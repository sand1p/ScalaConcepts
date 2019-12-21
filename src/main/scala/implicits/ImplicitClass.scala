package implicits


/*
A class marked with implicits keyword



 */
object ImplicitClass {

  implicit class IntWithTimes(x: Int){
    def times(f: => String): String ={

      def loop(current: Int, result: String): String = {
        if(current > 0) {
          val output= f
          loop(current -1,result+output )
        } else result
      }
      loop(x,"sandysandy")
    }
  }

  // Implicit parameters for single parameter
  implicit val pi=10
  implicit val num = 5.0
  def square(a: Int)(implicit  constant: Double, num: Int): Double = {
    0.5*constant*num*a
  }


  class RichString(str: String) {
    def snakeCase: String = str.reverse
  }

  // Implicit conversion

  implicit def asRichString(str: String): RichString = new RichString(str)
  "piyush" snakeCase

    // Type class
}