object question3 extends App{

  def wholesaleCost(amnt:Int):Double=amnt*0.6*24.95 + (if(amnt>50) 50*3+(amnt-50)*0.75 else amnt*3);

  println(wholesaleCost(60));

}
