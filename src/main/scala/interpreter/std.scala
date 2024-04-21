package org.lambda.flang
package interpreter

object std {
  def plus(args: List[Ast]): Ast =
    val (ints, doubles) = args.zipWithIndex.partitionMap { (node, index) =>
      node match
        case n: Integer => Left(n.value)
        case n: Real => Right(n.value)
        case _ => throw WrongArgumentType("plus", index, "integer or double")
    }
    if doubles.isEmpty then
      var res: Int = 0
      ints.foreach(res += _)
      new Integer(value = res, ctx = None)
    else
      var res: Double = 0
      ints.foreach(res += _)
      doubles.foreach(res += _)
      new Real(value = res, ctx = None)
}