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
		FUNC=10, LAMBDA=11, PROG=12, COND=13, WHILE=14, RETURN=15, BREAK=16, ID=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OP", "CP", "DIGIT", "INTEGER", "REAL", "NULL", "TRUE", "FALSE", "SETQ", 
			"FUNC", "LAMBDA", "PROG", "COND", "WHILE", "RETURN", "BREAK", "ID", "WS"
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
			"ID", "WS"
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
		"\u0004\u0000\u0012\u008d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0003\u0003-\b\u0003\u0001\u0003\u0004\u00030\b\u0003\u000b"+
		"\u0003\f\u00031\u0001\u0004\u0003\u00045\b\u0004\u0001\u0004\u0004\u0004"+
		"8\b\u0004\u000b\u0004\f\u00049\u0001\u0004\u0001\u0004\u0004\u0004>\b"+
		"\u0004\u000b\u0004\f\u0004?\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u0082\b\u0010"+
		"\n\u0010\f\u0010\u0085\t\u0010\u0001\u0011\u0004\u0011\u0088\b\u0011\u000b"+
		"\u0011\f\u0011\u0089\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012\u0001\u0000\u0003\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0003\u0000\t\n\f\r  \u0093\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000"+
		"\u0000\u0005)\u0001\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000\t"+
		"4\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rF\u0001\u0000"+
		"\u0000\u0000\u000fK\u0001\u0000\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000"+
		"\u0013V\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017b"+
		"\u0001\u0000\u0000\u0000\u0019g\u0001\u0000\u0000\u0000\u001bl\u0001\u0000"+
		"\u0000\u0000\u001dr\u0001\u0000\u0000\u0000\u001fy\u0001\u0000\u0000\u0000"+
		"!\u007f\u0001\u0000\u0000\u0000#\u0087\u0001\u0000\u0000\u0000%&\u0005"+
		"(\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005)\u0000\u0000(\u0004"+
		"\u0001\u0000\u0000\u0000)*\u000209\u0000*\u0006\u0001\u0000\u0000\u0000"+
		"+-\u0005-\u0000\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-/\u0001\u0000\u0000\u0000.0\u0003\u0005\u0002\u0000/.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u00002\b\u0001\u0000\u0000\u000035\u0005-\u0000\u000043\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000068\u0003"+
		"\u0005\u0002\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;=\u0005.\u0000\u0000<>\u0003\u0005\u0002\u0000=<\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005n\u0000\u0000BC\u0005u"+
		"\u0000\u0000CD\u0005l\u0000\u0000DE\u0005l\u0000\u0000E\f\u0001\u0000"+
		"\u0000\u0000FG\u0005t\u0000\u0000GH\u0005r\u0000\u0000HI\u0005u\u0000"+
		"\u0000IJ\u0005e\u0000\u0000J\u000e\u0001\u0000\u0000\u0000KL\u0005f\u0000"+
		"\u0000LM\u0005a\u0000\u0000MN\u0005l\u0000\u0000NO\u0005s\u0000\u0000"+
		"OP\u0005e\u0000\u0000P\u0010\u0001\u0000\u0000\u0000QR\u0005s\u0000\u0000"+
		"RS\u0005e\u0000\u0000ST\u0005t\u0000\u0000TU\u0005q\u0000\u0000U\u0012"+
		"\u0001\u0000\u0000\u0000VW\u0005f\u0000\u0000WX\u0005u\u0000\u0000XY\u0005"+
		"n\u0000\u0000YZ\u0005c\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000[\\\u0005"+
		"l\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005m\u0000\u0000^_\u0005b\u0000"+
		"\u0000_`\u0005d\u0000\u0000`a\u0005a\u0000\u0000a\u0016\u0001\u0000\u0000"+
		"\u0000bc\u0005p\u0000\u0000cd\u0005r\u0000\u0000de\u0005o\u0000\u0000"+
		"ef\u0005g\u0000\u0000f\u0018\u0001\u0000\u0000\u0000gh\u0005c\u0000\u0000"+
		"hi\u0005o\u0000\u0000ij\u0005n\u0000\u0000jk\u0005d\u0000\u0000k\u001a"+
		"\u0001\u0000\u0000\u0000lm\u0005w\u0000\u0000mn\u0005h\u0000\u0000no\u0005"+
		"i\u0000\u0000op\u0005l\u0000\u0000pq\u0005e\u0000\u0000q\u001c\u0001\u0000"+
		"\u0000\u0000rs\u0005r\u0000\u0000st\u0005e\u0000\u0000tu\u0005t\u0000"+
		"\u0000uv\u0005u\u0000\u0000vw\u0005r\u0000\u0000wx\u0005n\u0000\u0000"+
		"x\u001e\u0001\u0000\u0000\u0000yz\u0005b\u0000\u0000z{\u0005r\u0000\u0000"+
		"{|\u0005e\u0000\u0000|}\u0005a\u0000\u0000}~\u0005k\u0000\u0000~ \u0001"+
		"\u0000\u0000\u0000\u007f\u0083\u0007\u0000\u0000\u0000\u0080\u0082\u0007"+
		"\u0001\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u0088\u0007\u0002\u0000\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0006\u0011\u0000\u0000\u008c$\u0001\u0000\u0000"+
		"\u0000\b\u0000,149?\u0083\u0089\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}