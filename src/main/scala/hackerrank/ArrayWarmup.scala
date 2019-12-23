package hackerrank

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._


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
    result.foreach(println)
  }
  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Array[Int] = {
    val array: Array[Int] = Array(n)
    queries.flatMap{ q =>
      val start = q(0)
      val end = q(1)
      val value = q(2)
//         array(start-1) = array(start-1) + value
        println(s"start: $start" +
          s"end: $end" +
          s"value: $value")

      array.zipWithIndex.map{ case (elem, i) =>
        if( i <= start-1 && i <= end-1){
          array(i)+=value
        }
      }
    }
    array
  }
}