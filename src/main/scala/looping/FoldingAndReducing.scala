package looping

object FoldingAndReducing extends App{

//  val list: Array[Int] = Array(1, 2, 3, 4, 45, 67)

  val list: Array[Int] = Array(3, 4, 3, 0,2,2,3,0,0)
//  val list: Array[Int] = Array(4,2,0)
//  val list: Array[Int] = Array(4,4,3,3,1,0)



  def min(array: Array[Int]):Int = {
   var ans = 1000
    for {
      i <- 0 until array.length
    } yield {
      if(ans > array(i)){
        ans = array(i)
      }
    }
    ans
  }

  // test case 1 :
//  val input  = Array(-9,1,2,3,-3,-7)
  // test case 2
//  val input  = Array(9,1,2,3)
//  test case 3
  val input  = Array(-9,1,2,3,-3,-7)

  println(min(input))


  def folding():Int = {
    val map = list.groupBy(identity).map {
      case (x, y) => x -> y.length
    }
    var counter = 0
    val sortedMap = map.toSeq.sortWith((k1, k2) => k1._1 < k2._1)
      sortedMap.reduce {
      (x, y) => if (x._1 == y._1 - 1) {
        counter+=x._2
        y
      } else {
        y
      }
    }
    counter
  }

//  println(folding())


}
