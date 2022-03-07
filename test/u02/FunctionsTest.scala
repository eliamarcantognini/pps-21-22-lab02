package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.ex.Functions.*

class FunctionsTest:

  @Test def parityTest(): Unit =
    assertEquals(parity(10), "even")
    assertEquals(parity(5), "odd")
    
    
  @Test def parity2Test(): Unit =
    assertEquals(parity2(10), "even")
    assertEquals(parity2(5), "odd")