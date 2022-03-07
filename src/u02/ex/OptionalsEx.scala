package u02.ex

object OptionalsEx extends App {

  enum OptionEx[A]:
    case Some(a: A)
    case None() // here parens are needed because of genericity

  object OptionEx:

    def isEmpty[A](opt: OptionEx[A]): Boolean = opt match
      case None() => true
      case _ => false

    def orElse[A, B >: A](opt: OptionEx[A], orElse: B): B = opt match
      case Some(a) => a
      case _ => orElse

    def flatMap[A, B](opt: OptionEx[A])(f: A => OptionEx[B]): OptionEx[B] = opt match
      case Some(a) => f(a)
      case _ => None()

    def filter[A](opt: OptionEx[A])(pred: A => Boolean): OptionEx[A] = opt match
      case Some(a) => if (pred(a)) Some(a) else None() 
      case _ => None()
  
}
