package u02.ex.submits

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object Es6:
  
  // Exercise paste from:
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/src/u02/ex/Fibonacci.scala
  def fib(n: Int): Int = n match
    case 0 => 0
    case 1 | 2 => 1
    case _ => fib(n-1) + fib(n-2)

  def fibTailRec(n: Int): Long =
    @annotation.tailrec
    def _fib(n: Int, acc1: Long, acc2: Long): Long = n match
      case 0 => acc1
      case 1 => acc2
      case _ => _fib(n - 1, acc2, acc1 + acc2)
    _fib(n, 0, 1)

  // Test paste from:
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/test/u02/ex/FibonacciTest.scala
  @Test def fibTest(): Unit =
    assertEquals((fib(0), fib(1), fib(2), fib(3), fib(4), fib(5)), (0, 1, 1, 2, 3, 5))

  @Test def fibTailRecTest(): Unit =
    assertEquals((fibTailRec(0), fibTailRec(1), fibTailRec(2),
      fibTailRec(3), fibTailRec(4), fibTailRec(5)),
      (0, 1, 1, 2, 3, 5))
    val n = 2880067194370816120L
    assertEquals(fibTailRec(90), 2880067194370816120L )
