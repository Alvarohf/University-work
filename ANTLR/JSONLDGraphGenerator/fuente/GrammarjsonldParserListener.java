// Generated from .\fuente\GrammarjsonldParser.g4 by ANTLR 4.7.1

package fuente;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarjsonldParser}.
 */
public interface GrammarjsonldParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(GrammarjsonldParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(GrammarjsonldParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#context}.
	 * @param ctx the parse tree
	 */
	void enterContext(GrammarjsonldParser.ContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#context}.
	 * @param ctx the parse tree
	 */
	void exitContext(GrammarjsonldParser.ContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#languageProperty}.
	 * @param ctx the parse tree
	 */
	void enterLanguageProperty(GrammarjsonldParser.LanguagePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#languageProperty}.
	 * @param ctx the parse tree
	 */
	void exitLanguageProperty(GrammarjsonldParser.LanguagePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(GrammarjsonldParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(GrammarjsonldParser.LanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#gender}.
	 * @param ctx the parse tree
	 */
	void enterGender(GrammarjsonldParser.GenderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#gender}.
	 * @param ctx the parse tree
	 */
	void exitGender(GrammarjsonldParser.GenderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GrammarjsonldParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GrammarjsonldParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#wordType}.
	 * @param ctx the parse tree
	 */
	void enterWordType(GrammarjsonldParser.WordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#wordType}.
	 * @param ctx the parse tree
	 */
	void exitWordType(GrammarjsonldParser.WordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#xsd}.
	 * @param ctx the parse tree
	 */
	void enterXsd(GrammarjsonldParser.XsdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#xsd}.
	 * @param ctx the parse tree
	 */
	void exitXsd(GrammarjsonldParser.XsdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextProperty}.
	 * @param ctx the parse tree
	 */
	void enterContextProperty(GrammarjsonldParser.ContextPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextProperty}.
	 * @param ctx the parse tree
	 */
	void exitContextProperty(GrammarjsonldParser.ContextPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextId}.
	 * @param ctx the parse tree
	 */
	void enterContextId(GrammarjsonldParser.ContextIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextId}.
	 * @param ctx the parse tree
	 */
	void exitContextId(GrammarjsonldParser.ContextIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextName}.
	 * @param ctx the parse tree
	 */
	void enterContextName(GrammarjsonldParser.ContextNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextName}.
	 * @param ctx the parse tree
	 */
	void exitContextName(GrammarjsonldParser.ContextNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextOptional}.
	 * @param ctx the parse tree
	 */
	void enterContextOptional(GrammarjsonldParser.ContextOptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextOptional}.
	 * @param ctx the parse tree
	 */
	void exitContextOptional(GrammarjsonldParser.ContextOptionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextTypeOf}.
	 * @param ctx the parse tree
	 */
	void enterContextTypeOf(GrammarjsonldParser.ContextTypeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextTypeOf}.
	 * @param ctx the parse tree
	 */
	void exitContextTypeOf(GrammarjsonldParser.ContextTypeOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextMultiplicityMax}.
	 * @param ctx the parse tree
	 */
	void enterContextMultiplicityMax(GrammarjsonldParser.ContextMultiplicityMaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextMultiplicityMax}.
	 * @param ctx the parse tree
	 */
	void exitContextMultiplicityMax(GrammarjsonldParser.ContextMultiplicityMaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextMultiplicityMin}.
	 * @param ctx the parse tree
	 */
	void enterContextMultiplicityMin(GrammarjsonldParser.ContextMultiplicityMinContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextMultiplicityMin}.
	 * @param ctx the parse tree
	 */
	void exitContextMultiplicityMin(GrammarjsonldParser.ContextMultiplicityMinContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextIsList}.
	 * @param ctx the parse tree
	 */
	void enterContextIsList(GrammarjsonldParser.ContextIsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextIsList}.
	 * @param ctx the parse tree
	 */
	void exitContextIsList(GrammarjsonldParser.ContextIsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextLabel}.
	 * @param ctx the parse tree
	 */
	void enterContextLabel(GrammarjsonldParser.ContextLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextLabel}.
	 * @param ctx the parse tree
	 */
	void exitContextLabel(GrammarjsonldParser.ContextLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextUsedBy}.
	 * @param ctx the parse tree
	 */
	void enterContextUsedBy(GrammarjsonldParser.ContextUsedByContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextUsedBy}.
	 * @param ctx the parse tree
	 */
	void exitContextUsedBy(GrammarjsonldParser.ContextUsedByContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextLanguageData}.
	 * @param ctx the parse tree
	 */
	void enterContextLanguageData(GrammarjsonldParser.ContextLanguageDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextLanguageData}.
	 * @param ctx the parse tree
	 */
	void exitContextLanguageData(GrammarjsonldParser.ContextLanguageDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextClass}.
	 * @param ctx the parse tree
	 */
	void enterContextClass(GrammarjsonldParser.ContextClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextClass}.
	 * @param ctx the parse tree
	 */
	void exitContextClass(GrammarjsonldParser.ContextClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextInherits}.
	 * @param ctx the parse tree
	 */
	void enterContextInherits(GrammarjsonldParser.ContextInheritsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextInherits}.
	 * @param ctx the parse tree
	 */
	void exitContextInherits(GrammarjsonldParser.ContextInheritsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextProperties}.
	 * @param ctx the parse tree
	 */
	void enterContextProperties(GrammarjsonldParser.ContextPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextProperties}.
	 * @param ctx the parse tree
	 */
	void exitContextProperties(GrammarjsonldParser.ContextPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextOid}.
	 * @param ctx the parse tree
	 */
	void enterContextOid(GrammarjsonldParser.ContextOidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextOid}.
	 * @param ctx the parse tree
	 */
	void exitContextOid(GrammarjsonldParser.ContextOidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextRelationship}.
	 * @param ctx the parse tree
	 */
	void enterContextRelationship(GrammarjsonldParser.ContextRelationshipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextRelationship}.
	 * @param ctx the parse tree
	 */
	void exitContextRelationship(GrammarjsonldParser.ContextRelationshipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextFrom}.
	 * @param ctx the parse tree
	 */
	void enterContextFrom(GrammarjsonldParser.ContextFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextFrom}.
	 * @param ctx the parse tree
	 */
	void exitContextFrom(GrammarjsonldParser.ContextFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextTo}.
	 * @param ctx the parse tree
	 */
	void enterContextTo(GrammarjsonldParser.ContextToContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextTo}.
	 * @param ctx the parse tree
	 */
	void exitContextTo(GrammarjsonldParser.ContextToContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextReverseName}.
	 * @param ctx the parse tree
	 */
	void enterContextReverseName(GrammarjsonldParser.ContextReverseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextReverseName}.
	 * @param ctx the parse tree
	 */
	void exitContextReverseName(GrammarjsonldParser.ContextReverseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextLabelReverseName}.
	 * @param ctx the parse tree
	 */
	void enterContextLabelReverseName(GrammarjsonldParser.ContextLabelReverseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextLabelReverseName}.
	 * @param ctx the parse tree
	 */
	void exitContextLabelReverseName(GrammarjsonldParser.ContextLabelReverseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextType}.
	 * @param ctx the parse tree
	 */
	void enterContextType(GrammarjsonldParser.ContextTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextType}.
	 * @param ctx the parse tree
	 */
	void exitContextType(GrammarjsonldParser.ContextTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextValue}.
	 * @param ctx the parse tree
	 */
	void enterContextValue(GrammarjsonldParser.ContextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextValue}.
	 * @param ctx the parse tree
	 */
	void exitContextValue(GrammarjsonldParser.ContextValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextContainer}.
	 * @param ctx the parse tree
	 */
	void enterContextContainer(GrammarjsonldParser.ContextContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextContainer}.
	 * @param ctx the parse tree
	 */
	void exitContextContainer(GrammarjsonldParser.ContextContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#contextMandatory}.
	 * @param ctx the parse tree
	 */
	void enterContextMandatory(GrammarjsonldParser.ContextMandatoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#contextMandatory}.
	 * @param ctx the parse tree
	 */
	void exitContextMandatory(GrammarjsonldParser.ContextMandatoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#graphs}.
	 * @param ctx the parse tree
	 */
	void enterGraphs(GrammarjsonldParser.GraphsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#graphs}.
	 * @param ctx the parse tree
	 */
	void exitGraphs(GrammarjsonldParser.GraphsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(GrammarjsonldParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(GrammarjsonldParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#graphType}.
	 * @param ctx the parse tree
	 */
	void enterGraphType(GrammarjsonldParser.GraphTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#graphType}.
	 * @param ctx the parse tree
	 */
	void exitGraphType(GrammarjsonldParser.GraphTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(GrammarjsonldParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(GrammarjsonldParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GrammarjsonldParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GrammarjsonldParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrammarjsonldParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrammarjsonldParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#typeOf}.
	 * @param ctx the parse tree
	 */
	void enterTypeOf(GrammarjsonldParser.TypeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#typeOf}.
	 * @param ctx the parse tree
	 */
	void exitTypeOf(GrammarjsonldParser.TypeOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(GrammarjsonldParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(GrammarjsonldParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#isList}.
	 * @param ctx the parse tree
	 */
	void enterIsList(GrammarjsonldParser.IsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#isList}.
	 * @param ctx the parse tree
	 */
	void exitIsList(GrammarjsonldParser.IsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(GrammarjsonldParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(GrammarjsonldParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#optional}.
	 * @param ctx the parse tree
	 */
	void enterOptional(GrammarjsonldParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#optional}.
	 * @param ctx the parse tree
	 */
	void exitOptional(GrammarjsonldParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#multiplicityMax}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicityMax(GrammarjsonldParser.MultiplicityMaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#multiplicityMax}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicityMax(GrammarjsonldParser.MultiplicityMaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#multiplicityMin}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicityMin(GrammarjsonldParser.MultiplicityMinContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#multiplicityMin}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicityMin(GrammarjsonldParser.MultiplicityMinContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#usedBy}.
	 * @param ctx the parse tree
	 */
	void enterUsedBy(GrammarjsonldParser.UsedByContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#usedBy}.
	 * @param ctx the parse tree
	 */
	void exitUsedBy(GrammarjsonldParser.UsedByContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#languageData}.
	 * @param ctx the parse tree
	 */
	void enterLanguageData(GrammarjsonldParser.LanguageDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#languageData}.
	 * @param ctx the parse tree
	 */
	void exitLanguageData(GrammarjsonldParser.LanguageDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(GrammarjsonldParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(GrammarjsonldParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GrammarjsonldParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GrammarjsonldParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#classObject}.
	 * @param ctx the parse tree
	 */
	void enterClassObject(GrammarjsonldParser.ClassObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#classObject}.
	 * @param ctx the parse tree
	 */
	void exitClassObject(GrammarjsonldParser.ClassObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#inherits}.
	 * @param ctx the parse tree
	 */
	void enterInherits(GrammarjsonldParser.InheritsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#inherits}.
	 * @param ctx the parse tree
	 */
	void exitInherits(GrammarjsonldParser.InheritsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(GrammarjsonldParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(GrammarjsonldParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#oid}.
	 * @param ctx the parse tree
	 */
	void enterOid(GrammarjsonldParser.OidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#oid}.
	 * @param ctx the parse tree
	 */
	void exitOid(GrammarjsonldParser.OidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#relationship}.
	 * @param ctx the parse tree
	 */
	void enterRelationship(GrammarjsonldParser.RelationshipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#relationship}.
	 * @param ctx the parse tree
	 */
	void exitRelationship(GrammarjsonldParser.RelationshipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#reverseName}.
	 * @param ctx the parse tree
	 */
	void enterReverseName(GrammarjsonldParser.ReverseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#reverseName}.
	 * @param ctx the parse tree
	 */
	void exitReverseName(GrammarjsonldParser.ReverseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#labelReverseName}.
	 * @param ctx the parse tree
	 */
	void enterLabelReverseName(GrammarjsonldParser.LabelReverseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#labelReverseName}.
	 * @param ctx the parse tree
	 */
	void exitLabelReverseName(GrammarjsonldParser.LabelReverseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(GrammarjsonldParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(GrammarjsonldParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarjsonldParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(GrammarjsonldParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarjsonldParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(GrammarjsonldParser.ToContext ctx);
}