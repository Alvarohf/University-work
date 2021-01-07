lexer grammar GrammarInputLexer;		
@header{
package fuente;
}
//File identifiers
CSVID: '-CSV=';
JSONID: '-JSON=';
DOTID: '-DOT=';
SVGID: '-SVG=';

//Style identifiers
LEN: '-len_';
FONTCOLOR: '-fontcolor_';
FONTNAME: '-fontname_';
FONTSIZE: '-fontsize_';
ARROWSIZE: '-arrowsize_';
ARROWCOLOR: '-arrowcolor_';
PENWD: '-penwidth_';
FILLCOLOR: '-fillcolor_';
STYLE: '-style_';
SHAPE: '-shape_';

//Target identifiers
EDGE: 'edge_';
NODE: 'node_';
RELATIONSHIP: 'relationship=';
CLASS: 'class=';
INHERITANCE: 'inheritance=';
PROPERTY: 'property=';
INDIRECT_USE: 'indirect_use=';

//General values
INT: [0-9]+;
STRINGS: '"'.*?'"' {setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
NEWLINE: '\r\n'->skip;
SPACE: ' '+->skip;
TEXT: .+?;