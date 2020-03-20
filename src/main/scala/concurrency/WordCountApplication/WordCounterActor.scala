package concurrency.WordCountApplication

import akka.actor.{Actor, ActorRef, Props}

case class StartProcessFileMsg()

class WordCounterActor(filename: String) extends Actor {
  private var running = false
  private var totalLines = 0
  private var linesProcessed = 0
  private var totalWords = 0
  private var fileSender: Option[ActorRef] = None

  private val wordCounterActor = context.actorOf(Props[StringCounterActor])

  override def receive: Receive = {
    case StartProcessFileMsg() if running => println("Error: Duplicate start message received")
    case StartProcessFileMsg() => {
      running = true
      fileSender = Some(sender()) // save reference to process invoker
      import scala.io.Source._
      for (line <- fromFile(filename).getLines()) {
        wordCounterActor ! ProcessStringMessage(line)
        totalLines += 1
      }
    }
    case StringProcessedMessage(words: Int) => {
      totalWords += words
      linesProcessed += 1
      if (linesProcessed == totalLines) {
        fileSender.foreach(invoker => invoker ! totalWords) // provide result to process onvoker
      }
    }
    case _ => println("Error: Message is not recognized !")
  }
}
