package five

object main extends App{
  println("asd")

  def multiply(m: Int)(n: Int): Int = m * n

  val sample = multiply(2) _
  println(sample(3))

}

// trait vs abstract class
// 생성자 매개변수가 필요한 경우 abstract class
// trait의 경우 여러가지 상속을 받을 수 있음

//trait Car{
//  val brand: String
//}
//
//trait Shiny{
//  val shineRefraction: Int
//}
//
//class BMW extends Car with Shiny {
//  val brand = "BMW"
//  val shineRefraction = 12
//}

// A => B => C
// => 함수의 인자(파라미터)와 함수 내용(바디)를 분리
// A => B => C == A => (B => C)
// A => B 에서 A는 function에 전달할 인자, B는 function Body