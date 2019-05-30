// Generated from C:/Users/Aref/Desktop/COOL Parser/src\Parsing.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParsingParser}.
 */
public interface ParsingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code start}
	 * labeled alternative in {@link ParsingParser#program}.
	 * @param ctx the parse tree
	 */
	void enterStart(ParsingParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code start}
	 * labeled alternative in {@link ParsingParser#program}.
	 * @param ctx the parse tree
	 */
	void exitStart(ParsingParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDef}
	 * labeled alternative in {@link ParsingParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(ParsingParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDef}
	 * labeled alternative in {@link ParsingParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(ParsingParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link ParsingParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ParsingParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link ParsingParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ParsingParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link ParsingParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(ParsingParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link ParsingParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(ParsingParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param}
	 * labeled alternative in {@link ParsingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParam(ParsingParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param}
	 * labeled alternative in {@link ParsingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParam(ParsingParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(ParsingParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(ParsingParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(ParsingParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(ParsingParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(ParsingParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(ParsingParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lteq}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLteq(ParsingParser.LteqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lteq}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLteq(ParsingParser.LteqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(ParsingParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(ParsingParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticCall}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStaticCall(ParsingParser.StaticCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticCall}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStaticCall(ParsingParser.StaticCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLt(ParsingParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLt(ParsingParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ParsingParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ParsingParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switch}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(ParsingParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(ParsingParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(ParsingParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(ParsingParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(ParsingParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(ParsingParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newObject}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewObject(ParsingParser.NewObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObject}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewObject(ParsingParser.NewObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ParsingParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ParsingParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLet(ParsingParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLet(ParsingParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ParsingParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ParsingParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(ParsingParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(ParsingParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ParsingParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ParsingParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVoid(ParsingParser.VoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVoid(ParsingParser.VoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invert}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInvert(ParsingParser.InvertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invert}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInvert(ParsingParser.InvertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFactExpr(ParsingParser.FactExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFactExpr(ParsingParser.FactExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalse(ParsingParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalse(ParsingParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(ParsingParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(ParsingParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectCall}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjectCall(ParsingParser.ObjectCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectCall}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjectCall(ParsingParser.ObjectCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrue(ParsingParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrue(ParsingParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ParsingParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ParsingParser.AssignContext ctx);
}