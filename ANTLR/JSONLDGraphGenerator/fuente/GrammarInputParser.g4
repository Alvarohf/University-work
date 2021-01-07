parser grammar GrammarInputParser;

options {
    tokenVocab = GrammarInputLexer;
    language = Java;
}
@header{
package fuente;
}
//ROOT
input: (file|styleParameters)+ EOF; 

//FILE PARAMETER
file: (csvid|jsonid|svgid|dotid) path;
jsonid: JSONID;
csvid:CSVID;
svgid: SVGID;
dotid:DOTID;
path: (TEXT|numberValue)+;

//TARGET ELEMENT IN DOT
field: (node|edge);
edge: EDGE;
node: NODE;

//STYLE PARAMETERS
styleParameters: (len|fontcolor|fontsize|fontname|arrowsize|arrowcolor|penwd|fillcolor|shape|style);
params: (classes|relationship|inheritance|indirect_use|property);
classes: CLASS;
relationship: RELATIONSHIP;
inheritance: INHERITANCE;
indirect_use: INDIRECT_USE;
property: PROPERTY;

fontsize: FONTSIZE field params numberValue;
len: LEN params numberValue;
fontcolor: FONTCOLOR field params string;
fontname: FONTNAME field params string;
arrowsize: ARROWSIZE field params numberValue;
arrowcolor: ARROWCOLOR field params string;
penwd: PENWD field params numberValue;
fillcolor: FILLCOLOR field params  string;
shape: SHAPE field params string;
style: STYLE field params string;

//POSIBLE VALUES FOR STYLE PARAMETERS
string: STRINGS|path;
numberValue: INT;