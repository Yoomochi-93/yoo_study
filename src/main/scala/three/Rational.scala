package three

class Rational(n : Int, d: Int) {

  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val number = n / g
  val denom  = d / g

  def this(n: Int) = this(n, 1)

  def add(that: Rational) : Rational = {
    new Rational(number * that.denom + that.number * denom, denom * that.denom)
  }

  def + (that: Rational) : Rational = {
    new Rational(
      number * that.denom + that.number * denom,
      denom * that.denom
    )
  }

  def + (i : Int) : Rational = {
    new Rational(number + i * denom, denom)
  }

  def - (that : Rational) : Rational = {
    new Rational(
      number * that.denom - that.number * denom,
      denom * that.denom
    )
  }

  def - (i : Int) : Rational = {
    new Rational(number - i * denom, denom)
  }

  def * (that: Rational) : Rational = {
    new Rational(number * that.number, denom * that.denom)
  }

  def * (i : Int) : Rational = {
    new Rational(number * i, denom)
  }

  def / (that: Rational) : Rational = {
    new Rational(number * that.denom, denom * that.number)
  }

  def / (i : Int) : Rational = {
    new Rational(number, denom * i)
  }

  def lessthan(that : Rational) = this.number * that.denom < that.number * this.denom

  def max(that: Rational): Unit = {
    if(this.lessthan(that)) that else this
  }

  override def toString() = number + "/" + denom

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
