package u02

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.ex.Functions.*

class FunctionsTest:

  private val n1 = 10
  private val n2 = 5
  private val empty: String => Boolean = _ == ""
  private val notEmpty = neg(empty)
  private val d1 = 3.0
  private val d2 = 7.5
  private val d3 = 9.2


  @Test def parityTest(): Unit =
    assertEquals(parity(n1), "even")
    assertEquals(parity(n2), "odd")


  @Test def parity2Test(): Unit =
    assertEquals(parity2(n1), "even")
    assertEquals(parity2(n2), "odd")

  @Test def negTest(): Unit =
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty(""))

  @Test def negWithGenericsTest(): Unit =
    def isEven(n: Int): Boolean = n % 2 == 0
    val isOdd = negWithGenerics(isEven)
    val notEmptyWithGenerics = negWithGenerics(empty)
    assertFalse(isOdd(n1))
    assertTrue(notEmptyWithGenerics("foo"))

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