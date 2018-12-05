import Dependencies._

lazy val sparkBenchPath = "F:\\IdeaProject\\spark-bench_2.3.0_0.4.0-RELEASE\\lib"
lazy val sparkVersion = "2.2.0"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "WordGenerator",
    libraryDependencies += scalaTest % Test,
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core"  % sparkVersion % "provided",
      "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
      "org.apache.spark" %% "spark-sql"   % sparkVersion % "provided"
    ),
    unmanagedBase := new java.io.File(sparkBenchPath)
)
