package u02

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.ex.Functions.{defWithCurrying, defWithoutCurrying, valWithCurrying, valWithoutCurrying}

class CurryingFunctionsTest:

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