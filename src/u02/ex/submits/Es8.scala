package u02.ex.submits

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object Es8:

  // Exercise
  enum Option[A]:
    case Some(a: A)
    case None()

  object Option:

    def filter[A](opt: Option[A])(f: A => Boolean): Option[A] = opt match
      case Some(a) => if (f(a)) Some(a) else None()
      case _ => None()

    def map[A](opt: Option[A])(f: A => Boolean): Option[Boolean] = opt match
      case Some(a) => Some(f(a))
      case _ => None()

    def map2[A, B](opt1: Option[A], opt2: Option[B]): Option[(A, B)] = (opt1, opt2) match
      case (Some(a), Some(b)) => Some((a, b))
      case _ => None()

  // Test
  import Option.*

  private val s1: Option[Int] = Some(5)
  private val s2: Option[Int] = None()
  private val s3: Option[String] = Some("Dieci")

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