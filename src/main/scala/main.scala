package org.lambda.flang

import grammar.{FlangLexer, FlangParser}
import collection.mutable.*
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream, CommonToken}

@main
def main(): Unit =
  val charStream = CharStreams.fromFileName("lisp_examples/math.f")
  val lexer = FlangLexer(charStream)
  val tokenStream = CommonTokenStream(lexer)
  val rules = FlangLexer.ruleNames
  tokenStream.fill();
  println(rules.mkString("Array(", ", ", ")"))
  tokenStream.getTokens.forEach(
    t => if t.getType != -1
            then println(s"${rules.apply(t.getType - 1)} ${t.getText} ${t.getLine}:${t.getCharPositionInLine} ${t.getType}}")
            else println("EOF")
      )
