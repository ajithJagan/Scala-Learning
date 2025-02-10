package BasicCode

object OddEven extends App {

  for (i  <- 1 to 10) {
    if (i % 2 == 0) {
      println(i + " even number")
    }
    else {
      println(i + " odd number")
    }


  }
}
