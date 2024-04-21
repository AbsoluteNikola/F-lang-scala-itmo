package org.lambda.flang
package interpreter

import scala.collection.mutable.{Map => MuttableMap}

class Env {
  private val context: MuttableMap[String, Ast] = Env.defaultEnv
  def get(name: String): Option[Ast] = context.get(name)
  def set(name: String, ast: Ast): Unit = context.put(name, ast)
  def withTerms[A](terms: List[(String, Ast)], f: Env => A): A =
    val oldValues: MuttableMap[String, Ast] = MuttableMap()
    terms.foreach(
      (name, value) => if context.contains(name) then oldValues.put(name, context(name))
    )
    terms.foreach(
      (name, value) => context.put(name, value)
    )
    try
      val result = f(this)
      result
    finally
      oldValues.foreach((name, value) => context.put(name, value))
}

object Env:
  private def defaultEnv: MuttableMap[String, Ast] = MuttableMap(
    "plus" -> StdFunction("plus", std.plus),
    "times" -> StdFunction("times", std.times),
    "head" -> StdFunction("head", std.head),
    "tail" -> StdFunction("tail", std.tail),
    "cons" -> StdFunction("cons", std.cons),
    "eval" -> StdFunction("eval", std.cons),
    "isint"  -> StdFunction("isint",  std.isInt),
    "isReal" -> StdFunction("isReal", std.isReal),
    "isbool" -> StdFunction("isbool", std.isBool),
    "isnull" -> StdFunction("isnull", std.isNull),
    "isatom" -> StdFunction("isatom", std.isAtom),
    "islist" -> StdFunction("islist", std.isList),
    "print" -> StdFunction("print", std.isList),
  )
