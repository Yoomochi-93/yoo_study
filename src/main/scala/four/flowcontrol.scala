package four

import java.io.{File, PrintWriter}

object flowcontrol extends App{
  private def fileHere = (new java.io.File("./src/main/scala/one/")).listFiles()

  //  def filesMatching(query: String, matcher: (String, String) => Boolean) = {
  //    for (file <- fileHere ; if matcher(file.getName, query))
  //      yield file
  //  }

  def filesMatching(matcher: String => Boolean) = {
    for (file <- fileHere ; if matcher(file.getName))
      yield file
  }

//  def filesEnding(query: String) = {
//    for (file <- fileHere; if file.getName.endsWith(query))
//      yield file
//  }

//  def filesEnding(query : String) = {
//    filesMatching(query, _.endsWith(_))
//  }

  def filesEnding(query : String) = {
    filesMatching(_.endsWith(query))
  }

//  def fileContaining(query: String)={
//    for (file <- fileHere; if file.getName.contains(query))
//      yield file
//  }

//  def filesContaining(query : String) = {
//    filesMatching(query, _.contains(_))
//  }

  def filesContaining(query: String) = {
    filesMatching(_.contains(query))
  }

//  def filesRegex(query: String) ={
//    for {
//      file <- fileHere
//      if file.getName.matches(query)
//    } yield file
//  }

//  def filesRegex(query : String) = {
//    filesMatching(query, _.matches(_))
//  }

  def fileRegex(query : String) = {
    filesMatching(_.contains(query))
  }

//  def containsNeg(nums: List[Int]): Boolean = {
//    var exists = false
//    for (num <- nums)
//      if (num < 0)
//          exists = true
//    exists
//  }

//  def containsOdd(nums : List[Int]) : Boolean = {
//    var exists = false
//    for (num <- nums)
//      if (num % 2 == 1)
//          exists = true
//    exists
//  }

  def containsNeg(nums: List[Int]) = nums.exists(_ < 0)
  def containsOdd(nums: List[Int]) = nums.exists(_ %2 == 1)

//  def withPrintWriter(file: File, op: PrintWriter => Unit) = {
//    val writer = new PrintWriter(file)
//    try{
//      op(writer)
//    }finally{
//      writer.close()
//    }
//  }

  def withPrintWriter(file: File)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try{
      op(writer)
    }finally{
      writer.close()
    }
  }

//  withPrintWriter(new File("./src/main/scala/four/date.txt"),
//    writer => writer.println(new java.util.Date()))

  val file = new File("./src/main/scala/four/date.txt")
  withPrintWriter(file){
    writer => writer.println(new java.util.Date())
  }
  val assertionsEnabled = true

  def byNameAssert(predicate: => Boolean) = {
    if (assertionsEnabled && !predicate)
      throw new AssertionError()
  }

}
