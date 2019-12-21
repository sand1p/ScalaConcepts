import scala.util.Try

object Executor extends App {

  import implicits.ImplicitClass._
  import for_comprehension.ForComprehension._
  // implicit class
  //  val result = 2 times "sandy"
  //  println(result)
  //implicit paramter

    println(square(10))

  val result = Try{
    1.0/2.0
  }.toOption.map(s => println(s))

  println(result)
  // implicit conversion

  //  assert(increment("10") == 11)

  //  unwrappOptionalValues( )

  //  looping

//  val name= "sandy"
//  println(s"dsfsdf:  $name")
//  println("piyush".snakeCase)


}