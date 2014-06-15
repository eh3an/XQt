// Generated from D:\javad\Projects\XQtProjects\XQt\xqt.lang\src\main\java\xqt\lang\grammar\source\XQt.g4 by ANTLR 4.2.2
package xqt.lang.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQtLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, PERSPECTIVE=6, SELECT=7, FROM=8, 
		EXTENDS=9, ATTRIBUTE=10, MapTo=11, REVERSEMAP=12, CONNECTION=13, ADAPTER=14, 
		SOURCE_URI=15, PARAMETERS=16, BIND=17, SCOPE=18, VERSION=19, LATEST=20, 
		DISTINCT=21, UNION=22, ON=23, JOIN=24, INTO=25, ANCHOR=26, START=27, STOP=28, 
		WHERE=29, ORDERBY=30, ASC=31, DESC=32, NULL=33, FIRST=34, LAST=35, LIMIT=36, 
		SKIP=37, TAKE=38, GROUPBY=39, IS=40, NoT=41, NaN=42, Boolean=43, String=44, 
		Byte=45, Integer=46, Long=47, Real=48, Date=49, EQ=50, NotEQ=51, GT=52, 
		GTEQ=53, LT=54, LTEQ=55, LIKE=56, PLUS=57, MINUS=58, NEGATE=59, MULT=60, 
		DIV=61, MOD=62, POW=63, NOT=64, ASN=65, AOR=66, AAND=67, COMMA=68, UNDERSCORE=69, 
		LPAR=70, RPAR=71, DOT=72, LCUR=73, RCUR=74, DCOLON=75, COLON=76, OR=77, 
		AND=78, RELATIONSHIP=79, RELATION_FW=80, RELATION_RW=81, RELATION_UN=82, 
		RELATION_BI=83, CHAR=84, STRING=85, LINE_COMMENT=86, COMMENT=87, NEWLINE=88, 
		WS=89, ID=90, BOOLEAN=91, DATE=92, UINT=93, INT=94, FLOAT=95;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'after'", "'#'", "'$'", "'exact'", "'before'", "PERSPECTIVE", "SELECT", 
		"FROM", "EXTENDS", "ATTRIBUTE", "MapTo", "REVERSEMAP", "CONNECTION", "ADAPTER", 
		"SOURCE_URI", "PARAMETERS", "BIND", "SCOPE", "VERSION", "LATEST", "DISTINCT", 
		"UNION", "ON", "JOIN", "INTO", "ANCHOR", "START", "STOP", "WHERE", "ORDERBY", 
		"ASC", "DESC", "NULL", "FIRST", "LAST", "LIMIT", "SKIP", "TAKE", "GROUPBY", 
		"IS", "NoT", "NaN", "Boolean", "String", "Byte", "Integer", "Long", "Real", 
		"Date", "'=='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'~'", "'+'", "'-'", 
		"NEGATE", "'*'", "'/'", "'%'", "'^'", "'!'", "'='", "'|'", "'&'", "','", 
		"'_'", "'('", "')'", "'.'", "'{'", "'}'", "'::'", "':'", "OR", "AND", 
		"RELATIONSHIP", "'->'", "'<-'", "'--'", "'<->'", "CHAR", "STRING", "LINE_COMMENT", 
		"COMMENT", "NEWLINE", "WS", "ID", "BOOLEAN", "DATE", "UINT", "INT", "FLOAT"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "PERSPECTIVE", "SELECT", "FROM", 
		"EXTENDS", "ATTRIBUTE", "MapTo", "REVERSEMAP", "CONNECTION", "ADAPTER", 
		"SOURCE_URI", "PARAMETERS", "BIND", "SCOPE", "VERSION", "LATEST", "DISTINCT", 
		"UNION", "ON", "JOIN", "INTO", "ANCHOR", "START", "STOP", "WHERE", "ORDERBY", 
		"ASC", "DESC", "NULL", "FIRST", "LAST", "LIMIT", "SKIP", "TAKE", "GROUPBY", 
		"IS", "NoT", "NaN", "Boolean", "String", "Byte", "Integer", "Long", "Real", 
		"Date", "EQ", "NotEQ", "GT", "GTEQ", "LT", "LTEQ", "LIKE", "PLUS", "MINUS", 
		"NEGATE", "MULT", "DIV", "MOD", "POW", "NOT", "ASN", "AOR", "AAND", "COMMA", 
		"UNDERSCORE", "LPAR", "RPAR", "DOT", "LCUR", "RCUR", "DCOLON", "COLON", 
		"OR", "AND", "RELATIONSHIP", "RELATION_FW", "RELATION_RW", "RELATION_UN", 
		"RELATION_BI", "CHAR", "STRING", "LINE_COMMENT", "COMMENT", "NEWLINE", 
		"WS", "ID", "BOOLEAN", "DATE", "UINT", "INT", "FLOAT", "EXPONENT", "DEC_DIGIT", 
		"DEC_DIGIT_19", "DEC_DIGIT_ZERO", "HEX_DIGIT", "ID_LETTER", "LETTER", 
		"ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", "A", "B", "C", "D", "E", "F", "G", 
		"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
		"V", "W", "X", "Y", "Z"
	};


	public XQtLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XQt.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2a\u03b7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u012d"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u014d\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u017e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \5 \u01f3\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\5!\u0208\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\5-\u024d\n-\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\5/\u025c\n/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\66\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3"+
		"J\3J\3K\3K\3L\3L\3L\3M\3M\3N\3N\3N\3N\5N\u02ac\nN\3O\3O\3O\3O\3O\5O\u02b3"+
		"\nO\3P\3P\3P\3P\5P\u02b9\nP\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3T\3U"+
		"\3U\3U\5U\u02cb\nU\3U\3U\3V\3V\3V\7V\u02d2\nV\fV\16V\u02d5\13V\3V\3V\3"+
		"W\3W\3W\3W\7W\u02dd\nW\fW\16W\u02e0\13W\3W\3W\3W\3W\3X\3X\3X\3X\7X\u02ea"+
		"\nX\fX\16X\u02ed\13X\3X\3X\3X\3X\3X\3Y\5Y\u02f5\nY\3Y\3Y\3Y\3Y\3Z\6Z\u02fc"+
		"\nZ\rZ\16Z\u02fd\3Z\3Z\3[\3[\3[\7[\u0305\n[\f[\16[\u0308\13[\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0313\n\\\3]\3]\7]\u0317\n]\f]\16]\u031a"+
		"\13]\3]\3]\3^\6^\u031f\n^\r^\16^\u0320\3^\7^\u0324\n^\f^\16^\u0327\13"+
		"^\3^\3^\7^\u032b\n^\f^\16^\u032e\13^\5^\u0330\n^\3_\3_\3_\7_\u0335\n_"+
		"\f_\16_\u0338\13_\3_\3_\7_\u033c\n_\f_\16_\u033f\13_\5_\u0341\n_\3`\5"+
		"`\u0344\n`\3`\6`\u0347\n`\r`\16`\u0348\3`\3`\6`\u034d\n`\r`\16`\u034e"+
		"\3`\5`\u0352\n`\3a\3a\3a\5a\u0357\na\3a\6a\u035a\na\ra\16a\u035b\3b\3"+
		"b\3c\3c\3d\3d\3e\3e\3f\3f\5f\u0368\nf\3g\3g\3h\3h\3h\3h\5h\u0370\nh\3"+
		"i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u037b\ni\3j\3j\3j\3j\3j\3j\3j\3k\3k\3l\3"+
		"l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3"+
		"x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\4\u02de"+
		"\u02eb\2\u0085\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F"+
		"\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1\2\u00c3\2\u00c5"+
		"\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3\2\u00d5\2\u00d7"+
		"\2\u00d9\2\u00db\2\u00dd\2\u00df\2\u00e1\2\u00e3\2\u00e5\2\u00e7\2\u00e9"+
		"\2\u00eb\2\u00ed\2\u00ef\2\u00f1\2\u00f3\2\u00f5\2\u00f7\2\u00f9\2\u00fb"+
		"\2\u00fd\2\u00ff\2\u0101\2\u0103\2\u0105\2\u0107\2\3\2#\4\2))^^\4\2$$"+
		"^^\4\2\13\13\"\"\3\2%%\4\2GGgg\5\2\62;CHch\4\2C\\c|\n\2$$))^^ddhhpptt"+
		"vv\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u03be"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\3\u0109\3\2\2\2\5\u010f\3\2\2"+
		"\2\7\u0111\3\2\2\2\t\u0113\3\2\2\2\13\u0119\3\2\2\2\r\u0120\3\2\2\2\17"+
		"\u012e\3\2\2\2\21\u0135\3\2\2\2\23\u013a\3\2\2\2\25\u0142\3\2\2\2\27\u014e"+
		"\3\2\2\2\31\u0154\3\2\2\2\33\u015f\3\2\2\2\35\u016a\3\2\2\2\37\u0172\3"+
		"\2\2\2!\u017f\3\2\2\2#\u018a\3\2\2\2%\u018f\3\2\2\2\'\u0195\3\2\2\2)\u019d"+
		"\3\2\2\2+\u01a4\3\2\2\2-\u01ad\3\2\2\2/\u01b3\3\2\2\2\61\u01b6\3\2\2\2"+
		"\63\u01bb\3\2\2\2\65\u01c0\3\2\2\2\67\u01c7\3\2\2\29\u01cd\3\2\2\2;\u01d2"+
		"\3\2\2\2=\u01d8\3\2\2\2?\u01f2\3\2\2\2A\u0207\3\2\2\2C\u0209\3\2\2\2E"+
		"\u020e\3\2\2\2G\u0214\3\2\2\2I\u0219\3\2\2\2K\u021f\3\2\2\2M\u0224\3\2"+
		"\2\2O\u0229\3\2\2\2Q\u0232\3\2\2\2S\u0235\3\2\2\2U\u0239\3\2\2\2W\u023d"+
		"\3\2\2\2Y\u0245\3\2\2\2[\u024e\3\2\2\2]\u0253\3\2\2\2_\u025d\3\2\2\2a"+
		"\u0262\3\2\2\2c\u0267\3\2\2\2e\u026c\3\2\2\2g\u026f\3\2\2\2i\u0272\3\2"+
		"\2\2k\u0274\3\2\2\2m\u0277\3\2\2\2o\u0279\3\2\2\2q\u027c\3\2\2\2s\u027e"+
		"\3\2\2\2u\u0280\3\2\2\2w\u0282\3\2\2\2y\u0284\3\2\2\2{\u0286\3\2\2\2}"+
		"\u0288\3\2\2\2\177\u028a\3\2\2\2\u0081\u028c\3\2\2\2\u0083\u028e\3\2\2"+
		"\2\u0085\u0290\3\2\2\2\u0087\u0292\3\2\2\2\u0089\u0294\3\2\2\2\u008b\u0296"+
		"\3\2\2\2\u008d\u0298\3\2\2\2\u008f\u029a\3\2\2\2\u0091\u029c\3\2\2\2\u0093"+
		"\u029e\3\2\2\2\u0095\u02a0\3\2\2\2\u0097\u02a2\3\2\2\2\u0099\u02a5\3\2"+
		"\2\2\u009b\u02ab\3\2\2\2\u009d\u02b2\3\2\2\2\u009f\u02b8\3\2\2\2\u00a1"+
		"\u02ba\3\2\2\2\u00a3\u02bd\3\2\2\2\u00a5\u02c0\3\2\2\2\u00a7\u02c3\3\2"+
		"\2\2\u00a9\u02c7\3\2\2\2\u00ab\u02ce\3\2\2\2\u00ad\u02d8\3\2\2\2\u00af"+
		"\u02e5\3\2\2\2\u00b1\u02f4\3\2\2\2\u00b3\u02fb\3\2\2\2\u00b5\u0301\3\2"+
		"\2\2\u00b7\u0312\3\2\2\2\u00b9\u0314\3\2\2\2\u00bb\u032f\3\2\2\2\u00bd"+
		"\u0340\3\2\2\2\u00bf\u0343\3\2\2\2\u00c1\u0353\3\2\2\2\u00c3\u035d\3\2"+
		"\2\2\u00c5\u035f\3\2\2\2\u00c7\u0361\3\2\2\2\u00c9\u0363\3\2\2\2\u00cb"+
		"\u0367\3\2\2\2\u00cd\u0369\3\2\2\2\u00cf\u036f\3\2\2\2\u00d1\u037a\3\2"+
		"\2\2\u00d3\u037c\3\2\2\2\u00d5\u0383\3\2\2\2\u00d7\u0385\3\2\2\2\u00d9"+
		"\u0387\3\2\2\2\u00db\u0389\3\2\2\2\u00dd\u038b\3\2\2\2\u00df\u038d\3\2"+
		"\2\2\u00e1\u038f\3\2\2\2\u00e3\u0391\3\2\2\2\u00e5\u0393\3\2\2\2\u00e7"+
		"\u0395\3\2\2\2\u00e9\u0397\3\2\2\2\u00eb\u0399\3\2\2\2\u00ed\u039b\3\2"+
		"\2\2\u00ef\u039d\3\2\2\2\u00f1\u039f\3\2\2\2\u00f3\u03a1\3\2\2\2\u00f5"+
		"\u03a3\3\2\2\2\u00f7\u03a5\3\2\2\2\u00f9\u03a7\3\2\2\2\u00fb\u03a9\3\2"+
		"\2\2\u00fd\u03ab\3\2\2\2\u00ff\u03ad\3\2\2\2\u0101\u03af\3\2\2\2\u0103"+
		"\u03b1\3\2\2\2\u0105\u03b3\3\2\2\2\u0107\u03b5\3\2\2\2\u0109\u010a\7c"+
		"\2\2\u010a\u010b\7h\2\2\u010b\u010c\7v\2\2\u010c\u010d\7g\2\2\u010d\u010e"+
		"\7t\2\2\u010e\4\3\2\2\2\u010f\u0110\7%\2\2\u0110\6\3\2\2\2\u0111\u0112"+
		"\7&\2\2\u0112\b\3\2\2\2\u0113\u0114\7g\2\2\u0114\u0115\7z\2\2\u0115\u0116"+
		"\7c\2\2\u0116\u0117\7e\2\2\u0117\u0118\7v\2\2\u0118\n\3\2\2\2\u0119\u011a"+
		"\7d\2\2\u011a\u011b\7g\2\2\u011b\u011c\7h\2\2\u011c\u011d\7q\2\2\u011d"+
		"\u011e\7t\2\2\u011e\u011f\7g\2\2\u011f\f\3\2\2\2\u0120\u0121\5\u00f3z"+
		"\2\u0121\u0122\5\u00ddo\2\u0122\u0123\5\u00f7|\2\u0123\u012c\5\u00f9}"+
		"\2\u0124\u0125\5\u00f3z\2\u0125\u0126\5\u00ddo\2\u0126\u0127\5\u00d9m"+
		"\2\u0127\u0128\5\u00fb~\2\u0128\u0129\5\u00e5s\2\u0129\u012a\5\u00ff\u0080"+
		"\2\u012a\u012b\5\u00ddo\2\u012b\u012d\3\2\2\2\u012c\u0124\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\16\3\2\2\2\u012e\u012f\5\u00f9}\2\u012f\u0130\5\u00dd"+
		"o\2\u0130\u0131\5\u00ebv\2\u0131\u0132\5\u00ddo\2\u0132\u0133\5\u00d9"+
		"m\2\u0133\u0134\5\u00fb~\2\u0134\20\3\2\2\2\u0135\u0136\5\u00dfp\2\u0136"+
		"\u0137\5\u00f7|\2\u0137\u0138\5\u00f1y\2\u0138\u0139\5\u00edw\2\u0139"+
		"\22\3\2\2\2\u013a\u013b\5\u00ddo\2\u013b\u013c\5\u0103\u0082\2\u013c\u013d"+
		"\5\u00fb~\2\u013d\u013e\5\u00ddo\2\u013e\u013f\5\u00efx\2\u013f\u0140"+
		"\5\u00dbn\2\u0140\u0141\5\u00f9}\2\u0141\24\3\2\2\2\u0142\u0143\5\u00d5"+
		"k\2\u0143\u0144\5\u00fb~\2\u0144\u014c\5\u00fb~\2\u0145\u0146\5\u00f7"+
		"|\2\u0146\u0147\5\u00e5s\2\u0147\u0148\5\u00d7l\2\u0148\u0149\5\u00fd"+
		"\177\2\u0149\u014a\5\u00fb~\2\u014a\u014b\5\u00ddo\2\u014b\u014d\3\2\2"+
		"\2\u014c\u0145\3\2\2\2\u014c\u014d\3\2\2\2\u014d\26\3\2\2\2\u014e\u014f"+
		"\5\u00edw\2\u014f\u0150\5\u00d5k\2\u0150\u0151\5\u00f3z\2\u0151\u0152"+
		"\5\u00fb~\2\u0152\u0153\5\u00f1y\2\u0153\30\3\2\2\2\u0154\u0155\5\u00f7"+
		"|\2\u0155\u0156\5\u00ddo\2\u0156\u0157\5\u00ff\u0080\2\u0157\u0158\5\u00dd"+
		"o\2\u0158\u0159\5\u00f7|\2\u0159\u015a\5\u00f9}\2\u015a\u015b\5\u00dd"+
		"o\2\u015b\u015c\5\u00edw\2\u015c\u015d\5\u00d5k\2\u015d\u015e\5\u00f3"+
		"z\2\u015e\32\3\2\2\2\u015f\u0160\5\u00d9m\2\u0160\u0161\5\u00f1y\2\u0161"+
		"\u0162\5\u00efx\2\u0162\u0163\5\u00efx\2\u0163\u0164\5\u00ddo\2\u0164"+
		"\u0165\5\u00d9m\2\u0165\u0166\5\u00fb~\2\u0166\u0167\5\u00e5s\2\u0167"+
		"\u0168\5\u00f1y\2\u0168\u0169\5\u00efx\2\u0169\34\3\2\2\2\u016a\u016b"+
		"\5\u00d5k\2\u016b\u016c\5\u00dbn\2\u016c\u016d\5\u00d5k\2\u016d\u016e"+
		"\5\u00f3z\2\u016e\u016f\5\u00fb~\2\u016f\u0170\5\u00ddo\2\u0170\u0171"+
		"\5\u00f7|\2\u0171\36\3\2\2\2\u0172\u0173\5\u00f9}\2\u0173\u0174\5\u00f1"+
		"y\2\u0174\u0175\5\u00fd\177\2\u0175\u0176\5\u00f7|\2\u0176\u0177\5\u00d9"+
		"m\2\u0177\u017d\5\u00ddo\2\u0178\u0179\5\u008bF\2\u0179\u017a\5\u00fd"+
		"\177\2\u017a\u017b\5\u00f7|\2\u017b\u017c\5\u00e5s\2\u017c\u017e\3\2\2"+
		"\2\u017d\u0178\3\2\2\2\u017d\u017e\3\2\2\2\u017e \3\2\2\2\u017f\u0180"+
		"\5\u00f3z\2\u0180\u0181\5\u00d5k\2\u0181\u0182\5\u00f7|\2\u0182\u0183"+
		"\5\u00d5k\2\u0183\u0184\5\u00edw\2\u0184\u0185\5\u00ddo\2\u0185\u0186"+
		"\5\u00fb~\2\u0186\u0187\5\u00ddo\2\u0187\u0188\5\u00f7|\2\u0188\u0189"+
		"\5\u00f9}\2\u0189\"\3\2\2\2\u018a\u018b\5\u00d7l\2\u018b\u018c\5\u00e5"+
		"s\2\u018c\u018d\5\u00efx\2\u018d\u018e\5\u00dbn\2\u018e$\3\2\2\2\u018f"+
		"\u0190\5\u00f9}\2\u0190\u0191\5\u00d9m\2\u0191\u0192\5\u00f1y\2\u0192"+
		"\u0193\5\u00f3z\2\u0193\u0194\5\u00ddo\2\u0194&\3\2\2\2\u0195\u0196\5"+
		"\u00ff\u0080\2\u0196\u0197\5\u00ddo\2\u0197\u0198\5\u00f7|\2\u0198\u0199"+
		"\5\u00f9}\2\u0199\u019a\5\u00e5s\2\u019a\u019b\5\u00f1y\2\u019b\u019c"+
		"\5\u00efx\2\u019c(\3\2\2\2\u019d\u019e\5\u00ebv\2\u019e\u019f\5\u00d5"+
		"k\2\u019f\u01a0\5\u00fb~\2\u01a0\u01a1\5\u00ddo\2\u01a1\u01a2\5\u00f9"+
		"}\2\u01a2\u01a3\5\u00fb~\2\u01a3*\3\2\2\2\u01a4\u01a5\5\u00dbn\2\u01a5"+
		"\u01a6\5\u00e5s\2\u01a6\u01a7\5\u00f9}\2\u01a7\u01a8\5\u00fb~\2\u01a8"+
		"\u01a9\5\u00e5s\2\u01a9\u01aa\5\u00efx\2\u01aa\u01ab\5\u00d9m\2\u01ab"+
		"\u01ac\5\u00fb~\2\u01ac,\3\2\2\2\u01ad\u01ae\5\u00fd\177\2\u01ae\u01af"+
		"\5\u00efx\2\u01af\u01b0\5\u00e5s\2\u01b0\u01b1\5\u00f1y\2\u01b1\u01b2"+
		"\5\u00efx\2\u01b2.\3\2\2\2\u01b3\u01b4\5\u00f1y\2\u01b4\u01b5\5\u00ef"+
		"x\2\u01b5\60\3\2\2\2\u01b6\u01b7\5\u00e7t\2\u01b7\u01b8\5\u00f1y\2\u01b8"+
		"\u01b9\5\u00e5s\2\u01b9\u01ba\5\u00efx\2\u01ba\62\3\2\2\2\u01bb\u01bc"+
		"\5\u00e5s\2\u01bc\u01bd\5\u00efx\2\u01bd\u01be\5\u00fb~\2\u01be\u01bf"+
		"\5\u00f1y\2\u01bf\64\3\2\2\2\u01c0\u01c1\5\u00d5k\2\u01c1\u01c2\5\u00ef"+
		"x\2\u01c2\u01c3\5\u00d9m\2\u01c3\u01c4\5\u00e3r\2\u01c4\u01c5\5\u00f1"+
		"y\2\u01c5\u01c6\5\u00f7|\2\u01c6\66\3\2\2\2\u01c7\u01c8\5\u00f9}\2\u01c8"+
		"\u01c9\5\u00fb~\2\u01c9\u01ca\5\u00d5k\2\u01ca\u01cb\5\u00f7|\2\u01cb"+
		"\u01cc\5\u00fb~\2\u01cc8\3\2\2\2\u01cd\u01ce\5\u00f9}\2\u01ce\u01cf\5"+
		"\u00fb~\2\u01cf\u01d0\5\u00f1y\2\u01d0\u01d1\5\u00f3z\2\u01d1:\3\2\2\2"+
		"\u01d2\u01d3\5\u0101\u0081\2\u01d3\u01d4\5\u00e3r\2\u01d4\u01d5\5\u00dd"+
		"o\2\u01d5\u01d6\5\u00f7|\2\u01d6\u01d7\5\u00ddo\2\u01d7<\3\2\2\2\u01d8"+
		"\u01d9\5\u00f1y\2\u01d9\u01da\5\u00f7|\2\u01da\u01db\5\u00dbn\2\u01db"+
		"\u01dc\5\u00ddo\2\u01dc\u01dd\5\u00f7|\2\u01dd\u01de\7\"\2\2\u01de\u01df"+
		"\5\u00d7l\2\u01df\u01e0\5\u0105\u0083\2\u01e0>\3\2\2\2\u01e1\u01e2\5\u00d5"+
		"k\2\u01e2\u01e3\5\u00f9}\2\u01e3\u01e4\5\u00d9m\2\u01e4\u01f3\3\2\2\2"+
		"\u01e5\u01e6\5\u00d5k\2\u01e6\u01e7\5\u00f9}\2\u01e7\u01e8\5\u00d9m\2"+
		"\u01e8\u01e9\5\u00ddo\2\u01e9\u01ea\5\u00efx\2\u01ea\u01eb\5\u00dbn\2"+
		"\u01eb\u01ec\5\u00e5s\2\u01ec\u01ed\5\u00efx\2\u01ed\u01ee\5\u00e1q\2"+
		"\u01ee\u01f3\3\2\2\2\u01ef\u01f0\5\u00d5k\2\u01f0\u01f1\5\u00f9}\2\u01f1"+
		"\u01f3\3\2\2\2\u01f2\u01e1\3\2\2\2\u01f2\u01e5\3\2\2\2\u01f2\u01ef\3\2"+
		"\2\2\u01f3@\3\2\2\2\u01f4\u01f5\5\u00dbn\2\u01f5\u01f6\5\u00ddo\2\u01f6"+
		"\u01f7\5\u00f9}\2\u01f7\u01f8\5\u00d9m\2\u01f8\u0208\3\2\2\2\u01f9\u01fa"+
		"\5\u00dbn\2\u01fa\u01fb\5\u00ddo\2\u01fb\u01fc\5\u00f9}\2\u01fc\u01fd"+
		"\5\u00d9m\2\u01fd\u01fe\5\u00ddo\2\u01fe\u01ff\5\u00efx\2\u01ff\u0200"+
		"\5\u00dbn\2\u0200\u0201\5\u00e5s\2\u0201\u0202\5\u00efx\2\u0202\u0203"+
		"\5\u00e1q\2\u0203\u0208\3\2\2\2\u0204\u0205\5\u00dbn\2\u0205\u0206\5\u00f9"+
		"}\2\u0206\u0208\3\2\2\2\u0207\u01f4\3\2\2\2\u0207\u01f9\3\2\2\2\u0207"+
		"\u0204\3\2\2\2\u0208B\3\2\2\2\u0209\u020a\5\u00efx\2\u020a\u020b\5\u00fd"+
		"\177\2\u020b\u020c\5\u00ebv\2\u020c\u020d\5\u00ebv\2\u020dD\3\2\2\2\u020e"+
		"\u020f\5\u00dfp\2\u020f\u0210\5\u00e5s\2\u0210\u0211\5\u00f7|\2\u0211"+
		"\u0212\5\u00f9}\2\u0212\u0213\5\u00fb~\2\u0213F\3\2\2\2\u0214\u0215\5"+
		"\u00ebv\2\u0215\u0216\5\u00d5k\2\u0216\u0217\5\u00f9}\2\u0217\u0218\5"+
		"\u00fb~\2\u0218H\3\2\2\2\u0219\u021a\5\u00ebv\2\u021a\u021b\5\u00e5s\2"+
		"\u021b\u021c\5\u00edw\2\u021c\u021d\5\u00e5s\2\u021d\u021e\5\u00fb~\2"+
		"\u021eJ\3\2\2\2\u021f\u0220\5\u00f9}\2\u0220\u0221\5\u00e9u\2\u0221\u0222"+
		"\5\u00e5s\2\u0222\u0223\5\u00f3z\2\u0223L\3\2\2\2\u0224\u0225\5\u00fb"+
		"~\2\u0225\u0226\5\u00d5k\2\u0226\u0227\5\u00e9u\2\u0227\u0228\5\u00dd"+
		"o\2\u0228N\3\2\2\2\u0229\u022a\5\u00e1q\2\u022a\u022b\5\u00f7|\2\u022b"+
		"\u022c\5\u00f1y\2\u022c\u022d\5\u00fd\177\2\u022d\u022e\5\u00f3z\2\u022e"+
		"\u022f\7\"\2\2\u022f\u0230\5\u00d7l\2\u0230\u0231\5\u0105\u0083\2\u0231"+
		"P\3\2\2\2\u0232\u0233\5\u00e5s\2\u0233\u0234\5\u00f9}\2\u0234R\3\2\2\2"+
		"\u0235\u0236\5\u00efx\2\u0236\u0237\5\u00f1y\2\u0237\u0238\5\u00fb~\2"+
		"\u0238T\3\2\2\2\u0239\u023a\5\u00efx\2\u023a\u023b\5\u00d5k\2\u023b\u023c"+
		"\5\u00efx\2\u023cV\3\2\2\2\u023d\u023e\5\u00d7l\2\u023e\u023f\5\u00f1"+
		"y\2\u023f\u0240\5\u00f1y\2\u0240\u0241\5\u00ebv\2\u0241\u0242\5\u00dd"+
		"o\2\u0242\u0243\5\u00d5k\2\u0243\u0244\5\u00efx\2\u0244X\3\2\2\2\u0245"+
		"\u0246\5\u00f9}\2\u0246\u0247\5\u00fb~\2\u0247\u024c\5\u00f7|\2\u0248"+
		"\u0249\5\u00e5s\2\u0249\u024a\5\u00efx\2\u024a\u024b\5\u00e1q\2\u024b"+
		"\u024d\3\2\2\2\u024c\u0248\3\2\2\2\u024c\u024d\3\2\2\2\u024dZ\3\2\2\2"+
		"\u024e\u024f\5\u00d7l\2\u024f\u0250\5\u0105\u0083\2\u0250\u0251\5\u00fb"+
		"~\2\u0251\u0252\5\u00ddo\2\u0252\\\3\2\2\2\u0253\u0254\5\u00e5s\2\u0254"+
		"\u0255\5\u00efx\2\u0255\u025b\5\u00fb~\2\u0256\u0257\5\u00ddo\2\u0257"+
		"\u0258\5\u00e1q\2\u0258\u0259\5\u00ddo\2\u0259\u025a\5\u00f7|\2\u025a"+
		"\u025c\3\2\2\2\u025b\u0256\3\2\2\2\u025b\u025c\3\2\2\2\u025c^\3\2\2\2"+
		"\u025d\u025e\5\u00ebv\2\u025e\u025f\5\u00f1y\2\u025f\u0260\5\u00efx\2"+
		"\u0260\u0261\5\u00e1q\2\u0261`\3\2\2\2\u0262\u0263\5\u00f7|\2\u0263\u0264"+
		"\5\u00ddo\2\u0264\u0265\5\u00d5k\2\u0265\u0266\5\u00ebv\2\u0266b\3\2\2"+
		"\2\u0267\u0268\5\u00dbn\2\u0268\u0269\5\u00d5k\2\u0269\u026a\5\u00fb~"+
		"\2\u026a\u026b\5\u00ddo\2\u026bd\3\2\2\2\u026c\u026d\7?\2\2\u026d\u026e"+
		"\7?\2\2\u026ef\3\2\2\2\u026f\u0270\7>\2\2\u0270\u0271\7@\2\2\u0271h\3"+
		"\2\2\2\u0272\u0273\7@\2\2\u0273j\3\2\2\2\u0274\u0275\7@\2\2\u0275\u0276"+
		"\7?\2\2\u0276l\3\2\2\2\u0277\u0278\7>\2\2\u0278n\3\2\2\2\u0279\u027a\7"+
		">\2\2\u027a\u027b\7?\2\2\u027bp\3\2\2\2\u027c\u027d\7\u0080\2\2\u027d"+
		"r\3\2\2\2\u027e\u027f\7-\2\2\u027ft\3\2\2\2\u0280\u0281\7/\2\2\u0281v"+
		"\3\2\2\2\u0282\u0283\5u;\2\u0283x\3\2\2\2\u0284\u0285\7,\2\2\u0285z\3"+
		"\2\2\2\u0286\u0287\7\61\2\2\u0287|\3\2\2\2\u0288\u0289\7\'\2\2\u0289~"+
		"\3\2\2\2\u028a\u028b\7`\2\2\u028b\u0080\3\2\2\2\u028c\u028d\7#\2\2\u028d"+
		"\u0082\3\2\2\2\u028e\u028f\7?\2\2\u028f\u0084\3\2\2\2\u0290\u0291\7~\2"+
		"\2\u0291\u0086\3\2\2\2\u0292\u0293\7(\2\2\u0293\u0088\3\2\2\2\u0294\u0295"+
		"\7.\2\2\u0295\u008a\3\2\2\2\u0296\u0297\7a\2\2\u0297\u008c\3\2\2\2\u0298"+
		"\u0299\7*\2\2\u0299\u008e\3\2\2\2\u029a\u029b\7+\2\2\u029b\u0090\3\2\2"+
		"\2\u029c\u029d\7\60\2\2\u029d\u0092\3\2\2\2\u029e\u029f\7}\2\2\u029f\u0094"+
		"\3\2\2\2\u02a0\u02a1\7\177\2\2\u02a1\u0096\3\2\2\2\u02a2\u02a3\7<\2\2"+
		"\u02a3\u02a4\7<\2\2\u02a4\u0098\3\2\2\2\u02a5\u02a6\7<\2\2\u02a6\u009a"+
		"\3\2\2\2\u02a7\u02a8\7~\2\2\u02a8\u02ac\7~\2\2\u02a9\u02aa\7Q\2\2\u02aa"+
		"\u02ac\7T\2\2\u02ab\u02a7\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u009c\3\2"+
		"\2\2\u02ad\u02ae\7(\2\2\u02ae\u02b3\7(\2\2\u02af\u02b0\7C\2\2\u02b0\u02b1"+
		"\7P\2\2\u02b1\u02b3\7F\2\2\u02b2\u02ad\3\2\2\2\u02b2\u02af\3\2\2\2\u02b3"+
		"\u009e\3\2\2\2\u02b4\u02b9\5\u00a1Q\2\u02b5\u02b9\5\u00a3R\2\u02b6\u02b9"+
		"\5\u00a5S\2\u02b7\u02b9\5\u00a7T\2\u02b8\u02b4\3\2\2\2\u02b8\u02b5\3\2"+
		"\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9\u00a0\3\2\2\2\u02ba"+
		"\u02bb\7/\2\2\u02bb\u02bc\7@\2\2\u02bc\u00a2\3\2\2\2\u02bd\u02be\7>\2"+
		"\2\u02be\u02bf\7/\2\2\u02bf\u00a4\3\2\2\2\u02c0\u02c1\7/\2\2\u02c1\u02c2"+
		"\7/\2\2\u02c2\u00a6\3\2\2\2\u02c3\u02c4\7>\2\2\u02c4\u02c5\7/\2\2\u02c5"+
		"\u02c6\7@\2\2\u02c6\u00a8\3\2\2\2\u02c7\u02ca\7)\2\2\u02c8\u02cb\5\u00cf"+
		"h\2\u02c9\u02cb\n\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc\u02cd\7)\2\2\u02cd\u00aa\3\2\2\2\u02ce\u02d3\7$\2"+
		"\2\u02cf\u02d2\5\u00cfh\2\u02d0\u02d2\n\3\2\2\u02d1\u02cf\3\2\2\2\u02d1"+
		"\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2"+
		"\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d7\7$\2\2\u02d7"+
		"\u00ac\3\2\2\2\u02d8\u02d9\7\61\2\2\u02d9\u02da\7\61\2\2\u02da\u02de\3"+
		"\2\2\2\u02db\u02dd\13\2\2\2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02de\3\2"+
		"\2\2\u02e1\u02e2\7\f\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\bW\2\2\u02e4"+
		"\u00ae\3\2\2\2\u02e5\u02e6\7\61\2\2\u02e6\u02e7\7,\2\2\u02e7\u02eb\3\2"+
		"\2\2\u02e8\u02ea\13\2\2\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02eb\3\2"+
		"\2\2\u02ee\u02ef\7,\2\2\u02ef\u02f0\7\61\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02f2\bX\2\2\u02f2\u00b0\3\2\2\2\u02f3\u02f5\7\17\2\2\u02f4\u02f3\3\2"+
		"\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\7\f\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u02f9\bY\2\2\u02f9\u00b2\3\2\2\2\u02fa\u02fc\t\4"+
		"\2\2\u02fb\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\bZ\2\2\u0300\u00b4\3\2"+
		"\2\2\u0301\u0306\5\u00cbf\2\u0302\u0305\5\u00cbf\2\u0303\u0305\5\u00c3"+
		"b\2\u0304\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306"+
		"\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u00b6\3\2\2\2\u0308\u0306\3\2"+
		"\2\2\u0309\u030a\7v\2\2\u030a\u030b\7t\2\2\u030b\u030c\7w\2\2\u030c\u0313"+
		"\7g\2\2\u030d\u030e\7h\2\2\u030e\u030f\7c\2\2\u030f\u0310\7n\2\2\u0310"+
		"\u0311\7u\2\2\u0311\u0313\7g\2\2\u0312\u0309\3\2\2\2\u0312\u030d\3\2\2"+
		"\2\u0313\u00b8\3\2\2\2\u0314\u0318\7%\2\2\u0315\u0317\n\5\2\2\u0316\u0315"+
		"\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031b\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u031c\7%\2\2\u031c\u00ba\3\2"+
		"\2\2\u031d\u031f\5\u00c7d\2\u031e\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0330\3\2\2\2\u0322\u0324\5\u00c7"+
		"d\2\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u032c\5\u00c5"+
		"c\2\u0329\u032b\5\u00c3b\2\u032a\u0329\3\2\2\2\u032b\u032e\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2"+
		"\2\2\u032f\u031e\3\2\2\2\u032f\u0325\3\2\2\2\u0330\u00bc\3\2\2\2\u0331"+
		"\u0341\5\u00bb^\2\u0332\u0336\5u;\2\u0333\u0335\5\u00c7d\2\u0334\u0333"+
		"\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033d\5\u00c5c\2\u033a\u033c"+
		"\5\u00c3b\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2"+
		"\2\u033d\u033e\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0331"+
		"\3\2\2\2\u0340\u0332\3\2\2\2\u0341\u00be\3\2\2\2\u0342\u0344\5u;\2\u0343"+
		"\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345\u0347\5\u00c3"+
		"b\2\u0346\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0346\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c\5\u0091I\2\u034b\u034d"+
		"\5\u00c3b\2\u034c\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034c\3\2\2"+
		"\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u0352\5\u00c1a\2\u0351"+
		"\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u00c0\3\2\2\2\u0353\u0356\t\6"+
		"\2\2\u0354\u0357\5s:\2\u0355\u0357\5u;\2\u0356\u0354\3\2\2\2\u0356\u0355"+
		"\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358\u035a\5\u00c3b"+
		"\2\u0359\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c"+
		"\3\2\2\2\u035c\u00c2\3\2\2\2\u035d\u035e\4\62;\2\u035e\u00c4\3\2\2\2\u035f"+
		"\u0360\4\63;\2\u0360\u00c6\3\2\2\2\u0361\u0362\7\62\2\2\u0362\u00c8\3"+
		"\2\2\2\u0363\u0364\t\7\2\2\u0364\u00ca\3\2\2\2\u0365\u0368\5\u00cdg\2"+
		"\u0366\u0368\7a\2\2\u0367\u0365\3\2\2\2\u0367\u0366\3\2\2\2\u0368\u00cc"+
		"\3\2\2\2\u0369\u036a\t\b\2\2\u036a\u00ce\3\2\2\2\u036b\u036c\7^\2\2\u036c"+
		"\u0370\t\t\2\2\u036d\u0370\5\u00d3j\2\u036e\u0370\5\u00d1i\2\u036f\u036b"+
		"\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u036e\3\2\2\2\u0370\u00d0\3\2\2\2\u0371"+
		"\u0372\7^\2\2\u0372\u0373\4\62\65\2\u0373\u0374\4\629\2\u0374\u037b\4"+
		"\629\2\u0375\u0376\7^\2\2\u0376\u0377\4\629\2\u0377\u037b\4\629\2\u0378"+
		"\u0379\7^\2\2\u0379\u037b\4\629\2\u037a\u0371\3\2\2\2\u037a\u0375\3\2"+
		"\2\2\u037a\u0378\3\2\2\2\u037b\u00d2\3\2\2\2\u037c\u037d\7^\2\2\u037d"+
		"\u037e\7w\2\2\u037e\u037f\5\u00c9e\2\u037f\u0380\5\u00c9e\2\u0380\u0381"+
		"\5\u00c9e\2\u0381\u0382\5\u00c9e\2\u0382\u00d4\3\2\2\2\u0383\u0384\t\n"+
		"\2\2\u0384\u00d6\3\2\2\2\u0385\u0386\t\13\2\2\u0386\u00d8\3\2\2\2\u0387"+
		"\u0388\t\f\2\2\u0388\u00da\3\2\2\2\u0389\u038a\t\r\2\2\u038a\u00dc\3\2"+
		"\2\2\u038b\u038c\t\6\2\2\u038c\u00de\3\2\2\2\u038d\u038e\t\16\2\2\u038e"+
		"\u00e0\3\2\2\2\u038f\u0390\t\17\2\2\u0390\u00e2\3\2\2\2\u0391\u0392\t"+
		"\20\2\2\u0392\u00e4\3\2\2\2\u0393\u0394\t\21\2\2\u0394\u00e6\3\2\2\2\u0395"+
		"\u0396\t\22\2\2\u0396\u00e8\3\2\2\2\u0397\u0398\t\23\2\2\u0398\u00ea\3"+
		"\2\2\2\u0399\u039a\t\24\2\2\u039a\u00ec\3\2\2\2\u039b\u039c\t\25\2\2\u039c"+
		"\u00ee\3\2\2\2\u039d\u039e\t\26\2\2\u039e\u00f0\3\2\2\2\u039f\u03a0\t"+
		"\27\2\2\u03a0\u00f2\3\2\2\2\u03a1\u03a2\t\30\2\2\u03a2\u00f4\3\2\2\2\u03a3"+
		"\u03a4\t\31\2\2\u03a4\u00f6\3\2\2\2\u03a5\u03a6\t\32\2\2\u03a6\u00f8\3"+
		"\2\2\2\u03a7\u03a8\t\33\2\2\u03a8\u00fa\3\2\2\2\u03a9\u03aa\t\34\2\2\u03aa"+
		"\u00fc\3\2\2\2\u03ab\u03ac\t\35\2\2\u03ac\u00fe\3\2\2\2\u03ad\u03ae\t"+
		"\36\2\2\u03ae\u0100\3\2\2\2\u03af\u03b0\t\37\2\2\u03b0\u0102\3\2\2\2\u03b1"+
		"\u03b2\t \2\2\u03b2\u0104\3\2\2\2\u03b3\u03b4\t!\2\2\u03b4\u0106\3\2\2"+
		"\2\u03b5\u03b6\t\"\2\2\u03b6\u0108\3\2\2\2(\2\u012c\u014c\u017d\u01f2"+
		"\u0207\u024c\u025b\u02ab\u02b2\u02b8\u02ca\u02d1\u02d3\u02de\u02eb\u02f4"+
		"\u02fd\u0304\u0306\u0312\u0318\u0320\u0325\u032c\u032f\u0336\u033d\u0340"+
		"\u0343\u0348\u034e\u0351\u0356\u035b\u0367\u036f\u037a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}