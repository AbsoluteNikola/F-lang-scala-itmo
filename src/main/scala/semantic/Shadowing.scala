package org.lambda.flang
package semantic
import org.antlr.v4.runtime.{ParserRuleContext, Token}
import scala.collection.mutable.{Map => MuttableMap }

final case class ShadowingWarning(name: String, oldVarStartPos: Token, newVarStartPos: Token) {
  override def toString: String = s"Variable '$name' from ${oldVarStartPos.getLine}:${oldVarStartPos.getCharPositionInLine + 1}" +
    s" was shadowed by new variable at ${newVarStartPos.getLine}:${newVarStartPos.getCharPositionInLine + 1}"
}

def checkShadowing(ast: Ast): List[ShadowingWarning] = traverse(MuttableMap.empty, ast)

private def traverse(context: MuttableMap[String, ParserRuleContext], ast: Ast): List[ShadowingWarning] = ast match
  case n: Program => n.elements.flatMap(traverse(context, _))
  case n: FList => n.elements.flatMap(traverse(context, _))
  case n: BooleanConst => List.empty
  case n: NullConst => List.empty
  case n: IntegerConst => List.empty
  case n: RealConst => List.empty
  case n: Quoted => traverse(context, n.node)
  case n: Atom => List.empty
  case n: Cond =>
    traverse(context, n.pred) ++
    traverse(context, n.`then`) ++
    n.`else`.toList.flatMap(traverse(context, _))
  case n: While =>
    traverse(context, n.pred) ++ traverse(context, n.body)
  case n: Return => traverse(context, n.element)
  case n: Break => List.empty
  case n: Setq =>
    val otherWarnings = traverse(context, n.value)
    context.put(n.name.value, n.ctx)
    otherWarnings
  case n: Func =>
    val ctxCopy = context.clone()
    ctxCopy.put(n.name, n.ctx)
    val argsShadowing = n.args.map(checkVarShadowing(ctxCopy, _)).flatMap(_.toList)
    n.args.foreach(a => ctxCopy.put(a.value, a.ctx))
    argsShadowing ++ traverse(ctxCopy, n.body)
  case n: Lambda =>
    val ctxCopy = context.clone()
    val argsShadowing = n.args.map(checkVarShadowing(ctxCopy, _)).flatMap(_.toList)
    n.args.foreach(a => ctxCopy.put(a.value, a.ctx))
    argsShadowing ++ traverse(ctxCopy, n.body)
  case n: Prog =>
    val ctxCopy = context.clone()
    val argsShadowing = n.context.map(v => checkVarShadowing(ctxCopy, v._1)).flatMap(_.toList)
    n.context.foreach(v => ctxCopy.put(v._1.value, v._1.ctx))
    argsShadowing ++ traverse(ctxCopy, n.body)

private def checkVarShadowing(context: MuttableMap[String, ParserRuleContext], name: Atom): Option[ShadowingWarning] =
  context.get(name.value) match
    case Some(oldVar) => Some(ShadowingWarning(name.value, oldVarStartPos = oldVar.start, newVarStartPos = name.ctx.start))
    case None => None
