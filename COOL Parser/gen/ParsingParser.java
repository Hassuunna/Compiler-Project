// Generated from C:/Users/Aref/Desktop/COOL Parser/src\Parsing.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParsingParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_classDefine = 1, RULE_feature = 2, RULE_parameter = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDefine", "feature", "parameter", "expr"
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

	@Override
	public String getGrammarFileName() { return "Parsing.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParsingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StartContext extends ProgramContext {
		public List<ClassDefineContext> classDefine() {
			return getRuleContexts(ClassDefineContext.class);
		}
		public ClassDefineContext classDefine(int i) {
			return getRuleContext(ClassDefineContext.class,i);
		}
		public StartContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new StartContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				classDefine();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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

	public static class ClassDefineContext extends ParserRuleContext {
		public ClassDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefine; }
	 
		public ClassDefineContext() { }
		public void copyFrom(ClassDefineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDefContext extends ClassDefineContext {
		public TerminalNode CLASS() { return getToken(ParsingParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(ParsingParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(ParsingParser.TYPE, i);
		}
		public TerminalNode OPENBRACE() { return getToken(ParsingParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(ParsingParser.CLOSEBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ParsingParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParsingParser.SEMICOLON, i);
		}
		public TerminalNode INHERITS() { return getToken(ParsingParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public ClassDefContext(ClassDefineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefineContext classDefine() throws RecognitionException {
		ClassDefineContext _localctx = new ClassDefineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefine);
		int _la;
		try {
			_localctx = new ClassDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(CLASS);
			setState(16);
			match(TYPE);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(17);
				match(INHERITS);
				setState(18);
				match(TYPE);
				}
			}

			setState(21);
			match(OPENBRACE);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(22);
				feature();
				setState(23);
				match(SEMICOLON);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(CLOSEBRACE);
			setState(31);
			match(SEMICOLON);
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

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionContext extends FeatureContext {
		public TerminalNode ID() { return getToken(ParsingParser.ID, 0); }
		public TerminalNode OPENPARENTHESES() { return getToken(ParsingParser.OPENPARENTHESES, 0); }
		public TerminalNode CLOSEPARENTHESES() { return getToken(ParsingParser.CLOSEPARENTHESES, 0); }
		public TerminalNode COLON() { return getToken(ParsingParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(ParsingParser.TYPE, 0); }
		public TerminalNode OPENBRACE() { return getToken(ParsingParser.OPENBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEBRACE() { return getToken(ParsingParser.CLOSEBRACE, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParsingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParsingParser.COMMA, i);
		}
		public FunctionContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDefContext extends FeatureContext {
		public TerminalNode ID() { return getToken(ParsingParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ParsingParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(ParsingParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(ParsingParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(ID);
				setState(34);
				match(OPENPARENTHESES);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(35);
					parameter();
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(36);
						match(COMMA);
						setState(37);
						parameter();
						}
						}
						setState(42);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(45);
				match(CLOSEPARENTHESES);
				setState(46);
				match(COLON);
				setState(47);
				match(TYPE);
				setState(48);
				match(OPENBRACE);
				setState(49);
				expr(0);
				setState(50);
				match(CLOSEBRACE);
				}
				break;
			case 2:
				_localctx = new VarDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(ID);
				setState(53);
				match(COLON);
				setState(54);
				match(TYPE);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(55);
					match(ASSIGN);
					setState(56);
					expr(0);
					}
				}

				}
				break;
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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamContext extends ParameterContext {
		public TerminalNode ID() { return getToken(ParsingParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ParsingParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(ParsingParser.TYPE, 0); }
		public ParamContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		try {
			_localctx = new ParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
			setState(62);
			match(COLON);
			setState(63);
			match(TYPE);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(ParsingParser.SUB, 0); }
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(ParsingParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ParsingParser.MUL, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LteqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(ParsingParser.LTEQ, 0); }
		public LteqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterLteq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitLteq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitLteq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(ParsingParser.NUM, 0); }
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StaticCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(ParsingParser.ID, 0); }
		public TerminalNode OPENPARENTHESES() { return getToken(ParsingParser.OPENPARENTHESES, 0); }
		public TerminalNode CLOSEPARENTHESES() { return getToken(ParsingParser.CLOSEPARENTHESES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParsingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParsingParser.COMMA, i);
		}
		public StaticCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterStaticCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitStaticCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitStaticCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(ParsingParser.LT, 0); }
		public LtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(ParsingParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(ParsingParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(ParsingParser.POOL, 0); }
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchContext extends ExprContext {
		public TerminalNode CASE() { return getToken(ParsingParser.CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(ParsingParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(ParsingParser.ESAC, 0); }
		public List<TerminalNode> ID() { return getTokens(ParsingParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParsingParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ParsingParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ParsingParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(ParsingParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(ParsingParser.TYPE, i);
		}
		public List<TerminalNode> CASEASSIGN() { return getTokens(ParsingParser.CASEASSIGN); }
		public TerminalNode CASEASSIGN(int i) {
			return getToken(ParsingParser.CASEASSIGN, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ParsingParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParsingParser.SEMICOLON, i);
		}
		public SwitchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ParsingParser.DIV, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(ParsingParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewObjectContext extends ExprContext {
		public TerminalNode NEW() { return getToken(ParsingParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(ParsingParser.TYPE, 0); }
		public NewObjectContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitNewObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitNewObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExprContext {
		public TerminalNode OPENBRACE() { return getToken(ParsingParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(ParsingParser.CLOSEBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ParsingParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParsingParser.SEMICOLON, i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends ExprContext {
		public TerminalNode LET() { return getToken(ParsingParser.LET, 0); }
		public List<TerminalNode> ID() { return getTokens(ParsingParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParsingParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ParsingParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ParsingParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(ParsingParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(ParsingParser.TYPE, i);
		}
		public TerminalNode IN() { return getToken(ParsingParser.IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(ParsingParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(ParsingParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParsingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParsingParser.COMMA, i);
		}
		public LetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(ParsingParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ExprContext {
		public TerminalNode IF() { return getToken(ParsingParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(ParsingParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(ParsingParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(ParsingParser.FI, 0); }
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ParsingParser.ADD, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(ParsingParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvertContext extends ExprContext {
		public TerminalNode INTCOMP() { return getToken(ParsingParser.INTCOMP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InvertContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterInvert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitInvert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitInvert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactExprContext extends ExprContext {
		public TerminalNode OPENPARENTHESES() { return getToken(ParsingParser.OPENPARENTHESES, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESES() { return getToken(ParsingParser.CLOSEPARENTHESES, 0); }
		public FactExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterFactExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitFactExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitFactExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(ParsingParser.FALSE, 0); }
		public FalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ParsingParser.EQUAL, 0); }
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectCallContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ParsingParser.DOT, 0); }
		public TerminalNode ID() { return getToken(ParsingParser.ID, 0); }
		public TerminalNode OPENPARENTHESES() { return getToken(ParsingParser.OPENPARENTHESES, 0); }
		public TerminalNode CLOSEPARENTHESES() { return getToken(ParsingParser.CLOSEPARENTHESES, 0); }
		public TerminalNode AT() { return getToken(ParsingParser.AT, 0); }
		public TerminalNode TYPE() { return getToken(ParsingParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParsingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParsingParser.COMMA, i);
		}
		public ObjectCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterObjectCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitObjectCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitObjectCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(ParsingParser.TRUE, 0); }
		public TrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(ParsingParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ParsingParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsingListener ) ((ParsingListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsingVisitor ) return ((ParsingVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66);
				match(ID);
				setState(67);
				match(ASSIGN);
				setState(68);
				expr(25);
				}
				break;
			case 2:
				{
				_localctx = new StaticCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(ID);
				setState(70);
				match(OPENPARENTHESES);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACE) | (1L << OPENPARENTHESES) | (1L << INTCOMP) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << IF) | (1L << WHILE) | (1L << CASE) | (1L << LET) | (1L << ISVOID) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(71);
					expr(0);
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(72);
						match(COMMA);
						setState(73);
						expr(0);
						}
						}
						setState(78);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(81);
				match(CLOSEPARENTHESES);
				}
				break;
			case 3:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(IF);
				setState(83);
				expr(0);
				setState(84);
				match(THEN);
				setState(85);
				expr(0);
				setState(86);
				match(ELSE);
				setState(87);
				expr(0);
				setState(88);
				match(FI);
				}
				break;
			case 4:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(WHILE);
				setState(91);
				expr(0);
				setState(92);
				match(LOOP);
				setState(93);
				expr(0);
				setState(94);
				match(POOL);
				}
				break;
			case 5:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(OPENBRACE);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					expr(0);
					setState(98);
					match(SEMICOLON);
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACE) | (1L << OPENPARENTHESES) | (1L << INTCOMP) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << IF) | (1L << WHILE) | (1L << CASE) | (1L << LET) | (1L << ISVOID) | (1L << ID) | (1L << NUM))) != 0) );
				setState(104);
				match(CLOSEBRACE);
				}
				break;
			case 6:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(LET);
				setState(107);
				match(ID);
				setState(108);
				match(COLON);
				setState(109);
				match(TYPE);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(110);
					match(ASSIGN);
					setState(111);
					expr(0);
					}
				}

				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(114);
					match(COMMA);
					setState(115);
					match(ID);
					setState(116);
					match(COLON);
					setState(117);
					match(TYPE);
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(118);
						match(ASSIGN);
						setState(119);
						expr(0);
						}
					}

					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(IN);
				setState(128);
				expr(19);
				}
				break;
			case 7:
				{
				_localctx = new SwitchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(CASE);
				setState(130);
				expr(0);
				setState(131);
				match(OF);
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					match(ID);
					setState(133);
					match(COLON);
					setState(134);
					match(TYPE);
					setState(135);
					match(CASEASSIGN);
					setState(136);
					expr(0);
					setState(137);
					match(SEMICOLON);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(143);
				match(ESAC);
				}
				break;
			case 8:
				{
				_localctx = new NewObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(NEW);
				setState(146);
				match(TYPE);
				}
				break;
			case 9:
				{
				_localctx = new VoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(ISVOID);
				setState(148);
				expr(16);
				}
				break;
			case 10:
				{
				_localctx = new InvertContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(INTCOMP);
				setState(150);
				expr(11);
				}
				break;
			case 11:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(NOT);
				setState(152);
				expr(7);
				}
				break;
			case 12:
				{
				_localctx = new FactExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(OPENPARENTHESES);
				setState(154);
				expr(0);
				setState(155);
				match(CLOSEPARENTHESES);
				}
				break;
			case 13:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(STRING);
				}
				break;
			case 14:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(NUM);
				}
				break;
			case 15:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(ID);
				}
				break;
			case 16:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(TRUE);
				}
				break;
			case 17:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(165);
						match(MUL);
						setState(166);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(168);
						match(DIV);
						setState(169);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(171);
						match(ADD);
						setState(172);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(174);
						match(SUB);
						setState(175);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new LtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(177);
						match(LT);
						setState(178);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new LteqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(180);
						match(LTEQ);
						setState(181);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(183);
						match(EQUAL);
						setState(184);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ObjectCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(188);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(186);
							match(AT);
							setState(187);
							match(TYPE);
							}
						}

						setState(190);
						match(DOT);
						setState(191);
						match(ID);
						setState(192);
						match(OPENPARENTHESES);
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACE) | (1L << OPENPARENTHESES) | (1L << INTCOMP) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << IF) | (1L << WHILE) | (1L << CASE) | (1L << LET) | (1L << ISVOID) | (1L << ID) | (1L << NUM))) != 0)) {
							{
							setState(193);
							expr(0);
							setState(198);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(194);
								match(COMMA);
								setState(195);
								expr(0);
								}
								}
								setState(200);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(203);
						match(CLOSEPARENTHESES);
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00d4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3"+
		"\3\3\3\5\3\26\n\3\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\5\4.\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\5\4>\n\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\5\6R\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\6\6g\n\6\r\6\16\6h\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u008e\n\6\r\6\16\6\u008f\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00a5\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bf\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u00c7\n\6\f\6\16\6\u00ca\13\6\5\6\u00cc\n\6\3\6\7\6\u00cf"+
		"\n\6\f\6\16\6\u00d2\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2\2\u00f7\2\r\3\2\2\2"+
		"\4\21\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\n\u00a4\3\2\2\2\f\16\5\4\3\2\r\f\3"+
		"\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\7\3"+
		"\2\2\22\25\7\5\2\2\23\24\7\4\2\2\24\26\7\5\2\2\25\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\27\3\2\2\2\27\35\7\7\2\2\30\31\5\6\4\2\31\32\7\6\2\2\32\34\3\2"+
		"\2\2\33\30\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2"+
		"\2\37\35\3\2\2\2 !\7\b\2\2!\"\7\6\2\2\"\5\3\2\2\2#$\7+\2\2$-\7\13\2\2"+
		"%*\5\b\5\2&\'\7\n\2\2\')\5\b\5\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2"+
		"\2+.\3\2\2\2,*\3\2\2\2-%\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\f\2\2\60\61"+
		"\7\t\2\2\61\62\7\5\2\2\62\63\7\7\2\2\63\64\5\n\6\2\64\65\7\b\2\2\65>\3"+
		"\2\2\2\66\67\7+\2\2\678\7\t\2\28;\7\5\2\29:\7\30\2\2:<\5\n\6\2;9\3\2\2"+
		"\2;<\3\2\2\2<>\3\2\2\2=#\3\2\2\2=\66\3\2\2\2>\7\3\2\2\2?@\7+\2\2@A\7\t"+
		"\2\2AB\7\5\2\2B\t\3\2\2\2CD\b\6\1\2DE\7+\2\2EF\7\30\2\2F\u00a5\5\n\6\33"+
		"GH\7+\2\2HQ\7\13\2\2IN\5\n\6\2JK\7\n\2\2KM\5\n\6\2LJ\3\2\2\2MP\3\2\2\2"+
		"NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QI\3\2\2\2QR\3\2\2\2RS\3\2\2\2"+
		"S\u00a5\7\f\2\2TU\7\35\2\2UV\5\n\6\2VW\7\36\2\2WX\5\n\6\2XY\7\37\2\2Y"+
		"Z\5\n\6\2Z[\7 \2\2[\u00a5\3\2\2\2\\]\7!\2\2]^\5\n\6\2^_\7\"\2\2_`\5\n"+
		"\6\2`a\7#\2\2a\u00a5\3\2\2\2bf\7\7\2\2cd\5\n\6\2de\7\6\2\2eg\3\2\2\2f"+
		"c\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\b\2\2k\u00a5\3\2"+
		"\2\2lm\7\'\2\2mn\7+\2\2no\7\t\2\2or\7\5\2\2pq\7\30\2\2qs\5\n\6\2rp\3\2"+
		"\2\2rs\3\2\2\2s~\3\2\2\2tu\7\n\2\2uv\7+\2\2vw\7\t\2\2wz\7\5\2\2xy\7\30"+
		"\2\2y{\5\n\6\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|t\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7"+
		"(\2\2\u0082\u00a5\5\n\6\25\u0083\u0084\7$\2\2\u0084\u0085\5\n\6\2\u0085"+
		"\u008d\7%\2\2\u0086\u0087\7+\2\2\u0087\u0088\7\t\2\2\u0088\u0089\7\5\2"+
		"\2\u0089\u008a\7)\2\2\u008a\u008b\5\n\6\2\u008b\u008c\7\6\2\2\u008c\u008e"+
		"\3\2\2\2\u008d\u0086\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7&\2\2\u0092\u00a5\3\2"+
		"\2\2\u0093\u0094\7\20\2\2\u0094\u00a5\7\5\2\2\u0095\u0096\7*\2\2\u0096"+
		"\u00a5\5\n\6\22\u0097\u0098\7\17\2\2\u0098\u00a5\5\n\6\r\u0099\u009a\7"+
		"\31\2\2\u009a\u00a5\5\n\6\t\u009b\u009c\7\13\2\2\u009c\u009d\5\n\6\2\u009d"+
		"\u009e\7\f\2\2\u009e\u00a5\3\2\2\2\u009f\u00a5\7\34\2\2\u00a0\u00a5\7"+
		",\2\2\u00a1\u00a5\7+\2\2\u00a2\u00a5\7\32\2\2\u00a3\u00a5\7\33\2\2\u00a4"+
		"C\3\2\2\2\u00a4G\3\2\2\2\u00a4T\3\2\2\2\u00a4\\\3\2\2\2\u00a4b\3\2\2\2"+
		"\u00a4l\3\2\2\2\u00a4\u0083\3\2\2\2\u00a4\u0093\3\2\2\2\u00a4\u0095\3"+
		"\2\2\2\u00a4\u0097\3\2\2\2\u00a4\u0099\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4"+
		"\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00d0\3\2\2\2\u00a6\u00a7\f\21\2\2\u00a7"+
		"\u00a8\7\23\2\2\u00a8\u00cf\5\n\6\22\u00a9\u00aa\f\20\2\2\u00aa\u00ab"+
		"\7\24\2\2\u00ab\u00cf\5\n\6\21\u00ac\u00ad\f\17\2\2\u00ad\u00ae\7\21\2"+
		"\2\u00ae\u00cf\5\n\6\20\u00af\u00b0\f\16\2\2\u00b0\u00b1\7\22\2\2\u00b1"+
		"\u00cf\5\n\6\17\u00b2\u00b3\f\f\2\2\u00b3\u00b4\7\26\2\2\u00b4\u00cf\5"+
		"\n\6\r\u00b5\u00b6\f\13\2\2\u00b6\u00b7\7\27\2\2\u00b7\u00cf\5\n\6\f\u00b8"+
		"\u00b9\f\n\2\2\u00b9\u00ba\7\25\2\2\u00ba\u00cf\5\n\6\13\u00bb\u00be\f"+
		"\32\2\2\u00bc\u00bd\7\16\2\2\u00bd\u00bf\7\5\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\r\2\2\u00c1\u00c2\7+"+
		"\2\2\u00c2\u00cb\7\13\2\2\u00c3\u00c8\5\n\6\2\u00c4\u00c5\7\n\2\2\u00c5"+
		"\u00c7\5\n\6\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00c3\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\7\f"+
		"\2\2\u00ce\u00a6\3\2\2\2\u00ce\u00a9\3\2\2\2\u00ce\u00ac\3\2\2\2\u00ce"+
		"\u00af\3\2\2\2\u00ce\u00b2\3\2\2\2\u00ce\u00b5\3\2\2\2\u00ce\u00b8\3\2"+
		"\2\2\u00ce\u00bb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\13\3\2\2\2\u00d2\u00d0\3\2\2\2\26\17\25\35*-;=NQ"+
		"hrz~\u008f\u00a4\u00be\u00c8\u00cb\u00ce\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}