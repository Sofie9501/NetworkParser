package compiler.Frontend;

// Generated from C:\Users\s140330\Downloads\NetworkParser.g4 by ANTLR 4.1
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NetworkParserLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__28=1, T__27=2, T__26=3, T__25=4, T__24=5, T__23=6, T__22=7, T__21=8, 
		T__20=9, T__19=10, T__18=11, T__17=12, T__16=13, T__15=14, T__14=15, T__13=16, 
		T__12=17, T__11=18, T__10=19, T__9=20, T__8=21, T__7=22, T__6=23, T__5=24, 
		T__4=25, T__3=26, T__2=27, T__1=28, T__0=29, NUMBER=30, MAC=31, BYTE=32, 
		WORD=33, HEX=34, HEXNUMBER=35, IPV4ADR=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'ttl'", "'length'", "'PROTO'", "'id'", "'MF'", "'mf'", "'ICMP'", "'offset'", 
		"'tos'", "'IPv4'", "'none'", "'flags'", "'('", "','", "'TCP'", "'.'", 
		"'NONE'", "':'", "'['", "']'", "'>'", "'df'", "'IGMP'", "'DF'", "'proto'", 
		"'ethertype'", "')'", "'-'", "'UDP'", "NUMBER", "MAC", "BYTE", "WORD", 
		"HEX", "HEXNUMBER", "IPV4ADR"
	};
	public static final String[] ruleNames = {
		"T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", 
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "DIGIT", "NUMBER", "MAC", "BYTE", "WORD", 
		"HEX", "HEXNUMBER", "IPV4ADR"
	};


	public NetworkParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NetworkParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2&\u00f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3 \6 \u00c5\n \r \16 \u00c6\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\6%\u00e3\n%\r"+
		"%\16%\u00e4\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\2\'\3\3\1\5\4\1\7\5\1\t\6\1"+
		"\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20"+
		"\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63"+
		"\33\1\65\34\1\67\35\19\36\1;\37\1=\2\1? \1A!\1C\"\1E#\1G$\1I%\1K&\1\3"+
		"\2\4\3\2\62;\5\2\62;CHch\u00f0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5Q\3\2\2\2\7X\3"+
		"\2\2\2\t^\3\2\2\2\13a\3\2\2\2\rd\3\2\2\2\17g\3\2\2\2\21l\3\2\2\2\23s\3"+
		"\2\2\2\25w\3\2\2\2\27|\3\2\2\2\31\u0081\3\2\2\2\33\u0087\3\2\2\2\35\u0089"+
		"\3\2\2\2\37\u008b\3\2\2\2!\u008f\3\2\2\2#\u0091\3\2\2\2%\u0096\3\2\2\2"+
		"\'\u0098\3\2\2\2)\u009a\3\2\2\2+\u009c\3\2\2\2-\u009e\3\2\2\2/\u00a1\3"+
		"\2\2\2\61\u00a6\3\2\2\2\63\u00a9\3\2\2\2\65\u00af\3\2\2\2\67\u00b9\3\2"+
		"\2\29\u00bb\3\2\2\2;\u00bd\3\2\2\2=\u00c1\3\2\2\2?\u00c4\3\2\2\2A\u00c8"+
		"\3\2\2\2C\u00d4\3\2\2\2E\u00d7\3\2\2\2G\u00dc\3\2\2\2I\u00de\3\2\2\2K"+
		"\u00e6\3\2\2\2MN\7v\2\2NO\7v\2\2OP\7n\2\2P\4\3\2\2\2QR\7n\2\2RS\7g\2\2"+
		"ST\7p\2\2TU\7i\2\2UV\7v\2\2VW\7j\2\2W\6\3\2\2\2XY\7R\2\2YZ\7T\2\2Z[\7"+
		"Q\2\2[\\\7V\2\2\\]\7Q\2\2]\b\3\2\2\2^_\7k\2\2_`\7f\2\2`\n\3\2\2\2ab\7"+
		"O\2\2bc\7H\2\2c\f\3\2\2\2de\7o\2\2ef\7h\2\2f\16\3\2\2\2gh\7K\2\2hi\7E"+
		"\2\2ij\7O\2\2jk\7R\2\2k\20\3\2\2\2lm\7q\2\2mn\7h\2\2no\7h\2\2op\7u\2\2"+
		"pq\7g\2\2qr\7v\2\2r\22\3\2\2\2st\7v\2\2tu\7q\2\2uv\7u\2\2v\24\3\2\2\2"+
		"wx\7K\2\2xy\7R\2\2yz\7x\2\2z{\7\66\2\2{\26\3\2\2\2|}\7p\2\2}~\7q\2\2~"+
		"\177\7p\2\2\177\u0080\7g\2\2\u0080\30\3\2\2\2\u0081\u0082\7h\2\2\u0082"+
		"\u0083\7n\2\2\u0083\u0084\7c\2\2\u0084\u0085\7i\2\2\u0085\u0086\7u\2\2"+
		"\u0086\32\3\2\2\2\u0087\u0088\7*\2\2\u0088\34\3\2\2\2\u0089\u008a\7.\2"+
		"\2\u008a\36\3\2\2\2\u008b\u008c\7V\2\2\u008c\u008d\7E\2\2\u008d\u008e"+
		"\7R\2\2\u008e \3\2\2\2\u008f\u0090\7\60\2\2\u0090\"\3\2\2\2\u0091\u0092"+
		"\7P\2\2\u0092\u0093\7Q\2\2\u0093\u0094\7P\2\2\u0094\u0095\7G\2\2\u0095"+
		"$\3\2\2\2\u0096\u0097\7<\2\2\u0097&\3\2\2\2\u0098\u0099\7]\2\2\u0099("+
		"\3\2\2\2\u009a\u009b\7_\2\2\u009b*\3\2\2\2\u009c\u009d\7@\2\2\u009d,\3"+
		"\2\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7h\2\2\u00a0.\3\2\2\2\u00a1\u00a2"+
		"\7K\2\2\u00a2\u00a3\7I\2\2\u00a3\u00a4\7O\2\2\u00a4\u00a5\7R\2\2\u00a5"+
		"\60\3\2\2\2\u00a6\u00a7\7F\2\2\u00a7\u00a8\7H\2\2\u00a8\62\3\2\2\2\u00a9"+
		"\u00aa\7r\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7v\2\2"+
		"\u00ad\u00ae\7q\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7"+
		"v\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\u00b6\7{\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\66\3\2\2\2\u00b9\u00ba\7+\2\2\u00ba8\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc"+
		":\3\2\2\2\u00bd\u00be\7W\2\2\u00be\u00bf\7F\2\2\u00bf\u00c0\7R\2\2\u00c0"+
		"<\3\2\2\2\u00c1\u00c2\t\2\2\2\u00c2>\3\2\2\2\u00c3\u00c5\5=\37\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7@\3\2\2\2\u00c8\u00c9\5C\"\2\u00c9\u00ca\7<\2\2\u00ca\u00cb"+
		"\5C\"\2\u00cb\u00cc\7<\2\2\u00cc\u00cd\5C\"\2\u00cd\u00ce\7<\2\2\u00ce"+
		"\u00cf\5C\"\2\u00cf\u00d0\7<\2\2\u00d0\u00d1\5C\"\2\u00d1\u00d2\7<\2\2"+
		"\u00d2\u00d3\5C\"\2\u00d3B\3\2\2\2\u00d4\u00d5\5G$\2\u00d5\u00d6\5G$\2"+
		"\u00d6D\3\2\2\2\u00d7\u00d8\5G$\2\u00d8\u00d9\5G$\2\u00d9\u00da\5G$\2"+
		"\u00da\u00db\5G$\2\u00dbF\3\2\2\2\u00dc\u00dd\t\3\2\2\u00ddH\3\2\2\2\u00de"+
		"\u00df\7\62\2\2\u00df\u00e0\7z\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3\5G"+
		"$\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5J\3\2\2\2\u00e6\u00e7\5? \2\u00e7\u00e8\7\60\2\2\u00e8"+
		"\u00e9\5? \2\u00e9\u00ea\7\60\2\2\u00ea\u00eb\5? \2\u00eb\u00ec\7\60\2"+
		"\2\u00ec\u00ed\5? \2\u00ed\u00ee\7\60\2\2\u00ee\u00ef\5? \2\u00efL\3\2"+
		"\2\2\5\2\u00c6\u00e4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}