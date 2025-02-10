package BasicCode


object VowelsCheck extends App {

  private def vowelsCheck(name: String): Boolean = {
    val vowel = Set('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U')
    name.exists(vowel)
  }
 println(vowelsCheck("sss"))

}
