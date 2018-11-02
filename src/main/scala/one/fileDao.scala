package one

import scala.io.Source

class fileDao(recv_filename : String) {
  val filename = recv_filename

  def for_file_read(): Unit ={
    for (line <- Source.fromFile(filename).getLines())
      println(line.length + "\t|\t" + line)
  }

  def list_file_Read(): Unit ={
    val getfileline = Source.fromFile(filename).getLines()
    getfileline.foreach(getfileline => println(getfileline.length + "\t|\t" + getfileline))
  }

  def map_file_read(): Unit ={
    Source.fromFile(filename).getLines().map(line => line.length + "\t|\t" + line).foreach(println)
  }

  def no_side_effect_for() = for(line <- Source.fromFile(filename).getLines()) println(line.length + "\t|\t" + line)
  def no_side_effect_map() = Source.fromFile(filename).getLines().map(line => line.length + "\t|\t" + line).foreach(println)

}
