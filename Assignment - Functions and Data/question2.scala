// Index : 19000413
// Name  : N.D.Dissanayake

class Rational(a: Int, b: Int) {
  require(b > 0, "The denominator should be positive")
  def numerator = a / gcd(a.abs, b);
  def denominator = b / gcd(a.abs, b);

  def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y);

  def -(r: Rational) = new Rational(
    this.numerator * r.denominator - this.denominator * r.numerator,
    this.denominator * r.denominator
  );

  override def toString: String =
    this.numerator.toString() + "/" + this.denominator.toString();
}

object question1 extends App {
  var r1 = new Rational(3, 4);
  var r2 = new Rational(5, 8);
  var r3 = new Rational(2, 7);
  var res = r1 - r2 - r3;

  printf("r1: %s\n", r1);
  printf("r2: %s\n", r2);
  printf("r3: %s\n", r3);
  printf("r1-r2-r3: %s\n", res);
}
