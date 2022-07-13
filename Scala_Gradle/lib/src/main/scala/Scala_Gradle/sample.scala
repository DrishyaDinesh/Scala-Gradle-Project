package Scala_Gradle

import scala.io.StdIn._

class sample {
  var name=""
  var std= 10

  def show(age: Int): Unit ={
    println("Hi, My name is "+name)
    println("I am "+age+" years old and I am studying in class "+std)
  }
  def userinput(): Int ={
    println("Enter your name : ")
    name = readLine()
    println("Enter your age : ")
    val b = readLine().toInt
    b
  }
}
