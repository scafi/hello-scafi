val scafi_core  = "it.unibo.scafi" %% "scafi-core"  % "0.3.3"

ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies ++= Seq(scafi_core)
  )
