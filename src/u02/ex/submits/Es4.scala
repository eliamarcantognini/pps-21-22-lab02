package u02.ex.submits

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test

object Es4:

  // Exercise paste from:
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/src/u02/ex/Functions.scala
  val valWithCurrying: Double => Double => Double => Boolean =
    (x: Double) => (y: Double) => (z: Double) => x <= y && y <= z

  val valWithoutCurrying: (Double, Double, Double) => Boolean = (x, y, z) => x <= y && y <= z

  def defWithCurrying(x: Double)(y: Double)(z: Double): Boolean = x <= y && y <= z

  def defWithoutCurrying(x: Double, y: Double, z: Double): Boolean = x <= y && y <= z

  // Test paste from:
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/test/u02/ex/CurryingFunctionsTest.scala
  private val d1 = 3.0
  private val d2 = 7.5
  private val d3 = 9.2

  @Test def valWithCurryingTest(): Unit =
    assertTrue(valWithCurrying(d1)(d2)(d3))
    assertFalse(valWithCurrying(d2)(d1)(d3))

  @Test def valWithoutCurryingTest(): Unit =
    assertTrue(valWithoutCurrying(d1, d2, d3))
    assertFalse(valWithoutCurrying(d2, d1, d3))

  @Test def defWithCurryingTest(): Unit =
    assertTrue(defWithCurrying(d1)(d2)(d3))
    assertFalse(defWithCurrying(d2)(d1)(d3))

  @Test def defWithoutCurryingTest(): Unit =
    assertTrue(defWithoutCurrying(d1, d2, d3))
    assertFalse(defWithoutCurrying(d2, d1, d3))
