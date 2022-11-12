ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "ScalazExample"
  )

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.3.2"
libraryDependencies += "com.github.sbt" % "junit-interface" % "0.13.2" % Test