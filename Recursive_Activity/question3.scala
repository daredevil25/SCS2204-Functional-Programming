// Index : 19000413
// Name: N.D.Dissanayake

import scala.io.StdIn.readInt

object question3 extends App{
   def add(n:Int):Int = n match{
      case 1 => 1
      case _ => n + add(n-1)
   } 

   printf("Enter number: ")
   var n = readInt()
   println(add(n))
}