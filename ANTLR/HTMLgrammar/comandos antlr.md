### Comandos y trucos de ANTLR
<assoc-right> Asociar al reves del que viene como defecto
Reglas:
nombreRegla: expresionRegular;

## Puede tener:
Un identificador de un simbolo terminal MAYUSCULAS
Un identificador no terminal minusculas
Pueden ir seguidos:
nombreRegla: id ID;
Puede elegirse:
nombreRegla: (id/ID); o nombreRegla: [id ID];
nombreRegla: id?;
nombreRegla: id*;
nombreRegla: id+;
Composicion:
otraRegla: nombreRegla?;

## Patrones del lenguaje:

1. Patrón secuencia:
Esta regla o definicion regular se compone de x y z w;
DR: x y z w;
DR: '[' INT ']';
2. Secuencia con terminador:
DR: x y ';';
Se suelen utilizar para repeticiones se diferencian por el terminador signifca que ha acabado
DR: (x y ';')*;
DR: (x y NEWLINE)*;
3. Secuencia con separadores
3 , 4 , 5 , 6;
DR: expr (',' expr)*?+
4. Elección
Si es muy sencillo se pone en una única línea sino en varias líneas
DR: INT | Term | '333';
DR: INT
    | Term
    | '333'
    ;
5. Dependencia de tokens
DR: '(' expr ')';
6. Frase o expresión anidada/ Recursividad
Recursividad directa
Vale cualquier cadena b o bb o bbb etc.
DR: DR | b;
DRL: DRL | 'c' | 'd'; ANTLR permite hacerla por la izquierda
DRR: 'b' | DRR; Saben por la derecha
DRRL: DRRL | 'b' | DRRL;
Recursividad indirecta
DRI: expo | 'b';
expo: DRI | 'c';
Hay un problema porque ANTLR ni nadie puede resolver ya que se llega a un bucle infinito;



## Elementos a tener en cuenta al definir un nuevo lenguajes

1. Puntuación en los tokens
Se cambian los literales para evitar meter literales a las definiciones
Para poder dividir asi las gramaticas en el parser y lexer porque no 
tienen que tener símbolos terminales
2. Keywords del lenguaje
Siempre van al principio de los simbolos terminales para forzar al compilador
a buscar la palabra reservada primero
fragment ST: simbolo;
Es un atajo que permite sustituir símbolos terminales cuando se esta generando la gramatica
3. Numeros
fragment DIGITO: [0-9];
ENTERO: DIGITO+;
FLOTANTE: DIGITO+'.'DIGITO* // 1.000 1. 1.323
        | '.' DIGITO+ // .999 .323
        ;
4. Cadenas de carácteres (String)
Operador especial . que significa cualquier caracter
Es posible escapar caracteres
5. Comentarios
todos los tipos y al final

grun vuestragramatica reglaprincipal -gui -tokens fibonacci.prog

lexer grammar gComentarioLexer;

## Ejemplo
COMENTARIOABRIR: '/*' -> pushMode(COMENTARIO_MULTILINEA_MODE);
COMENTARIOLINEA: '//' -> pushMode(COMENTARIO_LINEA_MODE);
IDENTIFICADOR: [a-zA-Z]+;
NEXTLINE: '\r\n';

mode COMENTARIO_MULTILINEA_MODE;
COMENTARIOCERRAR: '*/'->popMode;
CONTENIDOMULTILINEA: .+?; 
mode COMENTARIO_LINEA_MODE;
FINALDECOMENTARIO: '\r\n'->popMode;
CONTENIDOUNILINEA: .+?; 

parser grammar gComentarioParser;

options {
        tokenVocab = gComentarioLexer;
        language = Java;
        }
fichero: (IDENTIFICADOR|comentario|NEXTLINE)*;
comentario: COMENTARIOABRIR (textos|NEXTLINE)* COMENTARIOCERRAR
            | COMENTARIOLINEA textos* FINALDECOMENTARIO;
textos: (CONTENIDOUNILINEA|CONTENIDOMULTILINEA)+;
