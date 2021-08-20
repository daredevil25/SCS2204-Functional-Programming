// Index : 19000413
// Name  : N.D.Dissanayake

class Rational(a: Int, b: Int) {
  def numerator = a;
  def denominator = b;

  def neg() = new Rational(-this.numerator, this.denominator);

  override def toString: String =
    this.numerator.toString() + "/" + this.denominator.toString();
}

object question1 extends App {
  var r1 = new Rational(2, 5);
  printf("Original Rational: %s\n", r1);
  printf("Nagative Rational: %s\n", r1.neg());
}
