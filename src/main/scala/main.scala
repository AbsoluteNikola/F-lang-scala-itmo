package org.lambda.flang

import grammar.FlangLexer
import grammar.FlangParser
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}

@main
def main(): Unit =
  val charStream = CharStreams.fromFileName("lisp_examples/roots.f")
  val lexer = FlangLexer(charStream)
  val tokenStream = CommonTokenStream(lexer)
  val rules = FlangLexer.ruleNames
  val parser = FlangParser(tokenStream)
  println(parser.program().toStringTree(parser))