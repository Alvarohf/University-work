// Generated from d:\antlr\bin\fuente/GrammarInputLexer.g4 by ANTLR 4.7.1

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
public class GrammarInputLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CSVID=1, JSONID=2, DOTID=3, SVGID=4, LEN=5, FONTCOLOR=6, FONTNAME=7, FONTSIZE=8, 
		ARROWSIZE=9, ARROWCOLOR=10, PENWD=11, FILLCOLOR=12, STYLE=13, SHAPE=14, 
		EDGE=15, NODE=16, RELATIONSHIP=17, CLASS=18, INHERITANCE=19, PROPERTY=20, 
		INDIRECT_USE=21, INT=22, STRINGS=23, NEWLINE=24, SPACE=25, TEXT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CSVID", "JSONID", "DOTID", "SVGID", "LEN", "FONTCOLOR", "FONTNAME", "FONTSIZE", 
		"ARROWSIZE", "ARROWCOLOR", "PENWD", "FILLCOLOR", "STYLE", "SHAPE", "EDGE", 
		"NODE", "RELATIONSHIP", "CLASS", "INHERITANCE", "PROPERTY", "INDIRECT_USE", 
		"INT", "STRINGS", "NEWLINE", "SPACE", "TEXT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-CSV='", "'-JSON='", "'-DOT='", "'-SVG='", "'-len_'", "'-fontcolor_'", 
		"'-fontname_'", "'-fontsize_'", "'-arrowsize_'", "'-arrowcolor_'", "'-penwidth_'", 
		"'-fillcolor_'", "'-style_'", "'-shape_'", "'edge_'", "'node_'", "'relationship='", 
		"'class='", "'inheritance='", "'property='", "'indirect_use='", null, 
		null, "'\r\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CSVID", "JSONID", "DOTID", "SVGID", "LEN", "FONTCOLOR", "FONTNAME", 
		"FONTSIZE", "ARROWSIZE", "ARROWCOLOR", "PENWD", "FILLCOLOR", "STYLE", 
		"SHAPE", "EDGE", "NODE", "RELATIONSHIP", "CLASS", "INHERITANCE", "PROPERTY", 
		"INDIRECT_USE", "INT", "STRINGS", "NEWLINE", "SPACE", "TEXT"
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


	public GrammarInputLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarInputLexer.g4"; }

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
		case 22:
			STRINGS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRINGS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u011e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\6\27\u0100\n\27\r\27\16\27\u0101\3\30\3\30\7\30\u0106"+
		"\n\30\f\30\16\30\u0109\13\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\6\32\u0114\n\32\r\32\16\32\u0115\3\32\3\32\3\33\6\33\u011b\n\33\r"+
		"\33\16\33\u011c\4\u0107\u011c\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\3\2\3\3\2\62;\2\u0121\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\3\67\3\2\2\2\5=\3\2\2\2\7D\3\2\2\2\tJ\3\2\2\2\13P\3\2"+
		"\2\2\rV\3\2\2\2\17b\3\2\2\2\21m\3\2\2\2\23x\3\2\2\2\25\u0084\3\2\2\2\27"+
		"\u0091\3\2\2\2\31\u009c\3\2\2\2\33\u00a8\3\2\2\2\35\u00b0\3\2\2\2\37\u00b8"+
		"\3\2\2\2!\u00be\3\2\2\2#\u00c4\3\2\2\2%\u00d2\3\2\2\2\'\u00d9\3\2\2\2"+
		")\u00e6\3\2\2\2+\u00f0\3\2\2\2-\u00ff\3\2\2\2/\u0103\3\2\2\2\61\u010d"+
		"\3\2\2\2\63\u0113\3\2\2\2\65\u011a\3\2\2\2\678\7/\2\289\7E\2\29:\7U\2"+
		"\2:;\7X\2\2;<\7?\2\2<\4\3\2\2\2=>\7/\2\2>?\7L\2\2?@\7U\2\2@A\7Q\2\2AB"+
		"\7P\2\2BC\7?\2\2C\6\3\2\2\2DE\7/\2\2EF\7F\2\2FG\7Q\2\2GH\7V\2\2HI\7?\2"+
		"\2I\b\3\2\2\2JK\7/\2\2KL\7U\2\2LM\7X\2\2MN\7I\2\2NO\7?\2\2O\n\3\2\2\2"+
		"PQ\7/\2\2QR\7n\2\2RS\7g\2\2ST\7p\2\2TU\7a\2\2U\f\3\2\2\2VW\7/\2\2WX\7"+
		"h\2\2XY\7q\2\2YZ\7p\2\2Z[\7v\2\2[\\\7e\2\2\\]\7q\2\2]^\7n\2\2^_\7q\2\2"+
		"_`\7t\2\2`a\7a\2\2a\16\3\2\2\2bc\7/\2\2cd\7h\2\2de\7q\2\2ef\7p\2\2fg\7"+
		"v\2\2gh\7p\2\2hi\7c\2\2ij\7o\2\2jk\7g\2\2kl\7a\2\2l\20\3\2\2\2mn\7/\2"+
		"\2no\7h\2\2op\7q\2\2pq\7p\2\2qr\7v\2\2rs\7u\2\2st\7k\2\2tu\7|\2\2uv\7"+
		"g\2\2vw\7a\2\2w\22\3\2\2\2xy\7/\2\2yz\7c\2\2z{\7t\2\2{|\7t\2\2|}\7q\2"+
		"\2}~\7y\2\2~\177\7u\2\2\177\u0080\7k\2\2\u0080\u0081\7|\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7a\2\2\u0083\24\3\2\2\2\u0084\u0085\7/\2\2\u0085\u0086"+
		"\7c\2\2\u0086\u0087\7t\2\2\u0087\u0088\7t\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008a\7y\2\2\u008a\u008b\7e\2\2\u008b\u008c\7q\2\2\u008c\u008d\7n\2\2"+
		"\u008d\u008e\7q\2\2\u008e\u008f\7t\2\2\u008f\u0090\7a\2\2\u0090\26\3\2"+
		"\2\2\u0091\u0092\7/\2\2\u0092\u0093\7r\2\2\u0093\u0094\7g\2\2\u0094\u0095"+
		"\7p\2\2\u0095\u0096\7y\2\2\u0096\u0097\7k\2\2\u0097\u0098\7f\2\2\u0098"+
		"\u0099\7v\2\2\u0099\u009a\7j\2\2\u009a\u009b\7a\2\2\u009b\30\3\2\2\2\u009c"+
		"\u009d\7/\2\2\u009d\u009e\7h\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7n\2\2"+
		"\u00a0\u00a1\7n\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4"+
		"\7n\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7a\2\2\u00a7"+
		"\32\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7v\2\2\u00ab"+
		"\u00ac\7{\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7a\2\2"+
		"\u00af\34\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7"+
		"j\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7a\2\2\u00b7\36\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb"+
		"\7i\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7a\2\2\u00bd \3\2\2\2\u00be\u00bf"+
		"\7p\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7a\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7n\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u00cb\7q\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce"+
		"\7j\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7?\2\2\u00d1"+
		"$\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7c\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7?\2\2\u00d8&\3\2\2\2\u00d9"+
		"\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7j\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd\u00de\7t\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\u00e5\7?\2\2\u00e5(\3\2\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7t\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7r\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7t\2\2"+
		"\u00ec\u00ed\7v\2\2\u00ed\u00ee\7{\2\2\u00ee\u00ef\7?\2\2\u00ef*\3\2\2"+
		"\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7f\2\2\u00f3\u00f4"+
		"\7k\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7e\2\2\u00f7"+
		"\u00f8\7v\2\2\u00f8\u00f9\7a\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7u\2\2"+
		"\u00fb\u00fc\7g\2\2\u00fc\u00fd\7?\2\2\u00fd,\3\2\2\2\u00fe\u0100\t\2"+
		"\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102.\3\2\2\2\u0103\u0107\7$\2\2\u0104\u0106\13\2\2\2"+
		"\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0108\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7$\2\2\u010b"+
		"\u010c\b\30\2\2\u010c\60\3\2\2\2\u010d\u010e\7\17\2\2\u010e\u010f\7\f"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0111\b\31\3\2\u0111\62\3\2\2\2\u0112\u0114"+
		"\7\"\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\b\32\3\2\u0118\64\3\2\2"+
		"\2\u0119\u011b\13\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\66\3\2\2\2\7\2\u0101\u0107\u0115"+
		"\u011c\4\3\30\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}