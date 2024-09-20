val scafi_core  = "it.unibo.scafi" %% "scafi-core"  % "1.2.0"

ThisBuild / scalaVersion := "2.13.15"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies ++= Seq(scafi_core)
  )
