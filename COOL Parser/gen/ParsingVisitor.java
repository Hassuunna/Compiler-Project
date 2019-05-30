// Generated from C:/Users/Aref/Desktop/COOL Parser/src\Parsing.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParsingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParsingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code start}
	 * labeled alternative in {@link ParsingParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ParsingParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDef}
	 * labeled alternative in {@link ParsingParser#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(ParsingParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link ParsingParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ParsingParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link ParsingParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(ParsingParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param}
	 * labeled alternative in {@link ParsingParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ParsingParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(ParsingParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ParsingParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(ParsingParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lteq}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteq(ParsingParser.LteqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(ParsingParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticCall}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticCall(ParsingParser.StaticCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(ParsingParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ParsingParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(ParsingParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ParsingParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ParsingParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObject}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(ParsingParser.NewObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParsingParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(ParsingParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ParsingParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ParsingParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ParsingParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code void}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid(ParsingParser.VoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invert}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvert(ParsingParser.InvertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactExpr(ParsingParser.FactExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(ParsingParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(ParsingParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectCall}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCall(ParsingParser.ObjectCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(ParsingParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ParsingParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ParsingParser.AssignContext ctx);
}