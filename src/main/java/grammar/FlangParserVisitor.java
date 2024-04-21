// Generated from src/main/java/grammar/FlangParser.g4 by ANTLR 4.13.1

   package org.lambda.flang.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FlangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(FlangParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#boolean_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_const(FlangParser.Boolean_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FlangParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#special_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_form(FlangParser.Special_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#atoms_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtoms_list(FlangParser.Atoms_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#prog_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_context(FlangParser.Prog_contextContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(FlangParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(FlangParser.QuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#quote_short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote_short(FlangParser.Quote_shortContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#setq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetq(FlangParser.SetqContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(FlangParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(FlangParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(FlangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(FlangParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(FlangParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(FlangParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(FlangParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlangParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FlangParser.ListContext ctx);
}