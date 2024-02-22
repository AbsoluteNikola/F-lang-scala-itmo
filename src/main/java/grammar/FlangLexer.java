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
		IDENTIFIER=1, OP=2, CP=3, NUMBER=4, DIGIT=5, LETTER=6, LOWER=7, UPPER=8, 
		ID=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "OP", "CP", "NUMBER", "DIGIT", "LETTER", "LOWER", "UPPER", 
			"ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "OP", "CP", "NUMBER", "DIGIT", "LETTER", "LOWER", 
			"UPPER", "ID", "WS"
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
		"\u0004\u0000\nA\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003#\b\u0003"+
		"\u0001\u0003\u0004\u0003&\b\u0003\u000b\u0003\f\u0003\'\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0003\u0005.\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b6\b\b\n\b\f\b9\t"+
		"\b\u0001\t\u0004\t<\b\t\u000b\t\f\t=\u0001\t\u0001\t\u0000\u0000\n\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0001\u0000\u0003\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0003\u0000\t\n\f\r  G\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0001\u0015\u0001\u0000\u0000\u0000\u0003\u001d\u0001"+
		"\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u0007\"\u0001\u0000"+
		"\u0000\u0000\t)\u0001\u0000\u0000\u0000\u000b-\u0001\u0000\u0000\u0000"+
		"\r/\u0001\u0000\u0000\u0000\u000f1\u0001\u0000\u0000\u0000\u00113\u0001"+
		"\u0000\u0000\u0000\u0013;\u0001\u0000\u0000\u0000\u0015\u001a\u0003\u000b"+
		"\u0005\u0000\u0016\u0019\u0003\u000b\u0005\u0000\u0017\u0019\u0003\t\u0004"+
		"\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0002\u0001\u0000\u0000"+
		"\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u001e\u0005(\u0000\u0000"+
		"\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005)\u0000\u0000 \u0006"+
		"\u0001\u0000\u0000\u0000!#\u0005-\u0000\u0000\"!\u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$&\u0003\t\u0004"+
		"\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000(\b\u0001\u0000\u0000\u0000)*\u0002"+
		"09\u0000*\n\u0001\u0000\u0000\u0000+.\u0003\r\u0006\u0000,.\u0003\u000f"+
		"\u0007\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\f\u0001"+
		"\u0000\u0000\u0000/0\u0002az\u00000\u000e\u0001\u0000\u0000\u000012\u0002"+
		"AZ\u00002\u0010\u0001\u0000\u0000\u000037\u0007\u0000\u0000\u000046\u0007"+
		"\u0001\u0000\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0012\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u0000:<\u0007\u0002\u0000\u0000;:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0006\t\u0000\u0000"+
		"@\u0014\u0001\u0000\u0000\u0000\b\u0000\u0018\u001a\"\'-7=\u0001\u0006"+
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