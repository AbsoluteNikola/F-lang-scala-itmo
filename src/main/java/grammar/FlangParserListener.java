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
	 * Enter a parse tree produced by {@link FlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FlangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FlangParser.ExpressionContext ctx);
}