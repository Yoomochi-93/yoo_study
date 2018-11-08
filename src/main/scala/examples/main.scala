package examples

import fileexample.fileBrowser.elem

object main extends App{
  println("Example Main")

  val filematcher = elem("./src/main/scala/four")

  println("--------------------- endWith ---------------------")
  filematcher.endWith(".scala").foreach(file => println("ends with : " + file))
  println("--------------------- startsWith ---------------------")
  filematcher.startsWith("flowcontrol").foreach(file => println("ends with : " + file))
  println("--------------------- contains ---------------------")
  filematcher.contains("nt").foreach(file => println("ends with : " + file))

}
