package BasicCode

object SwapThird extends App{

  private var a = 10
  private var b = 20

  println("Before")
  println("a is  = "+ a)
  println("b is  = "+ b)

  a= a+b 
  b= a-b
  a =a-b

  println("After")
  println("a is  = " + a)
  println("b is  = " + b)
  
  
}
