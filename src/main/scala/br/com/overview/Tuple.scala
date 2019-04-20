package br.com.overview

object Tuple {

  def main(args: Array[String]) = {

    val firstTuple = (1, "Nina", 5)
    println(firstTuple._1)
    println(firstTuple._2)
    println(firstTuple._3)

    val (code, name, age) = firstTuple
    println(code)
    println(name)
    println(age)
  }
}