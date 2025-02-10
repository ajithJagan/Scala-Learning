package Core

class Ajith1(Age: Int, Name: String)

object NormalClass extends App {

  val one1 = new Ajith1(26, "Ajith")
  val one2 = new Ajith1(26, "Ajith")

  if (one1.equals(one2)) {
    println("Its equal")
  }else{
    println("Its not equal")
  }
}
