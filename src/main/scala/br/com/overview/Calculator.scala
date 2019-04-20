package br.com.overview

class Calculator {

  private var number = 0

  def getNumber() = number
  def add(b: Byte) = number += b
  def checkNumber() = ~(this.number & 0xFF) + 1
}

object CalculatorExecutor {

  def main(args: Array[String]) = {

    val firstInstance = new Calculator()
    firstInstance.add(56)
    firstInstance.add(-30)
    println(firstInstance.getNumber())
    println(firstInstance.checkNumber())
  }
}