package u02

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.ex.Functions.*

class ComposeFunctionsTest:

  private val n = 5
  private val f1: Int => Int = _ - 1
  private val f2: Int => Int = _ * 2
  private val f3: String => Boolean = _.isEmpty()
  private val f4: String => String = _.toUpperCase()

  @Test def composeTest(): Unit =
    assertEquals(compose(f1, f2)(n), 9)

  @Test def composeWithGenericsTest(): Unit =
    assertEquals(composeWithGenerics(f1, f2)(n), 9)
    assertFalse(composeWithGenerics(f3, f4)("ciao"))

