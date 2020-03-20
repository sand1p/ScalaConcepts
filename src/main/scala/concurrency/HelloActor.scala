import akka.actor.Actor
import for_comprehension.Student

class HelloActor extends Actor {
  def receive : Receive = {
    case value : String =>   println(value)
    case _ => print("Unknown Message")
  }

}


class MyActor extends Actor {
  override def receive: Receive = {
    case value: String => println(value)
    case _ => println("Nothing matched")
  }
}





/**
  route(url, function(request)){
    var query = buildQuery(request);
    dbCall(query, function(dbResponse)){
      var wsRequest = buildWebServiceRequest(dbResponse);
      wsCall(wsRequest, function(wsResponse)) {
        sendReply(wsReponse)
      }

    }
  }
  */
/*

  msg match {

  }*/
