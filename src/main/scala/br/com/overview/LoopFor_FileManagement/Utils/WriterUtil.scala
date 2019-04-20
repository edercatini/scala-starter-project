package br.com.overview.LoopFor_FileManagement.Utils

import java.io.{BufferedWriter, FileWriter}

import scala.io.Source

object WriterUtil {

  val NUMBER = 5
  val REMAIN_FACTOR = 2
  val REMAIN_EQUAL = 0
  val FILE = "src/FirstPractice/test.txt"

  def writeNumbersOnFile() = {

    def createNumberList = for (number <- 1 to 10; if (number % REMAIN_FACTOR == REMAIN_EQUAL)) yield NUMBER * number

    def writeResultOnFile(numberList: List[Int]) = {

      val writer = new BufferedWriter(new FileWriter(FILE))
      numberList.foreach(number => writer.write(number.toString + "\n"))
      writer.close
    }

    def printLines = Source.fromFile(FILE).getLines foreach println

    writeResultOnFile(createNumberList.toList)
    printLines
  }
}
