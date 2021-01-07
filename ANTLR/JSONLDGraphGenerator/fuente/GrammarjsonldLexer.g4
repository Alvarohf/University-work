lexer grammar GrammarjsonldLexer;
@header{
package fuente;
}
//----------------------CONTEXT------------------
//Context tokens
CONTEXT: '"@context"';

//Context items
CONTEXTCLASS:'"class"';
PROPERTY:'"property"';
RELATIONSHIP:'"relationship"';
LANGUAGEPROPERTY: '"languageProperty"';
XSD:'"xsd"';

//Item options
MANDATORY:'"@mandatory"';
CONTAINER: '"@container"';
VALUE:'"@value"';

//LanguageProperty
WORDTYPE: '"wordType"';
LANGUAGE: '"language"';
GENDER: '"gender"';
NUMBER:'"number"';
CONTEXTTYPE: '"@type"';
//---------------------GRAPHS-----------------------
//Graphs tokens

GRAPHTYPE: '"@graph"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));}|'"@tree"' {setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
//Property graph
ID: '"@id"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
NAME: '"name"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
TYPEOF: '"typeOf"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
LABEL: '"label"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
ISLIST: '"isList"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
OPTIONAL:'"optional"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
MULTIPLICITYMIN:'"multiplicityMin"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
MULTIPLICITYMAX:'"multiplicityMax"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
USEDBY: '"usedby"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
LANGUAGEDATA: '"languageData"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};

//Class graph
INHERITS: '"inherits"' {setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
PROPERTIES: '"properties"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
OID:'"oid"';
//Relationship graph
REVERSENAME: '"reverseName"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
REVERSELABEL: '"labelReverseName"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
FROM:'"from"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
TO: '"to"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};


//--------------------------GENERAL----------------------
//General symbols

OPENBRACKET: '{';
CLOSEBRACKET: '}';
SQUAREOPENBRACKET: '[';
SQUARECLOSEBRACKET: ']';
COLON: ':';
COMMA: ',';
NEWLINE: '\r\n'->skip;
WS: ' '->skip;
TAB: '\t'->skip;
FALSE: 'false';
TRUE: 'true';
STRING: '"' ('""'|~'"')* '"' {setText(getText().replaceFirst("http://PdL.com/property#","property_"));
                              setText(getText().replaceFirst("http://PdL.com/class#","class_"));
                              setText(getText().replaceFirst("http://PdL.com/relationship#","relationship_"));
                              setText(getText().replaceFirst("http://PdL.com/",""));
                              {setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));}
                              };
