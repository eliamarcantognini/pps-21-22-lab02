package u02.ex.submits

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object Es7:

  // Exercise paste from:
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/src/u02/ex/Geometrics.scala
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

  // Test paste from:
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/test/u02/ex/GeometricsTest.scala
  private val rect = Rectangle(5, 2)
  private val circle = Circle(3)
  private val square = Square(4)

  @Test def perimeterTest(): Unit =
    assertEquals(perimeter(rect), 14)
    assertEquals(perimeter(circle), 6 * Math.PI)
    assertEquals(perimeter(square), 16)

  @Test def areaTest(): Unit =
    assertEquals(area(rect), 10)
    assertEquals(area(circle), 9 * Math.PI)
    assertEquals(area(square), 16)
