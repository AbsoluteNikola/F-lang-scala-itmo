package org.lambda.flang
package interpreter

import scala.collection.mutable.{Map => MuttableMap}

class Env {
  private var context: MuttableMap[String, Env.Ref] = Env.defaultEnv

  override def toString: String = s"Env: ${context.toString()}"
  def get(name: String): Option[Ast] = context.get(name).map(_.get())
  def set(name: String, ast: Ast): Unit = context.get(name) match
    case Some(ref) => ref.update(ast)
    case None => context.put(name, Env.Ref(ast))

  def copy(): Env =
    val e = Env()
    e.context = this.context.clone()
    e

  def withTerms[A](terms: List[(String, Ast)], f: Env => A): A =
    val oldValues: MuttableMap[String, Env.Ref] = MuttableMap()
    terms.foreach(
      (name, value) => if context.contains(name) then oldValues.put(name, context(name))
    )
    terms.foreach(
      (name, value) => this.set(name, value)
    )
    try
      val result = f(this)
      result
    finally
      oldValues.foreach((name, value) => context.put(name, value))
}

object Env:
  private def defaultEnv: MuttableMap[String, Ref] = MuttableMap(
    "plus" -> Ref(StdFunction("plus", std.plus)),
    "times" -> Ref(StdFunction("times", std.times)),
    "head" -> Ref(StdFunction("head", std.head)),
    "tail" -> Ref(StdFunction("tail", std.tail)),
    "cons" -> Ref(StdFunction("cons", std.cons)),
    "eval" -> Ref(StdFunction("eval", std.cons)),
    "isint"  -> Ref(StdFunction("isint",  std.isInt)),
    "isreal" -> Ref(StdFunction("isReal", std.isReal)),
    "isbool" -> Ref(StdFunction("isbool", std.isBool)),
    "isnull" -> Ref(StdFunction("isnull", std.isNull)),
    "isatom" -> Ref(StdFunction("isatom", std.isAtom)),
    "islist" -> Ref(StdFunction("islist", std.isList)),
    "print" -> Ref(StdFunction("print", std.print)),
  )

  private class Ref(value: Ast):
    private var _value: Ast = value

    override def toString: String = s"Ref($_value)"
    def update(newValue: Ast): Unit = _value = newValue
    def get(): Ast = _value
    override def clone(): Ref = this

