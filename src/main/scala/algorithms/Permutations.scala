package algorithms

object Permutations extends App{

  def permutations(input: List[Char]): Unit = {

    def perRec(input: List[Char], output: List[Char]): Unit = {
      input match  {
        case Nil => println(output)
//          perRec(input,reducedString,Nil)
        case head::tail => perRec(tail,output:+head)
          permutations(tail)
      }

    }
    perRec(input,Nil)
  }

  permutations("abc".toList)
}
