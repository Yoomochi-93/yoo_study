package one

import scala.io.Source

object second_step {
  def main(args: Array[String]): Unit ={
    println("Second Step")

    // Array
    val greetStrings = new Array[String](3)
    val greetString2 : Array[String] = new Array[String](3)

    greetStrings(0) = "Hello"
    greetStrings(1) = ","
    greetStrings(2) = "world!\n"

    for(i <- 0 to 2)
      print(greetStrings.apply(i))
      //print(greetStrings(i))

    // List
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val sum = oneTwo ::: threeFour
    println(sum)

    val twoThree = List(2,3)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)

    val oneTwoThree2 = 1 :: 2::3::Nil
    println(oneTwoThree2)


    // Tuple
    val pair = (99, "test")
    println(pair)
    println(pair._1)
    println(pair._2)

    val test = ("1", '2', 3, 4.0, true)
    println(test)

    // Set, Map
    var jetSet = Set("Boeing", "Airbus")
    println(jetSet)
    jetSet += "Lear"
    println(jetSet)
    println(jetSet.contains("Cessna"))

    import scala.collection.mutable.Set
    val movieSet = Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)

    var jetMap = Map(("Boeing", 1), ("Airbus", 2))
    println(jetMap)
    jetMap += (("Lear", 3))
    println(jetMap)
    println(jetMap.contains("Cessna"))

    println(System.getProperty("user.dir"))

    // File Read
    for(line <- Source.fromFile("./src/main/scala/first_step.scala").getLines())
        println(line.length + " " + line)

    val s = "Hello, World!"
    println(s indexOf 'o')
    println(s indexOf ('o', 5))

    val s2 = " Hello, world"
    println(s2.toLowerCase())
    println(s2.toUpperCase)
  }
}
