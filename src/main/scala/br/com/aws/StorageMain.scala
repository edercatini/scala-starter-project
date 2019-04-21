package br.com.aws

import br.com.aws.services.StorageService._

object StorageMain {

  def main(args: Array[String]): Unit = {

    val bucketName = "bucket-name-here"
    val sourceToUpload = "source-here/"
    val recursive = true

    putObject(bucketName, sourceToUpload, recursive)
  }
}