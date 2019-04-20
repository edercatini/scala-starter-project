package br.com.overview

import scala.collection.mutable.Set

object MutableSet {

  def main(args: Array[String])= {

    val firstSet = Set("1", "1", "2")
    firstSet.foreach(item => println(item))
  }
}