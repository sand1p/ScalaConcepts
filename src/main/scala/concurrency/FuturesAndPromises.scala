//package concurrency
//
//import java.util.concurrent.ThreadPoolExecutor
//
//import scala.concurrent.{ExecutionContext, Future}
//import scala.concurrent.ExecutionContext.Implicits.global
//import scala.concurrent.forkjoin.ForkJoinPool
//import scala.concurrent.forkjoin.ForkJoinPool.ManagedBlocker
//
//
//object FuturesAndPromises extends App {
//  val inverseFuture: Future[Matrix] = Future{
//    fatMatrix.inverse()  // non-blocking long lasting computation
//  } // ec is implicitly passed
//
//
//  // the following is equivalent to `implicit val ec = ExecutionContext.global`
//
//  Future{
//    ForkJoinPool.managedBlock(
//      new ManagedBlocker{
//        var done = false
//
//        override def block(): Boolean = {
//          try{
//            myLock.lock()
//            //
//          } finally{
//            done = true
//          }
//          true
//        }
//        override def isReleasable: Boolean = done
//      }
//    )
//  }
//
//  // Fortunately the concurrent package provides a convenient way for doing so:
//  import scala.concurrent.Future
//  import scala.concurrent.blocking
//  Future{
//    blocking{
//      mylock.lock()
//      // ...
//    }
//  }
//
//
//  implicit val ec=ExecutionContext.global
//
//  for( i <- 1 to 32000){
//    Future{
//      blocking{
//        Thread.sleep(99999)
//      }
//    }
//  }
//
////  Adapting a JavaExecutor, Wrapping a Java Executor inside Execution Context
//  ExecutionContext.fromExecutor(new ThreadPoolExecutor( /*
//
//
//  */
//  ))
//
//  // execution of fatMatrix.inverse()
//  //
//
//
//  // Looks like a nightmare to all the companies, but the thing is the only time where a candidate looks forward for a better opportunity to work with
//  // If you are giving an opportunity that means you should promise a very high value
//  // I don't care about the high hours of working, and neither the work-life balance
//  // I am high up about the time I would get to spend in a Start up,
//  // I am really looking forward for a starup like yours reason being a very good learning opportunity
//  // We can try out things set practices, there will be enough workload on my shoulder so that I can grow.
//  //
//
//
//
// }