// Generated from D:\Projects\PhD\Src\XQt\xqt.lang\src\main\java\xqt\lang\grammar\source\XQt.g4 by ANTLR 4.5
package xqt.lang.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQtParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Date=11, Boolean=12, String=13, Byte=14, Integer=15, Long=16, 
		Real=17, PERSPECTIVE=18, USING=19, PROJECTION=20, INLINE=21, AS=22, SELECT=23, 
		FROM=24, EXTENDS=25, ATTRIBUTE=26, MapTo=27, REVERSEMAP=28, CONNECTION=29, 
		ADAPTER=30, SOURCE_URI=31, PARAMETERS=32, BIND=33, SCOPE=34, VERSION=35, 
		LATEST=36, DISTINCT=37, UNION=38, ON=39, JOIN=40, INNER=41, OUTER=42, 
		LEFT=43, RIGHT=44, INTO=45, ANCHOR=46, START=47, STOP=48, WHERE=49, ORDERBY=50, 
		ASC=51, DESC=52, NULL=53, FIRST=54, LAST=55, LIMIT=56, SKIP=57, TAKE=58, 
		GROUPBY=59, IS=60, NoT=61, NUMBER=62, DateLiteral=63, EMPTY=64, PLOT=65, 
		PLOTTYPE=66, HAXIS=67, VAXIS=68, PLOT_H_LABEL=69, PLOT_V_LABEL=70, PLOT_LABEL=71, 
		EQ=72, NotEQ=73, GT=74, GTEQ=75, LT=76, LTEQ=77, LIKE=78, PLUS=79, MINUS=80, 
		NEGATE=81, MULT=82, DIV=83, MOD=84, POW=85, NOT=86, ASN=87, AOR=88, AAND=89, 
		COMMA=90, UNDERSCORE=91, LPAR=92, RPAR=93, DOT=94, LCUR=95, RCUR=96, DCOLON=97, 
		COLON=98, OR=99, AND=100, RELATIONSHIP=101, RELATION_FW=102, RELATION_RW=103, 
		RELATION_UN=104, RELATION_BI=105, CHAR=106, STRING=107, LINE_COMMENT=108, 
		COMMENT=109, NEWLINE=110, WS=111, ID=112, BOOLEAN=113, DateValue=114, 
		UINT=115, INT=116, FLOAT=117;
	public static final int
		RULE_createProcessModel = 0, RULE_process = 1, RULE_perspective = 2, RULE_attribute = 3, 
		RULE_connection = 4, RULE_parameter_def = 5, RULE_binding = 6, RULE_binding_scope_def = 7, 
		RULE_statement = 8, RULE_dataStatement = 9, RULE_dataRetrievalStatement = 10, 
		RULE_selectStatement = 11, RULE_setQualifierClause = 12, RULE_projectionClause = 13, 
		RULE_inlineAttribute = 14, RULE_sourceSelectionClause = 15, RULE_sourceRef = 16, 
		RULE_joinedSource = 17, RULE_joinDescription = 18, RULE_joinSpecification = 19, 
		RULE_singleContainer = 20, RULE_bindingRef = 21, RULE_containerRef = 22, 
		RULE_targetSelectionClause = 23, RULE_plot = 24, RULE_anchorClause = 25, 
		RULE_filterClause = 26, RULE_orderClause = 27, RULE_sortSpecification = 28, 
		RULE_sortKey = 29, RULE_sortOrder = 30, RULE_nullOrder = 31, RULE_limitClause = 32, 
		RULE_groupClause = 33, RULE_variable = 34, RULE_searchPhrase = 35, RULE_intNumber = 36, 
		RULE_floatNumber = 37, RULE_expression = 38, RULE_function = 39, RULE_argument = 40, 
		RULE_packagedIdentifier = 41, RULE_smartId = 42, RULE_dataType = 43, RULE_semanticKey = 44, 
		RULE_value = 45, RULE_identifier = 46, RULE_versionSelector = 47, RULE_labelVersionSelector = 48, 
		RULE_sequenceVersionSelector = 49, RULE_dateVersionSelector = 50, RULE_simpleIdentifier = 51, 
		RULE_qualifiedIdentifier = 52, RULE_literal = 53, RULE_path = 54, RULE_pathEntity = 55, 
		RULE_pathAttribute = 56;
	public static final String[] ruleNames = {
		"createProcessModel", "process", "perspective", "attribute", "connection", 
		"parameter_def", "binding", "binding_scope_def", "statement", "dataStatement", 
		"dataRetrievalStatement", "selectStatement", "setQualifierClause", "projectionClause", 
		"inlineAttribute", "sourceSelectionClause", "sourceRef", "joinedSource", 
		"joinDescription", "joinSpecification", "singleContainer", "bindingRef", 
		"containerRef", "targetSelectionClause", "plot", "anchorClause", "filterClause", 
		"orderClause", "sortSpecification", "sortKey", "sortOrder", "nullOrder", 
		"limitClause", "groupClause", "variable", "searchPhrase", "intNumber", 
		"floatNumber", "expression", "function", "argument", "packagedIdentifier", 
		"smartId", "dataType", "semanticKey", "value", "identifier", "versionSelector", 
		"labelVersionSelector", "sequenceVersionSelector", "dateVersionSelector", 
		"simpleIdentifier", "qualifiedIdentifier", "literal", "path", "pathEntity", 
		"pathAttribute"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'p'", "'l'", "'b'", "'s'", "'pie'", "'before'", "'exact'", "'after'", 
		"'#'", "'$'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'=='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'~'", 
		"'+'", "'-'", null, "'*'", "'/'", "'%'", "'^'", "'!'", "'='", "'|'", "'&'", 
		"','", "'_'", "'('", "')'", "'.'", "'{'", "'}'", "'::'", "':'", null, 
		null, null, "'->'", "'<-'", "'--'", "'<->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "Date", 
		"Boolean", "String", "Byte", "Integer", "Long", "Real", "PERSPECTIVE", 
		"USING", "PROJECTION", "INLINE", "AS", "SELECT", "FROM", "EXTENDS", "ATTRIBUTE", 
		"MapTo", "REVERSEMAP", "CONNECTION", "ADAPTER", "SOURCE_URI", "PARAMETERS", 
		"BIND", "SCOPE", "VERSION", "LATEST", "DISTINCT", "UNION", "ON", "JOIN", 
		"INNER", "OUTER", "LEFT", "RIGHT", "INTO", "ANCHOR", "START", "STOP", 
		"WHERE", "ORDERBY", "ASC", "DESC", "NULL", "FIRST", "LAST", "LIMIT", "SKIP", 
		"TAKE", "GROUPBY", "IS", "NoT", "NUMBER", "DateLiteral", "EMPTY", "PLOT", 
		"PLOTTYPE", "HAXIS", "VAXIS", "PLOT_H_LABEL", "PLOT_V_LABEL", "PLOT_LABEL", 
		"EQ", "NotEQ", "GT", "GTEQ", "LT", "LTEQ", "LIKE", "PLUS", "MINUS", "NEGATE", 
		"MULT", "DIV", "MOD", "POW", "NOT", "ASN", "AOR", "AAND", "COMMA", "UNDERSCORE", 
		"LPAR", "RPAR", "DOT", "LCUR", "RCUR", "DCOLON", "COLON", "OR", "AND", 
		"RELATIONSHIP", "RELATION_FW", "RELATION_RW", "RELATION_UN", "RELATION_BI", 
		"CHAR", "STRING", "LINE_COMMENT", "COMMENT", "NEWLINE", "WS", "ID", "BOOLEAN", 
		"DateValue", "UINT", "INT", "FLOAT"
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
	public String getGrammarFileName() { return "XQt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CreateProcessModelContext extends ParserRuleContext {
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public CreateProcessModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createProcessModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterCreateProcessModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitCreateProcessModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitCreateProcessModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateProcessModelContext createProcessModel() throws RecognitionException {
		CreateProcessModelContext _localctx = new CreateProcessModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_createProcessModel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			process();
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

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(XQtParser.EOF, 0); }
		public List<PerspectiveContext> perspective() {
			return getRuleContexts(PerspectiveContext.class);
		}
		public PerspectiveContext perspective(int i) {
			return getRuleContext(PerspectiveContext.class,i);
		}
		public List<ConnectionContext> connection() {
			return getRuleContexts(ConnectionContext.class);
		}
		public ConnectionContext connection(int i) {
			return getRuleContext(ConnectionContext.class,i);
		}
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(XQtParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XQtParser.NEWLINE, i);
		}
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_process);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERSPECTIVE) {
				{
				{
				setState(116);
				perspective();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONNECTION) {
				{
				{
				setState(122);
				connection();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIND) {
				{
				{
				setState(128);
				binding();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				statement();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(135);
					match(NEWLINE);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SELECT );
			setState(145);
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

	public static class PerspectiveContext extends ParserRuleContext {
		public Token name;
		public Token superPerspective;
		public TerminalNode PERSPECTIVE() { return getToken(XQtParser.PERSPECTIVE, 0); }
		public TerminalNode LCUR() { return getToken(XQtParser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(XQtParser.RCUR, 0); }
		public List<TerminalNode> ID() { return getTokens(XQtParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XQtParser.ID, i);
		}
		public TerminalNode EXTENDS() { return getToken(XQtParser.EXTENDS, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public PerspectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perspective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterPerspective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitPerspective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitPerspective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerspectiveContext perspective() throws RecognitionException {
		PerspectiveContext _localctx = new PerspectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_perspective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(PERSPECTIVE);
			setState(148);
			((PerspectiveContext)_localctx).name = match(ID);
			setState(151);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(149);
				match(EXTENDS);
				setState(150);
				((PerspectiveContext)_localctx).superPerspective = match(ID);
				}
			}

			setState(153);
			match(LCUR);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				attribute();
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATTRIBUTE );
			setState(159);
			match(RCUR);
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

	public static class AttributeContext extends ParserRuleContext {
		public ExpressionContext fwd;
		public ExpressionContext rvs;
		public TerminalNode ATTRIBUTE() { return getToken(XQtParser.ATTRIBUTE, 0); }
		public SmartIdContext smartId() {
			return getRuleContext(SmartIdContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(XQtParser.COMMA, 0); }
		public TerminalNode MapTo() { return getToken(XQtParser.MapTo, 0); }
		public List<TerminalNode> ASN() { return getTokens(XQtParser.ASN); }
		public TerminalNode ASN(int i) {
			return getToken(XQtParser.ASN, i);
		}
		public TerminalNode REVERSEMAP() { return getToken(XQtParser.REVERSEMAP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ATTRIBUTE);
			setState(162);
			smartId();
			setState(166);
			_la = _input.LA(1);
			if (_la==MapTo) {
				{
				setState(163);
				match(MapTo);
				setState(164);
				match(ASN);
				setState(165);
				((AttributeContext)_localctx).fwd = expression(0);
				}
			}

			setState(171);
			_la = _input.LA(1);
			if (_la==REVERSEMAP) {
				{
				setState(168);
				match(REVERSEMAP);
				setState(169);
				match(ASN);
				setState(170);
				((AttributeContext)_localctx).rvs = expression(0);
				}
			}

			setState(173);
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

	public static class ConnectionContext extends ParserRuleContext {
		public Token name;
		public Token adapterName;
		public Token srcURI;
		public TerminalNode CONNECTION() { return getToken(XQtParser.CONNECTION, 0); }
		public TerminalNode ADAPTER() { return getToken(XQtParser.ADAPTER, 0); }
		public List<TerminalNode> ASN() { return getTokens(XQtParser.ASN); }
		public TerminalNode ASN(int i) {
			return getToken(XQtParser.ASN, i);
		}
		public TerminalNode SOURCE_URI() { return getToken(XQtParser.SOURCE_URI, 0); }
		public List<TerminalNode> ID() { return getTokens(XQtParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XQtParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(XQtParser.STRING, 0); }
		public TerminalNode PARAMETERS() { return getToken(XQtParser.PARAMETERS, 0); }
		public List<Parameter_defContext> parameter_def() {
			return getRuleContexts(Parameter_defContext.class);
		}
		public Parameter_defContext parameter_def(int i) {
			return getRuleContext(Parameter_defContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitConnection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitConnection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(CONNECTION);
			setState(176);
			((ConnectionContext)_localctx).name = match(ID);
			setState(177);
			match(ADAPTER);
			setState(178);
			match(ASN);
			setState(179);
			((ConnectionContext)_localctx).adapterName = match(ID);
			setState(180);
			match(SOURCE_URI);
			setState(181);
			match(ASN);
			setState(182);
			((ConnectionContext)_localctx).srcURI = match(STRING);
			setState(193);
			_la = _input.LA(1);
			if (_la==PARAMETERS) {
				{
				setState(183);
				match(PARAMETERS);
				setState(184);
				match(ASN);
				{
				setState(185);
				parameter_def();
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(186);
					match(COMMA);
					setState(187);
					parameter_def();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Parameter_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parameter_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterParameter_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitParameter_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitParameter_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_defContext parameter_def() throws RecognitionException {
		Parameter_defContext _localctx = new Parameter_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
			setState(196);
			match(COLON);
			setState(197);
			expression(0);
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

	public static class BindingContext extends ParserRuleContext {
		public Token name;
		public Token connectionName;
		public TerminalNode BIND() { return getToken(XQtParser.BIND, 0); }
		public TerminalNode CONNECTION() { return getToken(XQtParser.CONNECTION, 0); }
		public List<TerminalNode> ASN() { return getTokens(XQtParser.ASN); }
		public TerminalNode ASN(int i) {
			return getToken(XQtParser.ASN, i);
		}
		public List<TerminalNode> ID() { return getTokens(XQtParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XQtParser.ID, i);
		}
		public TerminalNode SCOPE() { return getToken(XQtParser.SCOPE, 0); }
		public List<Binding_scope_defContext> binding_scope_def() {
			return getRuleContexts(Binding_scope_defContext.class);
		}
		public Binding_scope_defContext binding_scope_def(int i) {
			return getRuleContext(Binding_scope_defContext.class,i);
		}
		public TerminalNode VERSION() { return getToken(XQtParser.VERSION, 0); }
		public VersionSelectorContext versionSelector() {
			return getRuleContext(VersionSelectorContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(BIND);
			setState(200);
			((BindingContext)_localctx).name = match(ID);
			setState(201);
			match(CONNECTION);
			setState(202);
			match(ASN);
			setState(203);
			((BindingContext)_localctx).connectionName = match(ID);
			setState(214);
			_la = _input.LA(1);
			if (_la==SCOPE) {
				{
				setState(204);
				match(SCOPE);
				setState(205);
				match(ASN);
				setState(206);
				binding_scope_def();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(207);
					match(COMMA);
					setState(208);
					binding_scope_def();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(219);
			_la = _input.LA(1);
			if (_la==VERSION) {
				{
				setState(216);
				match(VERSION);
				setState(217);
				match(ASN);
				setState(218);
				versionSelector();
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

	public static class Binding_scope_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public Binding_scope_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding_scope_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterBinding_scope_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitBinding_scope_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitBinding_scope_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binding_scope_defContext binding_scope_def() throws RecognitionException {
		Binding_scope_defContext _localctx = new Binding_scope_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_binding_scope_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ID);
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

	public static class StatementContext extends ParserRuleContext {
		public DataStatementContext dataStatement() {
			return getRuleContext(DataStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			dataStatement();
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

	public static class DataStatementContext extends ParserRuleContext {
		public DataRetrievalStatementContext dataRetrievalStatement() {
			return getRuleContext(DataRetrievalStatementContext.class,0);
		}
		public DataStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStatementContext dataStatement() throws RecognitionException {
		DataStatementContext _localctx = new DataStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dataStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			dataRetrievalStatement();
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

	public static class DataRetrievalStatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public DataRetrievalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRetrievalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterDataRetrievalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitDataRetrievalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitDataRetrievalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRetrievalStatementContext dataRetrievalStatement() throws RecognitionException {
		DataRetrievalStatementContext _localctx = new DataRetrievalStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dataRetrievalStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			selectStatement();
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

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(XQtParser.SELECT, 0); }
		public SourceSelectionClauseContext sourceSelectionClause() {
			return getRuleContext(SourceSelectionClauseContext.class,0);
		}
		public SetQualifierClauseContext setQualifierClause() {
			return getRuleContext(SetQualifierClauseContext.class,0);
		}
		public ProjectionClauseContext projectionClause() {
			return getRuleContext(ProjectionClauseContext.class,0);
		}
		public TargetSelectionClauseContext targetSelectionClause() {
			return getRuleContext(TargetSelectionClauseContext.class,0);
		}
		public AnchorClauseContext anchorClause() {
			return getRuleContext(AnchorClauseContext.class,0);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public GroupClauseContext groupClause() {
			return getRuleContext(GroupClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(SELECT);
			setState(231);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==UNION) {
				{
				setState(230);
				setQualifierClause();
				}
			}

			setState(234);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(233);
				projectionClause();
				}
			}

			setState(236);
			sourceSelectionClause();
			setState(238);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(237);
				targetSelectionClause();
				}
			}

			setState(241);
			_la = _input.LA(1);
			if (_la==ANCHOR) {
				{
				setState(240);
				anchorClause();
				}
			}

			setState(244);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(243);
				filterClause();
				}
			}

			setState(247);
			_la = _input.LA(1);
			if (_la==ORDERBY) {
				{
				setState(246);
				orderClause();
				}
			}

			setState(250);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(249);
				limitClause();
				}
			}

			setState(253);
			_la = _input.LA(1);
			if (_la==GROUPBY) {
				{
				setState(252);
				groupClause();
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

	public static class SetQualifierClauseContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(XQtParser.DISTINCT, 0); }
		public TerminalNode UNION() { return getToken(XQtParser.UNION, 0); }
		public SetQualifierClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQualifierClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSetQualifierClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSetQualifierClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSetQualifierClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQualifierClauseContext setQualifierClause() throws RecognitionException {
		SetQualifierClauseContext _localctx = new SetQualifierClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setQualifierClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ProjectionClauseContext extends ParserRuleContext {
		public ProjectionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionClause; }
	 
		public ProjectionClauseContext() { }
		public void copyFrom(ProjectionClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProjectionClause_PerspectiveContext extends ProjectionClauseContext {
		public SimpleIdentifierContext perspectiveName;
		public TerminalNode USING() { return getToken(XQtParser.USING, 0); }
		public TerminalNode PERSPECTIVE() { return getToken(XQtParser.PERSPECTIVE, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ProjectionClause_PerspectiveContext(ProjectionClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterProjectionClause_Perspective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitProjectionClause_Perspective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitProjectionClause_Perspective(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProjectionClause_InlineContext extends ProjectionClauseContext {
		public TerminalNode USING() { return getToken(XQtParser.USING, 0); }
		public TerminalNode INLINE() { return getToken(XQtParser.INLINE, 0); }
		public List<InlineAttributeContext> inlineAttribute() {
			return getRuleContexts(InlineAttributeContext.class);
		}
		public InlineAttributeContext inlineAttribute(int i) {
			return getRuleContext(InlineAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public ProjectionClause_InlineContext(ProjectionClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterProjectionClause_Inline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitProjectionClause_Inline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitProjectionClause_Inline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionClauseContext projectionClause() throws RecognitionException {
		ProjectionClauseContext _localctx = new ProjectionClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_projectionClause);
		int _la;
		try {
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ProjectionClause_PerspectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(USING);
				setState(258);
				match(PERSPECTIVE);
				setState(259);
				((ProjectionClause_PerspectiveContext)_localctx).perspectiveName = simpleIdentifier();
				}
				break;
			case 2:
				_localctx = new ProjectionClause_InlineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(USING);
				setState(261);
				match(INLINE);
				setState(262);
				inlineAttribute();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263);
					match(COMMA);
					setState(264);
					inlineAttribute();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class InlineAttributeContext extends ParserRuleContext {
		public ExpressionContext att;
		public SimpleIdentifierContext alias;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(XQtParser.AS, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public InlineAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterInlineAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitInlineAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitInlineAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineAttributeContext inlineAttribute() throws RecognitionException {
		InlineAttributeContext _localctx = new InlineAttributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inlineAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			((InlineAttributeContext)_localctx).att = expression(0);
			setState(275);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(273);
				match(AS);
				setState(274);
				((InlineAttributeContext)_localctx).alias = simpleIdentifier();
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

	public static class SourceSelectionClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(XQtParser.FROM, 0); }
		public SourceRefContext sourceRef() {
			return getRuleContext(SourceRefContext.class,0);
		}
		public SourceSelectionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceSelectionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSourceSelectionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSourceSelectionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSourceSelectionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceSelectionClauseContext sourceSelectionClause() throws RecognitionException {
		SourceSelectionClauseContext _localctx = new SourceSelectionClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sourceSelectionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(FROM);
			setState(278);
			sourceRef();
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

	public static class SourceRefContext extends ParserRuleContext {
		public JoinedSourceContext joinedSource() {
			return getRuleContext(JoinedSourceContext.class,0);
		}
		public SingleContainerContext singleContainer() {
			return getRuleContext(SingleContainerContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SourceRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSourceRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSourceRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSourceRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceRefContext sourceRef() throws RecognitionException {
		SourceRefContext _localctx = new SourceRefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sourceRef);
		try {
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				joinedSource();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				singleContainer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				variable();
				}
				break;
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

	public static class JoinedSourceContext extends ParserRuleContext {
		public VariableContext leftVariable;
		public SingleContainerContext leftSource;
		public SimpleIdentifierContext leftPerspectiveName;
		public VariableContext rightVariable;
		public SingleContainerContext rightSource;
		public SimpleIdentifierContext rightPerspectiveName;
		public JoinDescriptionContext joinDescription() {
			return getRuleContext(JoinDescriptionContext.class,0);
		}
		public TerminalNode ON() { return getToken(XQtParser.ON, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<SingleContainerContext> singleContainer() {
			return getRuleContexts(SingleContainerContext.class);
		}
		public SingleContainerContext singleContainer(int i) {
			return getRuleContext(SingleContainerContext.class,i);
		}
		public List<TerminalNode> USING() { return getTokens(XQtParser.USING); }
		public TerminalNode USING(int i) {
			return getToken(XQtParser.USING, i);
		}
		public List<TerminalNode> PERSPECTIVE() { return getTokens(XQtParser.PERSPECTIVE); }
		public TerminalNode PERSPECTIVE(int i) {
			return getToken(XQtParser.PERSPECTIVE, i);
		}
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public JoinedSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterJoinedSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitJoinedSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitJoinedSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinedSourceContext joinedSource() throws RecognitionException {
		JoinedSourceContext _localctx = new JoinedSourceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_joinedSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(285);
				((JoinedSourceContext)_localctx).leftVariable = variable();
				}
				break;
			case 2:
				{
				setState(286);
				((JoinedSourceContext)_localctx).leftSource = singleContainer();
				setState(290);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(287);
					match(USING);
					setState(288);
					match(PERSPECTIVE);
					setState(289);
					((JoinedSourceContext)_localctx).leftPerspectiveName = simpleIdentifier();
					}
				}

				}
				break;
			}
			setState(294);
			joinDescription();
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(295);
				((JoinedSourceContext)_localctx).rightVariable = variable();
				}
				break;
			case 2:
				{
				setState(296);
				((JoinedSourceContext)_localctx).rightSource = singleContainer();
				setState(300);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(297);
					match(USING);
					setState(298);
					match(PERSPECTIVE);
					setState(299);
					((JoinedSourceContext)_localctx).rightPerspectiveName = simpleIdentifier();
					}
				}

				}
				break;
			}
			setState(304);
			match(ON);
			setState(305);
			joinSpecification();
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

	public static class JoinDescriptionContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(XQtParser.INNER, 0); }
		public TerminalNode JOIN() { return getToken(XQtParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(XQtParser.OUTER, 0); }
		public TerminalNode LEFT() { return getToken(XQtParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(XQtParser.RIGHT, 0); }
		public JoinDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterJoinDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitJoinDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitJoinDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinDescriptionContext joinDescription() throws RecognitionException {
		JoinDescriptionContext _localctx = new JoinDescriptionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_joinDescription);
		try {
			setState(317);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(INNER);
				setState(308);
				match(JOIN);
				}
				break;
			case OUTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(OUTER);
				setState(310);
				match(JOIN);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(LEFT);
				setState(312);
				match(OUTER);
				setState(313);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				match(RIGHT);
				setState(315);
				match(OUTER);
				setState(316);
				match(JOIN);
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

	public static class JoinSpecificationContext extends ParserRuleContext {
		public IdentifierContext leftKey;
		public Token op;
		public IdentifierContext rightKey;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EQ() { return getToken(XQtParser.EQ, 0); }
		public TerminalNode NotEQ() { return getToken(XQtParser.NotEQ, 0); }
		public TerminalNode GT() { return getToken(XQtParser.GT, 0); }
		public TerminalNode GTEQ() { return getToken(XQtParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(XQtParser.LT, 0); }
		public TerminalNode LTEQ() { return getToken(XQtParser.LTEQ, 0); }
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterJoinSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitJoinSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitJoinSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_joinSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			((JoinSpecificationContext)_localctx).leftKey = identifier();
			setState(320);
			((JoinSpecificationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (EQ - 72)) | (1L << (NotEQ - 72)) | (1L << (GT - 72)) | (1L << (GTEQ - 72)) | (1L << (LT - 72)) | (1L << (LTEQ - 72)))) != 0)) ) {
				((JoinSpecificationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(321);
			((JoinSpecificationContext)_localctx).rightKey = identifier();
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

	public static class SingleContainerContext extends ParserRuleContext {
		public BindingRefContext bindingRef() {
			return getRuleContext(BindingRefContext.class,0);
		}
		public TerminalNode DOT() { return getToken(XQtParser.DOT, 0); }
		public ContainerRefContext containerRef() {
			return getRuleContext(ContainerRefContext.class,0);
		}
		public SingleContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleContainer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSingleContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSingleContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSingleContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleContainerContext singleContainer() throws RecognitionException {
		SingleContainerContext _localctx = new SingleContainerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_singleContainer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			bindingRef();
			setState(324);
			match(DOT);
			setState(325);
			containerRef();
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

	public static class BindingRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public BindingRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterBindingRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitBindingRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitBindingRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingRefContext bindingRef() throws RecognitionException {
		BindingRefContext _localctx = new BindingRefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bindingRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ID);
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

	public static class ContainerRefContext extends ParserRuleContext {
		public TerminalNode UINT() { return getToken(XQtParser.UINT, 0); }
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public ContainerRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterContainerRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitContainerRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitContainerRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerRefContext containerRef() throws RecognitionException {
		ContainerRefContext _localctx = new ContainerRefContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_containerRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==UINT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TargetSelectionClauseContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(XQtParser.INTO, 0); }
		public PlotContext plot() {
			return getRuleContext(PlotContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SingleContainerContext singleContainer() {
			return getRuleContext(SingleContainerContext.class,0);
		}
		public TargetSelectionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetSelectionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterTargetSelectionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitTargetSelectionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitTargetSelectionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetSelectionClauseContext targetSelectionClause() throws RecognitionException {
		TargetSelectionClauseContext _localctx = new TargetSelectionClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_targetSelectionClause);
		try {
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(INTO);
				setState(332);
				plot();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(INTO);
				setState(334);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(INTO);
				setState(336);
				singleContainer();
				}
				break;
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

	public static class PlotContext extends ParserRuleContext {
		public VariableContext id;
		public IdentifierContext hx;
		public IdentifierContext vx1;
		public IdentifierContext identifier;
		public List<IdentifierContext> vxs2 = new ArrayList<IdentifierContext>();
		public Token plotType;
		public Token pxl;
		public Token pvl;
		public Token pll;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PLOT() { return getToken(XQtParser.PLOT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(XQtParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(XQtParser.STRING, i);
		}
		public TerminalNode HAXIS() { return getToken(XQtParser.HAXIS, 0); }
		public TerminalNode VAXIS() { return getToken(XQtParser.VAXIS, 0); }
		public TerminalNode PLOTTYPE() { return getToken(XQtParser.PLOTTYPE, 0); }
		public TerminalNode PLOT_H_LABEL() { return getToken(XQtParser.PLOT_H_LABEL, 0); }
		public TerminalNode PLOT_V_LABEL() { return getToken(XQtParser.PLOT_V_LABEL, 0); }
		public TerminalNode PLOT_LABEL() { return getToken(XQtParser.PLOT_LABEL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public PlotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterPlot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitPlot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitPlot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlotContext plot() throws RecognitionException {
		PlotContext _localctx = new PlotContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_plot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if (_la==PLOT) {
				{
				setState(339);
				match(PLOT);
				}
			}

			setState(342);
			((PlotContext)_localctx).id = variable();
			{
			setState(345);
			_la = _input.LA(1);
			if (_la==HAXIS) {
				{
				setState(343);
				match(HAXIS);
				setState(344);
				match(COLON);
				}
			}

			setState(347);
			((PlotContext)_localctx).hx = identifier();
			}
			{
			setState(351);
			_la = _input.LA(1);
			if (_la==VAXIS) {
				{
				setState(349);
				match(VAXIS);
				setState(350);
				match(COLON);
				}
			}

			{
			setState(353);
			((PlotContext)_localctx).vx1 = identifier();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(354);
				match(COMMA);
				setState(355);
				((PlotContext)_localctx).identifier = identifier();
				((PlotContext)_localctx).vxs2.add(((PlotContext)_localctx).identifier);
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
			setState(366);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0) || _la==PLOTTYPE) {
				{
				setState(363);
				_la = _input.LA(1);
				if (_la==PLOTTYPE) {
					{
					setState(361);
					match(PLOTTYPE);
					setState(362);
					match(COLON);
					}
				}

				setState(365);
				((PlotContext)_localctx).plotType = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
					((PlotContext)_localctx).plotType = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(373);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(370);
				_la = _input.LA(1);
				if (_la==PLOT_H_LABEL) {
					{
					setState(368);
					match(PLOT_H_LABEL);
					setState(369);
					match(COLON);
					}
				}

				setState(372);
				((PlotContext)_localctx).pxl = match(STRING);
				}
				break;
			}
			setState(380);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(377);
				_la = _input.LA(1);
				if (_la==PLOT_V_LABEL) {
					{
					setState(375);
					match(PLOT_V_LABEL);
					setState(376);
					match(COLON);
					}
				}

				setState(379);
				((PlotContext)_localctx).pvl = match(STRING);
				}
				break;
			}
			setState(387);
			_la = _input.LA(1);
			if (_la==PLOT_LABEL || _la==STRING) {
				{
				setState(384);
				_la = _input.LA(1);
				if (_la==PLOT_LABEL) {
					{
					setState(382);
					match(PLOT_LABEL);
					setState(383);
					match(COLON);
					}
				}

				setState(386);
				((PlotContext)_localctx).pll = match(STRING);
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

	public static class AnchorClauseContext extends ParserRuleContext {
		public SearchPhraseContext startAnchor;
		public SearchPhraseContext stopAnchor;
		public TerminalNode ANCHOR() { return getToken(XQtParser.ANCHOR, 0); }
		public TerminalNode START() { return getToken(XQtParser.START, 0); }
		public TerminalNode STOP() { return getToken(XQtParser.STOP, 0); }
		public List<SearchPhraseContext> searchPhrase() {
			return getRuleContexts(SearchPhraseContext.class);
		}
		public SearchPhraseContext searchPhrase(int i) {
			return getRuleContext(SearchPhraseContext.class,i);
		}
		public AnchorClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchorClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterAnchorClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitAnchorClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitAnchorClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorClauseContext anchorClause() throws RecognitionException {
		AnchorClauseContext _localctx = new AnchorClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_anchorClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(ANCHOR);
			setState(392);
			_la = _input.LA(1);
			if (_la==START) {
				{
				setState(390);
				match(START);
				setState(391);
				((AnchorClauseContext)_localctx).startAnchor = searchPhrase();
				}
			}

			setState(396);
			_la = _input.LA(1);
			if (_la==STOP) {
				{
				setState(394);
				match(STOP);
				setState(395);
				((AnchorClauseContext)_localctx).stopAnchor = searchPhrase();
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

	public static class FilterClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(XQtParser.WHERE, 0); }
		public TerminalNode LPAR() { return getToken(XQtParser.LPAR, 0); }
		public SearchPhraseContext searchPhrase() {
			return getRuleContext(SearchPhraseContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(XQtParser.RPAR, 0); }
		public FilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterFilterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitFilterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitFilterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterClauseContext filterClause() throws RecognitionException {
		FilterClauseContext _localctx = new FilterClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_filterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(WHERE);
			setState(399);
			match(LPAR);
			setState(400);
			searchPhrase();
			setState(401);
			match(RPAR);
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

	public static class OrderClauseContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(XQtParser.ORDERBY, 0); }
		public List<SortSpecificationContext> sortSpecification() {
			return getRuleContexts(SortSpecificationContext.class);
		}
		public SortSpecificationContext sortSpecification(int i) {
			return getRuleContext(SortSpecificationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public OrderClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterOrderClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitOrderClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitOrderClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderClauseContext orderClause() throws RecognitionException {
		OrderClauseContext _localctx = new OrderClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(ORDERBY);
			setState(404);
			sortSpecification();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(405);
				match(COMMA);
				setState(406);
				sortSpecification();
				}
				}
				setState(411);
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

	public static class SortSpecificationContext extends ParserRuleContext {
		public SortKeyContext sortKey() {
			return getRuleContext(SortKeyContext.class,0);
		}
		public SortOrderContext sortOrder() {
			return getRuleContext(SortOrderContext.class,0);
		}
		public NullOrderContext nullOrder() {
			return getRuleContext(NullOrderContext.class,0);
		}
		public SortSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSortSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSortSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSortSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortSpecificationContext sortSpecification() throws RecognitionException {
		SortSpecificationContext _localctx = new SortSpecificationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sortSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			sortKey();
			setState(414);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(413);
				sortOrder();
				}
			}

			setState(417);
			_la = _input.LA(1);
			if (_la==NULL) {
				{
				setState(416);
				nullOrder();
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

	public static class SortKeyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SortKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSortKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSortKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSortKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortKeyContext sortKey() throws RecognitionException {
		SortKeyContext _localctx = new SortKeyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sortKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			identifier();
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

	public static class SortOrderContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(XQtParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(XQtParser.DESC, 0); }
		public SortOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSortOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSortOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSortOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortOrderContext sortOrder() throws RecognitionException {
		SortOrderContext _localctx = new SortOrderContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sortOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class NullOrderContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(XQtParser.NULL, 0); }
		public TerminalNode FIRST() { return getToken(XQtParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(XQtParser.LAST, 0); }
		public NullOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterNullOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitNullOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitNullOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullOrderContext nullOrder() throws RecognitionException {
		NullOrderContext _localctx = new NullOrderContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nullOrder);
		try {
			setState(427);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(NULL);
				setState(424);
				match(FIRST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(NULL);
				setState(426);
				match(LAST);
				}
				break;
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

	public static class LimitClauseContext extends ParserRuleContext {
		public Token skip;
		public Token take;
		public TerminalNode LIMIT() { return getToken(XQtParser.LIMIT, 0); }
		public TerminalNode SKIP() { return getToken(XQtParser.SKIP, 0); }
		public TerminalNode TAKE() { return getToken(XQtParser.TAKE, 0); }
		public List<TerminalNode> UINT() { return getTokens(XQtParser.UINT); }
		public TerminalNode UINT(int i) {
			return getToken(XQtParser.UINT, i);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(LIMIT);
			setState(432);
			_la = _input.LA(1);
			if (_la==SKIP) {
				{
				setState(430);
				match(SKIP);
				setState(431);
				((LimitClauseContext)_localctx).skip = match(UINT);
				}
			}

			setState(436);
			_la = _input.LA(1);
			if (_la==TAKE) {
				{
				setState(434);
				match(TAKE);
				setState(435);
				((LimitClauseContext)_localctx).take = match(UINT);
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

	public static class GroupClauseContext extends ParserRuleContext {
		public TerminalNode GROUPBY() { return getToken(XQtParser.GROUPBY, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public GroupClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterGroupClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitGroupClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitGroupClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupClauseContext groupClause() throws RecognitionException {
		GroupClauseContext _localctx = new GroupClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_groupClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(GROUPBY);
			setState(439);
			identifier();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(440);
				match(COMMA);
				setState(441);
				identifier();
				}
				}
				setState(446);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(ID);
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

	public static class SearchPhraseContext extends ParserRuleContext {
		public ExpressionContext phrase;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSearchPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSearchPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSearchPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchPhraseContext searchPhrase() throws RecognitionException {
		SearchPhraseContext _localctx = new SearchPhraseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_searchPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			((SearchPhraseContext)_localctx).phrase = expression(0);
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

	public static class IntNumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(XQtParser.INT, 0); }
		public IntNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterIntNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitIntNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitIntNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntNumberContext intNumber() throws RecognitionException {
		IntNumberContext _localctx = new IntNumberContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_intNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
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

	public static class FloatNumberContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(XQtParser.FLOAT, 0); }
		public FloatNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterFloatNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitFloatNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitFloatNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatNumberContext floatNumber() throws RecognitionException {
		FloatNumberContext _localctx = new FloatNumberContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_floatNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(FLOAT);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expression_notContext extends ExpressionContext {
		public Token op;
		public ExpressionContext operand;
		public TerminalNode NOT() { return getToken(XQtParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_notContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_nestContext extends ExpressionContext {
		public ExpressionContext operand;
		public TerminalNode LPAR() { return getToken(XQtParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(XQtParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_nestContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_nest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_nest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_nest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_identifierContext extends ExpressionContext {
		public IdentifierContext operand;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_identifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_identifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_functionContext extends ExpressionContext {
		public FunctionContext operand;
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Expression_functionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_function(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_valueContext extends ExpressionContext {
		public ValueContext operand;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Expression_valueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_multContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(XQtParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(XQtParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(XQtParser.MOD, 0); }
		public Expression_multContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_mult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_mult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_powerContext extends ExpressionContext {
		public ExpressionContext x;
		public Token op;
		public ExpressionContext y;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_powerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_power(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_power(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_power(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_aAndOrContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AAND() { return getToken(XQtParser.AAND, 0); }
		public TerminalNode AOR() { return getToken(XQtParser.AOR, 0); }
		public Expression_aAndOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_aAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_aAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_aAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_andOrContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(XQtParser.AND, 0); }
		public TerminalNode OR() { return getToken(XQtParser.OR, 0); }
		public Expression_andOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_andOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_andOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_andOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_addContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(XQtParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(XQtParser.MINUS, 0); }
		public Expression_addContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_add(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_isContext extends ExpressionContext {
		public ExpressionContext operand;
		public Token not;
		public Token isType;
		public TerminalNode IS() { return getToken(XQtParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(XQtParser.NULL, 0); }
		public TerminalNode NUMBER() { return getToken(XQtParser.NUMBER, 0); }
		public TerminalNode DateLiteral() { return getToken(XQtParser.DateLiteral, 0); }
		public TerminalNode EMPTY() { return getToken(XQtParser.EMPTY, 0); }
		public TerminalNode NoT() { return getToken(XQtParser.NoT, 0); }
		public Expression_isContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_negateContext extends ExpressionContext {
		public Token op;
		public ExpressionContext operand;
		public TerminalNode NEGATE() { return getToken(XQtParser.NEGATE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_negateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_negate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_negate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_negate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_compareContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(XQtParser.EQ, 0); }
		public TerminalNode NotEQ() { return getToken(XQtParser.NotEQ, 0); }
		public TerminalNode GT() { return getToken(XQtParser.GT, 0); }
		public TerminalNode GTEQ() { return getToken(XQtParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(XQtParser.LT, 0); }
		public TerminalNode LTEQ() { return getToken(XQtParser.LTEQ, 0); }
		public TerminalNode LIKE() { return getToken(XQtParser.LIKE, 0); }
		public Expression_compareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_compare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_smartContext extends ExpressionContext {
		public SmartIdContext operand;
		public SmartIdContext smartId() {
			return getRuleContext(SmartIdContext.class,0);
		}
		public Expression_smartContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_smart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_smart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_smart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				_localctx = new Expression_negateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(456);
				((Expression_negateContext)_localctx).op = match(NEGATE);
				setState(457);
				((Expression_negateContext)_localctx).operand = expression(13);
				}
				break;
			case 2:
				{
				_localctx = new Expression_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(458);
				((Expression_notContext)_localctx).op = match(NOT);
				setState(459);
				((Expression_notContext)_localctx).operand = expression(7);
				}
				break;
			case 3:
				{
				_localctx = new Expression_functionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(460);
				((Expression_functionContext)_localctx).operand = function();
				}
				break;
			case 4:
				{
				_localctx = new Expression_nestContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(461);
				match(LPAR);
				setState(462);
				((Expression_nestContext)_localctx).operand = expression(0);
				setState(463);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new Expression_valueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(465);
				((Expression_valueContext)_localctx).operand = value();
				}
				break;
			case 6:
				{
				_localctx = new Expression_identifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(466);
				((Expression_identifierContext)_localctx).operand = identifier();
				}
				break;
			case 7:
				{
				_localctx = new Expression_smartContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(467);
				((Expression_smartContext)_localctx).operand = smartId();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(494);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_powerContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_powerContext)_localctx).x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(470);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(471);
						((Expression_powerContext)_localctx).op = match(POW);
						setState(472);
						((Expression_powerContext)_localctx).y = expression(15);
						}
						break;
					case 2:
						{
						_localctx = new Expression_multContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_multContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(473);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(474);
						((Expression_multContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (MULT - 82)) | (1L << (DIV - 82)) | (1L << (MOD - 82)))) != 0)) ) {
							((Expression_multContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(475);
						((Expression_multContext)_localctx).right = expression(13);
						}
						break;
					case 3:
						{
						_localctx = new Expression_addContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_addContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(476);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(477);
						((Expression_addContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Expression_addContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(478);
						((Expression_addContext)_localctx).right = expression(12);
						}
						break;
					case 4:
						{
						_localctx = new Expression_aAndOrContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_aAndOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(479);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(480);
						((Expression_aAndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AOR || _la==AAND) ) {
							((Expression_aAndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(481);
						((Expression_aAndOrContext)_localctx).right = expression(11);
						}
						break;
					case 5:
						{
						_localctx = new Expression_compareContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_compareContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(482);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(483);
						((Expression_compareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (EQ - 72)) | (1L << (NotEQ - 72)) | (1L << (GT - 72)) | (1L << (GTEQ - 72)) | (1L << (LT - 72)) | (1L << (LTEQ - 72)) | (1L << (LIKE - 72)))) != 0)) ) {
							((Expression_compareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(484);
						((Expression_compareContext)_localctx).right = expression(10);
						}
						break;
					case 6:
						{
						_localctx = new Expression_andOrContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_andOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(485);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(486);
						((Expression_andOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
							((Expression_andOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(487);
						((Expression_andOrContext)_localctx).right = expression(7);
						}
						break;
					case 7:
						{
						_localctx = new Expression_isContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_isContext)_localctx).operand = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(488);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(489);
						match(IS);
						setState(491);
						_la = _input.LA(1);
						if (_la==NoT) {
							{
							setState(490);
							((Expression_isContext)_localctx).not = match(NoT);
							}
						}

						setState(493);
						((Expression_isContext)_localctx).isType = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (NULL - 53)) | (1L << (NUMBER - 53)) | (1L << (DateLiteral - 53)) | (1L << (EMPTY - 53)))) != 0)) ) {
							((Expression_isContext)_localctx).isType = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Function_packageContext extends FunctionContext {
		public PackagedIdentifierContext functionName;
		public ArgumentContext arg1;
		public ArgumentContext argument;
		public List<ArgumentContext> args2 = new ArrayList<ArgumentContext>();
		public TerminalNode LPAR() { return getToken(XQtParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(XQtParser.RPAR, 0); }
		public PackagedIdentifierContext packagedIdentifier() {
			return getRuleContext(PackagedIdentifierContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public Function_packageContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterFunction_package(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitFunction_package(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitFunction_package(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_simpleContext extends FunctionContext {
		public SimpleIdentifierContext functionName;
		public ArgumentContext arg1;
		public ArgumentContext argument;
		public List<ArgumentContext> args2 = new ArrayList<ArgumentContext>();
		public TerminalNode LPAR() { return getToken(XQtParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(XQtParser.RPAR, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public Function_simpleContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterFunction_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitFunction_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitFunction_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function);
		int _la;
		try {
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new Function_simpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				((Function_simpleContext)_localctx).functionName = simpleIdentifier();
				setState(500);
				match(LPAR);
				setState(509);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (NEGATE - 81)) | (1L << (NOT - 81)) | (1L << (LPAR - 81)) | (1L << (STRING - 81)) | (1L << (ID - 81)) | (1L << (BOOLEAN - 81)) | (1L << (DateValue - 81)) | (1L << (UINT - 81)) | (1L << (INT - 81)) | (1L << (FLOAT - 81)))) != 0)) {
					{
					setState(501);
					((Function_simpleContext)_localctx).arg1 = argument();
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(502);
						match(COMMA);
						setState(503);
						((Function_simpleContext)_localctx).argument = argument();
						((Function_simpleContext)_localctx).args2.add(((Function_simpleContext)_localctx).argument);
						}
						}
						setState(508);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(511);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new Function_packageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				((Function_packageContext)_localctx).functionName = packagedIdentifier();
				setState(514);
				match(LPAR);
				setState(523);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (NEGATE - 81)) | (1L << (NOT - 81)) | (1L << (LPAR - 81)) | (1L << (STRING - 81)) | (1L << (ID - 81)) | (1L << (BOOLEAN - 81)) | (1L << (DateValue - 81)) | (1L << (UINT - 81)) | (1L << (INT - 81)) | (1L << (FLOAT - 81)))) != 0)) {
					{
					setState(515);
					((Function_packageContext)_localctx).arg1 = argument();
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(516);
						match(COMMA);
						setState(517);
						((Function_packageContext)_localctx).argument = argument();
						((Function_packageContext)_localctx).args2.add(((Function_packageContext)_localctx).argument);
						}
						}
						setState(522);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(525);
				match(RPAR);
				}
				break;
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

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			expression(0);
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

	public static class PackagedIdentifierContext extends ParserRuleContext {
		public Token packageId;
		public Token id;
		public TerminalNode DOT() { return getToken(XQtParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(XQtParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XQtParser.ID, i);
		}
		public PackagedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packagedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterPackagedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitPackagedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitPackagedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackagedIdentifierContext packagedIdentifier() throws RecognitionException {
		PackagedIdentifierContext _localctx = new PackagedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_packagedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			((PackagedIdentifierContext)_localctx).packageId = match(ID);
			setState(532);
			match(DOT);
			setState(533);
			((PackagedIdentifierContext)_localctx).id = match(ID);
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

	public static class SmartIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public SemanticKeyContext semanticKey() {
			return getRuleContext(SemanticKeyContext.class,0);
		}
		public SmartIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smartId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSmartId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSmartId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSmartId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmartIdContext smartId() throws RecognitionException {
		SmartIdContext _localctx = new SmartIdContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_smartId);
		try {
			setState(548);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				match(ID);
				setState(536);
				match(COLON);
				setState(537);
				dataType();
				setState(538);
				match(DCOLON);
				setState(539);
				semanticKey();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(ID);
				setState(542);
				match(DCOLON);
				setState(543);
				semanticKey();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				match(ID);
				setState(545);
				match(COLON);
				setState(546);
				dataType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				match(ID);
				}
				break;
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(XQtParser.Boolean, 0); }
		public TerminalNode Byte() { return getToken(XQtParser.Byte, 0); }
		public List<TerminalNode> String() { return getTokens(XQtParser.String); }
		public TerminalNode String(int i) {
			return getToken(XQtParser.String, i);
		}
		public TerminalNode Integer() { return getToken(XQtParser.Integer, 0); }
		public TerminalNode Long() { return getToken(XQtParser.Long, 0); }
		public TerminalNode Real() { return getToken(XQtParser.Real, 0); }
		public TerminalNode Date() { return getToken(XQtParser.Date, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Date) | (1L << Boolean) | (1L << String) | (1L << Byte) | (1L << Integer) | (1L << Long) | (1L << Real))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SemanticKeyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public TerminalNode STRING() { return getToken(XQtParser.STRING, 0); }
		public SemanticKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semanticKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSemanticKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSemanticKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSemanticKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemanticKeyContext semanticKey() throws RecognitionException {
		SemanticKeyContext _localctx = new SemanticKeyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_semanticKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode UINT() { return getToken(XQtParser.UINT, 0); }
		public TerminalNode INT() { return getToken(XQtParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(XQtParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(XQtParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(XQtParser.STRING, 0); }
		public TerminalNode DateValue() { return getToken(XQtParser.DateValue, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (STRING - 107)) | (1L << (BOOLEAN - 107)) | (1L << (DateValue - 107)) | (1L << (UINT - 107)) | (1L << (INT - 107)) | (1L << (FLOAT - 107)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Identifier_simpleContext extends IdentifierContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public Identifier_simpleContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterIdentifier_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitIdentifier_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitIdentifier_simple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Identifier_qulaifiedContext extends IdentifierContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public Identifier_qulaifiedContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterIdentifier_qulaified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitIdentifier_qulaified(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitIdentifier_qulaified(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_identifier);
		try {
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new Identifier_qulaifiedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				qualifiedIdentifier();
				}
				break;
			case 2:
				_localctx = new Identifier_simpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				simpleIdentifier();
				}
				break;
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

	public static class VersionSelectorContext extends ParserRuleContext {
		public LabelVersionSelectorContext labelVersionSelector() {
			return getRuleContext(LabelVersionSelectorContext.class,0);
		}
		public SequenceVersionSelectorContext sequenceVersionSelector() {
			return getRuleContext(SequenceVersionSelectorContext.class,0);
		}
		public VersionSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterVersionSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitVersionSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitVersionSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionSelectorContext versionSelector() throws RecognitionException {
		VersionSelectorContext _localctx = new VersionSelectorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_versionSelector);
		try {
			setState(562);
			switch (_input.LA(1)) {
			case LATEST:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				labelVersionSelector();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				sequenceVersionSelector();
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

	public static class LabelVersionSelectorContext extends ParserRuleContext {
		public TerminalNode LATEST() { return getToken(XQtParser.LATEST, 0); }
		public TerminalNode STRING() { return getToken(XQtParser.STRING, 0); }
		public LabelVersionSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelVersionSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterLabelVersionSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitLabelVersionSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitLabelVersionSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelVersionSelectorContext labelVersionSelector() throws RecognitionException {
		LabelVersionSelectorContext _localctx = new LabelVersionSelectorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_labelVersionSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_la = _input.LA(1);
			if ( !(_la==LATEST || _la==STRING) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SequenceVersionSelectorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(XQtParser.INT, 0); }
		public SequenceVersionSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceVersionSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSequenceVersionSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSequenceVersionSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSequenceVersionSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceVersionSelectorContext sequenceVersionSelector() throws RecognitionException {
		SequenceVersionSelectorContext _localctx = new SequenceVersionSelectorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sequenceVersionSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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

	public static class DateVersionSelectorContext extends ParserRuleContext {
		public TerminalNode DateValue() { return getToken(XQtParser.DateValue, 0); }
		public DateVersionSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateVersionSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterDateVersionSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitDateVersionSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitDateVersionSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateVersionSelectorContext dateVersionSelector() throws RecognitionException {
		DateVersionSelectorContext _localctx = new DateVersionSelectorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dateVersionSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(569);
			match(DateValue);
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

	public static class SimpleIdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public SimpleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSimpleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSimpleIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSimpleIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleIdentifierContext simpleIdentifier() throws RecognitionException {
		SimpleIdentifierContext _localctx = new SimpleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(ID);
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

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public Token firstId;
		public Token ID;
		public List<Token> otherIds = new ArrayList<Token>();
		public Token INT;
		public Token _tset642;
		public List<TerminalNode> ID() { return getTokens(XQtParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XQtParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(XQtParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(XQtParser.DOT, i);
		}
		public List<TerminalNode> INT() { return getTokens(XQtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(XQtParser.INT, i);
		}
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterQualifiedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitQualifiedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitQualifiedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_qualifiedIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			((QualifiedIdentifierContext)_localctx).firstId = match(ID);
			setState(576); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(574);
					match(DOT);
					setState(575);
					((QualifiedIdentifierContext)_localctx)._tset642 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
						((QualifiedIdentifierContext)_localctx)._tset642 = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					((QualifiedIdentifierContext)_localctx).otherIds.add(((QualifiedIdentifierContext)_localctx)._tset642);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(578); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public List<PathEntityContext> pathEntity() {
			return getRuleContexts(PathEntityContext.class);
		}
		public PathEntityContext pathEntity(int i) {
			return getRuleContext(PathEntityContext.class,i);
		}
		public List<TerminalNode> RELATIONSHIP() { return getTokens(XQtParser.RELATIONSHIP); }
		public TerminalNode RELATIONSHIP(int i) {
			return getToken(XQtParser.RELATIONSHIP, i);
		}
		public PathAttributeContext pathAttribute() {
			return getRuleContext(PathAttributeContext.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_path);
		int _la;
		try {
			int _alt;
			setState(623);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				pathEntity();
				setState(585); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(583);
					match(RELATIONSHIP);
					setState(584);
					pathEntity();
					}
					}
					setState(587); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RELATIONSHIP );
				setState(591);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(589);
					match(T__8);
					setState(590);
					pathAttribute();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				pathEntity();
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(594);
						match(RELATIONSHIP);
						setState(595);
						pathEntity();
						}
						} 
					}
					setState(600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				{
				setState(601);
				match(RELATIONSHIP);
				setState(602);
				pathEntity();
				}
				setState(606);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(604);
					match(T__9);
					setState(605);
					pathAttribute();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				pathEntity();
				setState(611);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(609);
					match(T__9);
					setState(610);
					pathAttribute();
					}
				}

				setState(615); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(613);
					match(RELATIONSHIP);
					setState(614);
					pathEntity();
					}
					}
					setState(617); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RELATIONSHIP );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(619);
				pathEntity();
				setState(620);
				match(T__8);
				setState(621);
				pathAttribute();
				}
				break;
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

	public static class PathEntityContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public PathEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterPathEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitPathEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitPathEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathEntityContext pathEntity() throws RecognitionException {
		PathEntityContext _localctx = new PathEntityContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_pathEntity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(ID);
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

	public static class PathAttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public PathAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterPathAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitPathAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitPathAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathAttributeContext pathAttribute() throws RecognitionException {
		PathAttributeContext _localctx = new PathAttributeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_pathAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3w\u0278\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\7\3x\n"+
		"\3\f\3\16\3{\13\3\3\3\7\3~\n\3\f\3\16\3\u0081\13\3\3\3\7\3\u0084\n\3\f"+
		"\3\16\3\u0087\13\3\3\3\3\3\7\3\u008b\n\3\f\3\16\3\u008e\13\3\6\3\u0090"+
		"\n\3\r\3\16\3\u0091\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u009a\n\4\3\4\3\4\6\4"+
		"\u009e\n\4\r\4\16\4\u009f\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u00a9\n\5\3"+
		"\5\3\5\3\5\5\5\u00ae\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u00bf\n\6\f\6\16\6\u00c2\13\6\5\6\u00c4\n\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00d4\n\b\f\b\16"+
		"\b\u00d7\13\b\5\b\u00d9\n\b\3\b\3\b\3\b\5\b\u00de\n\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\5\r\u00ea\n\r\3\r\5\r\u00ed\n\r\3\r\3\r\5\r"+
		"\u00f1\n\r\3\r\5\r\u00f4\n\r\3\r\5\r\u00f7\n\r\3\r\5\r\u00fa\n\r\3\r\5"+
		"\r\u00fd\n\r\3\r\5\r\u0100\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u010c\n\17\f\17\16\17\u010f\13\17\5\17\u0111\n\17\3\20"+
		"\3\20\3\20\5\20\u0116\n\20\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u011e\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\5\23\u0125\n\23\5\23\u0127\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u012f\n\23\5\23\u0131\n\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0140\n\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0154\n\31\3\32\5\32\u0157\n\32\3\32\3\32\3\32\5"+
		"\32\u015c\n\32\3\32\3\32\3\32\3\32\5\32\u0162\n\32\3\32\3\32\3\32\7\32"+
		"\u0167\n\32\f\32\16\32\u016a\13\32\3\32\3\32\5\32\u016e\n\32\3\32\5\32"+
		"\u0171\n\32\3\32\3\32\5\32\u0175\n\32\3\32\5\32\u0178\n\32\3\32\3\32\5"+
		"\32\u017c\n\32\3\32\5\32\u017f\n\32\3\32\3\32\5\32\u0183\n\32\3\32\5\32"+
		"\u0186\n\32\3\33\3\33\3\33\5\33\u018b\n\33\3\33\3\33\5\33\u018f\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u019a\n\35\f\35\16\35"+
		"\u019d\13\35\3\36\3\36\5\36\u01a1\n\36\3\36\5\36\u01a4\n\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3!\5!\u01ae\n!\3\"\3\"\3\"\5\"\u01b3\n\"\3\"\3\"\5\"\u01b7"+
		"\n\"\3#\3#\3#\3#\7#\u01bd\n#\f#\16#\u01c0\13#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01d7\n(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01ee\n(\3(\7(\u01f1"+
		"\n(\f(\16(\u01f4\13(\3)\3)\3)\3)\3)\7)\u01fb\n)\f)\16)\u01fe\13)\5)\u0200"+
		"\n)\3)\3)\3)\3)\3)\3)\3)\7)\u0209\n)\f)\16)\u020c\13)\5)\u020e\n)\3)\3"+
		")\5)\u0212\n)\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\5,\u0227\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\5\60\u0231\n\60\3\61\3\61\5"+
		"\61\u0235\n\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\66\6\66\u0243\n\66\r\66\16\66\u0244\3\67\3\67\38\38\38\68\u024c\n8"+
		"\r8\168\u024d\38\38\58\u0252\n8\38\38\38\78\u0257\n8\f8\168\u025a\138"+
		"\38\38\38\38\38\58\u0261\n8\38\38\38\58\u0266\n8\38\38\68\u026a\n8\r8"+
		"\168\u026b\38\38\38\38\58\u0272\n8\39\39\3:\3:\3:\2\3N;\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnpr\2\23\3\2\'(\3\2JO\4\2rruu\3\2\3\7\3\2\65\66\3\2TV\3\2QR\3\2Z["+
		"\3\2JP\3\2ef\4\2\67\67@B\3\2\r\23\4\2mmrr\4\2mmsw\4\2&&mm\3\2\b\n\4\2"+
		"rrvv\u0299\2t\3\2\2\2\4y\3\2\2\2\6\u0095\3\2\2\2\b\u00a3\3\2\2\2\n\u00b1"+
		"\3\2\2\2\f\u00c5\3\2\2\2\16\u00c9\3\2\2\2\20\u00df\3\2\2\2\22\u00e1\3"+
		"\2\2\2\24\u00e3\3\2\2\2\26\u00e5\3\2\2\2\30\u00e7\3\2\2\2\32\u0101\3\2"+
		"\2\2\34\u0110\3\2\2\2\36\u0112\3\2\2\2 \u0117\3\2\2\2\"\u011d\3\2\2\2"+
		"$\u0126\3\2\2\2&\u013f\3\2\2\2(\u0141\3\2\2\2*\u0145\3\2\2\2,\u0149\3"+
		"\2\2\2.\u014b\3\2\2\2\60\u0153\3\2\2\2\62\u0156\3\2\2\2\64\u0187\3\2\2"+
		"\2\66\u0190\3\2\2\28\u0195\3\2\2\2:\u019e\3\2\2\2<\u01a5\3\2\2\2>\u01a7"+
		"\3\2\2\2@\u01ad\3\2\2\2B\u01af\3\2\2\2D\u01b8\3\2\2\2F\u01c1\3\2\2\2H"+
		"\u01c3\3\2\2\2J\u01c5\3\2\2\2L\u01c7\3\2\2\2N\u01d6\3\2\2\2P\u0211\3\2"+
		"\2\2R\u0213\3\2\2\2T\u0215\3\2\2\2V\u0226\3\2\2\2X\u0228\3\2\2\2Z\u022a"+
		"\3\2\2\2\\\u022c\3\2\2\2^\u0230\3\2\2\2`\u0234\3\2\2\2b\u0236\3\2\2\2"+
		"d\u0238\3\2\2\2f\u023a\3\2\2\2h\u023d\3\2\2\2j\u023f\3\2\2\2l\u0246\3"+
		"\2\2\2n\u0271\3\2\2\2p\u0273\3\2\2\2r\u0275\3\2\2\2tu\5\4\3\2u\3\3\2\2"+
		"\2vx\5\6\4\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\177\3\2\2\2{y\3"+
		"\2\2\2|~\5\n\6\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0085\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\5\16\b\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u008f\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008c\5\22\n\2\u0089\u008b\7"+
		"p\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0088\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\7\2\2\3\u0094\5\3\2\2\2\u0095\u0096\7\24\2"+
		"\2\u0096\u0099\7r\2\2\u0097\u0098\7\33\2\2\u0098\u009a\7r\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7a\2\2\u009c"+
		"\u009e\5\b\5\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7b\2\2\u00a2"+
		"\7\3\2\2\2\u00a3\u00a4\7\34\2\2\u00a4\u00a8\5V,\2\u00a5\u00a6\7\35\2\2"+
		"\u00a6\u00a7\7Y\2\2\u00a7\u00a9\5N(\2\u00a8\u00a5\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00ac\7Y\2\2\u00ac"+
		"\u00ae\5N(\2\u00ad\u00aa\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2"+
		"\2\u00af\u00b0\7\\\2\2\u00b0\t\3\2\2\2\u00b1\u00b2\7\37\2\2\u00b2\u00b3"+
		"\7r\2\2\u00b3\u00b4\7 \2\2\u00b4\u00b5\7Y\2\2\u00b5\u00b6\7r\2\2\u00b6"+
		"\u00b7\7!\2\2\u00b7\u00b8\7Y\2\2\u00b8\u00c3\7m\2\2\u00b9\u00ba\7\"\2"+
		"\2\u00ba\u00bb\7Y\2\2\u00bb\u00c0\5\f\7\2\u00bc\u00bd\7\\\2\2\u00bd\u00bf"+
		"\5\f\7\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00b9\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\13\3\2\2\2\u00c5\u00c6\7r\2\2\u00c6\u00c7"+
		"\7d\2\2\u00c7\u00c8\5N(\2\u00c8\r\3\2\2\2\u00c9\u00ca\7#\2\2\u00ca\u00cb"+
		"\7r\2\2\u00cb\u00cc\7\37\2\2\u00cc\u00cd\7Y\2\2\u00cd\u00d8\7r\2\2\u00ce"+
		"\u00cf\7$\2\2\u00cf\u00d0\7Y\2\2\u00d0\u00d5\5\20\t\2\u00d1\u00d2\7\\"+
		"\2\2\u00d2\u00d4\5\20\t\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00ce\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dd\3\2\2\2\u00da"+
		"\u00db\7%\2\2\u00db\u00dc\7Y\2\2\u00dc\u00de\5`\61\2\u00dd\u00da\3\2\2"+
		"\2\u00dd\u00de\3\2\2\2\u00de\17\3\2\2\2\u00df\u00e0\7r\2\2\u00e0\21\3"+
		"\2\2\2\u00e1\u00e2\5\24\13\2\u00e2\23\3\2\2\2\u00e3\u00e4\5\26\f\2\u00e4"+
		"\25\3\2\2\2\u00e5\u00e6\5\30\r\2\u00e6\27\3\2\2\2\u00e7\u00e9\7\31\2\2"+
		"\u00e8\u00ea\5\32\16\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec"+
		"\3\2\2\2\u00eb\u00ed\5\34\17\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00f0\5 \21\2\u00ef\u00f1\5\60\31\2\u00f0\u00ef"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\5\64\33\2"+
		"\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7"+
		"\5\66\34\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2"+
		"\u00f8\u00fa\58\35\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc"+
		"\3\2\2\2\u00fb\u00fd\5B\"\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u0100\5D#\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2"+
		"\2\u0100\31\3\2\2\2\u0101\u0102\t\2\2\2\u0102\33\3\2\2\2\u0103\u0104\7"+
		"\25\2\2\u0104\u0105\7\24\2\2\u0105\u0111\5h\65\2\u0106\u0107\7\25\2\2"+
		"\u0107\u0108\7\27\2\2\u0108\u010d\5\36\20\2\u0109\u010a\7\\\2\2\u010a"+
		"\u010c\5\36\20\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0103\3\2\2\2\u0110\u0106\3\2\2\2\u0111\35\3\2\2\2\u0112\u0115\5N(\2"+
		"\u0113\u0114\7\30\2\2\u0114\u0116\5h\65\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\37\3\2\2\2\u0117\u0118\7\32\2\2\u0118\u0119\5\"\22\2\u0119"+
		"!\3\2\2\2\u011a\u011e\5$\23\2\u011b\u011e\5*\26\2\u011c\u011e\5F$\2\u011d"+
		"\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e#\3\2\2\2"+
		"\u011f\u0127\5F$\2\u0120\u0124\5*\26\2\u0121\u0122\7\25\2\2\u0122\u0123"+
		"\7\24\2\2\u0123\u0125\5h\65\2\u0124\u0121\3\2\2\2\u0124\u0125\3\2\2\2"+
		"\u0125\u0127\3\2\2\2\u0126\u011f\3\2\2\2\u0126\u0120\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0130\5&\24\2\u0129\u0131\5F$\2\u012a\u012e\5*\26\2\u012b"+
		"\u012c\7\25\2\2\u012c\u012d\7\24\2\2\u012d\u012f\5h\65\2\u012e\u012b\3"+
		"\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0129\3\2\2\2\u0130"+
		"\u012a\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7)\2\2\u0133\u0134\5(\25"+
		"\2\u0134%\3\2\2\2\u0135\u0136\7+\2\2\u0136\u0140\7*\2\2\u0137\u0138\7"+
		",\2\2\u0138\u0140\7*\2\2\u0139\u013a\7-\2\2\u013a\u013b\7,\2\2\u013b\u0140"+
		"\7*\2\2\u013c\u013d\7.\2\2\u013d\u013e\7,\2\2\u013e\u0140\7*\2\2\u013f"+
		"\u0135\3\2\2\2\u013f\u0137\3\2\2\2\u013f\u0139\3\2\2\2\u013f\u013c\3\2"+
		"\2\2\u0140\'\3\2\2\2\u0141\u0142\5^\60\2\u0142\u0143\t\3\2\2\u0143\u0144"+
		"\5^\60\2\u0144)\3\2\2\2\u0145\u0146\5,\27\2\u0146\u0147\7`\2\2\u0147\u0148"+
		"\5.\30\2\u0148+\3\2\2\2\u0149\u014a\7r\2\2\u014a-\3\2\2\2\u014b\u014c"+
		"\t\4\2\2\u014c/\3\2\2\2\u014d\u014e\7/\2\2\u014e\u0154\5\62\32\2\u014f"+
		"\u0150\7/\2\2\u0150\u0154\5F$\2\u0151\u0152\7/\2\2\u0152\u0154\5*\26\2"+
		"\u0153\u014d\3\2\2\2\u0153\u014f\3\2\2\2\u0153\u0151\3\2\2\2\u0154\61"+
		"\3\2\2\2\u0155\u0157\7C\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015b\5F$\2\u0159\u015a\7E\2\2\u015a\u015c\7d\2\2"+
		"\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e"+
		"\5^\60\2\u015e\u0161\3\2\2\2\u015f\u0160\7F\2\2\u0160\u0162\7d\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0168\5^"+
		"\60\2\u0164\u0165\7\\\2\2\u0165\u0167\5^\60\2\u0166\u0164\3\2\2\2\u0167"+
		"\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0170\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7D\2\2\u016c\u016e\7d\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\t\5\2\2\u0170"+
		"\u016d\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0177\3\2\2\2\u0172\u0173\7G"+
		"\2\2\u0173\u0175\7d\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0178\7m\2\2\u0177\u0174\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017e\3\2\2\2\u0179\u017a\7H\2\2\u017a\u017c\7d\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\7m\2\2\u017e"+
		"\u017b\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0185\3\2\2\2\u0180\u0181\7I"+
		"\2\2\u0181\u0183\7d\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0186\7m\2\2\u0185\u0182\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\63\3\2\2\2\u0187\u018a\7\60\2\2\u0188\u0189\7\61\2\2\u0189"+
		"\u018b\5H%\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e\3\2\2"+
		"\2\u018c\u018d\7\62\2\2\u018d\u018f\5H%\2\u018e\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\65\3\2\2\2\u0190\u0191\7\63\2\2\u0191\u0192\7^\2\2\u0192"+
		"\u0193\5H%\2\u0193\u0194\7_\2\2\u0194\67\3\2\2\2\u0195\u0196\7\64\2\2"+
		"\u0196\u019b\5:\36\2\u0197\u0198\7\\\2\2\u0198\u019a\5:\36\2\u0199\u0197"+
		"\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"9\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\5<\37\2\u019f\u01a1\5> \2\u01a0"+
		"\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a4\5@"+
		"!\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4;\3\2\2\2\u01a5\u01a6"+
		"\5^\60\2\u01a6=\3\2\2\2\u01a7\u01a8\t\6\2\2\u01a8?\3\2\2\2\u01a9\u01aa"+
		"\7\67\2\2\u01aa\u01ae\78\2\2\u01ab\u01ac\7\67\2\2\u01ac\u01ae\79\2\2\u01ad"+
		"\u01a9\3\2\2\2\u01ad\u01ab\3\2\2\2\u01aeA\3\2\2\2\u01af\u01b2\7:\2\2\u01b0"+
		"\u01b1\7;\2\2\u01b1\u01b3\7u\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2"+
		"\2\u01b3\u01b6\3\2\2\2\u01b4\u01b5\7<\2\2\u01b5\u01b7\7u\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7C\3\2\2\2\u01b8\u01b9\7=\2\2\u01b9\u01be"+
		"\5^\60\2\u01ba\u01bb\7\\\2\2\u01bb\u01bd\5^\60\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bfE\3\2\2\2"+
		"\u01c0\u01be\3\2\2\2\u01c1\u01c2\7r\2\2\u01c2G\3\2\2\2\u01c3\u01c4\5N"+
		"(\2\u01c4I\3\2\2\2\u01c5\u01c6\7v\2\2\u01c6K\3\2\2\2\u01c7\u01c8\7w\2"+
		"\2\u01c8M\3\2\2\2\u01c9\u01ca\b(\1\2\u01ca\u01cb\7S\2\2\u01cb\u01d7\5"+
		"N(\17\u01cc\u01cd\7X\2\2\u01cd\u01d7\5N(\t\u01ce\u01d7\5P)\2\u01cf\u01d0"+
		"\7^\2\2\u01d0\u01d1\5N(\2\u01d1\u01d2\7_\2\2\u01d2\u01d7\3\2\2\2\u01d3"+
		"\u01d7\5\\/\2\u01d4\u01d7\5^\60\2\u01d5\u01d7\5V,\2\u01d6\u01c9\3\2\2"+
		"\2\u01d6\u01cc\3\2\2\2\u01d6\u01ce\3\2\2\2\u01d6\u01cf\3\2\2\2\u01d6\u01d3"+
		"\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01f2\3\2\2\2\u01d8"+
		"\u01d9\f\20\2\2\u01d9\u01da\7W\2\2\u01da\u01f1\5N(\21\u01db\u01dc\f\16"+
		"\2\2\u01dc\u01dd\t\7\2\2\u01dd\u01f1\5N(\17\u01de\u01df\f\r\2\2\u01df"+
		"\u01e0\t\b\2\2\u01e0\u01f1\5N(\16\u01e1\u01e2\f\f\2\2\u01e2\u01e3\t\t"+
		"\2\2\u01e3\u01f1\5N(\r\u01e4\u01e5\f\13\2\2\u01e5\u01e6\t\n\2\2\u01e6"+
		"\u01f1\5N(\f\u01e7\u01e8\f\b\2\2\u01e8\u01e9\t\13\2\2\u01e9\u01f1\5N("+
		"\t\u01ea\u01eb\f\n\2\2\u01eb\u01ed\7>\2\2\u01ec\u01ee\7?\2\2\u01ed\u01ec"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\t\f\2\2\u01f0"+
		"\u01d8\3\2\2\2\u01f0\u01db\3\2\2\2\u01f0\u01de\3\2\2\2\u01f0\u01e1\3\2"+
		"\2\2\u01f0\u01e4\3\2\2\2\u01f0\u01e7\3\2\2\2\u01f0\u01ea\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3O\3\2\2\2"+
		"\u01f4\u01f2\3\2\2\2\u01f5\u01f6\5h\65\2\u01f6\u01ff\7^\2\2\u01f7\u01fc"+
		"\5R*\2\u01f8\u01f9\7\\\2\2\u01f9\u01fb\5R*\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0200\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01ff\u01f7\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0202\7_\2\2\u0202\u0212\3\2\2\2\u0203\u0204\5T+"+
		"\2\u0204\u020d\7^\2\2\u0205\u020a\5R*\2\u0206\u0207\7\\\2\2\u0207\u0209"+
		"\5R*\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u0205\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\7_\2\2\u0210"+
		"\u0212\3\2\2\2\u0211\u01f5\3\2\2\2\u0211\u0203\3\2\2\2\u0212Q\3\2\2\2"+
		"\u0213\u0214\5N(\2\u0214S\3\2\2\2\u0215\u0216\7r\2\2\u0216\u0217\7`\2"+
		"\2\u0217\u0218\7r\2\2\u0218U\3\2\2\2\u0219\u021a\7r\2\2\u021a\u021b\7"+
		"d\2\2\u021b\u021c\5X-\2\u021c\u021d\7c\2\2\u021d\u021e\5Z.\2\u021e\u0227"+
		"\3\2\2\2\u021f\u0220\7r\2\2\u0220\u0221\7c\2\2\u0221\u0227\5Z.\2\u0222"+
		"\u0223\7r\2\2\u0223\u0224\7d\2\2\u0224\u0227\5X-\2\u0225\u0227\7r\2\2"+
		"\u0226\u0219\3\2\2\2\u0226\u021f\3\2\2\2\u0226\u0222\3\2\2\2\u0226\u0225"+
		"\3\2\2\2\u0227W\3\2\2\2\u0228\u0229\t\r\2\2\u0229Y\3\2\2\2\u022a\u022b"+
		"\t\16\2\2\u022b[\3\2\2\2\u022c\u022d\t\17\2\2\u022d]\3\2\2\2\u022e\u0231"+
		"\5j\66\2\u022f\u0231\5h\65\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231"+
		"_\3\2\2\2\u0232\u0235\5b\62\2\u0233\u0235\5d\63\2\u0234\u0232\3\2\2\2"+
		"\u0234\u0233\3\2\2\2\u0235a\3\2\2\2\u0236\u0237\t\20\2\2\u0237c\3\2\2"+
		"\2\u0238\u0239\7v\2\2\u0239e\3\2\2\2\u023a\u023b\t\21\2\2\u023b\u023c"+
		"\7t\2\2\u023cg\3\2\2\2\u023d\u023e\7r\2\2\u023ei\3\2\2\2\u023f\u0242\7"+
		"r\2\2\u0240\u0241\7`\2\2\u0241\u0243\t\22\2\2\u0242\u0240\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245k\3\2\2\2"+
		"\u0246\u0247\3\2\2\2\u0247m\3\2\2\2\u0248\u024b\5p9\2\u0249\u024a\7g\2"+
		"\2\u024a\u024c\5p9\2\u024b\u0249\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u0250\7\13\2\2"+
		"\u0250\u0252\5r:\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0272"+
		"\3\2\2\2\u0253\u0258\5p9\2\u0254\u0255\7g\2\2\u0255\u0257\5p9\2\u0256"+
		"\u0254\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259\u025b\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\7g\2\2\u025c"+
		"\u025d\5p9\2\u025d\u0260\3\2\2\2\u025e\u025f\7\f\2\2\u025f\u0261\5r:\2"+
		"\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0272\3\2\2\2\u0262\u0265"+
		"\5p9\2\u0263\u0264\7\f\2\2\u0264\u0266\5r:\2\u0265\u0263\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0268\7g\2\2\u0268\u026a\5p9"+
		"\2\u0269\u0267\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c"+
		"\3\2\2\2\u026c\u0272\3\2\2\2\u026d\u026e\5p9\2\u026e\u026f\7\13\2\2\u026f"+
		"\u0270\5r:\2\u0270\u0272\3\2\2\2\u0271\u0248\3\2\2\2\u0271\u0253\3\2\2"+
		"\2\u0271\u0262\3\2\2\2\u0271\u026d\3\2\2\2\u0272o\3\2\2\2\u0273\u0274"+
		"\7r\2\2\u0274q\3\2\2\2\u0275\u0276\7r\2\2\u0276s\3\2\2\2Ky\177\u0085\u008c"+
		"\u0091\u0099\u009f\u00a8\u00ad\u00c0\u00c3\u00d5\u00d8\u00dd\u00e9\u00ec"+
		"\u00f0\u00f3\u00f6\u00f9\u00fc\u00ff\u010d\u0110\u0115\u011d\u0124\u0126"+
		"\u012e\u0130\u013f\u0153\u0156\u015b\u0161\u0168\u016d\u0170\u0174\u0177"+
		"\u017b\u017e\u0182\u0185\u018a\u018e\u019b\u01a0\u01a3\u01ad\u01b2\u01b6"+
		"\u01be\u01d6\u01ed\u01f0\u01f2\u01fc\u01ff\u020a\u020d\u0211\u0226\u0230"+
		"\u0234\u0244\u024d\u0251\u0258\u0260\u0265\u026b\u0271";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}