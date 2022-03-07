package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.ex.Fibonacci.fib

class FibonacciTest:

  @Test def fibTest(): Unit =
    assertEquals((fib(0), fib(1), fib(2), fib(3), fib(4)), (0, 1, 1, 2, 3))
