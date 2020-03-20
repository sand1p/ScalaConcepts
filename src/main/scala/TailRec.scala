import scala.annotation.tailrec

object TailRec {



  def fact(n: Int): Int = if (n == 1) 1 else n * fact(n - 1)


  @tailrec
  def ffact(n: Int, result: Int): Int = if(n == 1) result else ffact(n-1,1)
}

