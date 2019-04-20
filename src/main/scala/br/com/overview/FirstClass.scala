package br.com.overview

object FirstClass {

  def main(args: Array[String]) = {

    def sum(x: Int, y: Int) = x + y
    def minus(x: Int, y: Int) =  x - y
    def times(x: Int, y: Int) = x * y
    def division(x: Int, y: Int) = x / y

    println(sum(1, 2))
    println(minus(1, 2))
    println(times(2, 2))
    println(division(2, 2))
  }
}