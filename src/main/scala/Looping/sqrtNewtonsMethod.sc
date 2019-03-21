def sqrt(x: Double): Double = {

  def abs(x: Double) = if(x < 0) -x else x

  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double): Boolean = abs(guess*guess - x)/x < 0.0001

  def improve(guess: Double): Double = (x/guess + guess ) / 2

  sqrtIter(1)
}

sqrt(10)



