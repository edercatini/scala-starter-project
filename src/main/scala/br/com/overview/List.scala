package br.com.overview

object List {

  def main(args: Array[String])= {

    val second = Array.apply("4", "5", "6")
    second.foreach(value => println(value))
    for (value <- second) println(value)

    val first = Array("1", "2", "3")
    first.foreach(value => println(value))
    for (value <- first) println(value)

    val third = 1 :: 2 :: 3 :: Nil

    println(third.head)
    println(third.tail)

    val firstList = 1 :: 2 :: 3 :: 4 :: Nil
    val secondList = firstList ::: 5 :: 6 :: 7 :: 8 :: Nil
    val thirdList = secondList ::: 9 :: 10 :: Nil

    thirdList.foreach(element => println(element))
  }
}