name := "ScalaConcepts"

version := "0.1"

scalaVersion := "2.12.8"

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor
libraryDependencies ++=  Seq (
  "com.typesafe.akka" %% "akka-actor" % "2.5.21",
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test
)