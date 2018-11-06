package four

class ArrayElement(
  val contents: Array[String]
) extends Element

class LineElement(s: String) extends ArrayElement(Array(s))
{
  override def width = s.length
  override def height = 1
}

object main extends App{
  val ae = new ArrayElement(Array("Hello", "world"))
  println(ae.width)
}
