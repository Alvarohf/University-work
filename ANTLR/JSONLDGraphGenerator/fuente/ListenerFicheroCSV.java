package fuente;

public class ListenerFicheroCSV extends GrammarCsvParserBaseListener {
	
	public static final String VACIO="";
	private TSimbCSV _tsimb;
	
	/*private ListenerFicheroCSV() {
		super();
	}*/
	public ListenerFicheroCSV(TSimbCSV p_tsimb) {
		super();
		_tsimb=p_tsimb;
	}
	@Override
	public void exitStringColumna(GrammarCsvParser.StringColumnaContext ctx) {
		_tsimb.addColumn(ctx.CADENA().getText());
	}
	@Override
	public void exitTextoColumna(GrammarCsvParser.TextoColumnaContext ctx) {
		_tsimb.addColumn(ctx.TEXTO().getText());
	}
	@Override
	public void exitVacioColumna(GrammarCsvParser.VacioColumnaContext ctx) {
		_tsimb.addColumn(VACIO);
	}
	@Override
	public void enterLinea(GrammarCsvParser.LineaContext ctx) {
		_tsimb.createRow();
	}
	@Override
	public void exitString(GrammarCsvParser.StringContext ctx) {
		_tsimb.addValue(ctx.CADENA().getText());
	}
	@Override
	public void exitTexto(GrammarCsvParser.TextoContext ctx) {
		_tsimb.addValue(ctx.TEXTO().getText());
	}
	@Override
	public void exitVacio(GrammarCsvParser.VacioContext ctx) {
		_tsimb.addValue(VACIO);
	}
}
