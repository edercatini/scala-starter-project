package br.com.overview

object TypedArray {

  def main(args: Array[String]) = {

    val stringArray = new Array[String](3)

    stringArray(0) = "A"
    stringArray(1) = "B"
    stringArray(2) = "C"

    stringArray.foreach(data => println(data))
  }
}