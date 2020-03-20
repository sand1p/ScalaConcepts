package companion_object

object Main {
  class MyString(val jString: String) {
    private var extraData = ""
    override def toString = jString + extraData
  }
  object MyString {
    def apply(base:String, extras:String){
      val s : MyString= new MyString(base)
      println(s"First Iteration: $s")
      s.extraData = extras
      println(s"MyString $s")
      s
    }
    def apply(base:String) = new MyString(base)
  }

  def main(args: Array[String]) {
    println("<..>"+MyString("hello", "world"))
    println("<...>"+MyString("hello"))
  }
}