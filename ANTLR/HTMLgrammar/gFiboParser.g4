parser grammar gFiboParser;

options {
        tokenVocab = gFiboLexer;
        language = Java;
        }
//Nodo raiz de la gramatica
//Consideramos que tambien puede haber variables globlales
codigo: (bibliotecas|variable|funcion|comentario|NEXTLINE|ESPACIO)*;

//COMENTARIOS
comentario: ESPACIO? COMENTARIOABRIR (textos|NEXTLINE)* COMENTARIOCERRAR NEXTLINE? ESPACIO? 
            | ESPACIO? COMENTARIOLINEA textos* FINALDECOMENTARIO ESPACIO? 
            | ESPACIO? DOCUMENTACIONABRIR (etiquetas | DOCUMENTACION)* FINDOCUMENTACION NEXTLINE? ESPACIO?
            ;
textos: CONTENIDOUNILINEA+|CONTENIDOMULTILINEA+;
etiquetas: (AUTOR|TARGET|DESCRIPCION)+;

//BIBLIOTECAS
bibliotecas: ESPACIO? reservadaInclude NEXTLINE? comentario? NEXTLINE? nombreBiblioteca NEXTLINE? terminador NEXTLINE? ESPACIO?;
//Por si acaso en un futuro añadimos esta regla para obtener el nombre de la biblioteca
nombreBiblioteca:ESPACIO? IDENTIFICADOR(IDENTIFICADOR|INT)* ESPACIO?;
reservadaInclude: INCLUDE;

//FUNCIONES
funcion: ESPACIO? reservadaFuncion comentario? ESPACIO NEXTLINE* nombrefuncion NEXTLINE* comentario* NEXTLINE* parametro NEXTLINE* tipofuncion NEXTLINE* comienzo lineas* acabar;

//Cabecera de la funcion
parametro: parentesisIzq ESPACIO? ( tipo ESPACIO nombreVariable NEXTLINE?)?(ESPACIO? delimitador ESPACIO? tipo ESPACIO  nombreVariable NEXTLINE?)* ESPACIO? parentesisDer;
tipofuncion:ESPACIO? DOSPUNTOS NEXTLINE* ESPACIO? tipo ESPACIO? NEXTLINE*;
nombrefuncion: IDENTIFICADOR(IDENTIFICADOR|INT|BARRABAJA)* ESPACIO?;
reservadaFuncion: FUNCION;

//Contenido de la funcion
comienzo: ESPACIO? BEGIN ESPACIO? NEXTLINE;
lineas: ESPACIO? (comentario|llamada|variable|condicional|bucle|devolverfunc|NEXTLINE)+
        | comienzo lineas acabar
        | comienzo acabar 
        ;
acabar: ESPACIO? END NEXTLINE? ESPACIO?;

//Elementos del codigo

//VARIABLES
//Contemplan casi todo tipo de cambios en su formulacion
variable: ESPACIO? (tipo ESPACIO)? comentario? nombreVariable ESPACIO? asignar ESPACIO? (nombreVariable|numero|llamada|string)ESPACIO? NEXTLINE?(NEXTLINE? ESPACIO? operacion ESPACIO?NEXTLINE? (llamada|nombreVariable|numero|string|NEXTLINE) ESPACIO? NEXTLINE?)* ESPACIO? terminador ESPACIO?;
nombreVariable: IDENTIFICADOR(IDENTIFICADOR|INT)*;
tipo: IDENTIFICADOR;

//LLAMADAS A FUNCIONES
llamada: ESPACIO? nombrefuncion parentesisIzq ESPACIO? (nombreVariable|llamada|string|numero)?(ESPACIO?(delimitador|operacion)?ESPACIO?(nombreVariable|llamada|string|numero))* ESPACIO? parentesisDer ESPACIO? terminador? ESPACIO?;

//RETURNS
devolverfunc: ESPACIO? reservadaDevolver ESPACIO?  parentesisIzq ESPACIO?  (nombreVariable|llamada|string|numero)operacion?(nombreVariable|llamada|string|numero)*ESPACIO?  parentesisDer ESPACIO? NEXTLINE? terminador ESPACIO? ;
reservadaDevolver: RETURN;

//BUCLES
bucle: ESPACIO? reservadaBucle ESPACIO? condicion ((comienzo lineas acabar)|llamada);
reservadaBucle: BUCLE;
//IF
condicional: ESPACIO? reservadaIf  ESPACIO? condicion ESPACIO? entonces ESPACIO? NEXTLINE?  lineas ESPACIO? NEXTLINE? (reservadaElse ESPACIO? NEXTLINE? lineas)? ESPACIO? NEXTLINE? reservadaEndIf ESPACIO? NEXTLINE?;
reservadaIf: IF;
entonces: THEN;
reservadaElse: ELSE;
reservadaEndIf: ENDIF;
//CONDICIONES
condicion: parentesisIzq ESPACIO? (((nombreVariable|numero) ESPACIO?  oplogica ESPACIO? (nombreVariable|numero))|booleano) ESPACIO? parentesisDer ESPACIO?  NEXTLINE?;
//OPERACIONES
oplogica: MENOR|MAYOR|IGUALDAD|AND|OR;
operacion: SUMA|RESTA|MULT|DIV;
//ELEMENTOS BASICOS
booleano: TRUE|FALSE;
asignar:IGUAL;
string: CADENA;
numero: INT (PUNTO INT+)?;
//SIMBOLOS
terminador: PUNTOCOMA NEXTLINE?; 
delimitador: COMA NEXTLINE?;
parentesisIzq: PARIZQ;
parentesisDer: PARDER;
