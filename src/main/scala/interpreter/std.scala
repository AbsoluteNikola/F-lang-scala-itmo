package org.lambda.flang
package interpreter

object std {
  private def numberOperation(
    functionName: String,
    args: List[Ast],
    intOp: (Int, Int) => Int,
    intDef: Int,
    realOp: (Double, Double) => Double,
    realDef: Double,
  ): Ast =
    val (ints, doubles) = args.zipWithIndex.partitionMap { (node, index) =>
      node match
        case n: Integer => Left(n.value)
        case n: Real => Right(n.value)
        case _ => throw WrongArgumentType(functionName, index + 1, "integer or double")
    }
    if doubles.isEmpty then
      var res: Int = intDef
      ints.foreach(x => res = intOp(res, x))
      new Integer(value = res, ctx = None)
    else
      var res: Double = realDef
      ints.foreach(x => res = realOp(res, x))
      new Real(value = res, ctx = None)

  def plus(args: List[Ast]): Ast = numberOperation(
    functionName =  "plus",
    args = args,
    intOp = (x, y) => x + y,
    intDef = 0,
    realOp = (x, y) => x + y,
    realDef = 0
  )

  def times(args: List[Ast]): Ast = numberOperation(
    functionName =  "times",
    args = args,
    intOp = (x, y) => x * y,
    intDef = 1,
    realOp = (x, y) => x * y,
    realDef = 1
  )

  def head(args: List[Ast]): Ast =
    if args.length != 1
      then throw WrongArgumentsCount("head", trueCount = 1, wrongCount = args.length)
    args.head match
      case l: FList => l.elements.headOption match
        case Some(x) => x
        case None => throw EmptyList("head")
      case _ => throw WrongArgumentType("head", 1, "list")

  def tail(args: List[Ast]): Ast =
    if args.length != 1
      then throw WrongArgumentsCount("tail", trueCount = 1, wrongCount = args.length)
    args.head match
      case l: FList => if l.elements.isEmpty
        then throw EmptyList("tail")
        else FList(l.elements.tail, None)
      case _ => throw WrongArgumentType("tail", 1, "list")

  def cons(args: List[Ast]): Ast =
    if args.length != 2
      then throw WrongArgumentsCount("cons", trueCount = 2, wrongCount = args.length)
    args(2) match
      case l: FList => FList(args.head :: l.elements, None)
      case _ => throw WrongArgumentType("cons", 2, "list")

  def eval(args: List[Ast]): Ast =
    if args.length != 1
      then throw WrongArgumentsCount("eval", trueCount = 1, wrongCount = args.length)
    run(args.head)

  def isInt(args: List[Ast]): Ast =
    if args.length != 1
      then throw WrongArgumentsCount("isint", trueCount = 1, wrongCount = args.length)
    FBoolean(args.head.isInstanceOf[Integer], None)

  def isReal(args: List[Ast]): Ast =
    if args.length != 1
      then throw WrongArgumentsCount("isreal", trueCount = 1, wrongCount = args.length)
    FBoolean(args.head.isInstanceOf[Real], None)

  def isBool(args: List[Ast]): Ast =
    if args.length != 1
      then throw WrongArgumentsCount("isbool", trueCount = 1, wrongCount = args.length)
    FBoolean(args.head.isInstanceOf[FBoolean], None)

  def isNull(args: List[Ast]): Ast =
    if args.length != 1
      then throw WrongArgumentsCount("isnull", trueCount = 1, wrongCount = args.length)
    FBoolean(args.head.isInstanceOf[Null], None)

  def isAtom(args: List[Ast]): Ast =
    if args.length != 1
      then throw WrongArgumentsCount("isatom", trueCount = 1, wrongCount = args.length)
    FBoolean(args.head.isInstanceOf[Atom], None)

  def isList(args: List[Ast]): Ast =
    if args.length != 1
      then throw WrongArgumentsCount("islist", trueCount = 1, wrongCount = args.length)
    FBoolean(args.head.isInstanceOf[FList], None)

  def print(args: List[Ast]): Ast =
    if args.length != 1
     then throw WrongArgumentsCount("print", trueCount = 1, wrongCount = args.length)
    println(args.head)
    Null(None)
}