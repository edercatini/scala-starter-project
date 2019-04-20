package br.com.overview

object Factorial {

  def main(args: Array[String])= {

    def factorial(number: Int): Int = if (number > 1) number * factorial(number - 1) else number

    println(factorial(5))
    println(factorial(6))
  }
}