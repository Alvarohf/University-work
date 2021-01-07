parser grammar GrammarjsonldParser;

options {
	tokenVocab = GrammarjsonldLexer;
	language=Java;
}
@header{
package fuente;
}
//Root node for json parsing
json: OPENBRACKET (context COMMA)? graphs CLOSEBRACKET;

//-----------------------CONTEXT---------------------------
//Context is formed by xsd, languageProperty, property, class and relationship items.
//Context parse
context:CONTEXT COLON OPENBRACKET ((xsd|languageProperty|contextClass|contextProperty|contextRelationship) COMMA?)+ CLOSEBRACKET;

//Language property wich is composed by id, language, gender, number and wordtype 
languageProperty: LANGUAGEPROPERTY COLON OPENBRACKET contextId language gender number wordType CLOSEBRACKET;
//Parameters of the language property
language: LANGUAGE COLON OPENBRACKET  contextType CLOSEBRACKET COMMA?;
gender: GENDER COLON OPENBRACKET  contextType CLOSEBRACKET COMMA?;
number:NUMBER COLON OPENBRACKET  contextType CLOSEBRACKET COMMA?;
wordType:WORDTYPE COLON OPENBRACKET  contextType CLOSEBRACKET COMMA?;
//xsd
xsd: XSD COLON STRING;

//Context property wich is composed by id, name, label, optional, typeOf, isList, MultiplicityMin, MultiplicityMax, usedBy and LanguageData fields
contextProperty: PROPERTY COLON OPENBRACKET ((contextId|contextName|contextTypeOf|contextLabel|contextIsList|contextOptional|contextMultiplicityMax|contextMultiplicityMin|contextUsedBy|contextLanguageData)COMMA? )* CLOSEBRACKET;
//Parameters of the property
contextId:ID COLON value COMMA;
contextName:NAME COLON OPENBRACKET ((contextType|contextMandatory)COMMA?)* CLOSEBRACKET;
contextOptional:OPTIONAL COLON OPENBRACKET ((contextType|contextMandatory|contextValue)COMMA?)* CLOSEBRACKET;
contextTypeOf: TYPEOF COLON OPENBRACKET ((contextType|contextMandatory)COMMA?)* CLOSEBRACKET;
contextMultiplicityMax:MULTIPLICITYMAX COLON OPENBRACKET ((contextType|contextMandatory|contextValue)COMMA?)* CLOSEBRACKET;
contextMultiplicityMin:MULTIPLICITYMIN COLON OPENBRACKET ((contextType|contextMandatory|contextValue)COMMA?)* CLOSEBRACKET;
contextIsList:ISLIST COLON OPENBRACKET ((contextType|contextMandatory|contextValue)COMMA?)* CLOSEBRACKET;
contextLabel:LABEL COLON OPENBRACKET ((contextType|contextMandatory|contextContainer)COMMA?)* CLOSEBRACKET;
contextUsedBy:USEDBY COLON OPENBRACKET ((contextMandatory|contextId|contextContainer)COMMA?)* CLOSEBRACKET;
contextLanguageData:LANGUAGEDATA COLON OPENBRACKET ((contextMandatory|contextId|contextContainer)COMMA?)* CLOSEBRACKET;

//Context class wich is formed by id, name, label, inherits and properties
contextClass: CONTEXTCLASS COLON OPENBRACKET ((contextId|contextName|contextLabel|contextInherits|contextProperties|contextOid) COMMA?)* CLOSEBRACKET;
//Parameters of the class
contextInherits: INHERITS COLON OPENBRACKET ((contextMandatory|contextId)COMMA?)* CLOSEBRACKET;
contextProperties:PROPERTIES COLON OPENBRACKET ((contextMandatory|contextId|contextContainer)COMMA?)* CLOSEBRACKET;
contextOid:OID COLON OPENBRACKET ((contextType|contextMandatory)COMMA?)* CLOSEBRACKET;
//Context relationship wich is composed by id, name, label, from, to, reverseName, labelReverseName and properties
contextRelationship:RELATIONSHIP COLON OPENBRACKET ((contextId|contextName|contextLabel|contextFrom|contextTo|contextReverseName|contextLabelReverseName|contextProperties)COMMA?)* CLOSEBRACKET;
//Parameters of the relationship
contextFrom:FROM COLON OPENBRACKET ((contextMandatory|contextId)COMMA?)* CLOSEBRACKET;
contextTo:TO COLON OPENBRACKET ((contextMandatory|contextId)COMMA?)* CLOSEBRACKET;
contextReverseName:REVERSENAME COLON OPENBRACKET ((contextMandatory|contextType)COMMA?)* CLOSEBRACKET;
contextLabelReverseName: REVERSELABEL COLON OPENBRACKET ((contextType|contextMandatory|contextContainer)COMMA?)* CLOSEBRACKET;

