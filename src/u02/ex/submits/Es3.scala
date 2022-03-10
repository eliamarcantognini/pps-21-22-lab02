package u02.ex.submits

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test

object Es3:

  // Exercise paste from:
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/src/u02/ex/Functions.scala
  def negWithGenerics[X](p: X => Boolean): X => Boolean = !p(_)

  // Test paste from:
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/test/u02/ex/FunctionsTest.scala
  private val empty: String => Boolean = _ == ""
  private val n1 = 10
  
  @Test def negWithGenericsTest(): Unit =
    def isEven(n: Int): Boolean = n % 2 == 0
    val isOdd = negWithGenerics(isEven)
    val notEmptyWithGenerics = negWithGenerics(empty)
    assertFalse(isOdd(n1))
    assertTrue(notEmptyWithGenerics("foo"))
