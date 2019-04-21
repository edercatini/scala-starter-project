package br.com.aws.services

import java.io.{File, IOException}

import com.amazonaws.regions.Regions
import com.amazonaws.services.s3.AmazonS3ClientBuilder
import com.amazonaws.services.s3.transfer.TransferManagerBuilder
import com.amazonaws.{AmazonClientException, AmazonServiceException}
import org.slf4j.LoggerFactory

object StorageService {

  val region = Regions US_EAST_1
  val logger = LoggerFactory.getLogger(this.getClass)
  val client = AmazonS3ClientBuilder.standard.withRegion(region).build
  val s3 = TransferManagerBuilder.standard.withS3Client(client).build

  def getBucketLocationByName(bucketName: String) =
    client.getBucketLocation(bucketName)

  def putObject(bucketName: String, directoryPath: String, includeSubdirectories: Boolean = true) = {

    try {
      s3 uploadDirectory(bucketName, "", new File(directoryPath + "/"), includeSubdirectories)
    } catch {
      case amazonServiceException: AmazonServiceException => logger error amazonServiceException.getMessage
      case amazonClientException: AmazonClientException => logger error amazonClientException.getMessage
      case illegalArgumentException: IllegalArgumentException => logger error illegalArgumentException.getMessage
      case ioException: IOException => logger error ioException.getMessage
      case exception: Exception => logger error exception.getMessage
    }
  }
}