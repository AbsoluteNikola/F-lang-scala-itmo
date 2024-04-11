package org.lambda.flang
package semantic

import scala.collection.mutable.Map as MuttableMap

final case class AtomUnusedWarning(unused: Ast) extends Warning:
  override def toString: String =
    s"Object from ${unused.position.line}:${unused.position.positionInLine + 1} is unused."

def checkForUnused(ast: Ast): List[AtomUnusedWarning] =
  traverse(MuttableMap.empty, ast)

private def traverse(context: MuttableMap[String, Ast], ast: Ast): List[AtomUnusedWarning] = ast match
  case _: BooleanConst => List.empty
  case _: NullConst => List.empty
  case _: IntegerConst => List.empty
  case _: RealConst => List.empty
  case atom: Atom =>
    context.remove(atom.value)
    List.empty
  case _: Break => List.empty
  case program: Program =>
    program.elements.flatMap(traverse(context, _))
    context.map((k, v) => AtomUnusedWarning(v)).toList
  case list: FList =>
    list.elements.flatMap(traverse(context, _))
  case quoted: Quoted =>
    traverse(context, quoted.node)
  case cond: Cond =>
    traverse(context, cond.pred) ++
      traverse(context, cond.`then`) ++
      cond.`else`.toList.flatMap(traverse(context, _))
  case fWhile: While =>
    traverse(context, fWhile.pred) ++ traverse(context, fWhile.body)
  case fReturn: Return => traverse(context, fReturn.element)
  case setq: Setq =>
    context.put(setq.name.value, setq.name)
    traverse(context, setq.value)
  case func: Func =>
    context.put(func.name, func)
    func.args.foreach(x => context.put(x.value, x))
    traverse(context, func.body)
  case lambda: Lambda =>
    lambda.args.foreach(a => context.put(a.value, a))
    traverse(context, lambda.body)
  case prog: Prog =>
    prog.context.foreach(v => context.put(v._1.value, v._1))
    traverse(context, prog.body)
