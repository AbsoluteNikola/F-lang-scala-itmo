// Generated from src/main/java/grammar/FlangParser.g4 by ANTLR 4.13.1

   package org.lambda.flang.grammar;

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
	 * Enter a parse tree produced by {@link FlangParser#special_form}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_form(FlangParser.Special_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#special_form}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_form(FlangParser.Special_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#atoms_list}.
	 * @param ctx the parse tree
	 */
	void enterAtoms_list(FlangParser.Atoms_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#atoms_list}.
	 * @param ctx the parse tree
	 */
	void exitAtoms_list(FlangParser.Atoms_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#prog_context}.
	 * @param ctx the parse tree
	 */
	void enterProg_context(FlangParser.Prog_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#prog_context}.
	 * @param ctx the parse tree
	 */
	void exitProg_context(FlangParser.Prog_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(FlangParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(FlangParser.AtomContext ctx);
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
	 * Enter a parse tree produced by {@link FlangParser#quote_short}.
	 * @param ctx the parse tree
	 */
	void enterQuote_short(FlangParser.Quote_shortContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#quote_short}.
	 * @param ctx the parse tree
	 */
	void exitQuote_short(FlangParser.Quote_shortContext ctx);
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
	 * Enter a parse tree produced by {@link FlangParser#do}.
	 * @param ctx the parse tree
	 */
	void enterDo(FlangParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#do}.
	 * @param ctx the parse tree
	 */
	void exitDo(FlangParser.DoContext ctx);
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
	 * Enter a parse tree produced by {@link FlangParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(FlangParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(FlangParser.BreakContext ctx);
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