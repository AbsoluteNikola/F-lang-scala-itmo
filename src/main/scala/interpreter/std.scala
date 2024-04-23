package org.lambda.flang
package interpreter

object std {
  private def numberOperation(
    functionName: String,
    args: List[Ast],
    intOp: (Int, Int) => Int,
    realOp: (Double, Double) => Double,
  ): Ast =
    val correctArgs = args.zipWithIndex.map { (node, index) =>
      node match
        case n: Integer => Left(n.value)
        case n: Real => Right(n.value)
        case _ => throw WrongArgumentType(functionName, index + 1, "integer or double")
    }

    if correctArgs.exists(x =>
      x match
        case Left(_) => false
        case Right(_) => true) then
      val doubleArgs = correctArgs.map {
        case Left(i) => i.toDouble
        case Right(j) => j
      }
      var res: Double = doubleArgs.head
      doubleArgs.tail.foreach(x => res = realOp(res, x))
      new Real(value = res, ctx = None)
    else
      val doubleArgs = correctArgs.map {
        case Left(i) => i
        case Right(_) => 0
      }
      var res: Int = doubleArgs.head
      doubleArgs.tail.foreach(x => res = intOp(res, x))
      new Integer(value = res, ctx = None)

  private def compareOperation(
     functionName: String,
     args: List[Ast],
     predicate: Int => Boolean,
   ): Ast = args match
    case first :: second :: Nil =>
      (first, second) match
        case (a: Comparable, b: Comparable) => FBoolean(predicate(a.compare(b)), ctx = None)
        case _ => throw WrongComparison(first, second)
    case _ => throw WrongArgumentsCount(functionName, trueCount = 2, wrongCount = args.length)

  def plus(args: List[Ast]): Ast = numberOperation(
    functionName =  "plus",
    args = args,
    intOp = (x, y) => x + y,
    realOp = (x, y) => x + y
  )

  def minus(args: List[Ast]): Ast = numberOperation(
    functionName = "plus",
    args = args,
    intOp = (x, y) => x - y,
    realOp = (x, y) => x - y
  )

  def times(args: List[Ast]): Ast = numberOperation(
    functionName =  "times",
    args = args,
    intOp = (x, y) => x * y,
    realOp = (x, y) => x * y
  )

  def divide(args: List[Ast]): Ast = numberOperation(
    functionName = "divide",
    args = args,
    intOp = (x, y) => if y != 0 then x / y else throw DivideByZero(),
    realOp = (x, y) => if y != 0 then x / y else throw DivideByZero()
  )

  def equal(args: List[Ast]): Ast = compareOperation(
    functionName = "equal",
    args = args,
    predicate = x => x == 0
  )

  def greater(args: List[Ast]): Ast = compareOperation(
    functionName = "greater",
    args = args,
    predicate = x => x > 0
  )

  def greaterOrEqual(args: List[Ast]): Ast = compareOperation(
    functionName = "greaterOrEqual",
    args = args,
    predicate = x => x >= 0
  )

  def less(args: List[Ast]): Ast = compareOperation(
    functionName = "less",
    args = args,
    predicate = x => x < 0
  )

  def lessOrEqual(args: List[Ast]): Ast = compareOperation(
    functionName = "lessOrEqual",
    args = args,
    predicate = x => x <= 0
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