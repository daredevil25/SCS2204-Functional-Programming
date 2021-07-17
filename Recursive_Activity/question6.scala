// Index : 19000413
// Name: N.D.Dissanayake

import scala.io.StdIn.readInt

object question6 extends App{
   def fib(n:Int): Int = n match{
      case 1 => 0
      case 2 => 1
      case _ => fib(n-1) + fib (n-2)
   }

   def fibSeq(n:Int): Unit ={
      if(n>1) fibSeq(n-1)
      println(fib(n))
   }

   printf("Enter number: ")
   var n = readInt()
   fibSeq(n)
}