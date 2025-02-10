package Core


case class Ajith(name : String , Age : Int)

object CaseClassExample extends App{

  val name1 =Ajith("Ajith",26)
  val name2 = Ajith("Ajith", 26)
  val name3 = Ajith("Ajith", 26)



  if(name1.Age.equals(name2.Age)){
    println("It is true")
    println(s"Name is ${name1.name} and Age is ${name1.Age}")  // this is string Interpolation  right
  }else{
    println("It is not a true")
  }

}

