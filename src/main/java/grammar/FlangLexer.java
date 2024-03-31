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
		SETQ=10, FUNC=11, LAMBDA=12, PROG=13, COND=14, WHILE=15, RETURN=16, BREAK=17, 
		ATOM=18, DIGIT_WITHOUT_ZERO=19, DIGIT=20, ID=21, WS=22, COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OP", "CP", "INTEGER", "REAL", "NULL", "TRUE", "FALSE", "QUOTE", "QUOTE_SHORT", 
			"SETQ", "FUNC", "LAMBDA", "PROG", "COND", "WHILE", "RETURN", "BREAK", 
			"ATOM", "DIGIT_WITHOUT_ZERO", "DIGIT", "ID", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, "'null'", "'true'", "'false'", "'quote'", 
			"'''", "'setq'", "'func'", "'lambda'", "'prog'", "'cond'", "'while'", 
			"'return'", "'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP", "CP", "INTEGER", "REAL", "NULL", "TRUE", "FALSE", "QUOTE", 
			"QUOTE_SHORT", "SETQ", "FUNC", "LAMBDA", "PROG", "COND", "WHILE", "RETURN", 
			"BREAK", "ATOM", "DIGIT_WITHOUT_ZERO", "DIGIT", "ID", "WS", "COMMENT"
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
		"\u0004\u0000\u0017\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002"+
		"\u0004\u00028\b\u0002\u000b\u0002\f\u00029\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003?\b\u0003\u000b\u0003\f\u0003@\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u0091\b\u0014\n\u0014\f\u0014"+
		"\u0094\t\u0014\u0001\u0015\u0004\u0015\u0097\b\u0015\u000b\u0015\f\u0015"+
		"\u0098\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u009f"+
		"\b\u0016\n\u0016\f\u0016\u00a2\t\u0016\u0001\u0016\u0001\u0016\u0000\u0000"+
		"\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"\u0001\u0000\u0006\u0001\u000019\u0001\u000009\u0003\u0000AZ__az\u0005"+
		"\u0000--09AZ__az\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\r\u00aa\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/"+
		"\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00054\u0001\u0000"+
		"\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\tB\u0001\u0000\u0000\u0000"+
		"\u000bG\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fR\u0001"+
		"\u0000\u0000\u0000\u0011X\u0001\u0000\u0000\u0000\u0013Z\u0001\u0000\u0000"+
		"\u0000\u0015_\u0001\u0000\u0000\u0000\u0017d\u0001\u0000\u0000\u0000\u0019"+
		"k\u0001\u0000\u0000\u0000\u001bp\u0001\u0000\u0000\u0000\u001du\u0001"+
		"\u0000\u0000\u0000\u001f{\u0001\u0000\u0000\u0000!\u0082\u0001\u0000\u0000"+
		"\u0000#\u0088\u0001\u0000\u0000\u0000%\u008a\u0001\u0000\u0000\u0000\'"+
		"\u008c\u0001\u0000\u0000\u0000)\u008e\u0001\u0000\u0000\u0000+\u0096\u0001"+
		"\u0000\u0000\u0000-\u009c\u0001\u0000\u0000\u0000/0\u0005(\u0000\u0000"+
		"0\u0002\u0001\u0000\u0000\u000012\u0005)\u0000\u00002\u0004\u0001\u0000"+
		"\u0000\u000035\u0005-\u0000\u000043\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000057\u0001\u0000\u0000\u000068\u0003\'\u0013\u000076\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0003\u0005\u0002"+
		"\u0000<>\u0005.\u0000\u0000=?\u0003\'\u0013\u0000>=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000A\b\u0001\u0000\u0000\u0000BC\u0005n\u0000\u0000CD\u0005u"+
		"\u0000\u0000DE\u0005l\u0000\u0000EF\u0005l\u0000\u0000F\n\u0001\u0000"+
		"\u0000\u0000GH\u0005t\u0000\u0000HI\u0005r\u0000\u0000IJ\u0005u\u0000"+
		"\u0000JK\u0005e\u0000\u0000K\f\u0001\u0000\u0000\u0000LM\u0005f\u0000"+
		"\u0000MN\u0005a\u0000\u0000NO\u0005l\u0000\u0000OP\u0005s\u0000\u0000"+
		"PQ\u0005e\u0000\u0000Q\u000e\u0001\u0000\u0000\u0000RS\u0005q\u0000\u0000"+
		"ST\u0005u\u0000\u0000TU\u0005o\u0000\u0000UV\u0005t\u0000\u0000VW\u0005"+
		"e\u0000\u0000W\u0010\u0001\u0000\u0000\u0000XY\u0005\'\u0000\u0000Y\u0012"+
		"\u0001\u0000\u0000\u0000Z[\u0005s\u0000\u0000[\\\u0005e\u0000\u0000\\"+
		"]\u0005t\u0000\u0000]^\u0005q\u0000\u0000^\u0014\u0001\u0000\u0000\u0000"+
		"_`\u0005f\u0000\u0000`a\u0005u\u0000\u0000ab\u0005n\u0000\u0000bc\u0005"+
		"c\u0000\u0000c\u0016\u0001\u0000\u0000\u0000de\u0005l\u0000\u0000ef\u0005"+
		"a\u0000\u0000fg\u0005m\u0000\u0000gh\u0005b\u0000\u0000hi\u0005d\u0000"+
		"\u0000ij\u0005a\u0000\u0000j\u0018\u0001\u0000\u0000\u0000kl\u0005p\u0000"+
		"\u0000lm\u0005r\u0000\u0000mn\u0005o\u0000\u0000no\u0005g\u0000\u0000"+
		"o\u001a\u0001\u0000\u0000\u0000pq\u0005c\u0000\u0000qr\u0005o\u0000\u0000"+
		"rs\u0005n\u0000\u0000st\u0005d\u0000\u0000t\u001c\u0001\u0000\u0000\u0000"+
		"uv\u0005w\u0000\u0000vw\u0005h\u0000\u0000wx\u0005i\u0000\u0000xy\u0005"+
		"l\u0000\u0000yz\u0005e\u0000\u0000z\u001e\u0001\u0000\u0000\u0000{|\u0005"+
		"r\u0000\u0000|}\u0005e\u0000\u0000}~\u0005t\u0000\u0000~\u007f\u0005u"+
		"\u0000\u0000\u007f\u0080\u0005r\u0000\u0000\u0080\u0081\u0005n\u0000\u0000"+
		"\u0081 \u0001\u0000\u0000\u0000\u0082\u0083\u0005b\u0000\u0000\u0083\u0084"+
		"\u0005r\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086\u0005a"+
		"\u0000\u0000\u0086\u0087\u0005k\u0000\u0000\u0087\"\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0003)\u0014\u0000\u0089$\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0007\u0000\u0000\u0000\u008b&\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0007\u0001\u0000\u0000\u008d(\u0001\u0000\u0000\u0000\u008e\u0092\u0007"+
		"\u0002\u0000\u0000\u008f\u0091\u0007\u0003\u0000\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093*\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0097\u0007\u0004"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0006\u0015"+
		"\u0000\u0000\u009b,\u0001\u0000\u0000\u0000\u009c\u00a0\u0005;\u0000\u0000"+
		"\u009d\u009f\b\u0005\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\u0016\u0000\u0000\u00a4"+
		".\u0001\u0000\u0000\u0000\u0007\u000049@\u0092\u0098\u00a0\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}