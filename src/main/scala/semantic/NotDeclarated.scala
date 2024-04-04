package org.lambda.flang
package semantic
import scala.collection.mutable.{Map => MuttableMap}

final case class AtomNotDeclaratedWarning(unexpected: Atom) extends Warning {
  override def toString: String =
    s"Atom '${unexpected.value}' from ${unexpected.position.line}:${unexpected.position.positionInLine + 1}" +
    s" is not declarated."
}

def checkForNotDeclarated(ast: Ast): List[AtomNotDeclaratedWarning] =
  traverse2(MuttableMap.empty, ast)

private def traverse2(context: MuttableMap[String, Ast], ast: Ast): List[AtomNotDeclaratedWarning] = ast match
  case _: BooleanConst => List.empty
  case _: NullConst => List.empty
  case _: IntegerConst => List.empty
  case _: RealConst => List.empty
  case atom: Atom => checkAtomDeclaration(context, atom) match
    case Some(warning) => List(warning)
    case _ => List.empty
  case _: Break => List.empty
  case program: Program => program.elements.flatMap(traverse2(context, _))
  case list: FList =>
    val ctxCopy = context.clone()
    list.elements.flatMap(traverse2(ctxCopy, _))
  case quoted: Quoted =>
    traverse2(context, quoted.node)
  case cond: Cond =>
    traverse2(context, cond.pred) ++
    traverse2(context, cond.`then`) ++
    cond.`else`.toList.flatMap(traverse2(context, _))
  case fWhile: While =>
    traverse2(context, fWhile.pred) ++ traverse2(context, fWhile.body)
  case fReturn: Return => traverse2(context, fReturn.element)
  case setq: Setq =>
    context.put(setq.name.value, setq.name)
    traverse2(context, setq.value)
  case func: Func =>
    context.put(func.name, func)
    val ctxCopy = context.clone()
    func.args.foreach(x => ctxCopy.put(x.value, x))
    traverse2(ctxCopy, func.body)
  case lambda: Lambda =>
    val ctxCopy = context.clone()
    lambda.args.foreach(a => ctxCopy.put(a.value, a))
    traverse2(ctxCopy, lambda.body)
  case prog: Prog =>
    val ctxCopy = context.clone()
    prog.context.foreach(v => ctxCopy.put(v._1.value, v._1))
    traverse2(ctxCopy, prog.body)


val defaultAtoms = Set("plus", "minus", "equal", "head", "tail", "cons", "isnull", "not", "less", "greater", "times",
  "divide", "sqrt", "print", "nil")
private def checkAtomDeclaration(context: MuttableMap[String, Ast], atom: Atom): Option[AtomNotDeclaratedWarning] =
  context.get(atom.value) match
    case Some(value) => None
    case None =>
      if defaultAtoms.contains(atom.value) then
        None
      else
        Some(AtomNotDeclaratedWarning(atom))
