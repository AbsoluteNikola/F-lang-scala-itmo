package org.lambda.flang
package semantic
import scala.collection.mutable.{Map => MuttableMap}

trait Warning

final case class ShadowingWarning(oldValue: Ast, newValue: Atom) extends Warning:
  override def toString: String =
    s"Variable '${newValue.value}' from ${oldValue.position}" +
    s" was shadowed by new variable at ${newValue.position}"

def checkShadowing(ast: Ast): List[ShadowingWarning] = traverse(MuttableMap.empty, ast)

private def traverse(context: MuttableMap[String, Ast], ast: Ast): List[ShadowingWarning] = ast match
  case _: FBoolean => List.empty
  case _: Null => List.empty
  case _: Integer => List.empty
  case _: Real => List.empty
  case _: Atom => List.empty
  case _: Break => List.empty
  case program: Program => program.elements.flatMap(traverse(context, _))
  case list: FList => list.elements.flatMap(traverse(context, _))
  case quoted: Quoted => traverse(context, quoted.node)
  case cond: Cond =>
    traverse(context, cond.pred) ++
    traverse(context, cond.`then`) ++
    cond.`else`.toList.flatMap(traverse(context, _))
  case fWhile: While =>
    traverse(context, fWhile.pred) ++ traverse(context, fWhile.body)
  case fReturn: Return => traverse(context, fReturn.element)
  case d: Do =>
    val ctxCopy = context.clone()
    d.statements.flatMap(traverse(ctxCopy, _))
  case setq: Setq =>
    val otherWarnings = traverse(context, setq.value)
    context.put(setq.name.value, setq)
    otherWarnings
  case func: Func =>
    val ctxCopy = context.clone()
    ctxCopy.put(func.name, func)
    val argsShadowing = func.args.map(checkVarShadowing(ctxCopy, _)).flatMap(_.toList)
    func.args.foreach(a => ctxCopy.put(a.value, a))
    argsShadowing ++ traverse(ctxCopy, func.body)
  case lambda: Lambda =>
    val ctxCopy = context.clone()
    val argsShadowing = lambda.args.map(checkVarShadowing(ctxCopy, _)).flatMap(_.toList)
    lambda.args.foreach(a => ctxCopy.put(a.value, a))
    argsShadowing ++ traverse(ctxCopy, lambda.body)
  case prog: Prog =>
    val ctxCopy = context.clone()
    val argsShadowing = prog.context.map(v => checkVarShadowing(ctxCopy, v._1)).flatMap(_.toList)
    prog.context.foreach(v => ctxCopy.put(v._1.value, v._1))
    argsShadowing ++ traverse(ctxCopy, prog.body)

private def checkVarShadowing(context: MuttableMap[String, Ast], newValue: Atom): Option[ShadowingWarning] =
  context.get(newValue.value) match
    case Some(oldVar) => Some(ShadowingWarning(oldVar, newValue))
    case None => None
