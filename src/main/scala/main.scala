package org.lambda.flang

import grammar.{FlangLexer, FlangParser}

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}

@main
def main(): Unit =
  val charStream = CharStreams.fromString("(minus (plus 1 2) 3)")
  val lexer = FlangLexer(charStream)
  val tokenStream = CommonTokenStream(lexer)
  tokenStream.fill();

  println(tokenStream.getTokens)

  val parser = FlangParser(tokenStream)

  println(parser.program().toStringTree)

  println("Hello world!")
