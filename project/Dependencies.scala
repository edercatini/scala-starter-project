import sbt._

object Dependencies {

    private lazy val testDependencies = Seq(

    )

    private lazy val devDependencies = Seq(
      "org.apache.spark" %% "spark-core" % "2.4.0",
      "org.apache.spark" %% "spark-sql" % "2.4.0",
      "com.amazonaws" % "aws-java-sdk-s3" % "1.11.538",
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
    )

    val default = testDependencies ++ devDependencies
}