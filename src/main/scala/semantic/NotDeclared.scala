package org.lambda.flang
package semantic

import interpreter.Env

import scala.collection.mutable.Map as MuttableMap

final case class AtomNotDeclaredWarning(unexpected: Atom) extends Warning:
  override def toString: String =
    s"Atom '${unexpected.value}' from ${unexpected.position}" +
      s" is not declared."

def checkForNotDeclared(ast: Ast): List[AtomNotDeclaredWarning] =
  traverse_nd(MuttableMap.empty, ast)

private def traverse_nd(context: MuttableMap[String, Ast], ast: Ast): List[AtomNotDeclaredWarning] = ast match
  case _: FBoolean => List.empty
  case _: Null => List.empty
  case _: Integer => List.empty
  case _: Real => List.empty
  case atom: Atom => checkAtomDeclaration(context, atom) match
    case Some(warning) => List(warning)
    case _ => List.empty
  case _: Break => List.empty
  case program: Program => program.elements.flatMap(traverse_nd(context, _))
  case list: FList =>
    val ctxCopy = context.clone()
    list.elements.flatMap(traverse_nd(ctxCopy, _))
  case quoted: Quoted =>
    traverse_nd(context, quoted.node)
  case cond: Cond =>
    traverse_nd(context, cond.pred) ++
      traverse_nd(context, cond.`then`) ++
      cond.`else`.toList.flatMap(traverse_nd(context, _))
  case fWhile: While =>
    traverse_nd(context, fWhile.pred) ++ traverse_nd(context, fWhile.body)
  case fReturn: Return => traverse_nd(context, fReturn.element)
  case setq: Setq =>
    context.put(setq.name.value, setq.name)
    traverse_nd(context, setq.value)
  case func: Func =>
    context.put(func.name, func)
    val ctxCopy = context.clone()
    func.args.foreach(x => ctxCopy.put(x.value, x))
    traverse_nd(ctxCopy, func.body)
  case lambda: Lambda =>
    val ctxCopy = context.clone()
    lambda.args.foreach(a => ctxCopy.put(a.value, a))
    traverse_nd(ctxCopy, lambda.body)
  case prog: Prog =>
    val ctxCopy = context.clone()
    prog.context.foreach(v => ctxCopy.put(v._1.value, v._1))
    traverse_nd(ctxCopy, prog.body)
  case d: Do =>
    d.statements.flatMap(traverse_nd(context, _))

private def checkAtomDeclaration(context: MuttableMap[String, Ast], atom: Atom): Option[AtomNotDeclaredWarning] =
  context.get(atom.value) match
    case Some(value) => None
    case None =>
      if Env.defaultAtoms.contains(atom.value) then
        None
      else
        Some(AtomNotDeclaredWarning(atom))
