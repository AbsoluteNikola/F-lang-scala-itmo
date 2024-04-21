package org.lambda.flang

import grammar.FlangLexer
import grammar.FlangParser
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import semantic.checkShadowing

def runParser(fileName: String): FlangParser =
  val charStream = CharStreams.fromFileName(fileName)
  val lexer = FlangLexer(charStream)
  val tokenStream = CommonTokenStream(lexer)
  FlangParser(tokenStream)

@main
def main(): Unit =
  val parser = runParser("lisp_examples/roots.f")
  val ast = Ast.fromAntlr(parser)

  val shadowing = semantic.checkShadowing(ast)
  println("Variables shadowing check:")
  shadowing.foreach(println)

  val notDeclaredWarnings = semantic.checkForNotDeclared(ast)
  println("Atoms are not declarated check:")
  notDeclaredWarnings.foreach(println)

  val unusedWarnings = semantic.checkForUnused(ast)
  println("Declared but unused atoms check:")
  unusedWarnings.foreach(println)
