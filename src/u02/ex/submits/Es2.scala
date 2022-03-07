package u02.ex.submits

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test

object Es2:

  // Exercise
  def neg(p: String => Boolean): String => Boolean = !p(_)
  
  // Test
  private val empty: String => Boolean = _ == ""
  private val notEmpty = neg(empty)
  
  @Test def negTest(): Unit =
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty(""))

