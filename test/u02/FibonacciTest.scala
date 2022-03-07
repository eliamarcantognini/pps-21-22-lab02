package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.ex.Fibonacci.{fib, fibTailRec}

class FibonacciTest:

  @Test def fibTest(): Unit =
    assertEquals((fib(0), fib(1), fib(2), fib(3), fib(4), fib(5)), (0, 1, 1, 2, 3, 5))

  @Test def fibTailRecTest(): Unit =
    assertEquals((fibTailRec(0), fibTailRec(1), fibTailRec(2),
      fibTailRec(3), fibTailRec(4), fibTailRec(5)),
      (0, 1, 1, 2, 3, 5))
    val n = 2880067194370816120L
    assertEquals(fibTailRec(90), 2880067194370816120L )
