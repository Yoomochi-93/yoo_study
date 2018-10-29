object first_step {
  def main(args: Array[String]): Unit ={
    println("First Step")

    // 변수 선언
    // val : 재할당 불가능
    // var : 재할당 가능

    val msg = "Hello, World"
    println(msg)

    // 함수 호출
    println(max(10,20))
    greet

    // While
    var i = 0
    while(i < 10){
      print(i)
      i += 1
    }
    println("")
    //foreach & for
    var args = "asdfas asdf asd"
    args.foreach(args => print(args + "\t"))


  }

  // 함수 선언
  def max(x : Int, y : Int): Int = {
    if(x>y) x
    else y
  }

  def greet() = println("Greet Function Call")


}
