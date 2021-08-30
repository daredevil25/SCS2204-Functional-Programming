// Index : 19000413
// Name: N.D.Dissanayake

import scala.math._

case class Point(a: Int, b: Int) {
  def x: Int = a;
  def y: Int = b;

  def +(that: Point) = Point(this.x + that.x, this.y + that.y);
  def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy);
  def distance(that: Point) = sqrt(
    pow((this.x - that.x), 2) + pow((this.y - that.y), 2)
  )
  def invert() = Point(this.y, this.x);

  override def toString = "(" + x + "," + y + ")";
}

object question1 extends App {
  val p1 = Point(6, 7)
  print("p1: " + p1 + "\n");
  val p2 = Point(11, 4)
  print("p2: " + p2 + "\n");
  val p3 = p1 + p2;
  print("p3 = p1 + p2: " + p3 + "\n");
  val p4 = p3.move(-4, 2)
  print("p4 = After moving p3 by dx = -4 and dy = 2: " + p4 + "\n");
  val p5 = Point(1, 8);
  print("p5: " + p5 + "\n");
  val d = p5.distance(p4);
  print("Distance between p4 and p5: " + d + "\n");
  val p6 = p5.invert();
  print("p6 = After switching x,y coordinates of p5: " + p6 + "\n");
}
