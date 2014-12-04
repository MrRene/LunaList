name := "LunaList"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
)     

play.Project.playScalaSettings
