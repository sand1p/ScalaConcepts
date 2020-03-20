package case_classes_pattern_match

class SortingAlgorithms extends App {

  def quickSort(list: List[Int]): List[Int] = list match {
    case Nil => Nil
    case pivote :: tail =>
      val (smaller, rest) = tail.partition(x => x < pivote)
      quickSort(smaller) ::: pivote :: quickSort(rest)
  }

  def sorting(list: List[Int]): List[Int] = list match {
    case Nil => Nil
    case pivote :: tail =>
      val (smaller, rest) = tail.partition(_ < pivote)
      quickSort(smaller) ::: pivote :: sorting(rest)
  }
}