package br.com.overview

object ImutableSet {

  def main(args: Array[String]) = {

    val firstSet = Set.apply("1", "2", "3")
    firstSet.foreach(firstSetItem => println(firstSetItem))

    val secondSet = Set("4", "5", "6", "1")
    for (secondSetItem <- secondSet) println(secondSetItem)

    val thirdSet = firstSet ++ secondSet
    thirdSet.foreach(thirdSetItem => println(thirdSetItem))

    val fourthSet = thirdSet -- firstSet
    for (fourthSetItem <- fourthSet) println(fourthSetItem)
  }
}