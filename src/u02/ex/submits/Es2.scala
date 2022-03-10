package u02.ex.submits

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test

object Es2:

  // Exercise paste from:
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/src/u02/ex/Functions.scala
  def neg(p: String => Boolean): String => Boolean = !p(_)

  // Test paste from:
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/test/u02/ex/FunctionsTest.scala
  private val empty: String => Boolean = _ == ""
  private val notEmpty = neg(empty)
  
  @Test def negTest(): Unit =
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty(""))

