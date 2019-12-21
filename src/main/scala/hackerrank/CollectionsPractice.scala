package hackerrank

import java.io._
import java.math._
import java.security._
import java.text._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable.Map
import scala.Array


object CollectionsPractice {


  // Complete the sockMerchant function below.
  def sockMerchant(n: Int, ar: Array[Int]): Int = ar.groupBy(identity).values.map(_.length/2).sum

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val n = stdin.readLine.trim.toInt
    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = sockMerchant(n, ar)
    println(s"Result : $result")
  }
}