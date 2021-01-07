// Generated from d:\antlr\bin\fuente\GrammarjsonldParser.g4 by ANTLR 4.7.1

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
public class GrammarjsonldParser extends Parser {
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
	public static final int
		RULE_json = 0, RULE_context = 1, RULE_languageProperty = 2, RULE_language = 3, 
		RULE_gender = 4, RULE_number = 5, RULE_wordType = 6, RULE_xsd = 7, RULE_contextProperty = 8, 
		RULE_contextId = 9, RULE_contextName = 10, RULE_contextOptional = 11, 
		RULE_contextTypeOf = 12, RULE_contextMultiplicityMax = 13, RULE_contextMultiplicityMin = 14, 
		RULE_contextIsList = 15, RULE_contextLabel = 16, RULE_contextUsedBy = 17, 
		RULE_contextLanguageData = 18, RULE_contextClass = 19, RULE_contextInherits = 20, 
		RULE_contextProperties = 21, RULE_contextOid = 22, RULE_contextRelationship = 23, 
		RULE_contextFrom = 24, RULE_contextTo = 25, RULE_contextReverseName = 26, 
		RULE_contextLabelReverseName = 27, RULE_contextType = 28, RULE_contextValue = 29, 
		RULE_contextContainer = 30, RULE_contextMandatory = 31, RULE_graphs = 32, 
		RULE_graph = 33, RULE_graphType = 34, RULE_property = 35, RULE_id = 36, 
		RULE_name = 37, RULE_typeOf = 38, RULE_label = 39, RULE_isList = 40, RULE_booleanValue = 41, 
		RULE_optional = 42, RULE_multiplicityMax = 43, RULE_multiplicityMin = 44, 
		RULE_usedBy = 45, RULE_languageData = 46, RULE_reference = 47, RULE_value = 48, 
		RULE_classObject = 49, RULE_inherits = 50, RULE_properties = 51, RULE_oid = 52, 
		RULE_relationship = 53, RULE_reverseName = 54, RULE_labelReverseName = 55, 
		RULE_from = 56, RULE_to = 57;
	public static final String[] ruleNames = {
		"json", "context", "languageProperty", "language", "gender", "number", 
		"wordType", "xsd", "contextProperty", "contextId", "contextName", "contextOptional", 
		"contextTypeOf", "contextMultiplicityMax", "contextMultiplicityMin", "contextIsList", 
		"contextLabel", "contextUsedBy", "contextLanguageData", "contextClass", 
		"contextInherits", "contextProperties", "contextOid", "contextRelationship", 
		"contextFrom", "contextTo", "contextReverseName", "contextLabelReverseName", 
		"contextType", "contextValue", "contextContainer", "contextMandatory", 
		"graphs", "graph", "graphType", "property", "id", "name", "typeOf", "label", 
		"isList", "booleanValue", "optional", "multiplicityMax", "multiplicityMin", 
		"usedBy", "languageData", "reference", "value", "classObject", "inherits", 
		"properties", "oid", "relationship", "reverseName", "labelReverseName", 
		"from", "to"
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

	@Override
	public String getGrammarFileName() { return "GrammarjsonldParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarjsonldParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class JsonContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public GraphsContext graphs() {
			return getRuleContext(GraphsContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public ContextContext context() {
			return getRuleContext(ContextContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(OPENBRACKET);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTEXT) {
				{
				setState(117);
				context();
				setState(118);
				match(COMMA);
				}
			}

			setState(122);
			graphs();
			setState(123);
			match(CLOSEBRACKET);
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

	public static class ContextContext extends ParserRuleContext {
		public TerminalNode CONTEXT() { return getToken(GrammarjsonldParser.CONTEXT, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<XsdContext> xsd() {
			return getRuleContexts(XsdContext.class);
		}
		public XsdContext xsd(int i) {
			return getRuleContext(XsdContext.class,i);
		}
		public List<LanguagePropertyContext> languageProperty() {
			return getRuleContexts(LanguagePropertyContext.class);
		}
		public LanguagePropertyContext languageProperty(int i) {
			return getRuleContext(LanguagePropertyContext.class,i);
		}
		public List<ContextClassContext> contextClass() {
			return getRuleContexts(ContextClassContext.class);
		}
		public ContextClassContext contextClass(int i) {
			return getRuleContext(ContextClassContext.class,i);
		}
		public List<ContextPropertyContext> contextProperty() {
			return getRuleContexts(ContextPropertyContext.class);
		}
		public ContextPropertyContext contextProperty(int i) {
			return getRuleContext(ContextPropertyContext.class,i);
		}
		public List<ContextRelationshipContext> contextRelationship() {
			return getRuleContexts(ContextRelationshipContext.class);
		}
		public ContextRelationshipContext contextRelationship(int i) {
			return getRuleContext(ContextRelationshipContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context; }
	}

	public final ContextContext context() throws RecognitionException {
		ContextContext _localctx = new ContextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_context);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(CONTEXT);
			setState(126);
			match(COLON);
			setState(127);
			match(OPENBRACKET);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case XSD:
					{
					setState(128);
					xsd();
					}
					break;
				case LANGUAGEPROPERTY:
					{
					setState(129);
					languageProperty();
					}
					break;
				case CONTEXTCLASS:
					{
					setState(130);
					contextClass();
					}
					break;
				case PROPERTY:
					{
					setState(131);
					contextProperty();
					}
					break;
				case RELATIONSHIP:
					{
					setState(132);
					contextRelationship();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(135);
					match(COMMA);
					}
				}

				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTEXTCLASS) | (1L << PROPERTY) | (1L << RELATIONSHIP) | (1L << LANGUAGEPROPERTY) | (1L << XSD))) != 0) );
			setState(142);
			match(CLOSEBRACKET);
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

	public static class LanguagePropertyContext extends ParserRuleContext {
		public TerminalNode LANGUAGEPROPERTY() { return getToken(GrammarjsonldParser.LANGUAGEPROPERTY, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public ContextIdContext contextId() {
			return getRuleContext(ContextIdContext.class,0);
		}
		public LanguageContext language() {
			return getRuleContext(LanguageContext.class,0);
		}
		public GenderContext gender() {
			return getRuleContext(GenderContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WordTypeContext wordType() {
			return getRuleContext(WordTypeContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public LanguagePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageProperty; }
	}

	public final LanguagePropertyContext languageProperty() throws RecognitionException {
		LanguagePropertyContext _localctx = new LanguagePropertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_languageProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(LANGUAGEPROPERTY);
			setState(145);
			match(COLON);
			setState(146);
			match(OPENBRACKET);
			setState(147);
			contextId();
			setState(148);
			language();
			setState(149);
			gender();
			setState(150);
			number();
			setState(151);
			wordType();
			setState(152);
			match(CLOSEBRACKET);
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

	public static class LanguageContext extends ParserRuleContext {
		public TerminalNode LANGUAGE() { return getToken(GrammarjsonldParser.LANGUAGE, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public ContextTypeContext contextType() {
			return getRuleContext(ContextTypeContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_language);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(LANGUAGE);
			setState(155);
			match(COLON);
			setState(156);
			match(OPENBRACKET);
			setState(157);
			contextType();
			setState(158);
			match(CLOSEBRACKET);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(159);
				match(COMMA);
				}
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

	public static class GenderContext extends ParserRuleContext {
		public TerminalNode GENDER() { return getToken(GrammarjsonldParser.GENDER, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public ContextTypeContext contextType() {
			return getRuleContext(ContextTypeContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public GenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gender; }
	}

	public final GenderContext gender() throws RecognitionException {
		GenderContext _localctx = new GenderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_gender);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(GENDER);
			setState(163);
			match(COLON);
			setState(164);
			match(OPENBRACKET);
			setState(165);
			contextType();
			setState(166);
			match(CLOSEBRACKET);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(167);
				match(COMMA);
				}
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(GrammarjsonldParser.NUMBER, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public ContextTypeContext contextType() {
			return getRuleContext(ContextTypeContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(NUMBER);
			setState(171);
			match(COLON);
			setState(172);
			match(OPENBRACKET);
			setState(173);
			contextType();
			setState(174);
			match(CLOSEBRACKET);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(175);
				match(COMMA);
				}
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

	public static class WordTypeContext extends ParserRuleContext {
		public TerminalNode WORDTYPE() { return getToken(GrammarjsonldParser.WORDTYPE, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public ContextTypeContext contextType() {
			return getRuleContext(ContextTypeContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public WordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordType; }
	}

	public final WordTypeContext wordType() throws RecognitionException {
		WordTypeContext _localctx = new WordTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_wordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(WORDTYPE);
			setState(179);
			match(COLON);
			setState(180);
			match(OPENBRACKET);
			setState(181);
			contextType();
			setState(182);
			match(CLOSEBRACKET);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(183);
				match(COMMA);
				}
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

	public static class XsdContext extends ParserRuleContext {
		public TerminalNode XSD() { return getToken(GrammarjsonldParser.XSD, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(GrammarjsonldParser.STRING, 0); }
		public XsdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xsd; }
	}

	public final XsdContext xsd() throws RecognitionException {
		XsdContext _localctx = new XsdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_xsd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(XSD);
			setState(187);
			match(COLON);
			setState(188);
			match(STRING);
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

	public static class ContextPropertyContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(GrammarjsonldParser.PROPERTY, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextIdContext> contextId() {
			return getRuleContexts(ContextIdContext.class);
		}
		public ContextIdContext contextId(int i) {
			return getRuleContext(ContextIdContext.class,i);
		}
		public List<ContextNameContext> contextName() {
			return getRuleContexts(ContextNameContext.class);
		}
		public ContextNameContext contextName(int i) {
			return getRuleContext(ContextNameContext.class,i);
		}
		public List<ContextTypeOfContext> contextTypeOf() {
			return getRuleContexts(ContextTypeOfContext.class);
		}
		public ContextTypeOfContext contextTypeOf(int i) {
			return getRuleContext(ContextTypeOfContext.class,i);
		}
		public List<ContextLabelContext> contextLabel() {
			return getRuleContexts(ContextLabelContext.class);
		}
		public ContextLabelContext contextLabel(int i) {
			return getRuleContext(ContextLabelContext.class,i);
		}
		public List<ContextIsListContext> contextIsList() {
			return getRuleContexts(ContextIsListContext.class);
		}
		public ContextIsListContext contextIsList(int i) {
			return getRuleContext(ContextIsListContext.class,i);
		}
		public List<ContextOptionalContext> contextOptional() {
			return getRuleContexts(ContextOptionalContext.class);
		}
		public ContextOptionalContext contextOptional(int i) {
			return getRuleContext(ContextOptionalContext.class,i);
		}
		public List<ContextMultiplicityMaxContext> contextMultiplicityMax() {
			return getRuleContexts(ContextMultiplicityMaxContext.class);
		}
		public ContextMultiplicityMaxContext contextMultiplicityMax(int i) {
			return getRuleContext(ContextMultiplicityMaxContext.class,i);
		}
		public List<ContextMultiplicityMinContext> contextMultiplicityMin() {
			return getRuleContexts(ContextMultiplicityMinContext.class);
		}
		public ContextMultiplicityMinContext contextMultiplicityMin(int i) {
			return getRuleContext(ContextMultiplicityMinContext.class,i);
		}
		public List<ContextUsedByContext> contextUsedBy() {
			return getRuleContexts(ContextUsedByContext.class);
		}
		public ContextUsedByContext contextUsedBy(int i) {
			return getRuleContext(ContextUsedByContext.class,i);
		}
		public List<ContextLanguageDataContext> contextLanguageData() {
			return getRuleContexts(ContextLanguageDataContext.class);
		}
		public ContextLanguageDataContext contextLanguageData(int i) {
			return getRuleContext(ContextLanguageDataContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextProperty; }
	}

	public final ContextPropertyContext contextProperty() throws RecognitionException {
		ContextPropertyContext _localctx = new ContextPropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_contextProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(PROPERTY);
			setState(191);
			match(COLON);
			setState(192);
			match(OPENBRACKET);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NAME) | (1L << TYPEOF) | (1L << LABEL) | (1L << ISLIST) | (1L << OPTIONAL) | (1L << MULTIPLICITYMIN) | (1L << MULTIPLICITYMAX) | (1L << USEDBY) | (1L << LANGUAGEDATA))) != 0)) {
				{
				{
				setState(203);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(193);
					contextId();
					}
					break;
				case NAME:
					{
					setState(194);
					contextName();
					}
					break;
				case TYPEOF:
					{
					setState(195);
					contextTypeOf();
					}
					break;
				case LABEL:
					{
					setState(196);
					contextLabel();
					}
					break;
				case ISLIST:
					{
					setState(197);
					contextIsList();
					}
					break;
				case OPTIONAL:
					{
					setState(198);
					contextOptional();
					}
					break;
				case MULTIPLICITYMAX:
					{
					setState(199);
					contextMultiplicityMax();
					}
					break;
				case MULTIPLICITYMIN:
					{
					setState(200);
					contextMultiplicityMin();
					}
					break;
				case USEDBY:
					{
					setState(201);
					contextUsedBy();
					}
					break;
				case LANGUAGEDATA:
					{
					setState(202);
					contextLanguageData();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(205);
					match(COMMA);
					}
				}

				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(CLOSEBRACKET);
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

	public static class ContextIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarjsonldParser.ID, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public ContextIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextId; }
	}

	public final ContextIdContext contextId() throws RecognitionException {
		ContextIdContext _localctx = new ContextIdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_contextId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ID);
			setState(216);
			match(COLON);
			setState(217);
			value();
			setState(218);
			match(COMMA);
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

	public static class ContextNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarjsonldParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextTypeContext> contextType() {
			return getRuleContexts(ContextTypeContext.class);
		}
		public ContextTypeContext contextType(int i) {
			return getRuleContext(ContextTypeContext.class,i);
		}
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextName; }
	}

	public final ContextNameContext contextName() throws RecognitionException {
		ContextNameContext _localctx = new ContextNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_contextName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(NAME);
			setState(221);
			match(COLON);
			setState(222);
			match(OPENBRACKET);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MANDATORY || _la==CONTEXTTYPE) {
				{
				{
				setState(225);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTEXTTYPE:
					{
					setState(223);
					contextType();
					}
					break;
				case MANDATORY:
					{
					setState(224);
					contextMandatory();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(227);
					match(COMMA);
					}
				}

				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(CLOSEBRACKET);
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

	public static class ContextOptionalContext extends ParserRuleContext {
		public TerminalNode OPTIONAL() { return getToken(GrammarjsonldParser.OPTIONAL, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextTypeContext> contextType() {
			return getRuleContexts(ContextTypeContext.class);
		}
		public ContextTypeContext contextType(int i) {
			return getRuleContext(ContextTypeContext.class,i);
		}
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextValueContext> contextValue() {
			return getRuleContexts(ContextValueContext.class);
		}
		public ContextValueContext contextValue(int i) {
			return getRuleContext(ContextValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextOptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextOptional; }
	}

	public final ContextOptionalContext contextOptional() throws RecognitionException {
		ContextOptionalContext _localctx = new ContextOptionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contextOptional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(OPTIONAL);
			setState(238);
			match(COLON);
			setState(239);
			match(OPENBRACKET);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MANDATORY) | (1L << VALUE) | (1L << CONTEXTTYPE))) != 0)) {
				{
				{
				setState(243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTEXTTYPE:
					{
					setState(240);
					contextType();
					}
					break;
				case MANDATORY:
					{
					setState(241);
					contextMandatory();
					}
					break;
				case VALUE:
					{
					setState(242);
					contextValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(245);
					match(COMMA);
					}
				}

				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(CLOSEBRACKET);
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

	public static class ContextTypeOfContext extends ParserRuleContext {
		public TerminalNode TYPEOF() { return getToken(GrammarjsonldParser.TYPEOF, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextTypeContext> contextType() {
			return getRuleContexts(ContextTypeContext.class);
		}
		public ContextTypeContext contextType(int i) {
			return getRuleContext(ContextTypeContext.class,i);
		}
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextTypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextTypeOf; }
	}

	public final ContextTypeOfContext contextTypeOf() throws RecognitionException {
		ContextTypeOfContext _localctx = new ContextTypeOfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_contextTypeOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(TYPEOF);
			setState(256);
			match(COLON);
			setState(257);
			match(OPENBRACKET);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MANDATORY || _la==CONTEXTTYPE) {
				{
				{
				setState(260);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTEXTTYPE:
					{
					setState(258);
					contextType();
					}
					break;
				case MANDATORY:
					{
					setState(259);
					contextMandatory();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(262);
					match(COMMA);
					}
				}

				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(CLOSEBRACKET);
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

	public static class ContextMultiplicityMaxContext extends ParserRuleContext {
		public TerminalNode MULTIPLICITYMAX() { return getToken(GrammarjsonldParser.MULTIPLICITYMAX, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextTypeContext> contextType() {
			return getRuleContexts(ContextTypeContext.class);
		}
		public ContextTypeContext contextType(int i) {
			return getRuleContext(ContextTypeContext.class,i);
		}
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextValueContext> contextValue() {
			return getRuleContexts(ContextValueContext.class);
		}
		public ContextValueContext contextValue(int i) {
			return getRuleContext(ContextValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextMultiplicityMaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextMultiplicityMax; }
	}

	public final ContextMultiplicityMaxContext contextMultiplicityMax() throws RecognitionException {
		ContextMultiplicityMaxContext _localctx = new ContextMultiplicityMaxContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_contextMultiplicityMax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(MULTIPLICITYMAX);
			setState(273);
			match(COLON);
			setState(274);
			match(OPENBRACKET);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MANDATORY) | (1L << VALUE) | (1L << CONTEXTTYPE))) != 0)) {
				{
				{
				setState(278);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTEXTTYPE:
					{
					setState(275);
					contextType();
					}
					break;
				case MANDATORY:
					{
					setState(276);
					contextMandatory();
					}
					break;
				case VALUE:
					{
					setState(277);
					contextValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(280);
					match(COMMA);
					}
				}

				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(CLOSEBRACKET);
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

	public static class ContextMultiplicityMinContext extends ParserRuleContext {
		public TerminalNode MULTIPLICITYMIN() { return getToken(GrammarjsonldParser.MULTIPLICITYMIN, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextTypeContext> contextType() {
			return getRuleContexts(ContextTypeContext.class);
		}
		public ContextTypeContext contextType(int i) {
			return getRuleContext(ContextTypeContext.class,i);
		}
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextValueContext> contextValue() {
			return getRuleContexts(ContextValueContext.class);
		}
		public ContextValueContext contextValue(int i) {
			return getRuleContext(ContextValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextMultiplicityMinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextMultiplicityMin; }
	}

	public final ContextMultiplicityMinContext contextMultiplicityMin() throws RecognitionException {
		ContextMultiplicityMinContext _localctx = new ContextMultiplicityMinContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_contextMultiplicityMin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(MULTIPLICITYMIN);
			setState(291);
			match(COLON);
			setState(292);
			match(OPENBRACKET);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MANDATORY) | (1L << VALUE) | (1L << CONTEXTTYPE))) != 0)) {
				{
				{
				setState(296);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTEXTTYPE:
					{
					setState(293);
					contextType();
					}
					break;
				case MANDATORY:
					{
					setState(294);
					contextMandatory();
					}
					break;
				case VALUE:
					{
					setState(295);
					contextValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(298);
					match(COMMA);
					}
				}

				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(CLOSEBRACKET);
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

	public static class ContextIsListContext extends ParserRuleContext {
		public TerminalNode ISLIST() { return getToken(GrammarjsonldParser.ISLIST, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextTypeContext> contextType() {
			return getRuleContexts(ContextTypeContext.class);
		}
		public ContextTypeContext contextType(int i) {
			return getRuleContext(ContextTypeContext.class,i);
		}
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextValueContext> contextValue() {
			return getRuleContexts(ContextValueContext.class);
		}
		public ContextValueContext contextValue(int i) {
			return getRuleContext(ContextValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextIsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextIsList; }
	}

	public final ContextIsListContext contextIsList() throws RecognitionException {
		ContextIsListContext _localctx = new ContextIsListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_contextIsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(ISLIST);
			setState(309);
			match(COLON);
			setState(310);
			match(OPENBRACKET);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MANDATORY) | (1L << VALUE) | (1L << CONTEXTTYPE))) != 0)) {
				{
				{
				setState(314);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTEXTTYPE:
					{
					setState(311);
					contextType();
					}
					break;
				case MANDATORY:
					{
					setState(312);
					contextMandatory();
					}
					break;
				case VALUE:
					{
					setState(313);
					contextValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(316);
					match(COMMA);
					}
				}

				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(CLOSEBRACKET);
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

	public static class ContextLabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(GrammarjsonldParser.LABEL, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextTypeContext> contextType() {
			return getRuleContexts(ContextTypeContext.class);
		}
		public ContextTypeContext contextType(int i) {
			return getRuleContext(ContextTypeContext.class,i);
		}
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextContainerContext> contextContainer() {
			return getRuleContexts(ContextContainerContext.class);
		}
		public ContextContainerContext contextContainer(int i) {
			return getRuleContext(ContextContainerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextLabel; }
	}

	public final ContextLabelContext contextLabel() throws RecognitionException {
		ContextLabelContext _localctx = new ContextLabelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_contextLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(LABEL);
			setState(327);
			match(COLON);
			setState(328);
			match(OPENBRACKET);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MANDATORY) | (1L << CONTAINER) | (1L << CONTEXTTYPE))) != 0)) {
				{
				{
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTEXTTYPE:
					{
					setState(329);
					contextType();
					}
					break;
				case MANDATORY:
					{
					setState(330);
					contextMandatory();
					}
					break;
				case CONTAINER:
					{
					setState(331);
					contextContainer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(334);
					match(COMMA);
					}
				}

				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(CLOSEBRACKET);
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

	public static class ContextUsedByContext extends ParserRuleContext {
		public TerminalNode USEDBY() { return getToken(GrammarjsonldParser.USEDBY, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextIdContext> contextId() {
			return getRuleContexts(ContextIdContext.class);
		}
		public ContextIdContext contextId(int i) {
			return getRuleContext(ContextIdContext.class,i);
		}
		public List<ContextContainerContext> contextContainer() {
			return getRuleContexts(ContextContainerContext.class);
		}
		public ContextContainerContext contextContainer(int i) {
			return getRuleContext(ContextContainerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextUsedByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextUsedBy; }
	}

	public final ContextUsedByContext contextUsedBy() throws RecognitionException {
		ContextUsedByContext _localctx = new ContextUsedByContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_contextUsedBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(USEDBY);
			setState(345);
			match(COLON);
			setState(346);
			match(OPENBRACKET);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MANDATORY) | (1L << CONTAINER) | (1L << ID))) != 0)) {
				{
				{
				setState(350);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANDATORY:
					{
					setState(347);
					contextMandatory();
					}
					break;
				case ID:
					{
					setState(348);
					contextId();
					}
					break;
				case CONTAINER:
					{
					setState(349);
					contextContainer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(352);
					match(COMMA);
					}
				}

				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			match(CLOSEBRACKET);
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

	public static class ContextLanguageDataContext extends ParserRuleContext {
		public TerminalNode LANGUAGEDATA() { return getToken(GrammarjsonldParser.LANGUAGEDATA, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextIdContext> contextId() {
			return getRuleContexts(ContextIdContext.class);
		}
		public ContextIdContext contextId(int i) {
			return getRuleContext(ContextIdContext.class,i);
		}
		public List<ContextContainerContext> contextContainer() {
			return getRuleContexts(ContextContainerContext.class);
		}
		public ContextContainerContext contextContainer(int i) {
			return getRuleContext(ContextContainerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextLanguageDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextLanguageData; }
	}

	public final ContextLanguageDataContext contextLanguageData() throws RecognitionException {
		ContextLanguageDataContext _localctx = new ContextLanguageDataContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_contextLanguageData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(LANGUAGEDATA);
			setState(363);
			match(COLON);
			setState(364);
			match(OPENBRACKET);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MANDATORY) | (1L << CONTAINER) | (1L << ID))) != 0)) {
				{
				{
				setState(368);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANDATORY:
					{
					setState(365);
					contextMandatory();
					}
					break;
				case ID:
					{
					setState(366);
					contextId();
					}
					break;
				case CONTAINER:
					{
					setState(367);
					contextContainer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(370);
					match(COMMA);
					}
				}

				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(CLOSEBRACKET);
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

	public static class ContextClassContext extends ParserRuleContext {
		public TerminalNode CONTEXTCLASS() { return getToken(GrammarjsonldParser.CONTEXTCLASS, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextIdContext> contextId() {
			return getRuleContexts(ContextIdContext.class);
		}
		public ContextIdContext contextId(int i) {
			return getRuleContext(ContextIdContext.class,i);
		}
		public List<ContextNameContext> contextName() {
			return getRuleContexts(ContextNameContext.class);
		}
		public ContextNameContext contextName(int i) {
			return getRuleContext(ContextNameContext.class,i);
		}
		public List<ContextLabelContext> contextLabel() {
			return getRuleContexts(ContextLabelContext.class);
		}
		public ContextLabelContext contextLabel(int i) {
			return getRuleContext(ContextLabelContext.class,i);
		}
		public List<ContextInheritsContext> contextInherits() {
			return getRuleContexts(ContextInheritsContext.class);
		}
		public ContextInheritsContext contextInherits(int i) {
			return getRuleContext(ContextInheritsContext.class,i);
		}
		public List<ContextPropertiesContext> contextProperties() {
			return getRuleContexts(ContextPropertiesContext.class);
		}
		public ContextPropertiesContext contextProperties(int i) {
			return getRuleContext(ContextPropertiesContext.class,i);
		}
		public List<ContextOidContext> contextOid() {
			return getRuleContexts(ContextOidContext.class);
		}
		public ContextOidContext contextOid(int i) {
			return getRuleContext(ContextOidContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextClass; }
	}

	public final ContextClassContext contextClass() throws RecognitionException {
		ContextClassContext _localctx = new ContextClassContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_contextClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(CONTEXTCLASS);
			setState(381);
			match(COLON);
			setState(382);
			match(OPENBRACKET);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NAME) | (1L << LABEL) | (1L << INHERITS) | (1L << PROPERTIES) | (1L << OID))) != 0)) {
				{
				{
				setState(389);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(383);
					contextId();
					}
					break;
				case NAME:
					{
					setState(384);
					contextName();
					}
					break;
				case LABEL:
					{
					setState(385);
					contextLabel();
					}
					break;
				case INHERITS:
					{
					setState(386);
					contextInherits();
					}
					break;
				case PROPERTIES:
					{
					setState(387);
					contextProperties();
					}
					break;
				case OID:
					{
					setState(388);
					contextOid();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(391);
					match(COMMA);
					}
				}

				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(CLOSEBRACKET);
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

	public static class ContextInheritsContext extends ParserRuleContext {
		public TerminalNode INHERITS() { return getToken(GrammarjsonldParser.INHERITS, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextIdContext> contextId() {
			return getRuleContexts(ContextIdContext.class);
		}
		public ContextIdContext contextId(int i) {
			return getRuleContext(ContextIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextInheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextInherits; }
	}

	public final ContextInheritsContext contextInherits() throws RecognitionException {
		ContextInheritsContext _localctx = new ContextInheritsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_contextInherits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(INHERITS);
			setState(402);
			match(COLON);
			setState(403);
			match(OPENBRACKET);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MANDATORY || _la==ID) {
				{
				{
				setState(406);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANDATORY:
					{
					setState(404);
					contextMandatory();
					}
					break;
				case ID:
					{
					setState(405);
					contextId();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(408);
					match(COMMA);
					}
				}

				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			match(CLOSEBRACKET);
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

	public static class ContextPropertiesContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(GrammarjsonldParser.PROPERTIES, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextIdContext> contextId() {
			return getRuleContexts(ContextIdContext.class);
		}
		public ContextIdContext contextId(int i) {
			return getRuleContext(ContextIdContext.class,i);
		}
		public List<ContextContainerContext> contextContainer() {
			return getRuleContexts(ContextContainerContext.class);
		}
		public ContextContainerContext contextContainer(int i) {
			return getRuleContext(ContextContainerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextProperties; }
	}

	public final ContextPropertiesContext contextProperties() throws RecognitionException {
		ContextPropertiesContext _localctx = new ContextPropertiesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_contextProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(PROPERTIES);
			setState(419);
			match(COLON);
			setState(420);
			match(OPENBRACKET);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MANDATORY) | (1L << CONTAINER) | (1L << ID))) != 0)) {
				{
				{
				setState(424);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANDATORY:
					{
					setState(421);
					contextMandatory();
					}
					break;
				case ID:
					{
					setState(422);
					contextId();
					}
					break;
				case CONTAINER:
					{
					setState(423);
					contextContainer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(426);
					match(COMMA);
					}
				}

				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			match(CLOSEBRACKET);
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

	public static class ContextOidContext extends ParserRuleContext {
		public TerminalNode OID() { return getToken(GrammarjsonldParser.OID, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextTypeContext> contextType() {
			return getRuleContexts(ContextTypeContext.class);
		}
		public ContextTypeContext contextType(int i) {
			return getRuleContext(ContextTypeContext.class,i);
		}
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextOidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextOid; }
	}

	public final ContextOidContext contextOid() throws RecognitionException {
		ContextOidContext _localctx = new ContextOidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_contextOid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(OID);
			setState(437);
			match(COLON);
			setState(438);
			match(OPENBRACKET);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MANDATORY || _la==CONTEXTTYPE) {
				{
				{
				setState(441);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTEXTTYPE:
					{
					setState(439);
					contextType();
					}
					break;
				case MANDATORY:
					{
					setState(440);
					contextMandatory();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(443);
					match(COMMA);
					}
				}

				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			match(CLOSEBRACKET);
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

	public static class ContextRelationshipContext extends ParserRuleContext {
		public TerminalNode RELATIONSHIP() { return getToken(GrammarjsonldParser.RELATIONSHIP, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextIdContext> contextId() {
			return getRuleContexts(ContextIdContext.class);
		}
		public ContextIdContext contextId(int i) {
			return getRuleContext(ContextIdContext.class,i);
		}
		public List<ContextNameContext> contextName() {
			return getRuleContexts(ContextNameContext.class);
		}
		public ContextNameContext contextName(int i) {
			return getRuleContext(ContextNameContext.class,i);
		}
		public List<ContextLabelContext> contextLabel() {
			return getRuleContexts(ContextLabelContext.class);
		}
		public ContextLabelContext contextLabel(int i) {
			return getRuleContext(ContextLabelContext.class,i);
		}
		public List<ContextFromContext> contextFrom() {
			return getRuleContexts(ContextFromContext.class);
		}
		public ContextFromContext contextFrom(int i) {
			return getRuleContext(ContextFromContext.class,i);
		}
		public List<ContextToContext> contextTo() {
			return getRuleContexts(ContextToContext.class);
		}
		public ContextToContext contextTo(int i) {
			return getRuleContext(ContextToContext.class,i);
		}
		public List<ContextReverseNameContext> contextReverseName() {
			return getRuleContexts(ContextReverseNameContext.class);
		}
		public ContextReverseNameContext contextReverseName(int i) {
			return getRuleContext(ContextReverseNameContext.class,i);
		}
		public List<ContextLabelReverseNameContext> contextLabelReverseName() {
			return getRuleContexts(ContextLabelReverseNameContext.class);
		}
		public ContextLabelReverseNameContext contextLabelReverseName(int i) {
			return getRuleContext(ContextLabelReverseNameContext.class,i);
		}
		public List<ContextPropertiesContext> contextProperties() {
			return getRuleContexts(ContextPropertiesContext.class);
		}
		public ContextPropertiesContext contextProperties(int i) {
			return getRuleContext(ContextPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextRelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextRelationship; }
	}

	public final ContextRelationshipContext contextRelationship() throws RecognitionException {
		ContextRelationshipContext _localctx = new ContextRelationshipContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_contextRelationship);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(RELATIONSHIP);
			setState(454);
			match(COLON);
			setState(455);
			match(OPENBRACKET);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NAME) | (1L << LABEL) | (1L << PROPERTIES) | (1L << REVERSENAME) | (1L << REVERSELABEL) | (1L << FROM) | (1L << TO))) != 0)) {
				{
				{
				setState(464);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(456);
					contextId();
					}
					break;
				case NAME:
					{
					setState(457);
					contextName();
					}
					break;
				case LABEL:
					{
					setState(458);
					contextLabel();
					}
					break;
				case FROM:
					{
					setState(459);
					contextFrom();
					}
					break;
				case TO:
					{
					setState(460);
					contextTo();
					}
					break;
				case REVERSENAME:
					{
					setState(461);
					contextReverseName();
					}
					break;
				case REVERSELABEL:
					{
					setState(462);
					contextLabelReverseName();
					}
					break;
				case PROPERTIES:
					{
					setState(463);
					contextProperties();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(466);
					match(COMMA);
					}
				}

				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(CLOSEBRACKET);
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

	public static class ContextFromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(GrammarjsonldParser.FROM, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextIdContext> contextId() {
			return getRuleContexts(ContextIdContext.class);
		}
		public ContextIdContext contextId(int i) {
			return getRuleContext(ContextIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextFrom; }
	}

	public final ContextFromContext contextFrom() throws RecognitionException {
		ContextFromContext _localctx = new ContextFromContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_contextFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(FROM);
			setState(477);
			match(COLON);
			setState(478);
			match(OPENBRACKET);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MANDATORY || _la==ID) {
				{
				{
				setState(481);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANDATORY:
					{
					setState(479);
					contextMandatory();
					}
					break;
				case ID:
					{
					setState(480);
					contextId();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(483);
					match(COMMA);
					}
				}

				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(CLOSEBRACKET);
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

	public static class ContextToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(GrammarjsonldParser.TO, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextIdContext> contextId() {
			return getRuleContexts(ContextIdContext.class);
		}
		public ContextIdContext contextId(int i) {
			return getRuleContext(ContextIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextTo; }
	}

	public final ContextToContext contextTo() throws RecognitionException {
		ContextToContext _localctx = new ContextToContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_contextTo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(TO);
			setState(494);
			match(COLON);
			setState(495);
			match(OPENBRACKET);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MANDATORY || _la==ID) {
				{
				{
				setState(498);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANDATORY:
					{
					setState(496);
					contextMandatory();
					}
					break;
				case ID:
					{
					setState(497);
					contextId();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(500);
					match(COMMA);
					}
				}

				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			match(CLOSEBRACKET);
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

	public static class ContextReverseNameContext extends ParserRuleContext {
		public TerminalNode REVERSENAME() { return getToken(GrammarjsonldParser.REVERSENAME, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextTypeContext> contextType() {
			return getRuleContexts(ContextTypeContext.class);
		}
		public ContextTypeContext contextType(int i) {
			return getRuleContext(ContextTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextReverseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextReverseName; }
	}

	public final ContextReverseNameContext contextReverseName() throws RecognitionException {
		ContextReverseNameContext _localctx = new ContextReverseNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_contextReverseName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(REVERSENAME);
			setState(511);
			match(COLON);
			setState(512);
			match(OPENBRACKET);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MANDATORY || _la==CONTEXTTYPE) {
				{
				{
				setState(515);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANDATORY:
					{
					setState(513);
					contextMandatory();
					}
					break;
				case CONTEXTTYPE:
					{
					setState(514);
					contextType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(517);
					match(COMMA);
					}
				}

				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
			match(CLOSEBRACKET);
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

	public static class ContextLabelReverseNameContext extends ParserRuleContext {
		public TerminalNode REVERSELABEL() { return getToken(GrammarjsonldParser.REVERSELABEL, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<ContextTypeContext> contextType() {
			return getRuleContexts(ContextTypeContext.class);
		}
		public ContextTypeContext contextType(int i) {
			return getRuleContext(ContextTypeContext.class,i);
		}
		public List<ContextMandatoryContext> contextMandatory() {
			return getRuleContexts(ContextMandatoryContext.class);
		}
		public ContextMandatoryContext contextMandatory(int i) {
			return getRuleContext(ContextMandatoryContext.class,i);
		}
		public List<ContextContainerContext> contextContainer() {
			return getRuleContexts(ContextContainerContext.class);
		}
		public ContextContainerContext contextContainer(int i) {
			return getRuleContext(ContextContainerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public ContextLabelReverseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextLabelReverseName; }
	}

	public final ContextLabelReverseNameContext contextLabelReverseName() throws RecognitionException {
		ContextLabelReverseNameContext _localctx = new ContextLabelReverseNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_contextLabelReverseName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(REVERSELABEL);
			setState(528);
			match(COLON);
			setState(529);
			match(OPENBRACKET);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MANDATORY) | (1L << CONTAINER) | (1L << CONTEXTTYPE))) != 0)) {
				{
				{
				setState(533);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTEXTTYPE:
					{
					setState(530);
					contextType();
					}
					break;
				case MANDATORY:
					{
					setState(531);
					contextMandatory();
					}
					break;
				case CONTAINER:
					{
					setState(532);
					contextContainer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(535);
					match(COMMA);
					}
				}

				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543);
			match(CLOSEBRACKET);
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

	public static class ContextTypeContext extends ParserRuleContext {
		public TerminalNode CONTEXTTYPE() { return getToken(GrammarjsonldParser.CONTEXTTYPE, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ContextTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextType; }
	}

	public final ContextTypeContext contextType() throws RecognitionException {
		ContextTypeContext _localctx = new ContextTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_contextType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(CONTEXTTYPE);
			setState(546);
			match(COLON);
			setState(547);
			value();
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

	public static class ContextValueContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(GrammarjsonldParser.VALUE, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(GrammarjsonldParser.STRING, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public ContextValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextValue; }
	}

	public final ContextValueContext contextValue() throws RecognitionException {
		ContextValueContext _localctx = new ContextValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_contextValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(VALUE);
			setState(550);
			match(COLON);
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(551);
				match(STRING);
				}
				break;
			case FALSE:
			case TRUE:
				{
				setState(552);
				booleanValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ContextContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER() { return getToken(GrammarjsonldParser.CONTAINER, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(GrammarjsonldParser.STRING, 0); }
		public ContextContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextContainer; }
	}

	public final ContextContainerContext contextContainer() throws RecognitionException {
		ContextContainerContext _localctx = new ContextContainerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_contextContainer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(CONTAINER);
			setState(556);
			match(COLON);
			setState(557);
			match(STRING);
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

	public static class ContextMandatoryContext extends ParserRuleContext {
		public TerminalNode MANDATORY() { return getToken(GrammarjsonldParser.MANDATORY, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public ContextMandatoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextMandatory; }
	}

	public final ContextMandatoryContext contextMandatory() throws RecognitionException {
		ContextMandatoryContext _localctx = new ContextMandatoryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_contextMandatory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(MANDATORY);
			setState(560);
			match(COLON);
			setState(561);
			booleanValue();
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

	public static class GraphsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarjsonldParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode SQUAREOPENBRACKET() { return getToken(GrammarjsonldParser.SQUAREOPENBRACKET, 0); }
		public TerminalNode SQUARECLOSEBRACKET() { return getToken(GrammarjsonldParser.SQUARECLOSEBRACKET, 0); }
		public List<GraphContext> graph() {
			return getRuleContexts(GraphContext.class);
		}
		public GraphContext graph(int i) {
			return getRuleContext(GraphContext.class,i);
		}
		public GraphsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphs; }
	}

	public final GraphsContext graphs() throws RecognitionException {
		GraphsContext _localctx = new GraphsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_graphs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(STRING);
			setState(564);
			match(COLON);
			setState(565);
			match(SQUAREOPENBRACKET);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENBRACKET) {
				{
				{
				setState(566);
				graph();
				}
				}
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(572);
			match(SQUARECLOSEBRACKET);
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

	public static class GraphContext extends ParserRuleContext {
		public List<TerminalNode> OPENBRACKET() { return getTokens(GrammarjsonldParser.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(GrammarjsonldParser.OPENBRACKET, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public GraphTypeContext graphType() {
			return getRuleContext(GraphTypeContext.class,0);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(GrammarjsonldParser.CLOSEBRACKET); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(GrammarjsonldParser.CLOSEBRACKET, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(OPENBRACKET);
			setState(575);
			value();
			setState(576);
			match(COLON);
			setState(577);
			match(OPENBRACKET);
			setState(578);
			graphType();
			setState(579);
			match(CLOSEBRACKET);
			setState(580);
			match(CLOSEBRACKET);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(581);
				match(COMMA);
				}
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

	public static class GraphTypeContext extends ParserRuleContext {
		public TerminalNode GRAPHTYPE() { return getToken(GrammarjsonldParser.GRAPHTYPE, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode SQUAREOPENBRACKET() { return getToken(GrammarjsonldParser.SQUAREOPENBRACKET, 0); }
		public TerminalNode SQUARECLOSEBRACKET() { return getToken(GrammarjsonldParser.SQUARECLOSEBRACKET, 0); }
		public List<ClassObjectContext> classObject() {
			return getRuleContexts(ClassObjectContext.class);
		}
		public ClassObjectContext classObject(int i) {
			return getRuleContext(ClassObjectContext.class,i);
		}
		public List<RelationshipContext> relationship() {
			return getRuleContexts(RelationshipContext.class);
		}
		public RelationshipContext relationship(int i) {
			return getRuleContext(RelationshipContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public GraphTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphType; }
	}

	public final GraphTypeContext graphType() throws RecognitionException {
		GraphTypeContext _localctx = new GraphTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_graphType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(GRAPHTYPE);
			setState(585);
			match(COLON);
			setState(586);
			match(SQUAREOPENBRACKET);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENBRACKET) {
				{
				setState(590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(587);
					classObject();
					}
					break;
				case 2:
					{
					setState(588);
					relationship();
					}
					break;
				case 3:
					{
					setState(589);
					property();
					}
					break;
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
			match(SQUARECLOSEBRACKET);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TypeOfContext> typeOf() {
			return getRuleContexts(TypeOfContext.class);
		}
		public TypeOfContext typeOf(int i) {
			return getRuleContext(TypeOfContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<IsListContext> isList() {
			return getRuleContexts(IsListContext.class);
		}
		public IsListContext isList(int i) {
			return getRuleContext(IsListContext.class,i);
		}
		public List<OptionalContext> optional() {
			return getRuleContexts(OptionalContext.class);
		}
		public OptionalContext optional(int i) {
			return getRuleContext(OptionalContext.class,i);
		}
		public List<MultiplicityMaxContext> multiplicityMax() {
			return getRuleContexts(MultiplicityMaxContext.class);
		}
		public MultiplicityMaxContext multiplicityMax(int i) {
			return getRuleContext(MultiplicityMaxContext.class,i);
		}
		public List<MultiplicityMinContext> multiplicityMin() {
			return getRuleContexts(MultiplicityMinContext.class);
		}
		public MultiplicityMinContext multiplicityMin(int i) {
			return getRuleContext(MultiplicityMinContext.class,i);
		}
		public List<UsedByContext> usedBy() {
			return getRuleContexts(UsedByContext.class);
		}
		public UsedByContext usedBy(int i) {
			return getRuleContext(UsedByContext.class,i);
		}
		public List<LanguageDataContext> languageData() {
			return getRuleContexts(LanguageDataContext.class);
		}
		public LanguageDataContext languageData(int i) {
			return getRuleContext(LanguageDataContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(OPENBRACKET);
			setState(598);
			id();
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << TYPEOF) | (1L << LABEL) | (1L << ISLIST) | (1L << OPTIONAL) | (1L << MULTIPLICITYMIN) | (1L << MULTIPLICITYMAX) | (1L << USEDBY) | (1L << LANGUAGEDATA))) != 0)) {
				{
				setState(608);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(599);
					name();
					}
					break;
				case TYPEOF:
					{
					setState(600);
					typeOf();
					}
					break;
				case LABEL:
					{
					setState(601);
					label();
					}
					break;
				case ISLIST:
					{
					setState(602);
					isList();
					}
					break;
				case OPTIONAL:
					{
					setState(603);
					optional();
					}
					break;
				case MULTIPLICITYMAX:
					{
					setState(604);
					multiplicityMax();
					}
					break;
				case MULTIPLICITYMIN:
					{
					setState(605);
					multiplicityMin();
					}
					break;
				case USEDBY:
					{
					setState(606);
					usedBy();
					}
					break;
				case LANGUAGEDATA:
					{
					setState(607);
					languageData();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			match(CLOSEBRACKET);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(614);
				match(COMMA);
				}
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarjsonldParser.ID, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(ID);
			setState(618);
			match(COLON);
			setState(619);
			value();
			setState(620);
			match(COMMA);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarjsonldParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(NAME);
			setState(623);
			match(COLON);
			setState(624);
			value();
			setState(625);
			match(COMMA);
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

	public static class TypeOfContext extends ParserRuleContext {
		public TerminalNode TYPEOF() { return getToken(GrammarjsonldParser.TYPEOF, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public TypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOf; }
	}

	public final TypeOfContext typeOf() throws RecognitionException {
		TypeOfContext _localctx = new TypeOfContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(TYPEOF);
			setState(628);
			match(COLON);
			setState(629);
			value();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(630);
				match(COMMA);
				}
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(GrammarjsonldParser.LABEL, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(LABEL);
			setState(634);
			match(COLON);
			setState(635);
			match(OPENBRACKET);
			setState(636);
			reference();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(637);
				match(COMMA);
				}
			}

			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(640);
				reference();
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(641);
					match(COMMA);
					}
				}

				}
				}
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(649);
			match(CLOSEBRACKET);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(650);
				match(COMMA);
				}
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

	public static class IsListContext extends ParserRuleContext {
		public TerminalNode ISLIST() { return getToken(GrammarjsonldParser.ISLIST, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public IsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isList; }
	}

	public final IsListContext isList() throws RecognitionException {
		IsListContext _localctx = new IsListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_isList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(ISLIST);
			setState(654);
			match(COLON);
			setState(655);
			booleanValue();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(656);
				match(COMMA);
				}
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(GrammarjsonldParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GrammarjsonldParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OptionalContext extends ParserRuleContext {
		public TerminalNode OPTIONAL() { return getToken(GrammarjsonldParser.OPTIONAL, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public OptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional; }
	}

	public final OptionalContext optional() throws RecognitionException {
		OptionalContext _localctx = new OptionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_optional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(OPTIONAL);
			setState(662);
			match(COLON);
			setState(663);
			booleanValue();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(664);
				match(COMMA);
				}
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

	public static class MultiplicityMaxContext extends ParserRuleContext {
		public TerminalNode MULTIPLICITYMAX() { return getToken(GrammarjsonldParser.MULTIPLICITYMAX, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public MultiplicityMaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicityMax; }
	}

	public final MultiplicityMaxContext multiplicityMax() throws RecognitionException {
		MultiplicityMaxContext _localctx = new MultiplicityMaxContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multiplicityMax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(MULTIPLICITYMAX);
			setState(668);
			match(COLON);
			setState(669);
			value();
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(670);
				match(COMMA);
				}
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

	public static class MultiplicityMinContext extends ParserRuleContext {
		public TerminalNode MULTIPLICITYMIN() { return getToken(GrammarjsonldParser.MULTIPLICITYMIN, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public MultiplicityMinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicityMin; }
	}

	public final MultiplicityMinContext multiplicityMin() throws RecognitionException {
		MultiplicityMinContext _localctx = new MultiplicityMinContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_multiplicityMin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(MULTIPLICITYMIN);
			setState(674);
			match(COLON);
			setState(675);
			value();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(676);
				match(COMMA);
				}
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

	public static class UsedByContext extends ParserRuleContext {
		public TerminalNode USEDBY() { return getToken(GrammarjsonldParser.USEDBY, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode SQUAREOPENBRACKET() { return getToken(GrammarjsonldParser.SQUAREOPENBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode SQUARECLOSEBRACKET() { return getToken(GrammarjsonldParser.SQUARECLOSEBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public UsedByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usedBy; }
	}

	public final UsedByContext usedBy() throws RecognitionException {
		UsedByContext _localctx = new UsedByContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_usedBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(USEDBY);
			setState(680);
			match(COLON);
			setState(681);
			match(SQUAREOPENBRACKET);
			setState(682);
			value();
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(683);
				match(COMMA);
				}
			}

			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGUAGE) | (1L << NAME) | (1L << PROPERTIES) | (1L << STRING))) != 0)) {
				{
				{
				setState(686);
				value();
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(687);
					match(COMMA);
					}
				}

				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(695);
			match(SQUARECLOSEBRACKET);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(696);
				match(COMMA);
				}
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

	public static class LanguageDataContext extends ParserRuleContext {
		public TerminalNode LANGUAGEDATA() { return getToken(GrammarjsonldParser.LANGUAGEDATA, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode SQUAREOPENBRACKET() { return getToken(GrammarjsonldParser.SQUAREOPENBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode SQUARECLOSEBRACKET() { return getToken(GrammarjsonldParser.SQUARECLOSEBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public LanguageDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageData; }
	}

	public final LanguageDataContext languageData() throws RecognitionException {
		LanguageDataContext _localctx = new LanguageDataContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_languageData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(LANGUAGEDATA);
			setState(700);
			match(COLON);
			setState(701);
			match(SQUAREOPENBRACKET);
			setState(702);
			value();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(703);
				match(COMMA);
				}
			}

			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGUAGE) | (1L << NAME) | (1L << PROPERTIES) | (1L << STRING))) != 0)) {
				{
				{
				setState(706);
				value();
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(707);
					match(COMMA);
					}
				}

				}
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(715);
			match(SQUARECLOSEBRACKET);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(716);
				match(COMMA);
				}
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarjsonldParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(STRING);
			setState(720);
			match(COLON);
			setState(721);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarjsonldParser.STRING, 0); }
		public TerminalNode PROPERTIES() { return getToken(GrammarjsonldParser.PROPERTIES, 0); }
		public TerminalNode LANGUAGE() { return getToken(GrammarjsonldParser.LANGUAGE, 0); }
		public TerminalNode NAME() { return getToken(GrammarjsonldParser.NAME, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGUAGE) | (1L << NAME) | (1L << PROPERTIES) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ClassObjectContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<OidContext> oid() {
			return getRuleContexts(OidContext.class);
		}
		public OidContext oid(int i) {
			return getRuleContext(OidContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<InheritsContext> inherits() {
			return getRuleContexts(InheritsContext.class);
		}
		public InheritsContext inherits(int i) {
			return getRuleContext(InheritsContext.class,i);
		}
		public List<PropertiesContext> properties() {
			return getRuleContexts(PropertiesContext.class);
		}
		public PropertiesContext properties(int i) {
			return getRuleContext(PropertiesContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public ClassObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classObject; }
	}

	public final ClassObjectContext classObject() throws RecognitionException {
		ClassObjectContext _localctx = new ClassObjectContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(OPENBRACKET);
			setState(726);
			id();
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << LABEL) | (1L << INHERITS) | (1L << PROPERTIES) | (1L << OID))) != 0)) {
				{
				setState(732);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(727);
					name();
					}
					break;
				case OID:
					{
					setState(728);
					oid();
					}
					break;
				case LABEL:
					{
					setState(729);
					label();
					}
					break;
				case INHERITS:
					{
					setState(730);
					inherits();
					}
					break;
				case PROPERTIES:
					{
					setState(731);
					properties();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(737);
			match(CLOSEBRACKET);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(738);
				match(COMMA);
				}
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

	public static class InheritsContext extends ParserRuleContext {
		public TerminalNode INHERITS() { return getToken(GrammarjsonldParser.INHERITS, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public InheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherits; }
	}

	public final InheritsContext inherits() throws RecognitionException {
		InheritsContext _localctx = new InheritsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_inherits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(INHERITS);
			setState(742);
			match(COLON);
			setState(743);
			value();
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(744);
				match(COMMA);
				}
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

	public static class PropertiesContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(GrammarjsonldParser.PROPERTIES, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode SQUAREOPENBRACKET() { return getToken(GrammarjsonldParser.SQUAREOPENBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode SQUARECLOSEBRACKET() { return getToken(GrammarjsonldParser.SQUARECLOSEBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(PROPERTIES);
			setState(748);
			match(COLON);
			setState(749);
			match(SQUAREOPENBRACKET);
			setState(750);
			value();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(751);
				match(COMMA);
				}
			}

			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGUAGE) | (1L << NAME) | (1L << PROPERTIES) | (1L << STRING))) != 0)) {
				{
				{
				setState(754);
				value();
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(755);
					match(COMMA);
					}
				}

				}
				}
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(763);
			match(SQUARECLOSEBRACKET);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(764);
				match(COMMA);
				}
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

	public static class OidContext extends ParserRuleContext {
		public TerminalNode OID() { return getToken(GrammarjsonldParser.OID, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode SQUAREOPENBRACKET() { return getToken(GrammarjsonldParser.SQUAREOPENBRACKET, 0); }
		public TerminalNode SQUARECLOSEBRACKET() { return getToken(GrammarjsonldParser.SQUARECLOSEBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public OidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oid; }
	}

	public final OidContext oid() throws RecognitionException {
		OidContext _localctx = new OidContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_oid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(OID);
			setState(768);
			match(COLON);
			setState(769);
			match(SQUAREOPENBRACKET);
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(770);
				value();
				}
				break;
			}
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(773);
				match(COMMA);
				}
			}

			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGUAGE) | (1L << NAME) | (1L << PROPERTIES) | (1L << STRING))) != 0)) {
				{
				{
				setState(776);
				value();
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(777);
					match(COMMA);
					}
				}

				}
				}
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(785);
			match(SQUARECLOSEBRACKET);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(786);
				match(COMMA);
				}
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

	public static class RelationshipContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<ReverseNameContext> reverseName() {
			return getRuleContexts(ReverseNameContext.class);
		}
		public ReverseNameContext reverseName(int i) {
			return getRuleContext(ReverseNameContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<LabelReverseNameContext> labelReverseName() {
			return getRuleContexts(LabelReverseNameContext.class);
		}
		public LabelReverseNameContext labelReverseName(int i) {
			return getRuleContext(LabelReverseNameContext.class,i);
		}
		public List<FromContext> from() {
			return getRuleContexts(FromContext.class);
		}
		public FromContext from(int i) {
			return getRuleContext(FromContext.class,i);
		}
		public List<ToContext> to() {
			return getRuleContexts(ToContext.class);
		}
		public ToContext to(int i) {
			return getRuleContext(ToContext.class,i);
		}
		public List<PropertiesContext> properties() {
			return getRuleContexts(PropertiesContext.class);
		}
		public PropertiesContext properties(int i) {
			return getRuleContext(PropertiesContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public RelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship; }
	}

	public final RelationshipContext relationship() throws RecognitionException {
		RelationshipContext _localctx = new RelationshipContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_relationship);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(OPENBRACKET);
			setState(790);
			id();
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << LABEL) | (1L << PROPERTIES) | (1L << REVERSENAME) | (1L << REVERSELABEL) | (1L << FROM) | (1L << TO))) != 0)) {
				{
				setState(798);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(791);
					name();
					}
					break;
				case REVERSENAME:
					{
					setState(792);
					reverseName();
					}
					break;
				case LABEL:
					{
					setState(793);
					label();
					}
					break;
				case REVERSELABEL:
					{
					setState(794);
					labelReverseName();
					}
					break;
				case FROM:
					{
					setState(795);
					from();
					}
					break;
				case TO:
					{
					setState(796);
					to();
					}
					break;
				case PROPERTIES:
					{
					setState(797);
					properties();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(803);
			match(CLOSEBRACKET);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(804);
				match(COMMA);
				}
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

	public static class ReverseNameContext extends ParserRuleContext {
		public TerminalNode REVERSENAME() { return getToken(GrammarjsonldParser.REVERSENAME, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public ReverseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverseName; }
	}

	public final ReverseNameContext reverseName() throws RecognitionException {
		ReverseNameContext _localctx = new ReverseNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_reverseName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(REVERSENAME);
			setState(808);
			match(COLON);
			setState(809);
			value();
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(810);
				match(COMMA);
				}
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

	public static class LabelReverseNameContext extends ParserRuleContext {
		public TerminalNode REVERSELABEL() { return getToken(GrammarjsonldParser.REVERSELABEL, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GrammarjsonldParser.OPENBRACKET, 0); }
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(GrammarjsonldParser.CLOSEBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarjsonldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarjsonldParser.COMMA, i);
		}
		public LabelReverseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelReverseName; }
	}

	public final LabelReverseNameContext labelReverseName() throws RecognitionException {
		LabelReverseNameContext _localctx = new LabelReverseNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_labelReverseName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(REVERSELABEL);
			setState(814);
			match(COLON);
			setState(815);
			match(OPENBRACKET);
			setState(816);
			reference();
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(817);
				match(COMMA);
				}
			}

			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(820);
				reference();
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(821);
					match(COMMA);
					}
				}

				}
				}
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(829);
			match(CLOSEBRACKET);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(830);
				match(COMMA);
				}
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

	public static class FromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(GrammarjsonldParser.FROM, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(FROM);
			setState(834);
			match(COLON);
			setState(835);
			value();
			setState(836);
			match(COMMA);
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

	public static class ToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(GrammarjsonldParser.TO, 0); }
		public TerminalNode COLON() { return getToken(GrammarjsonldParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarjsonldParser.COMMA, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(TO);
			setState(839);
			match(COLON);
			setState(840);
			value();
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(841);
				match(COMMA);
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u034f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\5\2{\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0088\n"+
		"\3\3\3\5\3\u008b\n\3\6\3\u008d\n\3\r\3\16\3\u008e\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a3\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00ab\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b3\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bb\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ce\n\n\3\n\5\n\u00d1\n\n"+
		"\7\n\u00d3\n\n\f\n\16\n\u00d6\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00e4\n\f\3\f\5\f\u00e7\n\f\7\f\u00e9\n\f\f\f\16"+
		"\f\u00ec\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f6\n\r\3\r\5\r\u00f9"+
		"\n\r\7\r\u00fb\n\r\f\r\16\r\u00fe\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0107\n\16\3\16\5\16\u010a\n\16\7\16\u010c\n\16\f\16\16\16\u010f"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0119\n\17\3\17\5"+
		"\17\u011c\n\17\7\17\u011e\n\17\f\17\16\17\u0121\13\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u012b\n\20\3\20\5\20\u012e\n\20\7\20\u0130"+
		"\n\20\f\20\16\20\u0133\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u013d\n\21\3\21\5\21\u0140\n\21\7\21\u0142\n\21\f\21\16\21\u0145\13"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014f\n\22\3\22\5\22"+
		"\u0152\n\22\7\22\u0154\n\22\f\22\16\22\u0157\13\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0161\n\23\3\23\5\23\u0164\n\23\7\23\u0166\n"+
		"\23\f\23\16\23\u0169\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0173\n\24\3\24\5\24\u0176\n\24\7\24\u0178\n\24\f\24\16\24\u017b\13\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0188\n\25"+
		"\3\25\5\25\u018b\n\25\7\25\u018d\n\25\f\25\16\25\u0190\13\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0199\n\26\3\26\5\26\u019c\n\26\7\26\u019e"+
		"\n\26\f\26\16\26\u01a1\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u01ab\n\27\3\27\5\27\u01ae\n\27\7\27\u01b0\n\27\f\27\16\27\u01b3\13"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u01bc\n\30\3\30\5\30\u01bf"+
		"\n\30\7\30\u01c1\n\30\f\30\16\30\u01c4\13\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01d3\n\31\3\31\5\31\u01d6"+
		"\n\31\7\31\u01d8\n\31\f\31\16\31\u01db\13\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u01e4\n\32\3\32\5\32\u01e7\n\32\7\32\u01e9\n\32\f\32\16"+
		"\32\u01ec\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u01f5\n\33\3\33"+
		"\5\33\u01f8\n\33\7\33\u01fa\n\33\f\33\16\33\u01fd\13\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0206\n\34\3\34\5\34\u0209\n\34\7\34\u020b\n"+
		"\34\f\34\16\34\u020e\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0218\n\35\3\35\5\35\u021b\n\35\7\35\u021d\n\35\f\35\16\35\u0220\13\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u022c\n\37\3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u023a\n\"\f\"\16\"\u023d\13"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0249\n#\3$\3$\3$\3$\3$\3$\7$\u0251"+
		"\n$\f$\16$\u0254\13$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0263\n"+
		"%\f%\16%\u0266\13%\3%\3%\5%\u026a\n%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\5(\u027a\n(\3)\3)\3)\3)\3)\5)\u0281\n)\3)\3)\5)\u0285\n"+
		")\7)\u0287\n)\f)\16)\u028a\13)\3)\3)\5)\u028e\n)\3*\3*\3*\3*\5*\u0294"+
		"\n*\3+\3+\3,\3,\3,\3,\5,\u029c\n,\3-\3-\3-\3-\5-\u02a2\n-\3.\3.\3.\3."+
		"\5.\u02a8\n.\3/\3/\3/\3/\3/\5/\u02af\n/\3/\3/\5/\u02b3\n/\7/\u02b5\n/"+
		"\f/\16/\u02b8\13/\3/\3/\5/\u02bc\n/\3\60\3\60\3\60\3\60\3\60\5\60\u02c3"+
		"\n\60\3\60\3\60\5\60\u02c7\n\60\7\60\u02c9\n\60\f\60\16\60\u02cc\13\60"+
		"\3\60\3\60\5\60\u02d0\n\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\7\63\u02df\n\63\f\63\16\63\u02e2\13\63\3\63\3\63"+
		"\5\63\u02e6\n\63\3\64\3\64\3\64\3\64\5\64\u02ec\n\64\3\65\3\65\3\65\3"+
		"\65\3\65\5\65\u02f3\n\65\3\65\3\65\5\65\u02f7\n\65\7\65\u02f9\n\65\f\65"+
		"\16\65\u02fc\13\65\3\65\3\65\5\65\u0300\n\65\3\66\3\66\3\66\3\66\5\66"+
		"\u0306\n\66\3\66\5\66\u0309\n\66\3\66\3\66\5\66\u030d\n\66\7\66\u030f"+
		"\n\66\f\66\16\66\u0312\13\66\3\66\3\66\5\66\u0316\n\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0321\n\67\f\67\16\67\u0324\13\67"+
		"\3\67\3\67\5\67\u0328\n\67\38\38\38\38\58\u032e\n8\39\39\39\39\39\59\u0335"+
		"\n9\39\39\59\u0339\n9\79\u033b\n9\f9\169\u033e\139\39\39\59\u0342\n9\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\5;\u034d\n;\3;\2\2<\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2"+
		"\4\3\2,-\6\2\r\r\23\23\35\35..\2\u03b2\2v\3\2\2\2\4\177\3\2\2\2\6\u0092"+
		"\3\2\2\2\b\u009c\3\2\2\2\n\u00a4\3\2\2\2\f\u00ac\3\2\2\2\16\u00b4\3\2"+
		"\2\2\20\u00bc\3\2\2\2\22\u00c0\3\2\2\2\24\u00d9\3\2\2\2\26\u00de\3\2\2"+
		"\2\30\u00ef\3\2\2\2\32\u0101\3\2\2\2\34\u0112\3\2\2\2\36\u0124\3\2\2\2"+
		" \u0136\3\2\2\2\"\u0148\3\2\2\2$\u015a\3\2\2\2&\u016c\3\2\2\2(\u017e\3"+
		"\2\2\2*\u0193\3\2\2\2,\u01a4\3\2\2\2.\u01b6\3\2\2\2\60\u01c7\3\2\2\2\62"+
		"\u01de\3\2\2\2\64\u01ef\3\2\2\2\66\u0200\3\2\2\28\u0211\3\2\2\2:\u0223"+
		"\3\2\2\2<\u0227\3\2\2\2>\u022d\3\2\2\2@\u0231\3\2\2\2B\u0235\3\2\2\2D"+
		"\u0240\3\2\2\2F\u024a\3\2\2\2H\u0257\3\2\2\2J\u026b\3\2\2\2L\u0270\3\2"+
		"\2\2N\u0275\3\2\2\2P\u027b\3\2\2\2R\u028f\3\2\2\2T\u0295\3\2\2\2V\u0297"+
		"\3\2\2\2X\u029d\3\2\2\2Z\u02a3\3\2\2\2\\\u02a9\3\2\2\2^\u02bd\3\2\2\2"+
		"`\u02d1\3\2\2\2b\u02d5\3\2\2\2d\u02d7\3\2\2\2f\u02e7\3\2\2\2h\u02ed\3"+
		"\2\2\2j\u0301\3\2\2\2l\u0317\3\2\2\2n\u0329\3\2\2\2p\u032f\3\2\2\2r\u0343"+
		"\3\2\2\2t\u0348\3\2\2\2vz\7#\2\2wx\5\4\3\2xy\7(\2\2y{\3\2\2\2zw\3\2\2"+
		"\2z{\3\2\2\2{|\3\2\2\2|}\5B\"\2}~\7$\2\2~\3\3\2\2\2\177\u0080\7\3\2\2"+
		"\u0080\u0081\7\'\2\2\u0081\u008c\7#\2\2\u0082\u0088\5\20\t\2\u0083\u0088"+
		"\5\6\4\2\u0084\u0088\5(\25\2\u0085\u0088\5\22\n\2\u0086\u0088\5\60\31"+
		"\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u008b\7(\2\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u0087\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\7$\2\2\u0091\5\3\2\2\2\u0092\u0093\7\7\2\2"+
		"\u0093\u0094\7\'\2\2\u0094\u0095\7#\2\2\u0095\u0096\5\24\13\2\u0096\u0097"+
		"\5\b\5\2\u0097\u0098\5\n\6\2\u0098\u0099\5\f\7\2\u0099\u009a\5\16\b\2"+
		"\u009a\u009b\7$\2\2\u009b\7\3\2\2\2\u009c\u009d\7\r\2\2\u009d\u009e\7"+
		"\'\2\2\u009e\u009f\7#\2\2\u009f\u00a0\5:\36\2\u00a0\u00a2\7$\2\2\u00a1"+
		"\u00a3\7(\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\t\3\2\2\2"+
		"\u00a4\u00a5\7\16\2\2\u00a5\u00a6\7\'\2\2\u00a6\u00a7\7#\2\2\u00a7\u00a8"+
		"\5:\36\2\u00a8\u00aa\7$\2\2\u00a9\u00ab\7(\2\2\u00aa\u00a9\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\13\3\2\2\2\u00ac\u00ad\7\17\2\2\u00ad\u00ae\7\'\2"+
		"\2\u00ae\u00af\7#\2\2\u00af\u00b0\5:\36\2\u00b0\u00b2\7$\2\2\u00b1\u00b3"+
		"\7(\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\r\3\2\2\2\u00b4"+
		"\u00b5\7\f\2\2\u00b5\u00b6\7\'\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\5:\36"+
		"\2\u00b8\u00ba\7$\2\2\u00b9\u00bb\7(\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\17\3\2\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00be\7\'\2\2\u00be"+
		"\u00bf\7.\2\2\u00bf\21\3\2\2\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\7\'\2\2"+
		"\u00c2\u00d4\7#\2\2\u00c3\u00ce\5\24\13\2\u00c4\u00ce\5\26\f\2\u00c5\u00ce"+
		"\5\32\16\2\u00c6\u00ce\5\"\22\2\u00c7\u00ce\5 \21\2\u00c8\u00ce\5\30\r"+
		"\2\u00c9\u00ce\5\34\17\2\u00ca\u00ce\5\36\20\2\u00cb\u00ce\5$\23\2\u00cc"+
		"\u00ce\5&\24\2\u00cd\u00c3\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c5\3\2"+
		"\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd"+
		"\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00d1\7(\2\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8\23\3\2\2\2\u00d9\u00da\7\22\2"+
		"\2\u00da\u00db\7\'\2\2\u00db\u00dc\5b\62\2\u00dc\u00dd\7(\2\2\u00dd\25"+
		"\3\2\2\2\u00de\u00df\7\23\2\2\u00df\u00e0\7\'\2\2\u00e0\u00ea\7#\2\2\u00e1"+
		"\u00e4\5:\36\2\u00e2\u00e4\5@!\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2"+
		"\2\u00e4\u00e6\3\2\2\2\u00e5\u00e7\7(\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00ee\7$\2\2\u00ee\27\3\2\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1"+
		"\7\'\2\2\u00f1\u00fc\7#\2\2\u00f2\u00f6\5:\36\2\u00f3\u00f6\5@!\2\u00f4"+
		"\u00f6\5<\37\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2"+
		"\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f9\7(\2\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0100\7$\2\2\u0100\31\3\2\2\2\u0101\u0102\7\24\2"+
		"\2\u0102\u0103\7\'\2\2\u0103\u010d\7#\2\2\u0104\u0107\5:\36\2\u0105\u0107"+
		"\5@!\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u010a\7(\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0106\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7$"+
		"\2\2\u0111\33\3\2\2\2\u0112\u0113\7\31\2\2\u0113\u0114\7\'\2\2\u0114\u011f"+
		"\7#\2\2\u0115\u0119\5:\36\2\u0116\u0119\5@!\2\u0117\u0119\5<\37\2\u0118"+
		"\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011b\3\2"+
		"\2\2\u011a\u011c\7(\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011e\3\2\2\2\u011d\u0118\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0123\7$\2\2\u0123\35\3\2\2\2\u0124\u0125\7\30\2\2\u0125\u0126\7\'\2"+
		"\2\u0126\u0131\7#\2\2\u0127\u012b\5:\36\2\u0128\u012b\5@!\2\u0129\u012b"+
		"\5<\37\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012e\7(\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0130\3\2\2\2\u012f\u012a\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0134\u0135\7$\2\2\u0135\37\3\2\2\2\u0136\u0137\7\26\2\2\u0137\u0138"+
		"\7\'\2\2\u0138\u0143\7#\2\2\u0139\u013d\5:\36\2\u013a\u013d\5@!\2\u013b"+
		"\u013d\5<\37\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2"+
		"\2\2\u013d\u013f\3\2\2\2\u013e\u0140\7(\2\2\u013f\u013e\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013c\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\7$\2\2\u0147!\3\2\2\2\u0148\u0149\7\25\2\2"+
		"\u0149\u014a\7\'\2\2\u014a\u0155\7#\2\2\u014b\u014f\5:\36\2\u014c\u014f"+
		"\5@!\2\u014d\u014f\5> \2\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u0152\7(\2\2\u0151\u0150\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u014e\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7$\2\2\u0159#\3\2\2\2\u015a\u015b"+
		"\7\32\2\2\u015b\u015c\7\'\2\2\u015c\u0167\7#\2\2\u015d\u0161\5@!\2\u015e"+
		"\u0161\5\24\13\2\u015f\u0161\5> \2\u0160\u015d\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u015f\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0164\7(\2\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0160\3\2"+
		"\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7$\2\2\u016b%\3\2\2\2\u016c"+
		"\u016d\7\33\2\2\u016d\u016e\7\'\2\2\u016e\u0179\7#\2\2\u016f\u0173\5@"+
		"!\2\u0170\u0173\5\24\13\2\u0171\u0173\5> \2\u0172\u016f\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0176\7("+
		"\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177"+
		"\u0172\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7$\2\2\u017d"+
		"\'\3\2\2\2\u017e\u017f\7\4\2\2\u017f\u0180\7\'\2\2\u0180\u018e\7#\2\2"+
		"\u0181\u0188\5\24\13\2\u0182\u0188\5\26\f\2\u0183\u0188\5\"\22\2\u0184"+
		"\u0188\5*\26\2\u0185\u0188\5,\27\2\u0186\u0188\5.\30\2\u0187\u0181\3\2"+
		"\2\2\u0187\u0182\3\2\2\2\u0187\u0183\3\2\2\2\u0187\u0184\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u018b\7("+
		"\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u0187\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7$\2\2\u0192"+
		")\3\2\2\2\u0193\u0194\7\34\2\2\u0194\u0195\7\'\2\2\u0195\u019f\7#\2\2"+
		"\u0196\u0199\5@!\2\u0197\u0199\5\24\13\2\u0198\u0196\3\2\2\2\u0198\u0197"+
		"\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u019c\7(\2\2\u019b\u019a\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u0198\3\2\2\2\u019e\u01a1\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a3\7$\2\2\u01a3+\3\2\2\2\u01a4\u01a5\7\35\2\2"+
		"\u01a5\u01a6\7\'\2\2\u01a6\u01b1\7#\2\2\u01a7\u01ab\5@!\2\u01a8\u01ab"+
		"\5\24\13\2\u01a9\u01ab\5> \2\u01aa\u01a7\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01ae\7(\2\2\u01ad\u01ac\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01aa\3\2\2\2\u01b0"+
		"\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2"+
		"\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\7$\2\2\u01b5-\3\2\2\2\u01b6\u01b7"+
		"\7\36\2\2\u01b7\u01b8\7\'\2\2\u01b8\u01c2\7#\2\2\u01b9\u01bc\5:\36\2\u01ba"+
		"\u01bc\5@!\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01be\3\2\2"+
		"\2\u01bd\u01bf\7(\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1"+
		"\3\2\2\2\u01c0\u01bb\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7$"+
		"\2\2\u01c6/\3\2\2\2\u01c7\u01c8\7\6\2\2\u01c8\u01c9\7\'\2\2\u01c9\u01d9"+
		"\7#\2\2\u01ca\u01d3\5\24\13\2\u01cb\u01d3\5\26\f\2\u01cc\u01d3\5\"\22"+
		"\2\u01cd\u01d3\5\62\32\2\u01ce\u01d3\5\64\33\2\u01cf\u01d3\5\66\34\2\u01d0"+
		"\u01d3\58\35\2\u01d1\u01d3\5,\27\2\u01d2\u01ca\3\2\2\2\u01d2\u01cb\3\2"+
		"\2\2\u01d2\u01cc\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d2"+
		"\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d5\3\2"+
		"\2\2\u01d4\u01d6\7(\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d8\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc"+
		"\u01dd\7$\2\2\u01dd\61\3\2\2\2\u01de\u01df\7!\2\2\u01df\u01e0\7\'\2\2"+
		"\u01e0\u01ea\7#\2\2\u01e1\u01e4\5@!\2\u01e2\u01e4\5\24\13\2\u01e3\u01e1"+
		"\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\7(\2\2\u01e6"+
		"\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e3\3\2"+
		"\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7$\2\2\u01ee\63\3\2\2\2"+
		"\u01ef\u01f0\7\"\2\2\u01f0\u01f1\7\'\2\2\u01f1\u01fb\7#\2\2\u01f2\u01f5"+
		"\5@!\2\u01f3\u01f5\5\24\13\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"\u01f7\3\2\2\2\u01f6\u01f8\7(\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f4\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2"+
		"\2\2\u01fe\u01ff\7$\2\2\u01ff\65\3\2\2\2\u0200\u0201\7\37\2\2\u0201\u0202"+
		"\7\'\2\2\u0202\u020c\7#\2\2\u0203\u0206\5@!\2\u0204\u0206\5:\36\2\u0205"+
		"\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0209\7("+
		"\2\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a"+
		"\u0205\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7$\2\2\u0210"+
		"\67\3\2\2\2\u0211\u0212\7 \2\2\u0212\u0213\7\'\2\2\u0213\u021e\7#\2\2"+
		"\u0214\u0218\5:\36\2\u0215\u0218\5@!\2\u0216\u0218\5> \2\u0217\u0214\3"+
		"\2\2\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u021a\3\2\2\2\u0219"+
		"\u021b\7(\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2"+
		"\2\2\u021c\u0217\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7$"+
		"\2\2\u02229\3\2\2\2\u0223\u0224\7\20\2\2\u0224\u0225\7\'\2\2\u0225\u0226"+
		"\5b\62\2\u0226;\3\2\2\2\u0227\u0228\7\13\2\2\u0228\u022b\7\'\2\2\u0229"+
		"\u022c\7.\2\2\u022a\u022c\5T+\2\u022b\u0229\3\2\2\2\u022b\u022a\3\2\2"+
		"\2\u022c=\3\2\2\2\u022d\u022e\7\n\2\2\u022e\u022f\7\'\2\2\u022f\u0230"+
		"\7.\2\2\u0230?\3\2\2\2\u0231\u0232\7\t\2\2\u0232\u0233\7\'\2\2\u0233\u0234"+
		"\5T+\2\u0234A\3\2\2\2\u0235\u0236\7.\2\2\u0236\u0237\7\'\2\2\u0237\u023b"+
		"\7%\2\2\u0238\u023a\5D#\2\u0239\u0238\3\2\2\2\u023a\u023d\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023e\u023f\7&\2\2\u023fC\3\2\2\2\u0240\u0241\7#\2\2\u0241\u0242"+
		"\5b\62\2\u0242\u0243\7\'\2\2\u0243\u0244\7#\2\2\u0244\u0245\5F$\2\u0245"+
		"\u0246\7$\2\2\u0246\u0248\7$\2\2\u0247\u0249\7(\2\2\u0248\u0247\3\2\2"+
		"\2\u0248\u0249\3\2\2\2\u0249E\3\2\2\2\u024a\u024b\7\21\2\2\u024b\u024c"+
		"\7\'\2\2\u024c\u0252\7%\2\2\u024d\u0251\5d\63\2\u024e\u0251\5l\67\2\u024f"+
		"\u0251\5H%\2\u0250\u024d\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2"+
		"\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255"+
		"\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\7&\2\2\u0256G\3\2\2\2\u0257\u0258"+
		"\7#\2\2\u0258\u0264\5J&\2\u0259\u0263\5L\'\2\u025a\u0263\5N(\2\u025b\u0263"+
		"\5P)\2\u025c\u0263\5R*\2\u025d\u0263\5V,\2\u025e\u0263\5X-\2\u025f\u0263"+
		"\5Z.\2\u0260\u0263\5\\/\2\u0261\u0263\5^\60\2\u0262\u0259\3\2\2\2\u0262"+
		"\u025a\3\2\2\2\u0262\u025b\3\2\2\2\u0262\u025c\3\2\2\2\u0262\u025d\3\2"+
		"\2\2\u0262\u025e\3\2\2\2\u0262\u025f\3\2\2\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0269\7$\2\2\u0268"+
		"\u026a\7(\2\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026aI\3\2\2\2\u026b"+
		"\u026c\7\22\2\2\u026c\u026d\7\'\2\2\u026d\u026e\5b\62\2\u026e\u026f\7"+
		"(\2\2\u026fK\3\2\2\2\u0270\u0271\7\23\2\2\u0271\u0272\7\'\2\2\u0272\u0273"+
		"\5b\62\2\u0273\u0274\7(\2\2\u0274M\3\2\2\2\u0275\u0276\7\24\2\2\u0276"+
		"\u0277\7\'\2\2\u0277\u0279\5b\62\2\u0278\u027a\7(\2\2\u0279\u0278\3\2"+
		"\2\2\u0279\u027a\3\2\2\2\u027aO\3\2\2\2\u027b\u027c\7\25\2\2\u027c\u027d"+
		"\7\'\2\2\u027d\u027e\7#\2\2\u027e\u0280\5`\61\2\u027f\u0281\7(\2\2\u0280"+
		"\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0288\3\2\2\2\u0282\u0284\5`"+
		"\61\2\u0283\u0285\7(\2\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0287\3\2\2\2\u0286\u0282\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289\u028b\3\2\2\2\u028a\u0288\3\2\2\2\u028b"+
		"\u028d\7$\2\2\u028c\u028e\7(\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2"+
		"\2\u028eQ\3\2\2\2\u028f\u0290\7\26\2\2\u0290\u0291\7\'\2\2\u0291\u0293"+
		"\5T+\2\u0292\u0294\7(\2\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"S\3\2\2\2\u0295\u0296\t\2\2\2\u0296U\3\2\2\2\u0297\u0298\7\27\2\2\u0298"+
		"\u0299\7\'\2\2\u0299\u029b\5T+\2\u029a\u029c\7(\2\2\u029b\u029a\3\2\2"+
		"\2\u029b\u029c\3\2\2\2\u029cW\3\2\2\2\u029d\u029e\7\31\2\2\u029e\u029f"+
		"\7\'\2\2\u029f\u02a1\5b\62\2\u02a0\u02a2\7(\2\2\u02a1\u02a0\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2Y\3\2\2\2\u02a3\u02a4\7\30\2\2\u02a4\u02a5\7\'\2\2"+
		"\u02a5\u02a7\5b\62\2\u02a6\u02a8\7(\2\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8"+
		"\3\2\2\2\u02a8[\3\2\2\2\u02a9\u02aa\7\32\2\2\u02aa\u02ab\7\'\2\2\u02ab"+
		"\u02ac\7%\2\2\u02ac\u02ae\5b\62\2\u02ad\u02af\7(\2\2\u02ae\u02ad\3\2\2"+
		"\2\u02ae\u02af\3\2\2\2\u02af\u02b6\3\2\2\2\u02b0\u02b2\5b\62\2\u02b1\u02b3"+
		"\7(\2\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4"+
		"\u02b0\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2"+
		"\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02bb\7&\2\2\u02ba"+
		"\u02bc\7(\2\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc]\3\2\2\2\u02bd"+
		"\u02be\7\33\2\2\u02be\u02bf\7\'\2\2\u02bf\u02c0\7%\2\2\u02c0\u02c2\5b"+
		"\62\2\u02c1\u02c3\7(\2\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\u02ca\3\2\2\2\u02c4\u02c6\5b\62\2\u02c5\u02c7\7(\2\2\u02c6\u02c5\3\2"+
		"\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c9"+
		"\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2"+
		"\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02cf\7&\2\2\u02ce\u02d0\7(\2\2\u02cf\u02ce"+
		"\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0_\3\2\2\2\u02d1\u02d2\7.\2\2\u02d2\u02d3"+
		"\7\'\2\2\u02d3\u02d4\5b\62\2\u02d4a\3\2\2\2\u02d5\u02d6\t\3\2\2\u02d6"+
		"c\3\2\2\2\u02d7\u02d8\7#\2\2\u02d8\u02e0\5J&\2\u02d9\u02df\5L\'\2\u02da"+
		"\u02df\5j\66\2\u02db\u02df\5P)\2\u02dc\u02df\5f\64\2\u02dd\u02df\5h\65"+
		"\2\u02de\u02d9\3\2\2\2\u02de\u02da\3\2\2\2\u02de\u02db\3\2\2\2\u02de\u02dc"+
		"\3\2\2\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e5\7$"+
		"\2\2\u02e4\u02e6\7(\2\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"e\3\2\2\2\u02e7\u02e8\7\34\2\2\u02e8\u02e9\7\'\2\2\u02e9\u02eb\5b\62\2"+
		"\u02ea\u02ec\7(\2\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ecg\3\2"+
		"\2\2\u02ed\u02ee\7\35\2\2\u02ee\u02ef\7\'\2\2\u02ef\u02f0\7%\2\2\u02f0"+
		"\u02f2\5b\62\2\u02f1\u02f3\7(\2\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2"+
		"\2\2\u02f3\u02fa\3\2\2\2\u02f4\u02f6\5b\62\2\u02f5\u02f7\7(\2\2\u02f6"+
		"\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02f4\3\2"+
		"\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02ff\7&\2\2\u02fe\u0300\7(\2"+
		"\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300i\3\2\2\2\u0301\u0302"+
		"\7\36\2\2\u0302\u0303\7\'\2\2\u0303\u0305\7%\2\2\u0304\u0306\5b\62\2\u0305"+
		"\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0309\7("+
		"\2\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0310\3\2\2\2\u030a"+
		"\u030c\5b\62\2\u030b\u030d\7(\2\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2"+
		"\2\2\u030d\u030f\3\2\2\2\u030e\u030a\3\2\2\2\u030f\u0312\3\2\2\2\u0310"+
		"\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u0310\3\2"+
		"\2\2\u0313\u0315\7&\2\2\u0314\u0316\7(\2\2\u0315\u0314\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316k\3\2\2\2\u0317\u0318\7#\2\2\u0318\u0322\5J&\2\u0319\u0321"+
		"\5L\'\2\u031a\u0321\5n8\2\u031b\u0321\5P)\2\u031c\u0321\5p9\2\u031d\u0321"+
		"\5r:\2\u031e\u0321\5t;\2\u031f\u0321\5h\65\2\u0320\u0319\3\2\2\2\u0320"+
		"\u031a\3\2\2\2\u0320\u031b\3\2\2\2\u0320\u031c\3\2\2\2\u0320\u031d\3\2"+
		"\2\2\u0320\u031e\3\2\2\2\u0320\u031f\3\2\2\2\u0321\u0324\3\2\2\2\u0322"+
		"\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u0322\3\2"+
		"\2\2\u0325\u0327\7$\2\2\u0326\u0328\7(\2\2\u0327\u0326\3\2\2\2\u0327\u0328"+
		"\3\2\2\2\u0328m\3\2\2\2\u0329\u032a\7\37\2\2\u032a\u032b\7\'\2\2\u032b"+
		"\u032d\5b\62\2\u032c\u032e\7(\2\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2"+
		"\2\2\u032eo\3\2\2\2\u032f\u0330\7 \2\2\u0330\u0331\7\'\2\2\u0331\u0332"+
		"\7#\2\2\u0332\u0334\5`\61\2\u0333\u0335\7(\2\2\u0334\u0333\3\2\2\2\u0334"+
		"\u0335\3\2\2\2\u0335\u033c\3\2\2\2\u0336\u0338\5`\61\2\u0337\u0339\7("+
		"\2\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a"+
		"\u0336\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2"+
		"\2\2\u033d\u033f\3\2\2\2\u033e\u033c\3\2\2\2\u033f\u0341\7$\2\2\u0340"+
		"\u0342\7(\2\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342q\3\2\2\2\u0343"+
		"\u0344\7!\2\2\u0344\u0345\7\'\2\2\u0345\u0346\5b\62\2\u0346\u0347\7(\2"+
		"\2\u0347s\3\2\2\2\u0348\u0349\7\"\2\2\u0349\u034a\7\'\2\2\u034a\u034c"+
		"\5b\62\2\u034b\u034d\7(\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"u\3\2\2\2rz\u0087\u008a\u008e\u00a2\u00aa\u00b2\u00ba\u00cd\u00d0\u00d4"+
		"\u00e3\u00e6\u00ea\u00f5\u00f8\u00fc\u0106\u0109\u010d\u0118\u011b\u011f"+
		"\u012a\u012d\u0131\u013c\u013f\u0143\u014e\u0151\u0155\u0160\u0163\u0167"+
		"\u0172\u0175\u0179\u0187\u018a\u018e\u0198\u019b\u019f\u01aa\u01ad\u01b1"+
		"\u01bb\u01be\u01c2\u01d2\u01d5\u01d9\u01e3\u01e6\u01ea\u01f4\u01f7\u01fb"+
		"\u0205\u0208\u020c\u0217\u021a\u021e\u022b\u023b\u0248\u0250\u0252\u0262"+
		"\u0264\u0269\u0279\u0280\u0284\u0288\u028d\u0293\u029b\u02a1\u02a7\u02ae"+
		"\u02b2\u02b6\u02bb\u02c2\u02c6\u02ca\u02cf\u02de\u02e0\u02e5\u02eb\u02f2"+
		"\u02f6\u02fa\u02ff\u0305\u0308\u030c\u0310\u0315\u0320\u0322\u0327\u032d"+
		"\u0334\u0338\u033c\u0341\u034c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}