// Generated from src/main/java/grammar/FlangParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP=1, CP=2, INTEGER=3, REAL=4, NULL=5, TRUE=6, FALSE=7, QUOTE=8, SETQ=9, 
		FUNC=10, LAMBDA=11, PROG=12, COND=13, WHILE=14, RETURN=15, BREAK=16, ATOM=17, 
		DIGIT_WITHOUT_ZERO=18, DIGIT=19, ID=20, WS=21;
	public static final int
		RULE_program = 0, RULE_element = 1, RULE_boolean_const = 2, RULE_literal = 3, 
		RULE_quote = 4, RULE_setq = 5, RULE_func = 6, RULE_lambda = 7, RULE_prog = 8, 
		RULE_cond = 9, RULE_while = 10, RULE_return = 11, RULE_list = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "element", "boolean_const", "literal", "quote", "setq", "func", 
			"lambda", "prog", "cond", "while", "return", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, "'null'", "'true'", "'false'", null, 
			"'setq'", "'func'", "'lambda'", "'prog'", "'cond'", "'while'", "'return'", 
			"'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP", "CP", "INTEGER", "REAL", "NULL", "TRUE", "FALSE", "QUOTE", 
			"SETQ", "FUNC", "LAMBDA", "PROG", "COND", "WHILE", "RETURN", "BREAK", 
			"ATOM", "DIGIT_WITHOUT_ZERO", "DIGIT", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "FlangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				element();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 262138L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ATOM() { return getToken(FlangParser.ATOM, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public SetqContext setq() {
			return getRuleContext(SetqContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(FlangParser.BREAK, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(ATOM);
				}
				break;
			case INTEGER:
			case REAL:
			case NULL:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				literal();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				list();
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				quote();
				}
				break;
			case SETQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				setq();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(36);
				func();
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 7);
				{
				setState(37);
				lambda();
				}
				break;
			case PROG:
				enterOuterAlt(_localctx, 8);
				{
				setState(38);
				prog();
				}
				break;
			case COND:
				enterOuterAlt(_localctx, 9);
				{
				setState(39);
				cond();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 10);
				{
				setState(40);
				while_();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 11);
				{
				setState(41);
				return_();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 12);
				{
				setState(42);
				match(BREAK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_constContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(FlangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FlangParser.FALSE, 0); }
		public Boolean_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterBoolean_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitBoolean_const(this);
		}
	}

	public final Boolean_constContext boolean_const() throws RecognitionException {
		Boolean_constContext _localctx = new Boolean_constContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_boolean_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(FlangParser.NULL, 0); }
		public TerminalNode INTEGER() { return getToken(FlangParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(FlangParser.REAL, 0); }
		public Boolean_constContext boolean_const() {
			return getRuleContext(Boolean_constContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(NULL);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(INTEGER);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(REAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				boolean_const();
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuoteContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(FlangParser.QUOTE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitQuote(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(QUOTE);
			setState(54);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetqContext extends ParserRuleContext {
		public TerminalNode SETQ() { return getToken(FlangParser.SETQ, 0); }
		public TerminalNode ATOM() { return getToken(FlangParser.ATOM, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public SetqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterSetq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitSetq(this);
		}
	}

	public final SetqContext setq() throws RecognitionException {
		SetqContext _localctx = new SetqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(SETQ);
			setState(57);
			match(ATOM);
			setState(58);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(FlangParser.FUNC, 0); }
		public TerminalNode ATOM() { return getToken(FlangParser.ATOM, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(FUNC);
			setState(61);
			match(ATOM);
			setState(62);
			list();
			setState(63);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(FlangParser.LAMBDA, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitLambda(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(LAMBDA);
			setState(66);
			list();
			setState(67);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode PROG() { return getToken(FlangParser.PROG, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(PROG);
			setState(70);
			list();
			setState(71);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public TerminalNode COND() { return getToken(FlangParser.COND, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(COND);
			setState(74);
			element();
			setState(75);
			element();
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(76);
				element();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FlangParser.WHILE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(WHILE);
			setState(80);
			element();
			setState(81);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FlangParser.RETURN, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitReturn(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(RETURN);
			setState(84);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(FlangParser.OP, 0); }
		public TerminalNode CP() { return getToken(FlangParser.CP, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlangParserListener ) ((FlangParserListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(OP);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 262138L) != 0)) {
				{
				{
				setState(87);
				element();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(CP);
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
		"\u0004\u0001\u0015`\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001,\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tN\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fY\b\f\n\f\f\f\\"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\u0006\u0007"+
		"c\u0000\u001b\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004"+
		"-\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b5\u0001\u0000"+
		"\u0000\u0000\n8\u0001\u0000\u0000\u0000\f<\u0001\u0000\u0000\u0000\u000e"+
		"A\u0001\u0000\u0000\u0000\u0010E\u0001\u0000\u0000\u0000\u0012I\u0001"+
		"\u0000\u0000\u0000\u0014O\u0001\u0000\u0000\u0000\u0016S\u0001\u0000\u0000"+
		"\u0000\u0018V\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000"+
		"\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e\u0001\u0001\u0000\u0000\u0000\u001f,\u0005\u0011\u0000\u0000 ,"+
		"\u0003\u0006\u0003\u0000!,\u0003\u0018\f\u0000\",\u0003\b\u0004\u0000"+
		"#,\u0003\n\u0005\u0000$,\u0003\f\u0006\u0000%,\u0003\u000e\u0007\u0000"+
		"&,\u0003\u0010\b\u0000\',\u0003\u0012\t\u0000(,\u0003\u0014\n\u0000),"+
		"\u0003\u0016\u000b\u0000*,\u0005\u0010\u0000\u0000+\u001f\u0001\u0000"+
		"\u0000\u0000+ \u0001\u0000\u0000\u0000+!\u0001\u0000\u0000\u0000+\"\u0001"+
		"\u0000\u0000\u0000+#\u0001\u0000\u0000\u0000+$\u0001\u0000\u0000\u0000"+
		"+%\u0001\u0000\u0000\u0000+&\u0001\u0000\u0000\u0000+\'\u0001\u0000\u0000"+
		"\u0000+(\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000"+
		"\u0000\u0000,\u0003\u0001\u0000\u0000\u0000-.\u0007\u0000\u0000\u0000"+
		".\u0005\u0001\u0000\u0000\u0000/4\u0005\u0005\u0000\u000004\u0005\u0003"+
		"\u0000\u000014\u0005\u0004\u0000\u000024\u0003\u0004\u0002\u00003/\u0001"+
		"\u0000\u0000\u000030\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"32\u0001\u0000\u0000\u00004\u0007\u0001\u0000\u0000\u000056\u0005\b\u0000"+
		"\u000067\u0003\u0002\u0001\u00007\t\u0001\u0000\u0000\u000089\u0005\t"+
		"\u0000\u00009:\u0005\u0011\u0000\u0000:;\u0003\u0002\u0001\u0000;\u000b"+
		"\u0001\u0000\u0000\u0000<=\u0005\n\u0000\u0000=>\u0005\u0011\u0000\u0000"+
		">?\u0003\u0018\f\u0000?@\u0003\u0002\u0001\u0000@\r\u0001\u0000\u0000"+
		"\u0000AB\u0005\u000b\u0000\u0000BC\u0003\u0018\f\u0000CD\u0003\u0002\u0001"+
		"\u0000D\u000f\u0001\u0000\u0000\u0000EF\u0005\f\u0000\u0000FG\u0003\u0018"+
		"\f\u0000GH\u0003\u0002\u0001\u0000H\u0011\u0001\u0000\u0000\u0000IJ\u0005"+
		"\r\u0000\u0000JK\u0003\u0002\u0001\u0000KM\u0003\u0002\u0001\u0000LN\u0003"+
		"\u0002\u0001\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\u0013\u0001\u0000\u0000\u0000OP\u0005\u000e\u0000\u0000PQ\u0003\u0002"+
		"\u0001\u0000QR\u0003\u0002\u0001\u0000R\u0015\u0001\u0000\u0000\u0000"+
		"ST\u0005\u000f\u0000\u0000TU\u0003\u0002\u0001\u0000U\u0017\u0001\u0000"+
		"\u0000\u0000VZ\u0005\u0001\u0000\u0000WY\u0003\u0002\u0001\u0000XW\u0001"+
		"\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000]^\u0005\u0002\u0000\u0000^\u0019\u0001\u0000\u0000\u0000\u0005"+
		"\u001d+3MZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}