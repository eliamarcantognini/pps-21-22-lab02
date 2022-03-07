package u02.ex

object Geometrics extends App:

  enum Shape:
    case Rectangle(side1: Double, side2: Double)
    case Circle(radius: Double)
    case Square(side: Double)

  import Shape.*

  def perimeter(shape: Shape): Double = shape match
    case Rectangle(s1, s2) => s1 * 2 + s2 * 2
    case Circle(r) => 2 * Math.PI * r
    case Square(s) => s * 4

  def area(shape: Shape): Double = shape match
    case Rectangle(s1, s2) => s1 * s2
    case Circle(r) => Math.PI * r * r
    case Square(s) => s * s