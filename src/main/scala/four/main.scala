package four

import Element.elem

object main extends App{

//  def invokeDemo(e: Element) = {
//    e.demo()
//  }

//  val ae = new ArrayElement(Array("Hello", "world"))
//  println(ae.width)
//
//  invokeDemo(new ArrayElement(Array("Hello", "world")))
//  invokeDemo(new LineElement("Hello world"))
//  invokeDemo(new UniformElenet('a',1,2))

  val space = elem(" ")
  val corner = elem("+")

  def spiral(nEdges: Int, direction: Int) : Element = {
    if (nEdges == 1)
      elem("+")
    else{
      val sp = spiral(nEdges -1, (direction + 3) % 4)
      def verticalBar = elem('|', 1, sp.height)
      def horizontalBar = elem('-', sp.width, 1)
      if (direction == 0)
        (corner beside horizontalBar) above (sp beside space)
      else if (direction == 1)
        (sp above space) beside (corner above verticalBar)
      else if (direction == 2)
        (space beside sp) above (horizontalBar beside corner)
      else
        (verticalBar above corner) beside (space above sp)
    }
  }

  val nSides = 20
  println(spiral(nSides, 0))
}
