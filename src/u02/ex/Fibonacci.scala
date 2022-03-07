package u02.ex

object Fibonacci:

  def fib(n: Int): Int = n match
    case 0 => 0
    case 1 | 2 => 1
    case _ => fib(n-1) + fib(n-2)

