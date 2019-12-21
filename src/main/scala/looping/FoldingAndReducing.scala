package looping

object FoldingAndReducing extends App {

//  val list: Array[Int] = Array(1, 2, 3, 4, 45, 67)

  val list: Array[Int] = Array(3, 4, 3, 0,2,2,3,0,0)
//  val list: Array[Int] = Array(4,2,0)
//  val list: Array[Int] = Array(4,4,3,3,1,0)


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

  println(folding())

}
