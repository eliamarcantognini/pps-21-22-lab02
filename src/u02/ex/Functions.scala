package u02.ex

object Functions extends App:

  // a)
  // val to function literal
  val parity: Int => String = n => if (n % 2 == 0) "even" else "odd"

  // method syntax
  def parity2(x: Int): String = x match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  // b)
  def neg(p: String => Boolean): String => Boolean = !p(_)
//  val neg: (String => Boolean) => String => Boolean = (p: String => Boolean) => !p(_)
  def negWithGenerics[X](p: X => Boolean): X => Boolean = !p(_)

  val empty: String => Boolean = _ == ""
  val notEmpty = neg(empty)
  // test provided by slide
  println(notEmpty("foo"))
  println(notEmpty(""))
  println(notEmpty("foo") && !notEmpty(""))