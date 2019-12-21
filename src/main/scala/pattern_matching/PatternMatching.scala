package pattern_matching

object PatternMatching extends App {

  trait Person
  case class Student(name: String, rolllNo: Int) extends  Person
  case class Teacher(name: String,subject: String) extends Person

  mathingCaseClass
  def mathingCaseClass: Unit = {
    val student1= Student("sandip", 5)
    val student2 = Student ("sandip", 5)
    println(student1 == student2)
    println(student1.hashCode())
    println(student1.toString)

    println(student2.hashCode())
    println(student2.toString)

  }

  matchingType()

  def matchingType(): Unit = {
    val student2: Person = Student ("sandip", 5)
    val teacher = Teacher("pradip", "matchs")

    student2 match {
      case x: Student => println("Matches student")
      case x: Teacher => println("Matches teacher")

    }

  }


}
