parser grammar GrammarCsvParser;

options {
	tokenVocab = GrammarCsvLexer;
	language=Java;
}
@header{
package fuente;
}
csv: cabecera linea (INTRO linea)* EOF;
cabecera: columna (SEPARADOR columna)* INTRO;
linea: campo (SEPARADOR campo)*;

columna:TEXTO		#TextoColumna
		| CADENA	#StringColumna
		|			#VacioColumna
		;

campo: TEXTO		#Texto
		| CADENA	#String
		|			#Vacio
		;

