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
		OP=1, CP=2, DIGIT=3, INTEGER=4, REAL=5, NULL=6, TRUE=7, FALSE=8, SETQ=9, 
		FUNC=10, LAMBDA=11, PROG=12, COND=13, WHILE=14, RETURN=15, BREAK=16, LETTER=17, 
		LOWER=18, UPPER=19, ID=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OP", "CP", "DIGIT", "INTEGER", "REAL", "NULL", "TRUE", "FALSE", "SETQ", 
			"FUNC", "LAMBDA", "PROG", "COND", "WHILE", "RETURN", "BREAK", "LETTER", 
			"LOWER", "UPPER", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, "'null'", "'true'", "'false'", 
			"'setq'", "'func'", "'lambda'", "'prog'", "'cond'", "'while'", "'return'", 
			"'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP", "CP", "DIGIT", "INTEGER", "REAL", "NULL", "TRUE", "FALSE", 
			"SETQ", "FUNC", "LAMBDA", "PROG", "COND", "WHILE", "RETURN", "BREAK", 
			"LETTER", "LOWER", "UPPER", "ID", "WS"
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
		"\u0004\u0000\u0015\u009b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0003\u00033\b\u0003\u0001\u0003\u0004\u00036\b\u0003\u000b"+
		"\u0003\f\u00037\u0001\u0004\u0003\u0004;\b\u0004\u0001\u0004\u0004\u0004"+
		">\b\u0004\u000b\u0004\f\u0004?\u0001\u0004\u0001\u0004\u0004\u0004D\b"+
		"\u0004\u000b\u0004\f\u0004E\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0088\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0090\b\u0013\n\u0013\f\u0013\u0093\t\u0013\u0001\u0014\u0004"+
		"\u0014\u0096\b\u0014\u000b\u0014\f\u0014\u0097\u0001\u0014\u0001\u0014"+
		"\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"\u0001\u0000\u0003\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t"+
		"\n\f\r  \u00a2\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000"+
		"\u0000\u0005/\u0001\u0000\u0000\u0000\u00072\u0001\u0000\u0000\u0000\t"+
		":\u0001\u0000\u0000\u0000\u000bG\u0001\u0000\u0000\u0000\rL\u0001\u0000"+
		"\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000\u0011W\u0001\u0000\u0000\u0000"+
		"\u0013\\\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000\u0000\u0017"+
		"h\u0001\u0000\u0000\u0000\u0019m\u0001\u0000\u0000\u0000\u001br\u0001"+
		"\u0000\u0000\u0000\u001dx\u0001\u0000\u0000\u0000\u001f\u007f\u0001\u0000"+
		"\u0000\u0000!\u0087\u0001\u0000\u0000\u0000#\u0089\u0001\u0000\u0000\u0000"+
		"%\u008b\u0001\u0000\u0000\u0000\'\u008d\u0001\u0000\u0000\u0000)\u0095"+
		"\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\u0002\u0001\u0000\u0000"+
		"\u0000-.\u0005)\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/0\u000209\u0000"+
		"0\u0006\u0001\u0000\u0000\u000013\u0005-\u0000\u000021\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000046\u0003\u0005"+
		"\u0002\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008\b\u0001\u0000\u0000\u0000"+
		"9;\u0005-\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";=\u0001\u0000\u0000\u0000<>\u0003\u0005\u0002\u0000=<\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0005.\u0000\u0000BD\u0003\u0005"+
		"\u0002\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\n\u0001\u0000\u0000\u0000"+
		"GH\u0005n\u0000\u0000HI\u0005u\u0000\u0000IJ\u0005l\u0000\u0000JK\u0005"+
		"l\u0000\u0000K\f\u0001\u0000\u0000\u0000LM\u0005t\u0000\u0000MN\u0005"+
		"r\u0000\u0000NO\u0005u\u0000\u0000OP\u0005e\u0000\u0000P\u000e\u0001\u0000"+
		"\u0000\u0000QR\u0005f\u0000\u0000RS\u0005a\u0000\u0000ST\u0005l\u0000"+
		"\u0000TU\u0005s\u0000\u0000UV\u0005e\u0000\u0000V\u0010\u0001\u0000\u0000"+
		"\u0000WX\u0005s\u0000\u0000XY\u0005e\u0000\u0000YZ\u0005t\u0000\u0000"+
		"Z[\u0005q\u0000\u0000[\u0012\u0001\u0000\u0000\u0000\\]\u0005f\u0000\u0000"+
		"]^\u0005u\u0000\u0000^_\u0005n\u0000\u0000_`\u0005c\u0000\u0000`\u0014"+
		"\u0001\u0000\u0000\u0000ab\u0005l\u0000\u0000bc\u0005a\u0000\u0000cd\u0005"+
		"m\u0000\u0000de\u0005b\u0000\u0000ef\u0005d\u0000\u0000fg\u0005a\u0000"+
		"\u0000g\u0016\u0001\u0000\u0000\u0000hi\u0005p\u0000\u0000ij\u0005r\u0000"+
		"\u0000jk\u0005o\u0000\u0000kl\u0005g\u0000\u0000l\u0018\u0001\u0000\u0000"+
		"\u0000mn\u0005c\u0000\u0000no\u0005o\u0000\u0000op\u0005n\u0000\u0000"+
		"pq\u0005d\u0000\u0000q\u001a\u0001\u0000\u0000\u0000rs\u0005w\u0000\u0000"+
		"st\u0005h\u0000\u0000tu\u0005i\u0000\u0000uv\u0005l\u0000\u0000vw\u0005"+
		"e\u0000\u0000w\u001c\u0001\u0000\u0000\u0000xy\u0005r\u0000\u0000yz\u0005"+
		"e\u0000\u0000z{\u0005t\u0000\u0000{|\u0005u\u0000\u0000|}\u0005r\u0000"+
		"\u0000}~\u0005n\u0000\u0000~\u001e\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005b\u0000\u0000\u0080\u0081\u0005r\u0000\u0000\u0081\u0082\u0005e"+
		"\u0000\u0000\u0082\u0083\u0005a\u0000\u0000\u0083\u0084\u0005k\u0000\u0000"+
		"\u0084 \u0001\u0000\u0000\u0000\u0085\u0088\u0003#\u0011\u0000\u0086\u0088"+
		"\u0003%\u0012\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\"\u0001\u0000\u0000\u0000\u0089\u008a\u0002a"+
		"z\u0000\u008a$\u0001\u0000\u0000\u0000\u008b\u008c\u0002AZ\u0000\u008c"+
		"&\u0001\u0000\u0000\u0000\u008d\u0091\u0007\u0000\u0000\u0000\u008e\u0090"+
		"\u0007\u0001\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092(\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0096\u0007\u0002\u0000\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0006\u0014\u0000\u0000\u009a*\u0001\u0000"+
		"\u0000\u0000\t\u000027:?E\u0087\u0091\u0097\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}