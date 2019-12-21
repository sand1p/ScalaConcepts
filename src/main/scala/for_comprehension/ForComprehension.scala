package for_comprehension

case class Student(name: String, rollNo: Int, emailId: String)



object ForComprehension extends  App{


  //  If we are unwrapping optional values then in that case, if even a simgle value is None, nothing is executed inside the for comprehension
    // As internally it is implemented using maps and flatMap only

  def unwrappOptionalValues() {
    val name = Option("sandip")
    val rollNo = Option(34)
    val emailId = Some("asdasd")

    for {
      name <- name
      if name == "sandip"
      rollNo <- rollNo
      email <- emailId
    } yield {
      println(email)
      val result = Student(name, rollNo, email)
      println(result)
    }
  }

  // Looping using for comprehension

  def looping (): Unit =  {
    for {
      i <- 0 to 10
      j <- 0 to 10
       if i <= j && i == j
    } yield {
      println(s"Diagonal elements : [ i, j] : [ $i, $j ]  ")
    }
  }

  // For yield, yields result for the provided collection based on this
   // for yield iterates over a collection and return a new collection of same tpye

  // Given a map specifying Twitter users mentioned in a set of tweets,
  // and number of times each user was mentioned, look up the users
  // in a map of known politicians, and return a new map giving only the
  // Democratic politicians (as objects, rather than strings).
  def iterateCollection {
    val mentions = Map("BJP" -> 4, "Congres" -> 5)
    case class Account(party: String, owner: String)
    val dem_mentions: Map[String, Int] = for {
      (mention, times) <- mentions
      if mention == "BJP"
    } yield (mention, times)
    println(dem_mentions)
  }

  iterateCollection

}
