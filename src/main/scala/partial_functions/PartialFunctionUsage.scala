package partial_functions

object PartialFunctionUsage {

    // function that works for only subset of input
  def divide = new PartialFunction[Double,Double] {
    override def isDefinedAt(x: Double): Boolean = x!=0

    override def apply(v1: Double): Double = 100/v1
  }




}
