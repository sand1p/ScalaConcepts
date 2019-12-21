package hackerrank

object JumpingClouds {

  // Complete the jumpingOnClouds function below.
  def jumpingOnClouds(c: Array[Int]): Int =
    c.mkString.split("1").foldLeft(0)(_ + _.length/2 + 1) - 1

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val c = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = jumpingOnClouds(c)
    println(s"Result : $result")
  }
}
