package br.com.spark

import br.com.spark.utils.SparkUtils._

object App {

  def main(args: Array[String]): Unit = {

    createFile
    rddToDF(processRDD(createRDD)).show()
  }
}