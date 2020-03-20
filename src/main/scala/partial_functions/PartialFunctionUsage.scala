package partial_functions

object PartialFunctionUsage extends App {

  // function that works for only subset of input
  def divide: PartialFunction[Double, Double] = new PartialFunction[Double, Double] {
    override def isDefinedAt(x: Double): Boolean = x != 0
    override def apply(v1: Double): Double = 100 / v1
  }
  divide
  val addEvenDouble: PartialFunction[Int, Int] = {
    case x if x % 2 == 0 => x * x
  }
  val lresult = List(1, 2, 3, 4, 5) collect addEvenDouble
  println(lresult)
  val sample = 1 to 10
  val isEven: PartialFunction[Int, Int] = {
    case x if x % 2 == 0 => x
  }
  val result = sample collect isEven
  println(s"result: $result")


}