name := "mockito-sugar-rush"

organization := "com.github.bolthelmet"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++=  Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test"
)

