package Scala_Gradle

import org.apache.spark.sql.SparkSession
import scala.io.StdIn.readLine

object Spark_DataFrame {
  def main(args:Array[String]): Unit ={
    println("Hello World")
    println("")
    println("Finding the sum of two user inputted numbers")
    val a = readLine("Enter value of a: ").toInt
    val b = readLine("Enter value of b: ").toInt
    val c = a+b
    println(s"Sum is $c")

    println("")
    println("Creating a Spark Session")
    val spark = SparkSession.builder()
      .master("local").appName("Sample Spark Application")
      .getOrCreate()

    import spark.implicits._
    println("Creating a DataFrame")
    val data = Seq(("Java", "20000"), ("Python", "100000"), ("Scala", "3000"))
    val dfSeq = data.toDF("language","users_count")
    dfSeq.show()
    println("DataFrame created")

    println("")
    println("Closing Program")
  }
}
