import org.lambda.flang.interpreter.Env
import org.lambda.flang
import org.lambda.flang.Real

val e = Env()

e.set("x", Real(1, None))
e.set("y", Real(2, None))

e

val e2 = e.copy()
e2.set("z", Real(4, None))

e
e2

e2.set("x", Real(3, None))

e
e2
