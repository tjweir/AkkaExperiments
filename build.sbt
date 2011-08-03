name := "AkkaExperiments"

version := "1.0"

organization := "com.meetu.akka"

scalaVersion := "2.9.0-1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "se.scalablesolutions.akka" % "akka-actor" % "1.1.3",
  "se.scalablesolutions.akka" % "akka-typed-actor" % "1.1.3",
  "se.scalablesolutions.akka" % "akka-amqp" % "1.1.3"
)

libraryDependencies += "org.scalatest" % "scalatest_2.9.0" % "1.6.1"

libraryDependencies += "junit" % "junit" % "4.8.1"
