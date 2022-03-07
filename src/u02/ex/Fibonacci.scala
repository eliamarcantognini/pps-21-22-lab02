package u02.ex

object Fibonacci:

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

