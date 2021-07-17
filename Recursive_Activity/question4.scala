// Index : 19000413
// Name: N.D.Dissanayake

import scala.io.StdIn.readInt

object question4 extends App{
   def isEven(n: Int): Boolean = n match{
      case 0 => true
      case _ => isOdd(n-1)
   }

   def isOdd(n: Int): Boolean = !isEven(n)

   printf("Enter number: ")
   var n = readInt()
   if(isEven(n)) 
      println("Even") 
   else 
      println("Odd")
}