antlr4 .\fuente\GrammarInputLexer.g4
antlr4 .\fuente\GrammarInputParser.g4
antlr4 .\fuente\GrammarjsonldLexer.g4
antlr4 .\fuente\GrammarjsonldParser.g4
antlr4 .\fuente\GrammarCsvLexer.g4
antlr4 .\fuente\GrammarCsvParser.g4
javac .\fuente\*.java
javac .\transformacion.java
java transformacion -JSON=EjemploScheme.json 
