package br.com.spark.utils

import java.io.{BufferedWriter, File, FileWriter}

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

object SparkUtils {

  val fileName = "spark-doc"
  val sparkConf = new SparkConf().setMaster("local[2]").setAppName("app")
  val sparkContext = new SparkContext(sparkConf)
  val sparkSession = SparkSession.builder.config(sparkConf).getOrCreate

  def rddToDF(rdd: RDD[String]) = {
    import sparkSession.sqlContext.implicits._
    rdd.toDF
  }

  def createFile = {
    val file = new File(fileName)
    val writer = new BufferedWriter(new FileWriter(file))
    for (i <- 1 to 5000) writer write(i.toString + "\n")
    writer close
  }

  def createRDD=
    sparkContext.textFile(fileName).filter(line => line.toInt % 2 == 0).sortBy(_.toInt, true, 1)

  def processRDD(rdd: RDD[String]) =
    rdd.filter(line => line.toInt % 2 == 0).map(element => element * 3)
}