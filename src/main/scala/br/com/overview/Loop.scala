package br.com.overview

object Loop {

  def main(args: Array[String]) = {

    val names = Array("Neno", "Neusa", "Nina")
    names.foreach(name => println(name))

    for (name <- names) println(name)
  }
}