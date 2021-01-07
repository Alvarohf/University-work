antlr4 .\gFiboLexer.g4
antlr4 .\gFiboParser.g4
javac *.java
grun gFibo codigo -tokens -gui test.prog
java Analizador test.prog outputHTML

