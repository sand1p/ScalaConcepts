package concurrency.WordCountApplication

import akka.actor.{ActorSystem, Props}
import akka.dispatch.ExecutionContexts._
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.duration._

object App {

  def main(args: Array[String]): Unit = {
    /*
        1. ActorSystem provides context to the Actor,

        2. have a file name pointing to some file
        3. pass message of CountNumberOfWords(filename) |  TotalWordCounterActorReference
        4. Response will be received from the actor.
    */

    implicit val ec = global
    implicit val timeout = Timeout(25 seconds)

    val filename = "src/main/scala/concurrency/WordCountApplication/StringCounterActor.scala"
    //    val wordCounter = context.actorOf(Props(WordCounterActor))
    val actorSystem = ActorSystem("System")
    //    wordCounter | StartProcessFileMsg
    val actor = actorSystem.actorOf(Props(new WordCounterActor(filename)))
    val result = actor ? StartProcessFileMsg()
    result.map { words =>
      println(s"Number of Words: $words")
    }
  }
}