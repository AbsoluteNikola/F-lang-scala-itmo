package org.lambda.flang
package interpreter

abstract class FlangException extends Exception:
  override def toString: String = "Something gone wrong during interpretation"

class NothingToExecute extends FlangException:
  override def toString: String = "There were nothing to execute"

class NoSuchAtom(val name: String) extends FlangException:
  override def toString: String = s"There is no such atom '$name' in context"

class NotAFunction(val value: Ast) extends FlangException:
  override def toString: String = s"'$value' is not a function"

class WrongType(element: String, typ: String, val node: Ast) extends FlangException:
  override def toString: String = s"$element should be of type $typ not $node"

class WrongArgumentType(val functionName: String, index: Int, typ: String) extends FlangException:
  override def toString: String = s"$index argument of function '$functionName' should be $typ"

class WrongArgumentsCount(val functionName: String, trueCount: Int, wrongCount: Int) extends FlangException:
  override def toString: String = s"Function '$functionName' has $trueCount arguments, not $wrongCount"

class EmptyList(val functionName: String) extends FlangException:
  override def toString: String = s"$functionName: List is empty"

class BreakException extends FlangException:
  override def toString: String = "break outside of while"

class ReturnException(val value: Ast) extends FlangException:
  override def toString: String = "return outside of function"