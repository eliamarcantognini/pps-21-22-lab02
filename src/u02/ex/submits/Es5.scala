package u02.ex.submits

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse}
import org.junit.jupiter.api.Test

object Es5:

  // Exercise paste from:
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/src/u02/ex/Functions.scala
  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  def composeWithGenerics[A, B, C](f: B => C, g: A => B): A => C = x => f(g(x))

  // Test paste from: 
  // https://github.com/eliamarcantognini/pps-21-22-lab02/blob/master/test/u02/ex/ComposeFunctionsTest.scala
  private val n = 5
  private val f1: Int => Int = _ - 1
  private val f2: Int => Int = _ * 2
  private val f3: String => Boolean = _.isEmpty()
  private val f4: String => String = _.toUpperCase()
  
  @Test def composeTest(): Unit =
    assertEquals(compose(f1, f2)(n), 9)

  @Test def composeWithGenericsTest(): Unit =
    assertEquals(composeWithGenerics(f1, f2)(n), 9)
    assertFalse(composeWithGenerics(f3, f4)("ciao"))

