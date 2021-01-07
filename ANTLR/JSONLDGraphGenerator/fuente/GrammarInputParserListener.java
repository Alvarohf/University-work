// Generated from .\fuente\GrammarInputParser.g4 by ANTLR 4.7.1

package fuente;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarInputParser}.
 */
public interface GrammarInputParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(GrammarInputParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(GrammarInputParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GrammarInputParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GrammarInputParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#jsonid}.
	 * @param ctx the parse tree
	 */
	void enterJsonid(GrammarInputParser.JsonidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#jsonid}.
	 * @param ctx the parse tree
	 */
	void exitJsonid(GrammarInputParser.JsonidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#csvid}.
	 * @param ctx the parse tree
	 */
	void enterCsvid(GrammarInputParser.CsvidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#csvid}.
	 * @param ctx the parse tree
	 */
	void exitCsvid(GrammarInputParser.CsvidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#svgid}.
	 * @param ctx the parse tree
	 */
	void enterSvgid(GrammarInputParser.SvgidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#svgid}.
	 * @param ctx the parse tree
	 */
	void exitSvgid(GrammarInputParser.SvgidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#dotid}.
	 * @param ctx the parse tree
	 */
	void enterDotid(GrammarInputParser.DotidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#dotid}.
	 * @param ctx the parse tree
	 */
	void exitDotid(GrammarInputParser.DotidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(GrammarInputParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(GrammarInputParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(GrammarInputParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(GrammarInputParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(GrammarInputParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(GrammarInputParser.EdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(GrammarInputParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(GrammarInputParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#styleParameters}.
	 * @param ctx the parse tree
	 */
	void enterStyleParameters(GrammarInputParser.StyleParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#styleParameters}.
	 * @param ctx the parse tree
	 */
	void exitStyleParameters(GrammarInputParser.StyleParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(GrammarInputParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(GrammarInputParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#classes}.
	 * @param ctx the parse tree
	 */
	void enterClasses(GrammarInputParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#classes}.
	 * @param ctx the parse tree
	 */
	void exitClasses(GrammarInputParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#relationship}.
	 * @param ctx the parse tree
	 */
	void enterRelationship(GrammarInputParser.RelationshipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#relationship}.
	 * @param ctx the parse tree
	 */
	void exitRelationship(GrammarInputParser.RelationshipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(GrammarInputParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(GrammarInputParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#indirect_use}.
	 * @param ctx the parse tree
	 */
	void enterIndirect_use(GrammarInputParser.Indirect_useContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#indirect_use}.
	 * @param ctx the parse tree
	 */
	void exitIndirect_use(GrammarInputParser.Indirect_useContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(GrammarInputParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(GrammarInputParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#fontsize}.
	 * @param ctx the parse tree
	 */
	void enterFontsize(GrammarInputParser.FontsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#fontsize}.
	 * @param ctx the parse tree
	 */
	void exitFontsize(GrammarInputParser.FontsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(GrammarInputParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(GrammarInputParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#fontcolor}.
	 * @param ctx the parse tree
	 */
	void enterFontcolor(GrammarInputParser.FontcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#fontcolor}.
	 * @param ctx the parse tree
	 */
	void exitFontcolor(GrammarInputParser.FontcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#fontname}.
	 * @param ctx the parse tree
	 */
	void enterFontname(GrammarInputParser.FontnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#fontname}.
	 * @param ctx the parse tree
	 */
	void exitFontname(GrammarInputParser.FontnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#arrowsize}.
	 * @param ctx the parse tree
	 */
	void enterArrowsize(GrammarInputParser.ArrowsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#arrowsize}.
	 * @param ctx the parse tree
	 */
	void exitArrowsize(GrammarInputParser.ArrowsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#arrowcolor}.
	 * @param ctx the parse tree
	 */
	void enterArrowcolor(GrammarInputParser.ArrowcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#arrowcolor}.
	 * @param ctx the parse tree
	 */
	void exitArrowcolor(GrammarInputParser.ArrowcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#penwd}.
	 * @param ctx the parse tree
	 */
	void enterPenwd(GrammarInputParser.PenwdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#penwd}.
	 * @param ctx the parse tree
	 */
	void exitPenwd(GrammarInputParser.PenwdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#fillcolor}.
	 * @param ctx the parse tree
	 */
	void enterFillcolor(GrammarInputParser.FillcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#fillcolor}.
	 * @param ctx the parse tree
	 */
	void exitFillcolor(GrammarInputParser.FillcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(GrammarInputParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(GrammarInputParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(GrammarInputParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(GrammarInputParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(GrammarInputParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(GrammarInputParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInputParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(GrammarInputParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInputParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(GrammarInputParser.NumberValueContext ctx);
}