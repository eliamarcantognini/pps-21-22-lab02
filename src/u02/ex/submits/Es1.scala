package u02.ex.submits

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test

object Es1:

  // Exercise
  val parity: Int => String = n => if (n % 2 == 0) "even" else "odd"
  def parity2(x: Int): String = x match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  // Test
  private val n1 = 10
  private val n2 = 5

  @Test def parityTest(): Unit =
    assertEquals(parity(n1), "even")
    assertEquals(parity(n2), "odd")

  @Test def parity2Test(): Unit =
    assertEquals(parity2(n1), "even")
    assertEquals(parity2(n2), "odd")
