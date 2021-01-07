// Generated from .\fuente\GrammarCsvParser.g4 by ANTLR 4.7.1

package fuente;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarCsvParser}.
 */
public interface GrammarCsvParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarCsvParser#csv}.
	 * @param ctx the parse tree
	 */
	void enterCsv(GrammarCsvParser.CsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarCsvParser#csv}.
	 * @param ctx the parse tree
	 */
	void exitCsv(GrammarCsvParser.CsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarCsvParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(GrammarCsvParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarCsvParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(GrammarCsvParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarCsvParser#linea}.
	 * @param ctx the parse tree
	 */
	void enterLinea(GrammarCsvParser.LineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarCsvParser#linea}.
	 * @param ctx the parse tree
	 */
	void exitLinea(GrammarCsvParser.LineaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextoColumna}
	 * labeled alternative in {@link GrammarCsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterTextoColumna(GrammarCsvParser.TextoColumnaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextoColumna}
	 * labeled alternative in {@link GrammarCsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitTextoColumna(GrammarCsvParser.TextoColumnaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringColumna}
	 * labeled alternative in {@link GrammarCsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterStringColumna(GrammarCsvParser.StringColumnaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringColumna}
	 * labeled alternative in {@link GrammarCsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitStringColumna(GrammarCsvParser.StringColumnaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VacioColumna}
	 * labeled alternative in {@link GrammarCsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterVacioColumna(GrammarCsvParser.VacioColumnaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VacioColumna}
	 * labeled alternative in {@link GrammarCsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitVacioColumna(GrammarCsvParser.VacioColumnaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Texto}
	 * labeled alternative in {@link GrammarCsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterTexto(GrammarCsvParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Texto}
	 * labeled alternative in {@link GrammarCsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitTexto(GrammarCsvParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link GrammarCsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterString(GrammarCsvParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link GrammarCsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitString(GrammarCsvParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vacio}
	 * labeled alternative in {@link GrammarCsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterVacio(GrammarCsvParser.VacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vacio}
	 * labeled alternative in {@link GrammarCsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitVacio(GrammarCsvParser.VacioContext ctx);
}