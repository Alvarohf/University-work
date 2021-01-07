// Generated from d:\antlr\bin\fuente\GrammarInputParser.g4 by ANTLR 4.7.1

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
public class GrammarInputParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CSVID=1, JSONID=2, DOTID=3, SVGID=4, LEN=5, FONTCOLOR=6, FONTNAME=7, FONTSIZE=8, 
		ARROWSIZE=9, ARROWCOLOR=10, PENWD=11, FILLCOLOR=12, STYLE=13, SHAPE=14, 
		EDGE=15, NODE=16, RELATIONSHIP=17, CLASS=18, INHERITANCE=19, PROPERTY=20, 
		INDIRECT_USE=21, INT=22, STRINGS=23, NEWLINE=24, SPACE=25, TEXT=26;
	public static final int
		RULE_input = 0, RULE_file = 1, RULE_jsonid = 2, RULE_csvid = 3, RULE_svgid = 4, 
		RULE_dotid = 5, RULE_path = 6, RULE_field = 7, RULE_edge = 8, RULE_node = 9, 
		RULE_styleParameters = 10, RULE_params = 11, RULE_classes = 12, RULE_relationship = 13, 
		RULE_inheritance = 14, RULE_indirect_use = 15, RULE_property = 16, RULE_fontsize = 17, 
		RULE_len = 18, RULE_fontcolor = 19, RULE_fontname = 20, RULE_arrowsize = 21, 
		RULE_arrowcolor = 22, RULE_penwd = 23, RULE_fillcolor = 24, RULE_shape = 25, 
		RULE_style = 26, RULE_string = 27, RULE_numberValue = 28;
	public static final String[] ruleNames = {
		"input", "file", "jsonid", "csvid", "svgid", "dotid", "path", "field", 
		"edge", "node", "styleParameters", "params", "classes", "relationship", 
		"inheritance", "indirect_use", "property", "fontsize", "len", "fontcolor", 
		"fontname", "arrowsize", "arrowcolor", "penwd", "fillcolor", "shape", 
		"style", "string", "numberValue"
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

	@Override
	public String getGrammarFileName() { return "GrammarInputParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarInputParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarInputParser.EOF, 0); }
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public List<StyleParametersContext> styleParameters() {
			return getRuleContexts(StyleParametersContext.class);
		}
		public StyleParametersContext styleParameters(int i) {
			return getRuleContext(StyleParametersContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSVID:
				case JSONID:
				case DOTID:
				case SVGID:
					{
					setState(58);
					file();
					}
					break;
				case LEN:
				case FONTCOLOR:
				case FONTNAME:
				case FONTSIZE:
				case ARROWSIZE:
				case ARROWCOLOR:
				case PENWD:
				case FILLCOLOR:
				case STYLE:
				case SHAPE:
					{
					setState(59);
					styleParameters();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CSVID) | (1L << JSONID) | (1L << DOTID) | (1L << SVGID) | (1L << LEN) | (1L << FONTCOLOR) | (1L << FONTNAME) | (1L << FONTSIZE) | (1L << ARROWSIZE) | (1L << ARROWCOLOR) | (1L << PENWD) | (1L << FILLCOLOR) | (1L << STYLE) | (1L << SHAPE))) != 0) );
			setState(64);
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

	public static class FileContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public CsvidContext csvid() {
			return getRuleContext(CsvidContext.class,0);
		}
		public JsonidContext jsonid() {
			return getRuleContext(JsonidContext.class,0);
		}
		public SvgidContext svgid() {
			return getRuleContext(SvgidContext.class,0);
		}
		public DotidContext dotid() {
			return getRuleContext(DotidContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSVID:
				{
				setState(66);
				csvid();
				}
				break;
			case JSONID:
				{
				setState(67);
				jsonid();
				}
				break;
			case SVGID:
				{
				setState(68);
				svgid();
				}
				break;
			case DOTID:
				{
				setState(69);
				dotid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(72);
			path();
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

	public static class JsonidContext extends ParserRuleContext {
		public TerminalNode JSONID() { return getToken(GrammarInputParser.JSONID, 0); }
		public JsonidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonid; }
	}

	public final JsonidContext jsonid() throws RecognitionException {
		JsonidContext _localctx = new JsonidContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jsonid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(JSONID);
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

	public static class CsvidContext extends ParserRuleContext {
		public TerminalNode CSVID() { return getToken(GrammarInputParser.CSVID, 0); }
		public CsvidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csvid; }
	}

	public final CsvidContext csvid() throws RecognitionException {
		CsvidContext _localctx = new CsvidContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_csvid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(CSVID);
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

	public static class SvgidContext extends ParserRuleContext {
		public TerminalNode SVGID() { return getToken(GrammarInputParser.SVGID, 0); }
		public SvgidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svgid; }
	}

	public final SvgidContext svgid() throws RecognitionException {
		SvgidContext _localctx = new SvgidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_svgid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(SVGID);
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

	public static class DotidContext extends ParserRuleContext {
		public TerminalNode DOTID() { return getToken(GrammarInputParser.DOTID, 0); }
		public DotidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotid; }
	}

	public final DotidContext dotid() throws RecognitionException {
		DotidContext _localctx = new DotidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dotid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(DOTID);
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

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(GrammarInputParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(GrammarInputParser.TEXT, i);
		}
		public List<NumberValueContext> numberValue() {
			return getRuleContexts(NumberValueContext.class);
		}
		public NumberValueContext numberValue(int i) {
			return getRuleContext(NumberValueContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(82);
					match(TEXT);
					}
					break;
				case INT:
					{
					setState(83);
					numberValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT || _la==TEXT );
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

	public static class FieldContext extends ParserRuleContext {
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public EdgeContext edge() {
			return getRuleContext(EdgeContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NODE:
				{
				setState(88);
				node();
				}
				break;
			case EDGE:
				{
				setState(89);
				edge();
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

	public static class EdgeContext extends ParserRuleContext {
		public TerminalNode EDGE() { return getToken(GrammarInputParser.EDGE, 0); }
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(EDGE);
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

	public static class NodeContext extends ParserRuleContext {
		public TerminalNode NODE() { return getToken(GrammarInputParser.NODE, 0); }
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(NODE);
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

	public static class StyleParametersContext extends ParserRuleContext {
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public FontcolorContext fontcolor() {
			return getRuleContext(FontcolorContext.class,0);
		}
		public FontsizeContext fontsize() {
			return getRuleContext(FontsizeContext.class,0);
		}
		public FontnameContext fontname() {
			return getRuleContext(FontnameContext.class,0);
		}
		public ArrowsizeContext arrowsize() {
			return getRuleContext(ArrowsizeContext.class,0);
		}
		public ArrowcolorContext arrowcolor() {
			return getRuleContext(ArrowcolorContext.class,0);
		}
		public PenwdContext penwd() {
			return getRuleContext(PenwdContext.class,0);
		}
		public FillcolorContext fillcolor() {
			return getRuleContext(FillcolorContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public StyleParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleParameters; }
	}

	public final StyleParametersContext styleParameters() throws RecognitionException {
		StyleParametersContext _localctx = new StyleParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_styleParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				{
				setState(96);
				len();
				}
				break;
			case FONTCOLOR:
				{
				setState(97);
				fontcolor();
				}
				break;
			case FONTSIZE:
				{
				setState(98);
				fontsize();
				}
				break;
			case FONTNAME:
				{
				setState(99);
				fontname();
				}
				break;
			case ARROWSIZE:
				{
				setState(100);
				arrowsize();
				}
				break;
			case ARROWCOLOR:
				{
				setState(101);
				arrowcolor();
				}
				break;
			case PENWD:
				{
				setState(102);
				penwd();
				}
				break;
			case FILLCOLOR:
				{
				setState(103);
				fillcolor();
				}
				break;
			case SHAPE:
				{
				setState(104);
				shape();
				}
				break;
			case STYLE:
				{
				setState(105);
				style();
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

	public static class ParamsContext extends ParserRuleContext {
		public ClassesContext classes() {
			return getRuleContext(ClassesContext.class,0);
		}
		public RelationshipContext relationship() {
			return getRuleContext(RelationshipContext.class,0);
		}
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public Indirect_useContext indirect_use() {
			return getRuleContext(Indirect_useContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(108);
				classes();
				}
				break;
			case RELATIONSHIP:
				{
				setState(109);
				relationship();
				}
				break;
			case INHERITANCE:
				{
				setState(110);
				inheritance();
				}
				break;
			case INDIRECT_USE:
				{
				setState(111);
				indirect_use();
				}
				break;
			case PROPERTY:
				{
				setState(112);
				property();
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

	public static class ClassesContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(GrammarInputParser.CLASS, 0); }
		public ClassesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classes; }
	}

	public final ClassesContext classes() throws RecognitionException {
		ClassesContext _localctx = new ClassesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(CLASS);
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
		public TerminalNode RELATIONSHIP() { return getToken(GrammarInputParser.RELATIONSHIP, 0); }
		public RelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship; }
	}

	public final RelationshipContext relationship() throws RecognitionException {
		RelationshipContext _localctx = new RelationshipContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(RELATIONSHIP);
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

	public static class InheritanceContext extends ParserRuleContext {
		public TerminalNode INHERITANCE() { return getToken(GrammarInputParser.INHERITANCE, 0); }
		public InheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance; }
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(INHERITANCE);
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

	public static class Indirect_useContext extends ParserRuleContext {
		public TerminalNode INDIRECT_USE() { return getToken(GrammarInputParser.INDIRECT_USE, 0); }
		public Indirect_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirect_use; }
	}

	public final Indirect_useContext indirect_use() throws RecognitionException {
		Indirect_useContext _localctx = new Indirect_useContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_indirect_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(INDIRECT_USE);
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
		public TerminalNode PROPERTY() { return getToken(GrammarInputParser.PROPERTY, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(PROPERTY);
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

	public static class FontsizeContext extends ParserRuleContext {
		public TerminalNode FONTSIZE() { return getToken(GrammarInputParser.FONTSIZE, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public FontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontsize; }
	}

	public final FontsizeContext fontsize() throws RecognitionException {
		FontsizeContext _localctx = new FontsizeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(FONTSIZE);
			setState(126);
			field();
			setState(127);
			params();
			setState(128);
			numberValue();
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

	public static class LenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(GrammarInputParser.LEN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(LEN);
			setState(131);
			params();
			setState(132);
			numberValue();
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

	public static class FontcolorContext extends ParserRuleContext {
		public TerminalNode FONTCOLOR() { return getToken(GrammarInputParser.FONTCOLOR, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FontcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontcolor; }
	}

	public final FontcolorContext fontcolor() throws RecognitionException {
		FontcolorContext _localctx = new FontcolorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(FONTCOLOR);
			setState(135);
			field();
			setState(136);
			params();
			setState(137);
			string();
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

	public static class FontnameContext extends ParserRuleContext {
		public TerminalNode FONTNAME() { return getToken(GrammarInputParser.FONTNAME, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FontnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontname; }
	}

	public final FontnameContext fontname() throws RecognitionException {
		FontnameContext _localctx = new FontnameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(FONTNAME);
			setState(140);
			field();
			setState(141);
			params();
			setState(142);
			string();
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

	public static class ArrowsizeContext extends ParserRuleContext {
		public TerminalNode ARROWSIZE() { return getToken(GrammarInputParser.ARROWSIZE, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public ArrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowsize; }
	}

	public final ArrowsizeContext arrowsize() throws RecognitionException {
		ArrowsizeContext _localctx = new ArrowsizeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ARROWSIZE);
			setState(145);
			field();
			setState(146);
			params();
			setState(147);
			numberValue();
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

	public static class ArrowcolorContext extends ParserRuleContext {
		public TerminalNode ARROWCOLOR() { return getToken(GrammarInputParser.ARROWCOLOR, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArrowcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowcolor; }
	}

	public final ArrowcolorContext arrowcolor() throws RecognitionException {
		ArrowcolorContext _localctx = new ArrowcolorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ARROWCOLOR);
			setState(150);
			field();
			setState(151);
			params();
			setState(152);
			string();
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

	public static class PenwdContext extends ParserRuleContext {
		public TerminalNode PENWD() { return getToken(GrammarInputParser.PENWD, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public PenwdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penwd; }
	}

	public final PenwdContext penwd() throws RecognitionException {
		PenwdContext _localctx = new PenwdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_penwd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(PENWD);
			setState(155);
			field();
			setState(156);
			params();
			setState(157);
			numberValue();
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

	public static class FillcolorContext extends ParserRuleContext {
		public TerminalNode FILLCOLOR() { return getToken(GrammarInputParser.FILLCOLOR, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FillcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fillcolor; }
	}

	public final FillcolorContext fillcolor() throws RecognitionException {
		FillcolorContext _localctx = new FillcolorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(FILLCOLOR);
			setState(160);
			field();
			setState(161);
			params();
			setState(162);
			string();
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

	public static class ShapeContext extends ParserRuleContext {
		public TerminalNode SHAPE() { return getToken(GrammarInputParser.SHAPE, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(SHAPE);
			setState(165);
			field();
			setState(166);
			params();
			setState(167);
			string();
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

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(GrammarInputParser.STYLE, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(STYLE);
			setState(170);
			field();
			setState(171);
			params();
			setState(172);
			string();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRINGS() { return getToken(GrammarInputParser.STRINGS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_string);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGS:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(STRINGS);
				}
				break;
			case INT:
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				path();
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

	public static class NumberValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarInputParser.INT, 0); }
		public NumberValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberValue; }
	}

	public final NumberValueContext numberValue() throws RecognitionException {
		NumberValueContext _localctx = new NumberValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numberValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(INT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\6\2?\n\2\r"+
		"\2\16\2@\3\2\3\2\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\6\bW\n\b\r\b\16\bX\3\t\3\t\5\t]\n\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fm\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\5\rt\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u00b3\n\35\3\36\3\36\3\36"+
		"\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"\2\2\2\u00af\2>\3\2\2\2\4H\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\f"+
		"R\3\2\2\2\16V\3\2\2\2\20\\\3\2\2\2\22^\3\2\2\2\24`\3\2\2\2\26l\3\2\2\2"+
		"\30s\3\2\2\2\32u\3\2\2\2\34w\3\2\2\2\36y\3\2\2\2 {\3\2\2\2\"}\3\2\2\2"+
		"$\177\3\2\2\2&\u0084\3\2\2\2(\u0088\3\2\2\2*\u008d\3\2\2\2,\u0092\3\2"+
		"\2\2.\u0097\3\2\2\2\60\u009c\3\2\2\2\62\u00a1\3\2\2\2\64\u00a6\3\2\2\2"+
		"\66\u00ab\3\2\2\28\u00b2\3\2\2\2:\u00b4\3\2\2\2<?\5\4\3\2=?\5\26\f\2>"+
		"<\3\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\2\2\3"+
		"C\3\3\2\2\2DI\5\b\5\2EI\5\6\4\2FI\5\n\6\2GI\5\f\7\2HD\3\2\2\2HE\3\2\2"+
		"\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\5\16\b\2K\5\3\2\2\2LM\7\4\2\2M\7\3"+
		"\2\2\2NO\7\3\2\2O\t\3\2\2\2PQ\7\6\2\2Q\13\3\2\2\2RS\7\5\2\2S\r\3\2\2\2"+
		"TW\7\34\2\2UW\5:\36\2VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2"+
		"\2Y\17\3\2\2\2Z]\5\24\13\2[]\5\22\n\2\\Z\3\2\2\2\\[\3\2\2\2]\21\3\2\2"+
		"\2^_\7\21\2\2_\23\3\2\2\2`a\7\22\2\2a\25\3\2\2\2bm\5&\24\2cm\5(\25\2d"+
		"m\5$\23\2em\5*\26\2fm\5,\27\2gm\5.\30\2hm\5\60\31\2im\5\62\32\2jm\5\64"+
		"\33\2km\5\66\34\2lb\3\2\2\2lc\3\2\2\2ld\3\2\2\2le\3\2\2\2lf\3\2\2\2lg"+
		"\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\27\3\2\2\2nt\5\32\16"+
		"\2ot\5\34\17\2pt\5\36\20\2qt\5 \21\2rt\5\"\22\2sn\3\2\2\2so\3\2\2\2sp"+
		"\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\31\3\2\2\2uv\7\24\2\2v\33\3\2\2\2wx\7\23"+
		"\2\2x\35\3\2\2\2yz\7\25\2\2z\37\3\2\2\2{|\7\27\2\2|!\3\2\2\2}~\7\26\2"+
		"\2~#\3\2\2\2\177\u0080\7\n\2\2\u0080\u0081\5\20\t\2\u0081\u0082\5\30\r"+
		"\2\u0082\u0083\5:\36\2\u0083%\3\2\2\2\u0084\u0085\7\7\2\2\u0085\u0086"+
		"\5\30\r\2\u0086\u0087\5:\36\2\u0087\'\3\2\2\2\u0088\u0089\7\b\2\2\u0089"+
		"\u008a\5\20\t\2\u008a\u008b\5\30\r\2\u008b\u008c\58\35\2\u008c)\3\2\2"+
		"\2\u008d\u008e\7\t\2\2\u008e\u008f\5\20\t\2\u008f\u0090\5\30\r\2\u0090"+
		"\u0091\58\35\2\u0091+\3\2\2\2\u0092\u0093\7\13\2\2\u0093\u0094\5\20\t"+
		"\2\u0094\u0095\5\30\r\2\u0095\u0096\5:\36\2\u0096-\3\2\2\2\u0097\u0098"+
		"\7\f\2\2\u0098\u0099\5\20\t\2\u0099\u009a\5\30\r\2\u009a\u009b\58\35\2"+
		"\u009b/\3\2\2\2\u009c\u009d\7\r\2\2\u009d\u009e\5\20\t\2\u009e\u009f\5"+
		"\30\r\2\u009f\u00a0\5:\36\2\u00a0\61\3\2\2\2\u00a1\u00a2\7\16\2\2\u00a2"+
		"\u00a3\5\20\t\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\58\35\2\u00a5\63\3\2"+
		"\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\5\30\r\2\u00a9"+
		"\u00aa\58\35\2\u00aa\65\3\2\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\5\20"+
		"\t\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\58\35\2\u00af\67\3\2\2\2\u00b0\u00b3"+
		"\7\31\2\2\u00b1\u00b3\5\16\b\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b39\3\2\2\2\u00b4\u00b5\7\30\2\2\u00b5;\3\2\2\2\13>@HVX\\ls\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}