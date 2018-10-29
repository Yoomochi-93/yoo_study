import scala.io.Source

object fileio{
  var dut: fileDao = _

  def main(args: Array[String]): Unit = {
    println("리펙토링 테스트")

    dut = new fileDao("./src/main/scala/main.scala")
    println("For")
    dut.for_file_read()
    println("list")
    dut.list_file_Read()
    println("map")
    dut.map_file_read()
    println("no side effect For")
    dut.no_side_effect_for
    println("no side effect Map")
    dut.no_side_effect_map
  }
}
