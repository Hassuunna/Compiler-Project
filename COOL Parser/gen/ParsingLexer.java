// Generated from C:/Users/Aref/Desktop/COOL Parser/src\Parsing.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParsingLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, INHERITS=2, TYPE=3, SEMICOLON=4, OPENBRACE=5, CLOSEBRACE=6, COLON=7, 
		COMMA=8, OPENPARENTHESES=9, CLOSEPARENTHESES=10, DOT=11, AT=12, INTCOMP=13, 
		NEW=14, ADD=15, SUB=16, MUL=17, DIV=18, EQUAL=19, LT=20, LTEQ=21, ASSIGN=22, 
		NOT=23, TRUE=24, FALSE=25, STRING=26, IF=27, THEN=28, ELSE=29, FI=30, 
		WHILE=31, LOOP=32, POOL=33, CASE=34, OF=35, ESAC=36, LET=37, IN=38, CASEASSIGN=39, 
		ISVOID=40, ID=41, NUM=42, SINGLECOMMENT=43, MULTICOMMENT=44, WS=45, INVALID=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "H", "I", "L", "N", "O", "P", "R", "S", 
			"T", "V", "W", "CLASS", "INHERITS", "TYPE", "SEMICOLON", "OPENBRACE", 
			"CLOSEBRACE", "COLON", "COMMA", "OPENPARENTHESES", "CLOSEPARENTHESES", 
			"DOT", "AT", "INTCOMP", "NEW", "ADD", "SUB", "MUL", "DIV", "EQUAL", "LT", 
			"LTEQ", "ASSIGN", "NOT", "TRUE", "FALSE", "STRING", "IF", "THEN", "ELSE", 
			"FI", "WHILE", "LOOP", "POOL", "CASE", "OF", "ESAC", "LET", "IN", "CASEASSIGN", 
			"ISVOID", "ID", "NUM", "SINGLECOMMENT", "MULTICOMMENT", "WS", "INVALID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "';'", "'{'", "'}'", "':'", "','", "'('", "')'", 
			"'.'", "'@'", "'~'", null, "'+'", "'-'", "'*'", "'/'", "'='", "'<'", 
			"'<='", "'<-'", null, "'true'", "'false'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "INHERITS", "TYPE", "SEMICOLON", "OPENBRACE", "CLOSEBRACE", 
			"COLON", "COMMA", "OPENPARENTHESES", "CLOSEPARENTHESES", "DOT", "AT", 
			"INTCOMP", "NEW", "ADD", "SUB", "MUL", "DIV", "EQUAL", "LT", "LTEQ", 
			"ASSIGN", "NOT", "TRUE", "FALSE", "STRING", "IF", "THEN", "ELSE", "FI", 
			"WHILE", "LOOP", "POOL", "CASE", "OF", "ESAC", "LET", "IN", "CASEASSIGN", 
			"ISVOID", "ID", "NUM", "SINGLECOMMENT", "MULTICOMMENT", "WS", "INVALID"
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


	public ParsingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Parsing.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u016f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u00b5\n\25\f\25\16\25"+
		"\u00b8\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\5,\u00fa\n,\3,\7,\u00fd\n,"+
		"\f,\16,\u0100\13,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3:\3:\3:"+
		"\3:\3;\3;\7;\u0144\n;\f;\16;\u0147\13;\3<\6<\u014a\n<\r<\16<\u014b\3="+
		"\3=\3=\3=\7=\u0152\n=\f=\16=\u0155\13=\3=\3=\3>\3>\3>\3>\7>\u015d\n>\f"+
		">\16>\u0160\13>\3>\3>\3>\3>\3>\3?\6?\u0168\n?\r?\16?\u0169\3?\3?\3@\3"+
		"@\3\u015e\2A\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33"+
		"\2\35\2\37\2!\2#\2%\3\'\4)\5+\6-\7/\b\61\t\63\n\65\13\67\f9\r;\16=\17"+
		"?\20A\21C\22E\23G\24I\25K\26M\27O\30Q\31S\32U\33W\34Y\35[\36]\37_ a!c"+
		"\"e#g$i%k&m\'o(q)s*u+w,y-{.}/\177\60\3\2\33\4\2CCcc\4\2DDdd\4\2EEee\4"+
		"\2FFff\4\2GGgg\4\2HHhh\4\2JJjj\4\2KKkk\4\2NNnn\4\2PPpp\4\2QQqq\4\2RRr"+
		"r\4\2TTtt\4\2UUuu\4\2VVvv\4\2XXxx\4\2YYyy\3\2C\\\6\2\62;C\\aac|\4\2\13"+
		"\13^^\4\2\f\f\17\17\6\2\13\f\17\17$$^^\4\2aac|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u0168\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0083\3\2"+
		"\2\2\7\u0085\3\2\2\2\t\u0087\3\2\2\2\13\u0089\3\2\2\2\r\u008b\3\2\2\2"+
		"\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0091\3\2\2\2\25\u0093\3\2\2\2\27"+
		"\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3\2\2\2\37\u009d"+
		"\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a9\3\2\2\2"+
		")\u00b2\3\2\2\2+\u00b9\3\2\2\2-\u00bb\3\2\2\2/\u00bd\3\2\2\2\61\u00bf"+
		"\3\2\2\2\63\u00c1\3\2\2\2\65\u00c3\3\2\2\2\67\u00c5\3\2\2\29\u00c7\3\2"+
		"\2\2;\u00c9\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2\2\2A\u00d1\3\2\2\2C\u00d3"+
		"\3\2\2\2E\u00d5\3\2\2\2G\u00d7\3\2\2\2I\u00d9\3\2\2\2K\u00db\3\2\2\2M"+
		"\u00dd\3\2\2\2O\u00e0\3\2\2\2Q\u00e3\3\2\2\2S\u00e7\3\2\2\2U\u00ec\3\2"+
		"\2\2W\u00f2\3\2\2\2Y\u0103\3\2\2\2[\u0106\3\2\2\2]\u010b\3\2\2\2_\u0110"+
		"\3\2\2\2a\u0113\3\2\2\2c\u0119\3\2\2\2e\u011e\3\2\2\2g\u0123\3\2\2\2i"+
		"\u0128\3\2\2\2k\u012b\3\2\2\2m\u0130\3\2\2\2o\u0134\3\2\2\2q\u0137\3\2"+
		"\2\2s\u013a\3\2\2\2u\u0141\3\2\2\2w\u0149\3\2\2\2y\u014d\3\2\2\2{\u0158"+
		"\3\2\2\2}\u0167\3\2\2\2\177\u016d\3\2\2\2\u0081\u0082\t\2\2\2\u0082\4"+
		"\3\2\2\2\u0083\u0084\t\3\2\2\u0084\6\3\2\2\2\u0085\u0086\t\4\2\2\u0086"+
		"\b\3\2\2\2\u0087\u0088\t\5\2\2\u0088\n\3\2\2\2\u0089\u008a\t\6\2\2\u008a"+
		"\f\3\2\2\2\u008b\u008c\t\7\2\2\u008c\16\3\2\2\2\u008d\u008e\t\b\2\2\u008e"+
		"\20\3\2\2\2\u008f\u0090\t\t\2\2\u0090\22\3\2\2\2\u0091\u0092\t\n\2\2\u0092"+
		"\24\3\2\2\2\u0093\u0094\t\13\2\2\u0094\26\3\2\2\2\u0095\u0096\t\f\2\2"+
		"\u0096\30\3\2\2\2\u0097\u0098\t\r\2\2\u0098\32\3\2\2\2\u0099\u009a\t\16"+
		"\2\2\u009a\34\3\2\2\2\u009b\u009c\t\17\2\2\u009c\36\3\2\2\2\u009d\u009e"+
		"\t\20\2\2\u009e \3\2\2\2\u009f\u00a0\t\21\2\2\u00a0\"\3\2\2\2\u00a1\u00a2"+
		"\t\22\2\2\u00a2$\3\2\2\2\u00a3\u00a4\5\7\4\2\u00a4\u00a5\5\23\n\2\u00a5"+
		"\u00a6\5\3\2\2\u00a6\u00a7\5\35\17\2\u00a7\u00a8\5\35\17\2\u00a8&\3\2"+
		"\2\2\u00a9\u00aa\5\21\t\2\u00aa\u00ab\5\25\13\2\u00ab\u00ac\5\17\b\2\u00ac"+
		"\u00ad\5\13\6\2\u00ad\u00ae\5\33\16\2\u00ae\u00af\5\21\t\2\u00af\u00b0"+
		"\5\37\20\2\u00b0\u00b1\5\35\17\2\u00b1(\3\2\2\2\u00b2\u00b6\t\23\2\2\u00b3"+
		"\u00b5\t\24\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7*\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba"+
		"\7=\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7}\2\2\u00bc.\3\2\2\2\u00bd\u00be\7"+
		"\177\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7<\2\2\u00c0\62\3\2\2\2\u00c1\u00c2"+
		"\7.\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4\66\3\2\2\2\u00c5\u00c6"+
		"\7+\2\2\u00c68\3\2\2\2\u00c7\u00c8\7\60\2\2\u00c8:\3\2\2\2\u00c9\u00ca"+
		"\7B\2\2\u00ca<\3\2\2\2\u00cb\u00cc\7\u0080\2\2\u00cc>\3\2\2\2\u00cd\u00ce"+
		"\5\25\13\2\u00ce\u00cf\5\13\6\2\u00cf\u00d0\5#\22\2\u00d0@\3\2\2\2\u00d1"+
		"\u00d2\7-\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4D\3\2\2\2\u00d5\u00d6"+
		"\7,\2\2\u00d6F\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8H\3\2\2\2\u00d9\u00da"+
		"\7?\2\2\u00daJ\3\2\2\2\u00db\u00dc\7>\2\2\u00dcL\3\2\2\2\u00dd\u00de\7"+
		">\2\2\u00de\u00df\7?\2\2\u00dfN\3\2\2\2\u00e0\u00e1\7>\2\2\u00e1\u00e2"+
		"\7/\2\2\u00e2P\3\2\2\2\u00e3\u00e4\5\25\13\2\u00e4\u00e5\5\27\f\2\u00e5"+
		"\u00e6\5\37\20\2\u00e6R\3\2\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7t\2\2"+
		"\u00e9\u00ea\7w\2\2\u00ea\u00eb\7g\2\2\u00ebT\3\2\2\2\u00ec\u00ed\7h\2"+
		"\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1"+
		"\7g\2\2\u00f1V\3\2\2\2\u00f2\u00fe\7$\2\2\u00f3\u00fa\t\25\2\2\u00f4\u00f5"+
		"\7\17\2\2\u00f5\u00fa\7\f\2\2\u00f6\u00fa\t\26\2\2\u00f7\u00f8\7^\2\2"+
		"\u00f8\u00fa\7$\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f6"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00fd\n\27\2\2"+
		"\u00fc\u00f9\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0102\7$\2\2\u0102X\3\2\2\2\u0103\u0104\5\21\t\2\u0104\u0105\5\r\7\2"+
		"\u0105Z\3\2\2\2\u0106\u0107\5\37\20\2\u0107\u0108\5\17\b\2\u0108\u0109"+
		"\5\13\6\2\u0109\u010a\5\25\13\2\u010a\\\3\2\2\2\u010b\u010c\5\13\6\2\u010c"+
		"\u010d\5\23\n\2\u010d\u010e\5\35\17\2\u010e\u010f\5\13\6\2\u010f^\3\2"+
		"\2\2\u0110\u0111\5\r\7\2\u0111\u0112\5\21\t\2\u0112`\3\2\2\2\u0113\u0114"+
		"\5#\22\2\u0114\u0115\5\17\b\2\u0115\u0116\5\21\t\2\u0116\u0117\5\23\n"+
		"\2\u0117\u0118\5\13\6\2\u0118b\3\2\2\2\u0119\u011a\5\23\n\2\u011a\u011b"+
		"\5\27\f\2\u011b\u011c\5\27\f\2\u011c\u011d\5\31\r\2\u011dd\3\2\2\2\u011e"+
		"\u011f\5\31\r\2\u011f\u0120\5\27\f\2\u0120\u0121\5\27\f\2\u0121\u0122"+
		"\5\23\n\2\u0122f\3\2\2\2\u0123\u0124\5\7\4\2\u0124\u0125\5\3\2\2\u0125"+
		"\u0126\5\35\17\2\u0126\u0127\5\13\6\2\u0127h\3\2\2\2\u0128\u0129\5\27"+
		"\f\2\u0129\u012a\5\r\7\2\u012aj\3\2\2\2\u012b\u012c\5\13\6\2\u012c\u012d"+
		"\5\35\17\2\u012d\u012e\5\3\2\2\u012e\u012f\5\7\4\2\u012fl\3\2\2\2\u0130"+
		"\u0131\5\23\n\2\u0131\u0132\5\13\6\2\u0132\u0133\5\37\20\2\u0133n\3\2"+
		"\2\2\u0134\u0135\5\21\t\2\u0135\u0136\5\25\13\2\u0136p\3\2\2\2\u0137\u0138"+
		"\7?\2\2\u0138\u0139\7@\2\2\u0139r\3\2\2\2\u013a\u013b\5\21\t\2\u013b\u013c"+
		"\5\35\17\2\u013c\u013d\5!\21\2\u013d\u013e\5\27\f\2\u013e\u013f\5\21\t"+
		"\2\u013f\u0140\5\t\5\2\u0140t\3\2\2\2\u0141\u0145\t\30\2\2\u0142\u0144"+
		"\t\24\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146v\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014a\t"+
		"\31\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014cx\3\2\2\2\u014d\u014e\7/\2\2\u014e\u014f\7/\2\2\u014f"+
		"\u0153\3\2\2\2\u0150\u0152\n\26\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3"+
		"\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0157\b=\2\2\u0157z\3\2\2\2\u0158\u0159\7*\2\2\u0159"+
		"\u015a\7,\2\2\u015a\u015e\3\2\2\2\u015b\u015d\13\2\2\2\u015c\u015b\3\2"+
		"\2\2\u015d\u0160\3\2\2\2\u015e\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7,\2\2\u0162\u0163\7+\2"+
		"\2\u0163\u0164\3\2\2\2\u0164\u0165\b>\2\2\u0165|\3\2\2\2\u0166\u0168\t"+
		"\32\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b?\2\2\u016c~\3\2\2\2\u016d"+
		"\u016e\13\2\2\2\u016e\u0080\3\2\2\2\f\2\u00b6\u00f9\u00fc\u00fe\u0145"+
		"\u014b\u0153\u015e\u0169\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}