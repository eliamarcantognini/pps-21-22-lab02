package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.ex.OptionalsEx.OptionEx
import u02.ex.OptionalsEx.OptionEx.*

class OptionExTest:

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

