package hackerrank.array

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Code4MetricStream {
    // Complete the checkMagazine function below.
    def checkMagazine(magazine: Array[String], note: Array[String]) {

    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val numberOfInputs = stdin.readInt()
      val mn = stdin.readLine().split("#")

      val magazine = stdin.readLine.split(" ")
      val note = stdin.readLine.split(" ")
      checkMagazine(magazine, note)
    }
}