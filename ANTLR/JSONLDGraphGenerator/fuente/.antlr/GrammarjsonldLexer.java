// Generated from d:\antlr\bin\fuente\GrammarjsonldLexer.g4 by ANTLR 4.7.1

package fuente;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarjsonldLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONTEXT=1, CONTEXTCLASS=2, PROPERTY=3, RELATIONSHIP=4, LANGUAGEPROPERTY=5, 
		XSD=6, MANDATORY=7, CONTAINER=8, VALUE=9, WORDTYPE=10, LANGUAGE=11, GENDER=12, 
		NUMBER=13, CONTEXTTYPE=14, GRAPHTYPE=15, ID=16, NAME=17, TYPEOF=18, LABEL=19, 
		ISLIST=20, OPTIONAL=21, MULTIPLICITYMIN=22, MULTIPLICITYMAX=23, USEDBY=24, 
		LANGUAGEDATA=25, INHERITS=26, PROPERTIES=27, OID=28, REVERSENAME=29, REVERSELABEL=30, 
		FROM=31, TO=32, OPENBRACKET=33, CLOSEBRACKET=34, SQUAREOPENBRACKET=35, 
		SQUARECLOSEBRACKET=36, COLON=37, COMMA=38, NEWLINE=39, WS=40, TAB=41, 
		FALSE=42, TRUE=43, STRING=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CONTEXT", "CONTEXTCLASS", "PROPERTY", "RELATIONSHIP", "LANGUAGEPROPERTY", 
		"XSD", "MANDATORY", "CONTAINER", "VALUE", "WORDTYPE", "LANGUAGE", "GENDER", 
		"NUMBER", "CONTEXTTYPE", "GRAPHTYPE", "ID", "NAME", "TYPEOF", "LABEL", 
		"ISLIST", "OPTIONAL", "MULTIPLICITYMIN", "MULTIPLICITYMAX", "USEDBY", 
		"LANGUAGEDATA", "INHERITS", "PROPERTIES", "OID", "REVERSENAME", "REVERSELABEL", 
		"FROM", "TO", "OPENBRACKET", "CLOSEBRACKET", "SQUAREOPENBRACKET", "SQUARECLOSEBRACKET", 
		"COLON", "COMMA", "NEWLINE", "WS", "TAB", "FALSE", "TRUE", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"@context\"'", "'\"class\"'", "'\"property\"'", "'\"relationship\"'", 
		"'\"languageProperty\"'", "'\"xsd\"'", "'\"@mandatory\"'", "'\"@container\"'", 
		"'\"@value\"'", "'\"wordType\"'", "'\"language\"'", "'\"gender\"'", "'\"number\"'", 
		"'\"@type\"'", null, "'\"@id\"'", "'\"name\"'", "'\"typeOf\"'", "'\"label\"'", 
		"'\"isList\"'", "'\"optional\"'", "'\"multiplicityMin\"'", "'\"multiplicityMax\"'", 
		"'\"usedby\"'", "'\"languageData\"'", "'\"inherits\"'", "'\"properties\"'", 
		"'\"oid\"'", "'\"reverseName\"'", "'\"labelReverseName\"'", "'\"from\"'", 
		"'\"to\"'", "'{'", "'}'", "'['", "']'", "':'", "','", "'\r\n'", "' '", 
		"'\t'", "'false'", "'true'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CONTEXT", "CONTEXTCLASS", "PROPERTY", "RELATIONSHIP", "LANGUAGEPROPERTY", 
		"XSD", "MANDATORY", "CONTAINER", "VALUE", "WORDTYPE", "LANGUAGE", "GENDER", 
		"NUMBER", "CONTEXTTYPE", "GRAPHTYPE", "ID", "NAME", "TYPEOF", "LABEL", 
		"ISLIST", "OPTIONAL", "MULTIPLICITYMIN", "MULTIPLICITYMAX", "USEDBY", 
		"LANGUAGEDATA", "INHERITS", "PROPERTIES", "OID", "REVERSENAME", "REVERSELABEL", 
		"FROM", "TO", "OPENBRACKET", "CLOSEBRACKET", "SQUAREOPENBRACKET", "SQUARECLOSEBRACKET", 
		"COLON", "COMMA", "NEWLINE", "WS", "TAB", "FALSE", "TRUE", "STRING"
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


	public GrammarjsonldLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarjsonldLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 14:
			GRAPHTYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			NAME_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			TYPEOF_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			LABEL_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			ISLIST_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			OPTIONAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			MULTIPLICITYMIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			MULTIPLICITYMAX_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			USEDBY_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			LANGUAGEDATA_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			INHERITS_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			PROPERTIES_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			REVERSENAME_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			REVERSELABEL_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			FROM_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			TO_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void GRAPHTYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		case 1:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void NAME_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void TYPEOF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void LABEL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void ISLIST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void OPTIONAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void MULTIPLICITYMIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void MULTIPLICITYMAX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void USEDBY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void LANGUAGEDATA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void INHERITS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void PROPERTIES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void REVERSENAME_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void REVERSELABEL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void FROM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void TO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			setText(getText().replaceFirst("http://PdL.com/property#","property_"));
			                              setText(getText().replaceFirst("http://PdL.com/class#","class_"));
			                              setText(getText().replaceFirst("http://PdL.com/relationship#","relationship_"));
			                              setText(getText().replaceFirst("http://PdL.com/",""));
			                              {setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));}
			                              
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0212\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0108\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\7-\u020b\n-\f-\16-\u020e"+
		"\13-\3-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\3\3\2$$\2\u0214"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5f\3\2\2\2\7n\3\2\2\2\ty\3"+
		"\2\2\2\13\u0088\3\2\2\2\r\u009b\3\2\2\2\17\u00a1\3\2\2\2\21\u00ae\3\2"+
		"\2\2\23\u00bb\3\2\2\2\25\u00c4\3\2\2\2\27\u00cf\3\2\2\2\31\u00da\3\2\2"+
		"\2\33\u00e3\3\2\2\2\35\u00ec\3\2\2\2\37\u0107\3\2\2\2!\u0109\3\2\2\2#"+
		"\u0111\3\2\2\2%\u011a\3\2\2\2\'\u0125\3\2\2\2)\u012f\3\2\2\2+\u013a\3"+
		"\2\2\2-\u0147\3\2\2\2/\u015b\3\2\2\2\61\u016f\3\2\2\2\63\u017a\3\2\2\2"+
		"\65\u018b\3\2\2\2\67\u0198\3\2\2\29\u01a7\3\2\2\2;\u01ad\3\2\2\2=\u01bd"+
		"\3\2\2\2?\u01d2\3\2\2\2A\u01db\3\2\2\2C\u01e2\3\2\2\2E\u01e4\3\2\2\2G"+
		"\u01e6\3\2\2\2I\u01e8\3\2\2\2K\u01ea\3\2\2\2M\u01ec\3\2\2\2O\u01ee\3\2"+
		"\2\2Q\u01f3\3\2\2\2S\u01f7\3\2\2\2U\u01fb\3\2\2\2W\u0201\3\2\2\2Y\u0206"+
		"\3\2\2\2[\\\7$\2\2\\]\7B\2\2]^\7e\2\2^_\7q\2\2_`\7p\2\2`a\7v\2\2ab\7g"+
		"\2\2bc\7z\2\2cd\7v\2\2de\7$\2\2e\4\3\2\2\2fg\7$\2\2gh\7e\2\2hi\7n\2\2"+
		"ij\7c\2\2jk\7u\2\2kl\7u\2\2lm\7$\2\2m\6\3\2\2\2no\7$\2\2op\7r\2\2pq\7"+
		"t\2\2qr\7q\2\2rs\7r\2\2st\7g\2\2tu\7t\2\2uv\7v\2\2vw\7{\2\2wx\7$\2\2x"+
		"\b\3\2\2\2yz\7$\2\2z{\7t\2\2{|\7g\2\2|}\7n\2\2}~\7c\2\2~\177\7v\2\2\177"+
		"\u0080\7k\2\2\u0080\u0081\7q\2\2\u0081\u0082\7p\2\2\u0082\u0083\7u\2\2"+
		"\u0083\u0084\7j\2\2\u0084\u0085\7k\2\2\u0085\u0086\7r\2\2\u0086\u0087"+
		"\7$\2\2\u0087\n\3\2\2\2\u0088\u0089\7$\2\2\u0089\u008a\7n\2\2\u008a\u008b"+
		"\7c\2\2\u008b\u008c\7p\2\2\u008c\u008d\7i\2\2\u008d\u008e\7w\2\2\u008e"+
		"\u008f\7c\2\2\u008f\u0090\7i\2\2\u0090\u0091\7g\2\2\u0091\u0092\7R\2\2"+
		"\u0092\u0093\7t\2\2\u0093\u0094\7q\2\2\u0094\u0095\7r\2\2\u0095\u0096"+
		"\7g\2\2\u0096\u0097\7t\2\2\u0097\u0098\7v\2\2\u0098\u0099\7{\2\2\u0099"+
		"\u009a\7$\2\2\u009a\f\3\2\2\2\u009b\u009c\7$\2\2\u009c\u009d\7z\2\2\u009d"+
		"\u009e\7u\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7$\2\2\u00a0\16\3\2\2\2\u00a1"+
		"\u00a2\7$\2\2\u00a2\u00a3\7B\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7c\2\2"+
		"\u00a5\u00a6\7p\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9"+
		"\7v\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7{\2\2\u00ac"+
		"\u00ad\7$\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7$\2\2\u00af\u00b0\7B\2\2\u00b0"+
		"\u00b1\7e\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7v\2\2"+
		"\u00b4\u00b5\7c\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7$\2\2\u00ba\22\3\2\2\2\u00bb\u00bc"+
		"\7$\2\2\u00bc\u00bd\7B\2\2\u00bd\u00be\7x\2\2\u00be\u00bf\7c\2\2\u00bf"+
		"\u00c0\7n\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7$\2\2"+
		"\u00c3\24\3\2\2\2\u00c4\u00c5\7$\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7\7"+
		"q\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb"+
		"\7{\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7$\2\2\u00ce"+
		"\26\3\2\2\2\u00cf\u00d0\7$\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7c\2\2\u00d2"+
		"\u00d3\7p\2\2\u00d3\u00d4\7i\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7c\2\2"+
		"\u00d6\u00d7\7i\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7$\2\2\u00d9\30\3\2"+
		"\2\2\u00da\u00db\7$\2\2\u00db\u00dc\7i\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de"+
		"\7p\2\2\u00de\u00df\7f\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7t\2\2\u00e1"+
		"\u00e2\7$\2\2\u00e2\32\3\2\2\2\u00e3\u00e4\7$\2\2\u00e4\u00e5\7p\2\2\u00e5"+
		"\u00e6\7w\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7g\2\2"+
		"\u00e9\u00ea\7t\2\2\u00ea\u00eb\7$\2\2\u00eb\34\3\2\2\2\u00ec\u00ed\7"+
		"$\2\2\u00ed\u00ee\7B\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7{\2\2\u00f0\u00f1"+
		"\7r\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7$\2\2\u00f3\36\3\2\2\2\u00f4\u00f5"+
		"\7$\2\2\u00f5\u00f6\7B\2\2\u00f6\u00f7\7i\2\2\u00f7\u00f8\7t\2\2\u00f8"+
		"\u00f9\7c\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7j\2\2\u00fb\u00fc\7$\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fd\u0108\b\20\2\2\u00fe\u00ff\7$\2\2\u00ff\u0100"+
		"\7B\2\2\u0100\u0101\7v\2\2\u0101\u0102\7t\2\2\u0102\u0103\7g\2\2\u0103"+
		"\u0104\7g\2\2\u0104\u0105\7$\2\2\u0105\u0106\3\2\2\2\u0106\u0108\b\20"+
		"\3\2\u0107\u00f4\3\2\2\2\u0107\u00fe\3\2\2\2\u0108 \3\2\2\2\u0109\u010a"+
		"\7$\2\2\u010a\u010b\7B\2\2\u010b\u010c\7k\2\2\u010c\u010d\7f\2\2\u010d"+
		"\u010e\7$\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b\21\4\2\u0110\"\3\2\2\2"+
		"\u0111\u0112\7$\2\2\u0112\u0113\7p\2\2\u0113\u0114\7c\2\2\u0114\u0115"+
		"\7o\2\2\u0115\u0116\7g\2\2\u0116\u0117\7$\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\b\22\5\2\u0119$\3\2\2\2\u011a\u011b\7$\2\2\u011b\u011c\7v\2\2\u011c"+
		"\u011d\7{\2\2\u011d\u011e\7r\2\2\u011e\u011f\7g\2\2\u011f\u0120\7Q\2\2"+
		"\u0120\u0121\7h\2\2\u0121\u0122\7$\2\2\u0122\u0123\3\2\2\2\u0123\u0124"+
		"\b\23\6\2\u0124&\3\2\2\2\u0125\u0126\7$\2\2\u0126\u0127\7n\2\2\u0127\u0128"+
		"\7c\2\2\u0128\u0129\7d\2\2\u0129\u012a\7g\2\2\u012a\u012b\7n\2\2\u012b"+
		"\u012c\7$\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b\24\7\2\u012e(\3\2\2\2"+
		"\u012f\u0130\7$\2\2\u0130\u0131\7k\2\2\u0131\u0132\7u\2\2\u0132\u0133"+
		"\7N\2\2\u0133\u0134\7k\2\2\u0134\u0135\7u\2\2\u0135\u0136\7v\2\2\u0136"+
		"\u0137\7$\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b\25\b\2\u0139*\3\2\2\2"+
		"\u013a\u013b\7$\2\2\u013b\u013c\7q\2\2\u013c\u013d\7r\2\2\u013d\u013e"+
		"\7v\2\2\u013e\u013f\7k\2\2\u013f\u0140\7q\2\2\u0140\u0141\7p\2\2\u0141"+
		"\u0142\7c\2\2\u0142\u0143\7n\2\2\u0143\u0144\7$\2\2\u0144\u0145\3\2\2"+
		"\2\u0145\u0146\b\26\t\2\u0146,\3\2\2\2\u0147\u0148\7$\2\2\u0148\u0149"+
		"\7o\2\2\u0149\u014a\7w\2\2\u014a\u014b\7n\2\2\u014b\u014c\7v\2\2\u014c"+
		"\u014d\7k\2\2\u014d\u014e\7r\2\2\u014e\u014f\7n\2\2\u014f\u0150\7k\2\2"+
		"\u0150\u0151\7e\2\2\u0151\u0152\7k\2\2\u0152\u0153\7v\2\2\u0153\u0154"+
		"\7{\2\2\u0154\u0155\7O\2\2\u0155\u0156\7k\2\2\u0156\u0157\7p\2\2\u0157"+
		"\u0158\7$\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b\27\n\2\u015a.\3\2\2\2"+
		"\u015b\u015c\7$\2\2\u015c\u015d\7o\2\2\u015d\u015e\7w\2\2\u015e\u015f"+
		"\7n\2\2\u015f\u0160\7v\2\2\u0160\u0161\7k\2\2\u0161\u0162\7r\2\2\u0162"+
		"\u0163\7n\2\2\u0163\u0164\7k\2\2\u0164\u0165\7e\2\2\u0165\u0166\7k\2\2"+
		"\u0166\u0167\7v\2\2\u0167\u0168\7{\2\2\u0168\u0169\7O\2\2\u0169\u016a"+
		"\7c\2\2\u016a\u016b\7z\2\2\u016b\u016c\7$\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\b\30\13\2\u016e\60\3\2\2\2\u016f\u0170\7$\2\2\u0170\u0171\7w\2"+
		"\2\u0171\u0172\7u\2\2\u0172\u0173\7g\2\2\u0173\u0174\7f\2\2\u0174\u0175"+
		"\7d\2\2\u0175\u0176\7{\2\2\u0176\u0177\7$\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\b\31\f\2\u0179\62\3\2\2\2\u017a\u017b\7$\2\2\u017b\u017c\7n\2\2"+
		"\u017c\u017d\7c\2\2\u017d\u017e\7p\2\2\u017e\u017f\7i\2\2\u017f\u0180"+
		"\7w\2\2\u0180\u0181\7c\2\2\u0181\u0182\7i\2\2\u0182\u0183\7g\2\2\u0183"+
		"\u0184\7F\2\2\u0184\u0185\7c\2\2\u0185\u0186\7v\2\2\u0186\u0187\7c\2\2"+
		"\u0187\u0188\7$\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b\32\r\2\u018a\64"+
		"\3\2\2\2\u018b\u018c\7$\2\2\u018c\u018d\7k\2\2\u018d\u018e\7p\2\2\u018e"+
		"\u018f\7j\2\2\u018f\u0190\7g\2\2\u0190\u0191\7t\2\2\u0191\u0192\7k\2\2"+
		"\u0192\u0193\7v\2\2\u0193\u0194\7u\2\2\u0194\u0195\7$\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0197\b\33\16\2\u0197\66\3\2\2\2\u0198\u0199\7$\2\2\u0199"+
		"\u019a\7r\2\2\u019a\u019b\7t\2\2\u019b\u019c\7q\2\2\u019c\u019d\7r\2\2"+
		"\u019d\u019e\7g\2\2\u019e\u019f\7t\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1"+
		"\7k\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7$\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a6\b\34\17\2\u01a68\3\2\2\2\u01a7\u01a8\7$\2\2"+
		"\u01a8\u01a9\7q\2\2\u01a9\u01aa\7k\2\2\u01aa\u01ab\7f\2\2\u01ab\u01ac"+
		"\7$\2\2\u01ac:\3\2\2\2\u01ad\u01ae\7$\2\2\u01ae\u01af\7t\2\2\u01af\u01b0"+
		"\7g\2\2\u01b0\u01b1\7x\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3\7t\2\2\u01b3"+
		"\u01b4\7u\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6\7P\2\2\u01b6\u01b7\7c\2\2"+
		"\u01b7\u01b8\7o\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7$\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bc\b\36\20\2\u01bc<\3\2\2\2\u01bd\u01be\7$\2\2\u01be"+
		"\u01bf\7n\2\2\u01bf\u01c0\7c\2\2\u01c0\u01c1\7d\2\2\u01c1\u01c2\7g\2\2"+
		"\u01c2\u01c3\7n\2\2\u01c3\u01c4\7T\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6"+
		"\7x\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8\7t\2\2\u01c8\u01c9\7u\2\2\u01c9"+
		"\u01ca\7g\2\2\u01ca\u01cb\7P\2\2\u01cb\u01cc\7c\2\2\u01cc\u01cd\7o\2\2"+
		"\u01cd\u01ce\7g\2\2\u01ce\u01cf\7$\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1"+
		"\b\37\21\2\u01d1>\3\2\2\2\u01d2\u01d3\7$\2\2\u01d3\u01d4\7h\2\2\u01d4"+
		"\u01d5\7t\2\2\u01d5\u01d6\7q\2\2\u01d6\u01d7\7o\2\2\u01d7\u01d8\7$\2\2"+
		"\u01d8\u01d9\3\2\2\2\u01d9\u01da\b \22\2\u01da@\3\2\2\2\u01db\u01dc\7"+
		"$\2\2\u01dc\u01dd\7v\2\2\u01dd\u01de\7q\2\2\u01de\u01df\7$\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e1\b!\23\2\u01e1B\3\2\2\2\u01e2\u01e3\7}\2\2\u01e3D"+
		"\3\2\2\2\u01e4\u01e5\7\177\2\2\u01e5F\3\2\2\2\u01e6\u01e7\7]\2\2\u01e7"+
		"H\3\2\2\2\u01e8\u01e9\7_\2\2\u01e9J\3\2\2\2\u01ea\u01eb\7<\2\2\u01ebL"+
		"\3\2\2\2\u01ec\u01ed\7.\2\2\u01edN\3\2\2\2\u01ee\u01ef\7\17\2\2\u01ef"+
		"\u01f0\7\f\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\b(\24\2\u01f2P\3\2\2\2"+
		"\u01f3\u01f4\7\"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\b)\24\2\u01f6R\3"+
		"\2\2\2\u01f7\u01f8\7\13\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\b*\24\2\u01fa"+
		"T\3\2\2\2\u01fb\u01fc\7h\2\2\u01fc\u01fd\7c\2\2\u01fd\u01fe\7n\2\2\u01fe"+
		"\u01ff\7u\2\2\u01ff\u0200\7g\2\2\u0200V\3\2\2\2\u0201\u0202\7v\2\2\u0202"+
		"\u0203\7t\2\2\u0203\u0204\7w\2\2\u0204\u0205\7g\2\2\u0205X\3\2\2\2\u0206"+
		"\u020c\7$\2\2\u0207\u0208\7$\2\2\u0208\u020b\7$\2\2\u0209\u020b\n\2\2"+
		"\2\u020a\u0207\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a"+
		"\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f"+
		"\u0210\7$\2\2\u0210\u0211\b-\25\2\u0211Z\3\2\2\2\6\2\u0107\u020a\u020c"+
		"\26\3\20\2\3\20\3\3\21\4\3\22\5\3\23\6\3\24\7\3\25\b\3\26\t\3\27\n\3\30"+
		"\13\3\31\f\3\32\r\3\33\16\3\34\17\3\36\20\3\37\21\3 \22\3!\23\b\2\2\3"+
		"-\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}