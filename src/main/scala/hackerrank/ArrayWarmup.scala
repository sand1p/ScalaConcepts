package hackerrank

import scala.annotation.tailrec
import scala.Predef._


object ArrayWarmup extends {

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val nm = stdin.readLine.split(" ")

    val n = nm(0).trim.toInt

    val m = nm(1).trim.toInt

    val queries = Array.ofDim[Int](m, 3)

    for (i <- 0 until m) {
      queries(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }
    val result = arrayManipulation(n, queries)
    println(result)
  }

  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    // declare array of provided length
    val array: Array[Long] = new Array[Long](n + 2)
    queries.foreach { q =>
      val start = q(0)
      val end = q(1)
      val value = q(2)
      array(start) +=value
      array(end+1) -=value
    }
 @tailrec
    def bulkUpdate(preFixSum: Long, curIndex: Int, max: Long): Long = {
      if (curIndex < array.length) {
        array(curIndex) = preFixSum + array(curIndex)
        val updatedMax = Math.max(array(curIndex), max)
        bulkUpdate(array(curIndex), curIndex + 1, updatedMax)
      } else max
    }
    bulkUpdate(0L, 1, Long.MinValue)
  }
}