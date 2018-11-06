package three

object Recursionfunction extends App{

  def bang(x: Int): Int ={
    if (x == 0) throw new Exception("Bang!")
    else bang(x - 1)
  }

  bang(10)
}
