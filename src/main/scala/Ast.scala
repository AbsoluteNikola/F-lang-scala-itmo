package org.lambda.flang

import grammar.FlangParser.{ATOM, ElementContext}
import grammar.{FlangParser, FlangParserVisitor}

import org.antlr.v4.runtime.{ParserRuleContext, Token}
import org.antlr.v4.runtime.tree.{ErrorNode, ParseTree, RuleNode, TerminalNode}

import scala.collection.immutable as c
import scala.jdk.CollectionConverters.*

case class Position(line: Int, positionInLine: Int)
sealed trait Ast(ctx: ParserRuleContext) {
  def position: Position = Position(ctx.start.getLine, ctx.start.getCharPositionInLine)
}

final case class Program(elements: List[Ast], ctx: ParserRuleContext) extends Ast(ctx)
final case class FList(elements: List[Ast], ctx: ParserRuleContext) extends Ast(ctx)
final case class BooleanConst(value: Boolean, ctx: ParserRuleContext) extends Ast(ctx)
final case class NullConst(ctx: ParserRuleContext) extends Ast(ctx)
final case class IntegerConst(value: Int, ctx: ParserRuleContext) extends Ast(ctx)
final case class RealConst(value: Double, ctx: ParserRuleContext) extends Ast(ctx)
final case class Quoted(node: Ast, ctx: ParserRuleContext) extends Ast(ctx)
final case class Atom(value: String, ctx: ParserRuleContext) extends Ast(ctx)
final case class Setq(name: Atom, value: Ast, ctx: ParserRuleContext) extends Ast(ctx)
final case class Func(name: String, args: List[Atom], body: Ast, ctx: ParserRuleContext) extends Ast(ctx)
final case class Lambda(args: List[Atom], body: Ast, ctx: ParserRuleContext) extends Ast(ctx)
final case class Prog(
   context: List[(Atom, Ast)], // list of new variables that will be appeared in body
   body: Ast,
   ctx: ParserRuleContext) extends Ast(ctx)
final case class Cond(pred: Ast, `then`: Ast, `else`: Option[Ast], ctx: ParserRuleContext) extends Ast(ctx)
final case class While(pred: Ast, body: Ast, ctx: ParserRuleContext) extends Ast(ctx)
final case class Return(element: Ast, ctx: ParserRuleContext) extends Ast(ctx)
final case class Break(ctx: ParserRuleContext) extends Ast(ctx)

object Ast:
  def fromAntlr(flangParser: FlangParser): Ast = flangParser.program().accept(AntlrAstVisitor())

  private class AntlrAstVisitor extends FlangParserVisitor[Ast]:
    override def visit(tree: ParseTree): Ast = ???
    override def visitChildren(node: RuleNode): Ast = ???
    override def visitTerminal(node: TerminalNode): Ast = ???
    override def visitErrorNode(node: ErrorNode): Ast = ???

    override def visitProgram(ctx: FlangParser.ProgramContext): Ast =
      val decls = ctx.element().asScala.map(_.accept(this)).toList
      Program(decls, ctx)

    override def visitAtom(ctx: FlangParser.AtomContext): Ast = 
      Atom(ctx.ATOM().getText, ctx)
      
    override def visitElement(ctx: FlangParser.ElementContext): Ast =
      if ctx.atom() != null
        then ctx.atom().accept(this)
      else if ctx.list() != null
        then ctx.list().accept(this)
      else if ctx.special_form() != null
        then ctx.special_form().accept(this)
      else if ctx.literal() != null
        then ctx.literal().accept(this)
      else if ctx.quote_short() != null
        then ctx.quote_short().accept(this)
      else
        throw RuntimeException("Unexpected element type, should be impossible")

    override def visitBoolean_const(ctx: FlangParser.Boolean_constContext): Ast =
      if ctx.TRUE() != null
        then BooleanConst(true, ctx)
        else BooleanConst(false, ctx)

    override def visitLiteral(ctx: FlangParser.LiteralContext): Ast =
      if ctx.NULL() != null then NullConst(ctx)
      else if ctx.REAL() != null then RealConst(value = ctx.REAL().getText.toDouble, ctx)
      else if ctx.INTEGER() != null then IntegerConst(value = ctx.INTEGER().getText.toInt, ctx)
      else if ctx.boolean_const() != null then ctx.boolean_const().accept(this)
      else throw RuntimeException("Unexpected literal, should be impossible")

    override def visitQuote(ctx: FlangParser.QuoteContext): Ast =
      Quoted(ctx.element().accept(this), ctx)

    override def visitSetq(ctx: FlangParser.SetqContext): Ast =
      val varName = ctx.atom().accept(this).asInstanceOf[Atom]
      val value = ctx.element().accept(this)
      Setq(name = varName, value = value, ctx)

    override def visitFunc(ctx: FlangParser.FuncContext): Ast =
      val funcName = ctx.atom().ATOM().getText
      val args = visitAtomsListCustom(ctx.atoms_list())
      val body = ctx.element().accept(this)
      Func(name = funcName, args = args, body = body, ctx)

    override def visitLambda(ctx: FlangParser.LambdaContext): Ast =
      val args = visitAtomsListCustom(ctx.atoms_list())
      val body = ctx.element().accept(this)
      Lambda(args = args, body = body, ctx)

    override def visitProg(ctx: FlangParser.ProgContext): Ast =
      val progContext = visitProgContextCustom(ctx.prog_context())
      val body = ctx.element().accept(this)
      Prog(context = progContext, body = body, ctx)

    override def visitCond(ctx: FlangParser.CondContext): Ast =
      val pred = ctx.element(0).accept(this)
      val `then` = ctx.element(1).accept(this)
      val `else` = ctx.element().asScala.toList.lift(2).map(_.accept(this))
      Cond(pred, `then`, `else`, ctx)

    override def visitWhile(ctx: FlangParser.WhileContext): Ast =
      val pred = ctx.element(0).accept(this)
      val body = ctx.element(1).accept(this)
      While(pred, body, ctx)

    override def visitReturn(ctx: FlangParser.ReturnContext): Ast =
      Return(ctx.element().accept(this), ctx)

    override def visitList(ctx: FlangParser.ListContext): Ast =
      val elements = ctx.element().asScala.map(_.accept(this)).toList
      FList(elements, ctx)

    override def visitSpecial_form(ctx: FlangParser.Special_formContext): Ast =
      ctx.children.get(0).accept(this);

    override def visitQuote_short(ctx: FlangParser.Quote_shortContext): Ast =
      Quoted(ctx.element().accept(this), ctx)

    override def visitAtoms_list(ctx: FlangParser.Atoms_listContext): Ast =
      throw RuntimeException("Use custom visitAtomsListCustom instead")

    def visitAtomsListCustom(ctx: FlangParser.Atoms_listContext): List[Atom] =
      ctx.atom().asScala.map(_.accept(this).asInstanceOf[Atom]).toList

    override def visitProg_context(ctx: FlangParser.Prog_contextContext): Ast =
      throw RuntimeException("Use custom visitProgContextCustom instead")

    private def visitProgContextCustom(ctx: FlangParser.Prog_contextContext): List[(Atom, Ast)] =
      val atoms = ctx.atom().asScala.map(_.accept(this).asInstanceOf[Atom]).toList
      val values = ctx.element().asScala.map(_.accept(this)).toList
      atoms.zip(values)

    override def visitBreak(ctx: FlangParser.BreakContext): Ast = Break(ctx)