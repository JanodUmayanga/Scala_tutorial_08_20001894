import scala.math._

object Q1 extends App {

  case class Point(a: Int, b: Int) {
    def x: Int = a

    def y: Int = b

    //a
    def + (op: Point) = Point(this.x + op.x, this.y + op.y)

    //b
    def move (dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

    //d
    def invert = Point(this.y, this.x)

  }

  //c
  def distance (p1: Point, p2: Point): Double = pow((pow(p1.x - p2.x, 2) + pow(p1.y - p2.y, 2)), 0.5)

  val p1 = Point(6, 9)

  val p2 = Point(2, 3)

  println(p1+p2)

  println(p1.move(3,-7))

  println(p1.invert)

  val d = distance(p1, p2)

  println(d)

}
