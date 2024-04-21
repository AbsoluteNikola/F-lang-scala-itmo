package org.lambda.flang
package interpreter

import org.lambda.flang.StdFunction

import scala.annotation.internal.Body

def run(ast: Ast): Ast = eval(ast, Env())

private def eval(evalNode: Ast, env: Env): Ast = evalNode match
  case x: FBoolean => x
  case x: Null => x
  case x: Integer => x
  case x: Real => x
  case x: Atom =>
    env.get(x.value).getOrElse(throw NoSuchAtom(x.value))
  case x: Break => throw BreakException()
  case program: Program =>
    var result: Option[Ast] = None
    program.elements.foreach {
      case f: Func => env.set(f.name, f)
      case _ => ()
    }
    program.elements.foreach(node => result = Some(eval(node, env)))
    result.getOrElse(throw NothingToExecute())
  case list: FList =>
    if list.elements.isEmpty
      then list
    else if list.elements.length == 1
      then eval(list.elements.head, env)
    else
      val func = eval(list.elements.head, env)
      val args = list.elements.tail.map(eval(_, env))
      func match
        case f: StdFunction => f.evaluator(args)
        case f: Lambda => ???
        case f: Func => ???
        case n => throw NotAFunction(n)
  case quoted: Quoted => quoted.node
  case cond: Cond => ???
  case fWhile: While => ???
  case fReturn: Return =>
    val res = eval(fReturn.element, env)
    throw ReturnException(res)
  case setq: Setq =>
    val v = eval(setq.value, env)
    env.set(setq.name.value, v)
    Null(None)

  case func: Func => func
  case lambda: Lambda => lambda
  case prog: Prog =>
    env.withTerms(
      terms = prog.context.map((name, node) => (name.value, eval(node, env))),
      f = eval.curried(prog.body)
    )

private def applyFunction(argsName: List[Atom], args: List[Atom], body: Body) = ???