package org.lambda.flang

import grammar.FlangParser.{ATOM, ElementContext}
import grammar.{FlangParser, FlangParserVisitor}

import org.antlr.v4.runtime.{ParserRuleContext, Token}
import org.antlr.v4.runtime.tree.{ErrorNode, ParseTree, RuleNode, TerminalNode}

import scala.collection.immutable as c
import scala.jdk.CollectionConverters.*

sealed trait Position
final case class FilePosition(line: Int, positionInLine: Int) extends Position:
  override def toString: String = s"$line:${positionInLine + 1}}"
final case class NoPosition() extends Position:
  override def toString: String = "no position"

sealed trait Ast(ctx: Option[ParserRuleContext]) {
  def position: Position = ctx match
    case Some(c) => FilePosition(c.start.getLine, c.start.getCharPositionInLine)
    case None => NoPosition()
}

final class Program(val elements: List[Ast], ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = elements.mkString("\n\n")
final class FList(val elements: List[Ast], ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = s"(${elements.mkString(" ")})"
final class BooleanF(val value: Boolean, ctx: Option[ParserRuleContext]) extends Ast(ctx):
  override def toString: String = s"$value"
final class Null(ctx: Option[ParserRuleContext]) extends Ast(ctx):
  override def toString: String = "null"
final class Integer(val value: Int, ctx: Option[ParserRuleContext]) extends Ast(ctx):
  override def toString: String = s"$value"
final class Real(val value: Double, ctx: Option[ParserRuleContext]) extends Ast(ctx):
  override def toString: String = s"$value"
final class Quoted(val node: Ast, ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = s"'$node"
final class Atom(val value: String, ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = value
final class Setq(val name: Atom, val value: Ast, ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = s"setq $name $value"

final class Func(val name: String, val args: List[Atom], val body: Ast, ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = s"func $name (${args.mkString(" ")}) (...)"
final class Lambda(val args: List[Atom], val body: Ast, ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = s"lambda (${args.mkString(" ")}) (...)"
final class Prog(
   val context: List[(Atom, Ast)], // list of new variables that will be appeared in body
   val body: Ast,
   ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = s"prog (${context.map((name, _) => "(name ...)").mkString(" ")}) (...)"
final class Cond(val pred: Ast, val `then`: Ast, val `else`: Option[Ast], ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = s"if $pred (...) (...)"
final class While(val pred: Ast, val body: Ast, ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = s"while $pred (...)"
final class Return(val element: Ast, ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = s"return $element"
final class Break(ctx: ParserRuleContext) extends Ast(Some(ctx)):
  override def toString: String = s"break"
final class StdFunction(val name: String, val evaluator: List[Ast] => Ast) extends Ast(None):
  override def toString: String = s"standard function $name"

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
        then BooleanF(true, Some(ctx))
        else BooleanF(false, Some(ctx))

    override def visitLiteral(ctx: FlangParser.LiteralContext): Ast =
      if ctx.NULL() != null then Null(Some(ctx))
      else if ctx.REAL() != null then Real(value = ctx.REAL().getText.toDouble, Some(ctx))
      else if ctx.INTEGER() != null then new Integer(value = ctx.INTEGER().getText.toInt, Some(ctx))
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