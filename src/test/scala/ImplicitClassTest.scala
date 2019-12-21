import org.scalatest.FunSuite

class ImplicitClassTest extends  FunSuite {

  test("shouldExecuteMethodConsideringObjectCreation"){
    import implicits.ImplicitClass._
    val result = 2 times "sandy"
    assert(result == "sandysandy")
  }

}