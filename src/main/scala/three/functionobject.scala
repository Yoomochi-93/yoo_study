package three

object functionobject extends App{
  implicit def intToRational(x: Int) = new Rational(x)

  val oneHalf = new Rational(1, 2)
  val twoThirds = new Rational(2, 3)

  val sample = oneHalf add twoThirds
  println(sample)
//  print(sample.number)
//  print(sample.denom)

  val gcdSample = new Rational(66, 42)
  println(gcdSample)

  println(oneHalf + twoThirds)
  println(oneHalf + oneHalf + twoThirds)
  println((oneHalf + oneHalf) * twoThirds)
  println(oneHalf + (oneHalf * twoThirds))
  println(oneHalf + 2)
  println(2 * twoThirds)

}