//Context general parameters that are used by all of the parameters
contextType: CONTEXTTYPE COLON value;
contextValue: VALUE COLON (STRING|booleanValue);
contextContainer: CONTAINER COLON STRING;
contextMandatory: MANDATORY COLON booleanValue;

//-----------------------GRAPHS---------------------------

//All the graphs that are in the json
graphs: STRING COLON SQUAREOPENBRACKET graph* SQUARECLOSEBRACKET;

//Individual graph with name and type
graph: OPENBRACKET value COLON OPENBRACKET graphType CLOSEBRACKET CLOSEBRACKET COMMA?;
//Graph type with its graph
graphType: GRAPHTYPE COLON SQUAREOPENBRACKET (classObject|relationship|property)* SQUARECLOSEBRACKET;

//Property wich is composed by id, name, label, optional, typeOf, isList, MultiplicityMin, MultiplicityMax, usedBy and LanguageData fields
property:OPENBRACKET  id (name|typeOf|label|isList|optional|multiplicityMax|multiplicityMin|usedBy|languageData)* CLOSEBRACKET COMMA?;

//Components of property
id:ID COLON value COMMA;
name: NAME COLON value COMMA;
typeOf: TYPEOF COLON value COMMA?;
label:LABEL COLON OPENBRACKET reference COMMA? (reference COMMA?)* CLOSEBRACKET COMMA?;
isList: ISLIST COLON booleanValue COMMA?;
booleanValue: TRUE|FALSE;
optional:OPTIONAL COLON booleanValue COMMA?;
multiplicityMax: MULTIPLICITYMAX COLON value COMMA?;
multiplicityMin:MULTIPLICITYMIN COLON value COMMA?;
usedBy:USEDBY COLON SQUAREOPENBRACKET value COMMA? (value COMMA?)* SQUARECLOSEBRACKET COMMA?;
languageData:LANGUAGEDATA COLON SQUAREOPENBRACKET value COMMA? (value COMMA?)* SQUARECLOSEBRACKET COMMA?;
//We have to create this to avoid conflicts between reserved names and custom names
reference: STRING  COLON value;
value: STRING | PROPERTIES | LANGUAGE | NAME;
//Class wich is formed by id, name, label, inherits and properties
classObject: OPENBRACKET  id (name|oid|label|inherits|properties)* CLOSEBRACKET COMMA?;
inherits:INHERITS COLON value COMMA?;
properties:PROPERTIES COLON SQUAREOPENBRACKET value COMMA? (value COMMA?)* SQUARECLOSEBRACKET COMMA?;
oid: OID COLON SQUAREOPENBRACKET value? COMMA? (value COMMA?)* SQUARECLOSEBRACKET COMMA?;
//Relationship defined in the graph wich is composed by id, name, label, from, to, reverseName, labelReverseName and properties
relationship:OPENBRACKET id (name|reverseName|label|labelReverseName|from|to|properties)* CLOSEBRACKET COMMA?;
reverseName:REVERSENAME COLON value COMMA?;
labelReverseName:REVERSELABEL COLON OPENBRACKET reference COMMA? (reference COMMA?)* CLOSEBRACKET COMMA?;
from:FROM COLON value COMMA;
to:TO COLON value COMMA?;
