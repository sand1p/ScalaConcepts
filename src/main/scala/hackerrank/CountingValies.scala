package hackerrank

object CountingValies {

  // Complete the countingValleys function below.
  def countingValleys(n: Int, s: String): Int = {
    def rec(path: List[Char], counter: Int, valleys: Int): Int = {
      path match  {
        case Nil => valleys
        case x::xs if (x == 'U') && ((counter + 1) == 0) =>
          rec(xs, counter+1, valleys+1 )
        case x::xs if x == 'U' => rec(xs, counter +1, valleys)
        case x::xs if x == 'D' => rec(xs, counter -1, valleys)
      }
    }
    rec(s.toList, 0, 0)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val s = stdin.readLine

    val result = countingValleys(n, s)
  println(s"Resul : $result")
  }
}
