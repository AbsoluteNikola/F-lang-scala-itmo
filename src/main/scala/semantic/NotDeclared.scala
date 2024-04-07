package org.lambda.flang
package semantic

import scala.collection.mutable.Map as MuttableMap

val defaultAtoms = Set(
  "plus", "minus", "equal", "head", "tail", "cons", "isnull", "not", "less", "greater", "times", "divide", "sqrt",
  "print", "nil"
)

final case class AtomNotDeclaredWarning(unexpected: Atom) extends Warning:
  override def toString: String =
    s"Atom '${unexpected.value}' from ${unexpected.position.line}:${unexpected.position.positionInLine + 1}" +
      s" is not declared."

def checkForNotDeclared(ast: Ast): List[AtomNotDeclaredWarning] =
  traverse(MuttableMap.empty, ast)

private def traverse(context: MuttableMap[String, Ast], ast: Ast): List[AtomNotDeclaredWarning] = ast match
  case _: BooleanConst => List.empty
  case _: NullConst => List.empty
  case _: IntegerConst => List.empty
  case _: RealConst => List.empty
  case atom: Atom => checkAtomDeclaration(context, atom) match
    case Some(warning) => List(warning)
    case _ => List.empty
  case _: Break => List.empty
  case program: Program => program.elements.flatMap(traverse(context, _))
  case list: FList =>
    val ctxCopy = context.clone()
    list.elements.flatMap(traverse(ctxCopy, _))
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
    val ctxCopy = context.clone()
    func.args.foreach(x => ctxCopy.put(x.value, x))
    traverse(ctxCopy, func.body)
  case lambda: Lambda =>
    val ctxCopy = context.clone()
    lambda.args.foreach(a => ctxCopy.put(a.value, a))
    traverse(ctxCopy, lambda.body)
  case prog: Prog =>
    val ctxCopy = context.clone()
    prog.context.foreach(v => ctxCopy.put(v._1.value, v._1))
    traverse(ctxCopy, prog.body)

private def checkAtomDeclaration(context: MuttableMap[String, Ast], atom: Atom): Option[AtomNotDeclaredWarning] =
  context.get(atom.value) match
    case Some(value) => None
    case None =>
      if defaultAtoms.contains(atom.value) then
        None
      else
        Some(AtomNotDeclaredWarning(atom))
