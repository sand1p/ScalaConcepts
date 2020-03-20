package collections

object MyMap extends App{

  val map: Map[String, String] = Map.empty[String, String]

  // + adds element to the collection and creates new collection
  val elemMap = map+("sandip" -> "Bold")

  val removed = elemMap - "sandip"


  println(s" - method on Map $removed   original $elemMap")
  // return Parallel collection with same underlying dataset, reference points to the same collection
  map.par

  // Map is a trait with empty method implemented  with Map as a object reference
  map.empty

  // Partial functions works with curly braces {}
  map.exists{ case (k,v) => k == "sandy"}



  val twoElemMap = elemMap+("pradip" -> "Sutar")


//  println(s"Elem Sum : ${twoElemMap.sum}")
  println(s"1 -2 ${elemMap--Seq("sandip","pradip")}")

  println(s" 2- 2 ${twoElemMap--Seq("sandip","pradip")}")

  println(s"Map: $elemMap ${map.par} ${elemMap.par}")

}
