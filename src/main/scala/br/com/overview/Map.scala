package br.com.overview

import scala.collection.mutable

object Map {

  def main(args: Array[String]) = {

    val myMap = mutable.HashMap(1 -> "First", 2 -> "Second")
    println(myMap(1))
    println(myMap(2))
  }
}