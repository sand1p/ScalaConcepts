package concurrency.WordCountApplication

import akka.actor.Actor

case class ProcessStringMessage(line: String)

case class StringProcessedMessage(words: Int)

class StringCounterActor extends Actor {
  override def receive: Receive = {
    case ProcessStringMessage(line) => {
      val numberOfWords = line.split(" ").length
      sender ! StringProcessedMessage(numberOfWords)
    }
    case _ => println("Error: message not recognized")
  }
}