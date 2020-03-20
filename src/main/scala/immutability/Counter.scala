package immutability

class Counter {
  Counter.counter+=1
  override def toString: String = s"Counter value: ${Counter.counter}"
}

object Counter {
  var counter : Int = 0   // Not recommended
}


object Runner extends App {
  val counter = new Counter()
  println(counter.toString)
  val counter2= new Counter()
  println(counter2.toString)
}