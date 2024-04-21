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
    val result = f(this)
    oldValues.foreach((name, value) => context.put(name, value))
    result
}

object Env:
  private def defaultEnv: MuttableMap[String, Ast] = MuttableMap(
    "plus" -> StdFunction("plus", std.plus)
  )
