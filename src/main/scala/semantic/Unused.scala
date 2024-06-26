package org.lambda.flang
package semantic

import scala.collection.mutable.Map as MuttableMap

final case class AtomUnusedWarning(name: String, node: Ast) extends Warning:
  override def toString: String =
    s"'$name' from ${node.position} is unused."

def checkForUnused(ast: Ast): List[AtomUnusedWarning] =
  traverse_u(MuttableMap.empty, ast)

private def traverse_u(context: MuttableMap[String, Ast], ast: Ast): List[AtomUnusedWarning] = ast match
  case _: FBoolean => List.empty
  case _: Null => List.empty
  case _: Integer => List.empty
  case _: Real => List.empty
  case atom: Atom =>
    context.remove(atom.value)
    List.empty
  case _: Break => List.empty
  case program: Program =>
    program.elements.flatMap(traverse_u(context, _))
    context.map((k, v) => AtomUnusedWarning(k, v)).toList
  case list: FList =>
    list.elements.flatMap(traverse_u(context, _))
  case quoted: Quoted =>
    traverse_u(context, quoted.node)
  case cond: Cond =>
    traverse_u(context, cond.pred) ++
      traverse_u(context, cond.`then`) ++
      cond.`else`.toList.flatMap(traverse_u(context, _))
  case fWhile: While =>
    traverse_u(context, fWhile.pred) ++ traverse_u(context, fWhile.body)
  case fReturn: Return => traverse_u(context, fReturn.element)
  case setq: Setq =>
    context.put(setq.name.value, setq.name)
    traverse_u(context, setq.value)
  case d: Do =>
    val ctxCopy = context.clone()
    d.statements.flatMap(traverse_u(ctxCopy, _))
  case func: Func =>
    context.put(func.name, func)
    func.args.foreach(x => context.put(x.value, x))
    traverse_u(context, func.body)
  case lambda: Lambda =>
    lambda.args.foreach(a => context.put(a.value, a))
    traverse_u(context, lambda.body)
  case prog: Prog =>
    prog.context.foreach(v => context.put(v._1.value, v._1))
    traverse_u(context, prog.body)
