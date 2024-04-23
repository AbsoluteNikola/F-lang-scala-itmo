package org.lambda.flang
package interpreter

def run(ast: Ast): Ast = eval(ast, Env())

private def eval(evalNode: Ast, env: Env): Ast = evalNode match
  case x: FBoolean => x
  case x: Null => x
  case x: Integer => x
  case x: Real => x
  case x: Atom =>
    env.get(x.value).getOrElse(throw NoSuchAtom(x.value))
  case x: Break => throw BreakException()
  case program: Program =>
    var result: Option[Ast] = None
    program.elements.foreach {
      case f: Func =>
        env.set(f.name, f)
        f.executionEnv = env
      case _ => ()
    }
    program.elements.foreach(node => result = Some(eval(node, env)))
    result.getOrElse(throw NothingToExecute())
  case list: FList =>
    if list.elements.isEmpty
      then list
    else
      val func = eval(list.elements.head, env)
      val args = list.elements.tail.map(eval(_, env))
      func match
        case f: StdFunction => f.evaluator(args)
        case f: Lambda => applyFunction(
          functionName = "lambda",
          argsName = f.args,
          args = args,
          body = f.body,
          env = f.executionEnv,
        )
        case f: Func => applyFunction(
          functionName = f.name,
          argsName = f.args,
          args = args,
          body = f.body,
          env = f.executionEnv,
        )
        case n => if list.elements.length == 1
          then n
          else throw NotAFunction(n)
  case quoted: Quoted => quoted.node
  case cond: Cond =>
    val pred = eval(cond.pred, env) match
      case b: FBoolean => b.value
      case other => throw WrongType("predicate of if", "boolean", other)
    cond.`else` match
      case Some(e) => if pred
        then eval(cond.`then`, env)
        else eval(e, env)
      case None =>
        if pred then eval(cond.`then`, env)
        new Null(None)

  case fWhile: While =>
    while
      true
    do
      val pred = eval(fWhile.pred, env) match
        case b: FBoolean => b.value
        case other => throw WrongType("predicate of while", "boolean", other)
      try
        eval(fWhile.body, env)
      catch
        case _: BreakException => return Null(None)
    Null(None)

  case fReturn: Return =>
    val res = eval(fReturn.element, env)
    throw ReturnException(res)
  case setq: Setq =>
    val v = eval(setq.value, env)
    env.set(setq.name.value, v)
    Null(None)

  case func: Func =>
    env.set(func.name, func)
    func.executionEnv = env.copy()
    func
  case lambda: Lambda =>
    lambda.executionEnv = env.copy()
    lambda
  case prog: Prog =>
    env.withTerms(
      terms = prog.context.map((name, node) => (name.value, eval(node, env))),
      f = eval.curried(prog.body)
    )
  case function: StdFunction => function
  case d: Do =>
    val results = d.statements.map(eval(_, env))
    results.last

private def applyFunction(functionName: String, argsName: List[Atom], args: List[Ast], body: Ast, env: Env): Ast =
//  println(s"Apply $functionName, args($args), env = $env")
  if argsName.length != args.length
    then throw WrongArgumentsCount(functionName, argsName.length, args.length)
  val terms = argsName.map(_.value).zip(args)
  try
    env.withTerms(terms = terms, f = newEnv => eval(body, newEnv))
  catch
    case e: ReturnException => e.value
