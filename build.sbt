ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.0"
libraryDependencies += "org.antlr" % "antlr4-runtime" % "4.13.1"
libraryDependencies += "org.typelevel" %% "cats-core" % "2.10.0"

lazy val root = (project in file("."))
  .settings(
    name := "flang",
    idePackagePrefix := Some("org.lambda.flang")
  )