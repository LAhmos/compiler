// Generated from Micro.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, INTLITERAL=16, 
		FLOATLITERAL=17, STRINGLITERAL=18, COMMENT=19, OR=20, AND=21, NOT=22, 
		TRUE=23, FALSE=24, FUNCTION=25, READ=26, WRITE=27, IF=28, ELIF=29, ELSE=30, 
		ENDIF=31, FOR=32, ENDFOR=33, CONTINUE=34, BREAK=35, RETURN=36, INT=37, 
		VOID=38, STRING=39, FLOAT=40, PROGRAM=41, BEGIN=42, END=43, Ws=44, IDENTIFIER=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "COMMENT", "OR", "AND", "NOT", "TRUE", "FALSE", "FUNCTION", 
		"READ", "WRITE", "IF", "ELIF", "ELSE", "ENDIF", "FOR", "ENDFOR", "CONTINUE", 
		"BREAK", "RETURN", "INT", "VOID", "STRING", "FLOAT", "PROGRAM", "BEGIN", 
		"END", "Ws", "IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':='", "';'", "','", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
		"'<'", "'>'", "'='", "'!='", "'<='", "'>='", null, null, null, null, "'OR'", 
		"'AND'", "'NOT'", "'TRUE'", "'FALSE'", "'FUNCTION'", "'READ'", "'WRITE'", 
		"'IF'", "'ELIF'", "'ELSE'", "'ENDIF'", "'FOR'", "'ENDFOR'", "'CONTINUE'", 
		"'BREAK'", "'RETURN'", "'INT'", "'VOID'", "'STRING'", "'FLOAT'", "'PROGRAM'", 
		"'BEGIN'", "'END'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
		"COMMENT", "OR", "AND", "NOT", "TRUE", "FALSE", "FUNCTION", "READ", "WRITE", 
		"IF", "ELIF", "ELSE", "ENDIF", "FOR", "ENDFOR", "CONTINUE", "BREAK", "RETURN", 
		"INT", "VOID", "STRING", "FLOAT", "PROGRAM", "BEGIN", "END", "Ws", "IDENTIFIER"
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


	public MicroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u0141\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\6\21\u0081\n\21\r\21\16\21\u0082\3\22\6\22"+
		"\u0086\n\22\r\22\16\22\u0087\3\22\3\22\6\22\u008c\n\22\r\22\16\22\u008d"+
		"\3\22\3\22\6\22\u0092\n\22\r\22\16\22\u0093\5\22\u0096\n\22\3\23\3\23"+
		"\7\23\u009a\n\23\f\23\16\23\u009d\13\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\7\24\u00a5\n\24\f\24\16\24\u00a8\13\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3-\6-\u0135\n-\r-\16-\u0136\3-\3-\3.\3.\7.\u013d"+
		"\n.\f.\16.\u0140\13.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\b\3\2"+
		"\62;\3\2$$\3\2\f\f\7\2\13\f\17\17\"\"))~~\4\2C\\c|\5\2\63;C\\c|\u0149"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5`\3\2\2\2\7b\3"+
		"\2\2\2\td\3\2\2\2\13f\3\2\2\2\rh\3\2\2\2\17j\3\2\2\2\21l\3\2\2\2\23n\3"+
		"\2\2\2\25p\3\2\2\2\27r\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35y\3\2\2\2\37"+
		"|\3\2\2\2!\u0080\3\2\2\2#\u0095\3\2\2\2%\u0097\3\2\2\2\'\u00a0\3\2\2\2"+
		")\u00ad\3\2\2\2+\u00b0\3\2\2\2-\u00b4\3\2\2\2/\u00b8\3\2\2\2\61\u00bd"+
		"\3\2\2\2\63\u00c3\3\2\2\2\65\u00cc\3\2\2\2\67\u00d1\3\2\2\29\u00d7\3\2"+
		"\2\2;\u00da\3\2\2\2=\u00df\3\2\2\2?\u00e4\3\2\2\2A\u00ea\3\2\2\2C\u00ee"+
		"\3\2\2\2E\u00f5\3\2\2\2G\u00fe\3\2\2\2I\u0104\3\2\2\2K\u010b\3\2\2\2M"+
		"\u010f\3\2\2\2O\u0114\3\2\2\2Q\u011b\3\2\2\2S\u0121\3\2\2\2U\u0129\3\2"+
		"\2\2W\u012f\3\2\2\2Y\u0134\3\2\2\2[\u013a\3\2\2\2]^\7<\2\2^_\7?\2\2_\4"+
		"\3\2\2\2`a\7=\2\2a\6\3\2\2\2bc\7.\2\2c\b\3\2\2\2de\7*\2\2e\n\3\2\2\2f"+
		"g\7+\2\2g\f\3\2\2\2hi\7-\2\2i\16\3\2\2\2jk\7/\2\2k\20\3\2\2\2lm\7,\2\2"+
		"m\22\3\2\2\2no\7\61\2\2o\24\3\2\2\2pq\7>\2\2q\26\3\2\2\2rs\7@\2\2s\30"+
		"\3\2\2\2tu\7?\2\2u\32\3\2\2\2vw\7#\2\2wx\7?\2\2x\34\3\2\2\2yz\7>\2\2z"+
		"{\7?\2\2{\36\3\2\2\2|}\7@\2\2}~\7?\2\2~ \3\2\2\2\177\u0081\t\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\"\3\2\2\2\u0084\u0086\t\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\7\60\2\2\u008a\u008c\t\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0096\3\2\2\2\u008f"+
		"\u0091\7\60\2\2\u0090\u0092\t\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0085\3\2\2\2\u0095\u008f\3\2\2\2\u0096$\3\2\2\2\u0097\u009b\7$\2\2\u0098"+
		"\u009a\n\3\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\7$\2\2\u009f&\3\2\2\2\u00a0\u00a1\7/\2\2\u00a1\u00a2\7/\2\2\u00a2"+
		"\u00a6\3\2\2\2\u00a3\u00a5\n\4\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\24"+
		"\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7Q\2\2\u00ae\u00af\7T\2\2\u00af*\3\2\2"+
		"\2\u00b0\u00b1\7C\2\2\u00b1\u00b2\7P\2\2\u00b2\u00b3\7F\2\2\u00b3,\3\2"+
		"\2\2\u00b4\u00b5\7P\2\2\u00b5\u00b6\7Q\2\2\u00b6\u00b7\7V\2\2\u00b7.\3"+
		"\2\2\2\u00b8\u00b9\7V\2\2\u00b9\u00ba\7T\2\2\u00ba\u00bb\7W\2\2\u00bb"+
		"\u00bc\7G\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7H\2\2\u00be\u00bf\7C\2\2\u00bf"+
		"\u00c0\7N\2\2\u00c0\u00c1\7U\2\2\u00c1\u00c2\7G\2\2\u00c2\62\3\2\2\2\u00c3"+
		"\u00c4\7H\2\2\u00c4\u00c5\7W\2\2\u00c5\u00c6\7P\2\2\u00c6\u00c7\7E\2\2"+
		"\u00c7\u00c8\7V\2\2\u00c8\u00c9\7K\2\2\u00c9\u00ca\7Q\2\2\u00ca\u00cb"+
		"\7P\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7T\2\2\u00cd\u00ce\7G\2\2\u00ce\u00cf"+
		"\7C\2\2\u00cf\u00d0\7F\2\2\u00d0\66\3\2\2\2\u00d1\u00d2\7Y\2\2\u00d2\u00d3"+
		"\7T\2\2\u00d3\u00d4\7K\2\2\u00d4\u00d5\7V\2\2\u00d5\u00d6\7G\2\2\u00d6"+
		"8\3\2\2\2\u00d7\u00d8\7K\2\2\u00d8\u00d9\7H\2\2\u00d9:\3\2\2\2\u00da\u00db"+
		"\7G\2\2\u00db\u00dc\7N\2\2\u00dc\u00dd\7K\2\2\u00dd\u00de\7H\2\2\u00de"+
		"<\3\2\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1\7N\2\2\u00e1\u00e2\7U\2\2\u00e2"+
		"\u00e3\7G\2\2\u00e3>\3\2\2\2\u00e4\u00e5\7G\2\2\u00e5\u00e6\7P\2\2\u00e6"+
		"\u00e7\7F\2\2\u00e7\u00e8\7K\2\2\u00e8\u00e9\7H\2\2\u00e9@\3\2\2\2\u00ea"+
		"\u00eb\7H\2\2\u00eb\u00ec\7Q\2\2\u00ec\u00ed\7T\2\2\u00edB\3\2\2\2\u00ee"+
		"\u00ef\7G\2\2\u00ef\u00f0\7P\2\2\u00f0\u00f1\7F\2\2\u00f1\u00f2\7H\2\2"+
		"\u00f2\u00f3\7Q\2\2\u00f3\u00f4\7T\2\2\u00f4D\3\2\2\2\u00f5\u00f6\7E\2"+
		"\2\u00f6\u00f7\7Q\2\2\u00f7\u00f8\7P\2\2\u00f8\u00f9\7V\2\2\u00f9\u00fa"+
		"\7K\2\2\u00fa\u00fb\7P\2\2\u00fb\u00fc\7W\2\2\u00fc\u00fd\7G\2\2\u00fd"+
		"F\3\2\2\2\u00fe\u00ff\7D\2\2\u00ff\u0100\7T\2\2\u0100\u0101\7G\2\2\u0101"+
		"\u0102\7C\2\2\u0102\u0103\7M\2\2\u0103H\3\2\2\2\u0104\u0105\7T\2\2\u0105"+
		"\u0106\7G\2\2\u0106\u0107\7V\2\2\u0107\u0108\7W\2\2\u0108\u0109\7T\2\2"+
		"\u0109\u010a\7P\2\2\u010aJ\3\2\2\2\u010b\u010c\7K\2\2\u010c\u010d\7P\2"+
		"\2\u010d\u010e\7V\2\2\u010eL\3\2\2\2\u010f\u0110\7X\2\2\u0110\u0111\7"+
		"Q\2\2\u0111\u0112\7K\2\2\u0112\u0113\7F\2\2\u0113N\3\2\2\2\u0114\u0115"+
		"\7U\2\2\u0115\u0116\7V\2\2\u0116\u0117\7T\2\2\u0117\u0118\7K\2\2\u0118"+
		"\u0119\7P\2\2\u0119\u011a\7I\2\2\u011aP\3\2\2\2\u011b\u011c\7H\2\2\u011c"+
		"\u011d\7N\2\2\u011d\u011e\7Q\2\2\u011e\u011f\7C\2\2\u011f\u0120\7V\2\2"+
		"\u0120R\3\2\2\2\u0121\u0122\7R\2\2\u0122\u0123\7T\2\2\u0123\u0124\7Q\2"+
		"\2\u0124\u0125\7I\2\2\u0125\u0126\7T\2\2\u0126\u0127\7C\2\2\u0127\u0128"+
		"\7O\2\2\u0128T\3\2\2\2\u0129\u012a\7D\2\2\u012a\u012b\7G\2\2\u012b\u012c"+
		"\7I\2\2\u012c\u012d\7K\2\2\u012d\u012e\7P\2\2\u012eV\3\2\2\2\u012f\u0130"+
		"\7G\2\2\u0130\u0131\7P\2\2\u0131\u0132\7F\2\2\u0132X\3\2\2\2\u0133\u0135"+
		"\t\5\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b-\2\2\u0139Z\3\2\2\2\u013a"+
		"\u013e\t\6\2\2\u013b\u013d\t\7\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\\\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\f\2\u0082\u0087\u008d\u0093\u0095\u009b\u00a6\u0136\u013e\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}