
object Solution {

  def main(args: Array[String]): Unit = {
    import java.time.LocalDateTime
    import scala.annotation.tailrec
    @tailrec
    def recFact(n: Int, acc: Int): Int = {
      if (n == 1) {
        acc
      } else {
        recFact(n - 1, n * acc)
      }
    }

    val startingTime = new LocalDateTime().getNano

    val result = recFact(100, 1)
    val endTime = new LocalDateTime().getNano
    println(s"time Neede: ${endTime - startingTime}  result: $result")
  }
}
    /*    def rec(pre: Char, input: String, counter: Int, output: String): String  = {
          input.isEmpty match  {
            case false if pre == input.head =>
              rec(input.head, input.tail, counter + 1, output)

            case false if pre != input.head =>
              rec(input.head, input.tail,1, output+s"$pre$counter")

            case true =>
              output+s"$pre$counter"
          }
        }
        rec('a',"aaabbcccdddp", 0, "" )
      }*/
