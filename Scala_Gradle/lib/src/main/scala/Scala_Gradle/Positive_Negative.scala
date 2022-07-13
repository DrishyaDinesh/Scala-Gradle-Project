package Scala_Gradle

import scala.io.StdIn.readLine

object Positive_Negative extends App {
  println("Enter the number: ")
  val x = readLine().toInt
  if (x > 0) {
    println(s"$x IS POSITIVE")
  }
  else if (x < 0) {
    println(s"$x IS NEGATIVE")
  }
  else {
    println(s"$x IS ZERO")
  }
}
