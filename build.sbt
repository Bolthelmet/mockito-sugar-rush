name := "mockito-sugar-rush"

organization := "com.github.bolthelmet"

version := "1.2"

scalaVersion := "2.12.1"

crossScalaVersions := Seq("2.10.2", "2.11.8", "2.12.1")

libraryDependencies ++=  Seq(
  "org.scalatest" %% "scalatest" % "3.0.1",
  "org.mockito" % "mockito-all" % "1.9.5"
)

