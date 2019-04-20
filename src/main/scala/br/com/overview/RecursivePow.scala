package br.com.overview

object RecursivePow {

  val SIZE = 10

  def main(args: Array[String]): Unit = {

    def manualPow(number: Double, powFactor: Double): Double = if (powFactor > 0) number * Math.pow(number, powFactor - 1) else number
    println(manualPow(3, 4))

    val list = 1 :: 10 :: 50 :: 30 :: 40 :: Nil
    val anotherList = list ::: 35 :: 23 :: 101 :: 4 :: Nil

    println(anotherList.reduceLeft(_ min _))
    println(anotherList.reduceLeft(_ max _))
  }
}