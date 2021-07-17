// Index : 19000413
// Name: N.D.Dissanayake

import scala.io.StdIn.readInt

object question5 extends App{
   def addEven(n: Int):Int = n match{
      case 0 => 0
      case x if x%2==1 => addEven(n-1)
      case _ => n + addEven(n-2)
   }

   printf("Enter number: ")
   var n = readInt()
   println(addEven(n))
}