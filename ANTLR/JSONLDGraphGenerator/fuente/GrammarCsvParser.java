// Generated from .\fuente\GrammarCsvParser.g4 by ANTLR 4.7.1

package fuente;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarCsvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXTO=1, INTRO=2, CADENA=3, SEPARADOR=4;
	public static final int
		RULE_csv = 0, RULE_cabecera = 1, RULE_linea = 2, RULE_columna = 3, RULE_campo = 4;
	public static final String[] ruleNames = {
		"csv", "cabecera", "linea", "columna", "campo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TEXTO", "INTRO", "CADENA", "SEPARADOR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GrammarCsvParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarCsvParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CsvContext extends ParserRuleContext {
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public TerminalNode EOF() { return getToken(GrammarCsvParser.EOF, 0); }
		public List<TerminalNode> INTRO() { return getTokens(GrammarCsvParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(GrammarCsvParser.INTRO, i);
		}
		public CsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).enterCsv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).exitCsv(this);
		}
	}

	public final CsvContext csv() throws RecognitionException {
		CsvContext _localctx = new CsvContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_csv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			cabecera();
			setState(11);
			linea();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO) {
				{
				{
				setState(12);
				match(INTRO);
				setState(13);
				linea();
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CabeceraContext extends ParserRuleContext {
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public TerminalNode INTRO() { return getToken(GrammarCsvParser.INTRO, 0); }
		public List<TerminalNode> SEPARADOR() { return getTokens(GrammarCsvParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(GrammarCsvParser.SEPARADOR, i);
		}
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).enterCabecera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).exitCabecera(this);
		}
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cabecera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			columna();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(22);
				match(SEPARADOR);
				setState(23);
				columna();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(INTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineaContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<TerminalNode> SEPARADOR() { return getTokens(GrammarCsvParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(GrammarCsvParser.SEPARADOR, i);
		}
		public LineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).enterLinea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).exitLinea(this);
		}
	}

	public final LineaContext linea() throws RecognitionException {
		LineaContext _localctx = new LineaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_linea);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			campo();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(32);
				match(SEPARADOR);
				setState(33);
				campo();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnaContext extends ParserRuleContext {
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
	 
		public ColumnaContext() { }
		public void copyFrom(ColumnaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TextoColumnaContext extends ColumnaContext {
		public TerminalNode TEXTO() { return getToken(GrammarCsvParser.TEXTO, 0); }
		public TextoColumnaContext(ColumnaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).enterTextoColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).exitTextoColumna(this);
		}
	}
	public static class VacioColumnaContext extends ColumnaContext {
		public VacioColumnaContext(ColumnaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).enterVacioColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).exitVacioColumna(this);
		}
	}
	public static class StringColumnaContext extends ColumnaContext {
		public TerminalNode CADENA() { return getToken(GrammarCsvParser.CADENA, 0); }
		public StringColumnaContext(ColumnaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).enterStringColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).exitStringColumna(this);
		}
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columna);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				_localctx = new TextoColumnaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(TEXTO);
				}
				break;
			case CADENA:
				_localctx = new StringColumnaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(CADENA);
				}
				break;
			case INTRO:
			case SEPARADOR:
				_localctx = new VacioColumnaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CampoContext extends ParserRuleContext {
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
	 
		public CampoContext() { }
		public void copyFrom(CampoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VacioContext extends CampoContext {
		public VacioContext(CampoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).enterVacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).exitVacio(this);
		}
	}
	public static class StringContext extends CampoContext {
		public TerminalNode CADENA() { return getToken(GrammarCsvParser.CADENA, 0); }
		public StringContext(CampoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).exitString(this);
		}
	}
	public static class TextoContext extends CampoContext {
		public TerminalNode TEXTO() { return getToken(GrammarCsvParser.TEXTO, 0); }
		public TextoContext(CampoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarCsvParserListener ) ((GrammarCsvParserListener)listener).exitTexto(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_campo);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				_localctx = new TextoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(TEXTO);
				}
				break;
			case CADENA:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(CADENA);
				}
				break;
			case EOF:
			case INTRO:
			case SEPARADOR:
				_localctx = new VacioContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\7\4%\n\4\f\4\16\4(\13\4\3\5\3\5\3\5\5\5-\n\5\3\6\3\6\3\6\5\6\62\n\6\3"+
		"\6\2\2\7\2\4\6\b\n\2\2\2\65\2\f\3\2\2\2\4\27\3\2\2\2\6!\3\2\2\2\b,\3\2"+
		"\2\2\n\61\3\2\2\2\f\r\5\4\3\2\r\22\5\6\4\2\16\17\7\4\2\2\17\21\5\6\4\2"+
		"\20\16\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2"+
		"\24\22\3\2\2\2\25\26\7\2\2\3\26\3\3\2\2\2\27\34\5\b\5\2\30\31\7\6\2\2"+
		"\31\33\5\b\5\2\32\30\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2"+
		"\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\4\2\2 \5\3\2\2\2!&\5\n\6\2\"#\7\6\2"+
		"\2#%\5\n\6\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2(&\3"+
		"\2\2\2)-\7\3\2\2*-\7\5\2\2+-\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\t"+
		"\3\2\2\2.\62\7\3\2\2/\62\7\5\2\2\60\62\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2"+
		"\61\60\3\2\2\2\62\13\3\2\2\2\7\22\34&,\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}