lexer grammar gFiboLexer;

//Comentarios
COMENTARIOABRIR: '/*' -> pushMode(COMENTARIO_MULTILINEA_MODE);
DOCUMENTACIONABRIR: '/***' -> pushMode(COMENTARIODOCUMENTACION_MODE);
COMENTARIOLINEA: '//' -> pushMode(COMENTARIO_LINEA_MODE);
//Palabras reservadas
INCLUDE: 'include';
FUNCION: 'function';
BEGIN: 'begin';
END: 'end';
BUCLE: 'while';
RETURN: 'devolver';
ENDIF:'endif';
ELSE: 'else';
IF:'if';
THEN: 'then';
TRUE: 'true';
FALSE: 'false';
BARRABAJA:'_';
//Identificadores
IDENTIFICADOR: [a-zA-Z]+;
//Simbolos de la gramatica
PARIZQ: '(';
PARDER: ')';
COMA: ',';
PUNTO: '.';
DOSPUNTOS: ':';
IGUAL:':=';
PUNTOCOMA: ';';
//Operadores de la gramatica
SUMA: '+';
RESTA: '-';
MULT: '*';
DIV: '/';
AND: '&&';
OR: '||';
MENOR: '<';
MAYOR: '>';
IGUALDAD: '==';
//Elementos de la gramatica
INT:[0-9]+;
ESPACIO: ' '+;
CADENA: '"' (ESC |.)*? '"';
fragment ESC:'\\' [btnr"\\]; // \b \n \t \r \" \\
NEXTLINE: '\r\n';

//Modos de los comentarios donde se hace un cambio de contexto
mode COMENTARIO_MULTILINEA_MODE;
COMENTARIOCERRAR: '*/'->popMode;
CONTENIDOMULTILINEA: .+?; 
mode COMENTARIO_LINEA_MODE;
FINALDECOMENTARIO: '\r\n'->popMode;
CONTENIDOUNILINEA: .+?; 
mode COMENTARIODOCUMENTACION_MODE;
FINDOCUMENTACION: '***/'->popMode;
AUTOR: ' @author:';
TARGET:' @target:';
DESCRIPCION:' @description:';
DOCUMENTACION: .+?; 