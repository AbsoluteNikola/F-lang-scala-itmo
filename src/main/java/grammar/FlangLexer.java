// Generated from src/main/java/grammar/FlangLexer.g4 by ANTLR 4.13.1

   package org.lambda.flang.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP=1, CP=2, INTEGER=3, REAL=4, NULL=5, TRUE=6, FALSE=7, QUOTE=8, QUOTE_SHORT=9, 
		DO=10, SETQ=11, FUNC=12, LAMBDA=13, PROG=14, COND=15, WHILE=16, RETURN=17, 
		BREAK=18, ATOM=19, DIGIT_WITHOUT_ZERO=20, DIGIT=21, ID=22, WS=23, COMMENT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OP", "CP", "INTEGER", "REAL", "NULL", "TRUE", "FALSE", "QUOTE", "QUOTE_SHORT", 
			"DO", "SETQ", "FUNC", "LAMBDA", "PROG", "COND", "WHILE", "RETURN", "BREAK", 
			"ATOM", "DIGIT_WITHOUT_ZERO", "DIGIT", "ID", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, "'null'", "'true'", "'false'", "'quote'", 
			"'''", "'do'", "'setq'", "'func'", "'lambda'", "'prog'", "'cond'", "'while'", 
			"'return'", "'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP", "CP", "INTEGER", "REAL", "NULL", "TRUE", "FALSE", "QUOTE", 
			"QUOTE_SHORT", "DO", "SETQ", "FUNC", "LAMBDA", "PROG", "COND", "WHILE", 
			"RETURN", "BREAK", "ATOM", "DIGIT_WITHOUT_ZERO", "DIGIT", "ID", "WS", 
			"COMMENT"
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


	public FlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FlangLexer.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u00aa\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002"+
		"7\b\u0002\u0001\u0002\u0004\u0002:\b\u0002\u000b\u0002\f\u0002;\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003A\b\u0003\u000b\u0003\f\u0003"+
		"B\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0096\b\u0015\n\u0015\f\u0015\u0099"+
		"\t\u0015\u0001\u0016\u0004\u0016\u009c\b\u0016\u000b\u0016\f\u0016\u009d"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u00a4\b\u0017"+
		"\n\u0017\f\u0017\u00a7\t\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u0018\u0001\u0000\u0006\u0001\u000019\u0001\u000009\u0003\u0000AZ__"+
		"az\u0005\u0000--09AZ__az\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\r\u00af"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u00033\u0001\u0000"+
		"\u0000\u0000\u00056\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000"+
		"\tD\u0001\u0000\u0000\u0000\u000bI\u0001\u0000\u0000\u0000\rN\u0001\u0000"+
		"\u0000\u0000\u000fT\u0001\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000"+
		"\u0013\\\u0001\u0000\u0000\u0000\u0015_\u0001\u0000\u0000\u0000\u0017"+
		"d\u0001\u0000\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001bp\u0001"+
		"\u0000\u0000\u0000\u001du\u0001\u0000\u0000\u0000\u001fz\u0001\u0000\u0000"+
		"\u0000!\u0080\u0001\u0000\u0000\u0000#\u0087\u0001\u0000\u0000\u0000%"+
		"\u008d\u0001\u0000\u0000\u0000\'\u008f\u0001\u0000\u0000\u0000)\u0091"+
		"\u0001\u0000\u0000\u0000+\u0093\u0001\u0000\u0000\u0000-\u009b\u0001\u0000"+
		"\u0000\u0000/\u00a1\u0001\u0000\u0000\u000012\u0005(\u0000\u00002\u0002"+
		"\u0001\u0000\u0000\u000034\u0005)\u0000\u00004\u0004\u0001\u0000\u0000"+
		"\u000057\u0005-\u0000\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000079\u0001\u0000\u0000\u00008:\u0003)\u0014\u000098\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0003\u0005\u0002\u0000"+
		">@\u0005.\u0000\u0000?A\u0003)\u0014\u0000@?\u0001\u0000\u0000\u0000A"+
		"B\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000C\b\u0001\u0000\u0000\u0000DE\u0005n\u0000\u0000EF\u0005u\u0000"+
		"\u0000FG\u0005l\u0000\u0000GH\u0005l\u0000\u0000H\n\u0001\u0000\u0000"+
		"\u0000IJ\u0005t\u0000\u0000JK\u0005r\u0000\u0000KL\u0005u\u0000\u0000"+
		"LM\u0005e\u0000\u0000M\f\u0001\u0000\u0000\u0000NO\u0005f\u0000\u0000"+
		"OP\u0005a\u0000\u0000PQ\u0005l\u0000\u0000QR\u0005s\u0000\u0000RS\u0005"+
		"e\u0000\u0000S\u000e\u0001\u0000\u0000\u0000TU\u0005q\u0000\u0000UV\u0005"+
		"u\u0000\u0000VW\u0005o\u0000\u0000WX\u0005t\u0000\u0000XY\u0005e\u0000"+
		"\u0000Y\u0010\u0001\u0000\u0000\u0000Z[\u0005\'\u0000\u0000[\u0012\u0001"+
		"\u0000\u0000\u0000\\]\u0005d\u0000\u0000]^\u0005o\u0000\u0000^\u0014\u0001"+
		"\u0000\u0000\u0000_`\u0005s\u0000\u0000`a\u0005e\u0000\u0000ab\u0005t"+
		"\u0000\u0000bc\u0005q\u0000\u0000c\u0016\u0001\u0000\u0000\u0000de\u0005"+
		"f\u0000\u0000ef\u0005u\u0000\u0000fg\u0005n\u0000\u0000gh\u0005c\u0000"+
		"\u0000h\u0018\u0001\u0000\u0000\u0000ij\u0005l\u0000\u0000jk\u0005a\u0000"+
		"\u0000kl\u0005m\u0000\u0000lm\u0005b\u0000\u0000mn\u0005d\u0000\u0000"+
		"no\u0005a\u0000\u0000o\u001a\u0001\u0000\u0000\u0000pq\u0005p\u0000\u0000"+
		"qr\u0005r\u0000\u0000rs\u0005o\u0000\u0000st\u0005g\u0000\u0000t\u001c"+
		"\u0001\u0000\u0000\u0000uv\u0005c\u0000\u0000vw\u0005o\u0000\u0000wx\u0005"+
		"n\u0000\u0000xy\u0005d\u0000\u0000y\u001e\u0001\u0000\u0000\u0000z{\u0005"+
		"w\u0000\u0000{|\u0005h\u0000\u0000|}\u0005i\u0000\u0000}~\u0005l\u0000"+
		"\u0000~\u007f\u0005e\u0000\u0000\u007f \u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005r\u0000\u0000\u0081\u0082\u0005e\u0000\u0000\u0082\u0083\u0005"+
		"t\u0000\u0000\u0083\u0084\u0005u\u0000\u0000\u0084\u0085\u0005r\u0000"+
		"\u0000\u0085\u0086\u0005n\u0000\u0000\u0086\"\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005b\u0000\u0000\u0088\u0089\u0005r\u0000\u0000\u0089\u008a"+
		"\u0005e\u0000\u0000\u008a\u008b\u0005a\u0000\u0000\u008b\u008c\u0005k"+
		"\u0000\u0000\u008c$\u0001\u0000\u0000\u0000\u008d\u008e\u0003+\u0015\u0000"+
		"\u008e&\u0001\u0000\u0000\u0000\u008f\u0090\u0007\u0000\u0000\u0000\u0090"+
		"(\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0001\u0000\u0000\u0092*\u0001"+
		"\u0000\u0000\u0000\u0093\u0097\u0007\u0002\u0000\u0000\u0094\u0096\u0007"+
		"\u0003\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098,\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u009c\u0007\u0004\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0006\u0016\u0000\u0000\u00a0.\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a5\u0005;\u0000\u0000\u00a2\u00a4\b\u0005\u0000\u0000"+
		"\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0006\u0017\u0000\u0000\u00a90\u0001\u0000\u0000\u0000\u0007"+
		"\u00006;B\u0097\u009d\u00a5\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}