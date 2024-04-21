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

class WrongArgumentType(val functionName: String, index: Int, typ: String) extends FlangException:
  override def toString: String = s"$index argument of function '$functionName' should be $typ"