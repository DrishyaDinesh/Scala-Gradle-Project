package Scala_Gradle

import scala.io.StdIn.readLine

object GettingInput {
  def main(args: Array[String]): Unit = {
    println("Enter your name : ")
    val a = readLine()
    println("My name is : " + a)
  }
}
