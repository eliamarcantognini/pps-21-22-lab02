package u02.ex

object Functions extends App:

  // val to function literal
  val parity: Int => String = _ match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  // method syntax
  def parity2(x: Int): String = x match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  println(parity(10))
  println(parity2(5))
