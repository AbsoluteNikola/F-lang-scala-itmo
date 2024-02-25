// Generated from src/main/java/grammar/FlangParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlangParser}.
 */
public interface FlangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FlangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FlangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(FlangParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(FlangParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#boolean_const}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_const(FlangParser.Boolean_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#boolean_const}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_const(FlangParser.Boolean_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FlangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FlangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(FlangParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(FlangParser.QuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#setq}.
	 * @param ctx the parse tree
	 */
	void enterSetq(FlangParser.SetqContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#setq}.
	 * @param ctx the parse tree
	 */
	void exitSetq(FlangParser.SetqContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(FlangParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(FlangParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(FlangParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(FlangParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(FlangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(FlangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(FlangParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(FlangParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(FlangParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(FlangParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(FlangParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(FlangParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FlangParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FlangParser.ListContext ctx);
}