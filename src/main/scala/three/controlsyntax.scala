package three

import scala.io.Source

object controlsyntax extends App{

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while(a != 0){
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  // gcdLoop == gcd, while을 사용하기전 반드시 필요한가 확인필요
  def gcd(x: Long, y: Long): Long = {
    if ( y == 0 ) x else gcd(y, x % y)
  }

  val filename =
    if (!args.isEmpty) args(0)
    else println("gg")

  val filesHere = (new java.io.File("./src/main/scala/one/")).listFiles

  for (file <- filesHere
       if file.isFile
       if file.length >= 100
       if file.getName.endsWith(".scala")
  ) yield file

  def filelines(file : java.io.File) = scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern : String) =
    for (
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- filelines(file)
      if line.trim.matches(pattern)
    ) println(file + " : " + line.trim)

  def processFile(filename : String, width : Int) ={

    def processLine(line: String) = {
      if (line.length > width)
        println(filename + ":" + line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }

  grep(".*gcd.*")

  val forLinelength = for{
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- filelines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length

  //forLinelength.foreach(println)

  val gugu = new gugudan()
  println(gugu.multiTable())

  processFile("./src/main/scala/one/fileio.scala", 10)

  var increase = (x: Int) => x +1
  println(increase(10))

  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  someNumbers.foreach((x : Int) => println(x))
  println(someNumbers.filter((x: Int) => x > 0))

  someNumbers.foreach(x => println(x))
  println(someNumbers.filter((x) => x>0))

}
