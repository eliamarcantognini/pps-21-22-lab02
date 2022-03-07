package u02.ex

object Functions extends App:

  val parity: Int => String = n => if (n % 2 == 0) "even" else "odd"
  def parity2(x: Int): String = x match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  def neg(p: String => Boolean): String => Boolean = !p(_)

  def negWithGenerics[X](p: X => Boolean): X => Boolean = !p(_)

  val valWithCurrying: Double => Double => Double => Boolean =
    (x: Double) => (y: Double) => (z: Double) => x <= y && y <= z
    
  val valWithoutCurrying: (Double, Double, Double) => Boolean = (x, y, z) => x <= y && y <= z
  
  def defWithCurrying(x: Double)(y: Double)(z: Double): Boolean = x <= y && y <= z
  
  def defWithoutCurrying(x: Double, y: Double, z: Double): Boolean = x <= y && y <= z