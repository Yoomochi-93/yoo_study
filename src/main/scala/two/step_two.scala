package two

import ChecksumAccumulator.calculate
object step_two {

  def main(args : Array[String]): Unit ={
    println("Day 2 step two")

    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }

}
