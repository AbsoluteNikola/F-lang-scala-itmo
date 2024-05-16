package org.lambda.flang

import grammar.FlangLexer
import grammar.FlangParser

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import semantic.checkShadowing

import interpreter.FlangException

def runParser(fileName: String): FlangParser =
  val charStream = CharStreams.fromFileName(fileName)
  val lexer = FlangLexer(charStream)
  val tokenStream = CommonTokenStream(lexer)
  tokenStream.fill()
  println(tokenStream.getTokens)
  FlangParser(tokenStream)

@main
def main(): Unit =
  val parser = runParser("lisp_examples/closure.f")
  val ast = Ast.fromAntlr(parser)
  if parser.getNumberOfSyntaxErrors > 0
    then
      println("Parser failed")
      sys.exit(1)
  val shadowing = semantic.checkShadowing(ast)
  println("Variables shadowing check:")
  shadowing.foreach(println)

  val notDeclaredWarnings = semantic.checkForNotDeclared(ast)
  println("\nAtoms are not declared check:")
  notDeclaredWarnings.foreach(println)

  val unusedWarnings = semantic.checkForUnused(ast)
  println("\nDeclared but unused atoms check:")
  unusedWarnings.foreach(println)

  println("\nRunning interpreter")
  try {
    val res = interpreter.run(ast)
    println(s"Result: $res")
  } catch
    case e: FlangException => println(s"Error: $e")
    case e: Exception => println(s"Interpreter internal error: $e")
