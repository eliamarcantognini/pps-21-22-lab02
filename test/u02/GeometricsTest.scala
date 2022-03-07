package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.ex.Geometrics.Shape.{Circle, Rectangle, Square}
import u02.ex.Geometrics.perimeter

class GeometricsTest:

  private val rect = Rectangle(5, 2)
  private val circle = Circle(3)
  private val square = Square(4)

  @Test def perimeterTest(): Unit =
    assertEquals(perimeter(rect), 14)
    assertEquals(perimeter(circle), 6 * Math.PI)
    assertEquals(perimeter(square), 16)
