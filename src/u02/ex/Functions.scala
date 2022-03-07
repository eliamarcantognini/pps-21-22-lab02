package u02.ex

object Functions extends App:

  // a)
  val parity: Int => String = n => if (n % 2 == 0) "even" else "odd"
  def parity2(x: Int): String = x match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  // b)
  def neg(p: String => Boolean): String => Boolean = !p(_)

  // c
  def negWithGenerics[X](p: X => Boolean): X => Boolean = !p(_)
