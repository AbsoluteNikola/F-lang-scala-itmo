import scala.collection.mutable.{Map => MuttableMap}

val m1 = MuttableMap[String, List[Int]](
  "x" -> List(1),
  "y" -> List(2),

)
val m2 = m1.clone()
println(m1)
println(m2)
m1.put("z", List(3))
println(m1)
println(m2)
m1.put("x", List(4))
println(m1)
println(m2)