package u02.ex.submits

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object Es8:

  // Exercise
  enum OptionEx[A]:
    case Some(a: A)
    case None() // here parens are needed because of genericity

  object OptionEx:
    
    def filter[A](opt: OptionEx[A])(f: A => Boolean): OptionEx[A] = opt match
      case Some(a) => if (f(a)) Some(a) else None()
      case _ => None()
  
    def map[A, B](opt: OptionEx[A])(f: A => Boolean): OptionEx[Boolean] = opt match
      case Some(a) => Some(f(a))
      case _ => None()
  
    def map2[A, B](opt1: OptionEx[A], opt2: OptionEx[B]): OptionEx[(A, B)] = (opt1, opt2) match
      case (Some(a), Some(b)) => Some((a, b))
      case _ => None()

  // Test
  import OptionEx.*
  
  private val s1: OptionEx[Int] = Some(5)
  private val s2: OptionEx[Int] = None()
  private val s3: OptionEx[String] = Some("Dieci")

  @Test def filterTest(): Unit =
    assertEquals(filter(s1)(_ > 2), Some(5))
    assertEquals(filter(s1)(_ > 8), None())
    assertEquals(filter(s2)(_ > 2), None())

  @Test def mapTest(): Unit =
    assertEquals(map(s1)(_ > 2), Some(true))
    assertEquals(map(s1)(_ > 8), Some(false))
    assertEquals(map(s2)(_ > 2), None())

  @Test def map2Test(): Unit =
    assertEquals(map2(s1, s2), None())
    assertEquals(map2(s2, s1), None())
    assertEquals(map2(s1, s3), Some((5, "Dieci")))