lexer grammar GrammarCsvLexer;
@header{
package fuente;
}
TEXTO: ~[,\n\r"]+;

INTRO: [\n\r]+;
CADENA: '"' ('""'|~'"')* '"' {setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
SEPARADOR: ',';
