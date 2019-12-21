# Use of implicits in my code 
* To Pass Execution Context
* 

##Restrictions on implicit classes 

* they should must be defined inside other trait/class/object
* Accepts Only one non implicit argument in the constructor  
* There may not be any method, member or object in scope with the same name as the implicit class.
```
object Bar
implicit class Bar(x: Int) // BAD!

val x = 5
implicit class x(y: Int) // BAD!

implicit case class Baz(x: Int) // BAD!
```


 