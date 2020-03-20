package collections

import scala.collection.mutable.{Map => MMAP}

object MMap extends App {

  val map: MMAP[String, String] = MMAP.empty[String, String]

  map++=MMAP("sandy" -> "Smart","Tushar" -> "Hardwork")
  println(s"Map: $map")

  map.get("sandy").foreach{result => println(result) }

//  map-=("sandy")
  println(s"map : $map")
  map.zipWithIndex.foreach{
    case ((k,v), i) => println(s"Index: $i   $k -> $v")

  }
}
