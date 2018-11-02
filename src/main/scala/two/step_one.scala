package two

import scala.io.Source

object step_one {
  def main(args : Array[String]): Unit ={
    println("day2 step one")

    //var vs val, 리펙토링
    // 함수형 프로그래밍 기초 -> 부수효과 (Unit), var이 없는 표현
    val testdata = Array("Hello", "," , "World")
    printvarArgs(testdata)
    printvalArgs(testdata)

    val res = formatArgs(Array("zero", "one", "two"))
    assert(res == "zero\none\ntwo")

//    val lines = Source.fromFile("./src/main/scala/one//main.scala").getLines().toList
//    println(lines)
//    val longestLines = lines.reduceLeft(
//      (a,b) => if (a.length > b.length) a else b
//    )
//
//    println(longestLines)
//    val maxWidth = stringlength(longestLines)
//
//    for (line <- lines){
//      val numSpace = maxWidth - stringlength(line)
//      val padding = " " * numSpace
//      println(padding + line.length + " | " + line)
//    }

    val lines = Source.fromFile("./src/main/scala/one//main.scala").getLines().toList
    val maxWidth = stringlength(longestLine(lines))
    for (line <- lines){
      val numSpace = maxWidth - stringlength(line)
      val padding = " " * numSpace
      println(padding + line.length + " | " + line)
    }
  }

  def printvarArgs(testdata: Array[String]): Unit ={
    var i = 0
    while ( i < testdata.length)
    {
      println(testdata(i))
      i += 1
    }
  }
  def printvalArgs(testdata: Array[String]): Unit ={
    for (testdatas <- testdata)
      println(testdatas)

    testdata.foreach(println)
  }
  def formatArgs(testdata : Array[String]) = testdata.mkString("\n")
  def stringlength(s : String)= s.length.toString().length

  def longestLine(l : List[String])= l.reduceLeft((a,b) => if (a.length > b.length) a else b)
}
