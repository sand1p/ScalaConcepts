package hackerrank.array

import scala.annotation.tailrec

object ArrayRangeUpdate extends App{

  val inputArray = Array(Array(1,2,500),
    Array(2,4,200),
    Array(0,4,300))

  val array= new Array[Int](6)

  println("0\t\t1\t\t2\t\t3\t\t4")
  inputArray.map{ input =>
    println()
    val start = input(0)
    val end = input(1)
    val value = input(2)
    array(start) = array(start) + value
    array(end) = array(end+1)-value

    for (elem <- array) {
      print(s"$elem\t\t")
    }
  }

  @tailrec
  def bulkUpdate(prev: Int, curIndex: Int): Unit = {
    if(curIndex < array.length) {
      array(curIndex) = prev+array(curIndex)
      bulkUpdate(array(curIndex),curIndex+1)
    }  else{
      Unit
    }
  }

  bulkUpdate(0,0)

  println()

  println("0\t\t1\t\t2\t\t3\t\t4")

  var max= 0
  for (elem <- array) {
    print(s"$elem\t\t")
    if(elem > max) max= elem
  }

  println(s"\nmax: $max")



}