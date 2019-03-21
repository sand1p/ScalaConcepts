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
var result = recFact(10, 1)
println(s"Time Needed Tail: ${LocalDateTime.now().getNano - LocalDateTime.now().getNano}  result: $result")



def fact(n: Int): Int = {
  if (n == 1) {
    1
  } else {
    n*fact(n - 1)
  }
}
result = recFact(100, 1)
println(s"Time Needed REC: ${LocalDateTime.now().getNano - LocalDateTime.now().getNano}  result: $result")


/*

object Sol {
  def main(array: Array[String]) = {

    var resultantString: String = ""
    var prevChar: Char = 'a'
    var counter = 0

    val inputString = "aaabbccd"

    inputString.map  { character =>
      if(character == prevChar) {
        counter += 1
        prevChar = character
      } else  {
        resultantString=resultantString +s"$counter"+prevChar
        prevChar = character
        counter = 1
      }

    }
    resultantString=resultantString +s"$counter"+prevChar
  }
}

*/


/**
  * "aaabbcccdddp" =>   "3a2b3c3d1p"
  */

//import scala.annotation.tailrec
//
//def rec(pre: Char, input: String, counter: Int): String = {
//  input.isEmpty match {
//    case false if pre == input.head =>
//      rec(input.head, input.tail, counter + 1)
//    case false if pre != input.head =>
//      s"$pre$counter" + rec(input.head, input.tail, 1)
//    case true => s"$pre$counter"
//  }
//}
//
//rec('a', "aaabbcccdddp", 0)

//object Solution {
//
//  def main(args: Array[String]): Unit = {
//
//    import scala.annotation.tailrec
//    @tailrec
//    def rec(pre: Char, input: String, counter: Int, output: String): String  = {
//      input.isEmpty match  {
//        case false if pre == input.head =>
//          rec(input.head, input.tail, counter + 1, output)
//        case false if pre != input.head =>
//          rec(input.head, input.tail,1,output+s"$pre$counter")
//        case true =>
//          output+s"$pre$counter"
//      }
//    }
//
//    rec('a',"aaabbcccdddp", 0, "" )
//
//  }
//}

// For comprehension


/*

def foo (n: Int, v: Int) = {

   for {
     i <- 0 until n
     j <- 0 until n if i + j == v
   }
   println(s"i: $i, j: $j")
*/

/* yield  {
  (i,j)
}
results*/
//}


//foo(10, 5)  /*foreach {
//  case (i,j) =>
//}*/
/*
case class User(nname: String, mobileNumber: Int)

val users = Seq(
  User("a" ,1),
  User("b", 2),
  User("c", 3)
)


val evenNumber:Seq[String] = for {
  user <- users if user.mobileNumber%2 == 0
} yield {
  user.nname
}

*/


/*
import scala.util.matching.Regex

val numberPattern: Regex  = "[0-9]".r

numberPattern.findFirstMatchIn("awesomePassword3") match  {

  case None => "Choose better password"
  case Some(_) => "Awesome Password"
}
*/


// sealed class trait

//sealed abstract class Furniture {
//
//  case class Couch() extends Furniture
//
//  case class Chair() extends Furniture
//
//  def findPlaceToSit(piece: Furniture) = {
//    piece match {
//      case a: Couch => "sitting on Couch "
//
//      case b: Chair => "Sitting in chair "
//    }
// }
//}


//foldLeft

//def foldLeft[B](z: B)(op: (B, A) => B): B

/*
val salaries = Seq(10,102,12302,312)

def sum: (Int, Int) => Int  =    (a: Int, b: Int) => a+b


salaries.fold(0)(sum)

*/


/*
import akka.actor.{Actor, ActorRef, Props, ActorSystem}



abstract class A {
  val message:String
}

class B extends A {
  val message = " instance of class B"
}

trait C extends  A {
  def loudMessage: String = message.toUpperCase
}


class D extends B with C


val d = new D

d.message
d.loudMessage


//classes can have one superclass but many mixin



trait AbsIterator {
  type T // abstract type T
  //standard iterator methods
  def hasNext : Boolean
  def next: T
}

//mixin
trait RichIterator extends AbsIterator {
  def foreach (f: T => Unit): Unit = while(hasNext) f(next)
}


//Concrete class(all abstract members T, hasNext and next have implementations)

// Superclass
class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0
  def hasNext = i < s.length

  def next: T= {
    val ch = s charAt i
    i = i + 1
    ch
  }
}

class RichStringIterator extends StringIterator("Scala ") with RichIterator

val  rich = new RichStringIterator

rich.foreach( x => println(x))


//With single inheritance we would not be able to achieve this level of flexibility.

val salaries = Seq(1000, 2000, 3000)

val doubleSalaries =  (x: Int) => x*2
val newSalaries = salaries.map(doubleSalaries)

//anonymous function which is passed as an argument to other function {map}
// type of x need not to be mentioned as it is inferred by the compiler (type inference )
val newSalaries1 = salaries.map( x => x*2)

//
val newSalaries2 = salaries.map(_ * 2)

// syntax:   left  =>  right   , left is generally s parameter list.


case class WeeklyWeatherForecast(temperatur: Seq[Double])  {
    private def convertCtoF(temp: Double) = temp *1.8 + 32
    def forecastInFahrenheit: Seq[Double] = temperatur.map(convertCtoF)
 }



// Higher Order Functions
object SalaryRaiser {

  def smallPromotion (salaries: Seq[Double]): Seq[Double] = {
    salaries.map(salary => salary * 1.1)
  }

  def bigPromotion (salaries: Seq[Double]): Seq[Double] = {
    salaries.map(salary => salary * math.log(salary))
  }

  def hugePromotion (salaries: Seq[Double]): Seq[Double] = {
    salaries.map(salary => salary * salary)
  }

}

object Increment {
  def promotion(salaries: Seq[Double])(incrementFunction: Double => Double): Seq[Double] = {
    salaries.map(incrementFunction)
  }

  def smallPromotion (salaries: Seq[Double]): Seq[Double] = {
    promotion(salaries)(salary => salary * 1.1)
  }

  def bigPromotion (salaries: Seq[Double]): Seq[Double] = {
    promotion(salaries)(salary => salary * math.log(salary))
  }

  def hugePromotion (salaries: Seq[Double]): Seq[Double] = {
    promotion(salaries)(salary => salary * salary)
  }

}

//Functions that return functions
def urlBuilder(ssl: Boolean, domainName: String ): (String, String) => String = {
  val schema = if(ssl) "https://" else "http://"
  (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
}

val domainName: String= "facebook.com"
val getURL = urlBuilder(ssl=true, domainName)
val endpoint = "users"
val queryParam = "id=1"

getURL(endpoint,queryParam)



*/
