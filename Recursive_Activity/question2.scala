// Index : 19000413
// Name: N.D.Diss~ayake

import scala.io.StdIn.readInt

object question2 extends App{
   def GCD(x: Int, y: Int):Int = y match{
      case 0 => x;
      case _ => GCD(y, x%y)
   }

   def prime(n: Int, k: Int=2): Boolean = n match{
      case x if (x < 2) => false
      case x if(x == k) => true
      case x if GCD(x, k) > 1 => false
      case _ => prime(n, k+1)
   }

   def primeSeq(n: Int):Unit = {
      if(n>1){
         primeSeq(n-1)
         if(prime(n)) println(n)
      }
   } 

   printf("Enter number: ")
   var n = readInt()
   primeSeq(n)
}