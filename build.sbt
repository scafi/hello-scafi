val scafi_core  = "it.unibo.apice.scafiteam" %% "scafi-core"  % "0.3.2"

ThisBuild / scalaVersion := "2.11.8"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies ++= Seq(scafi_core)
  )
