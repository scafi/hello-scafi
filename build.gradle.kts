plugins {
    application
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.11")
    implementation("it.unibo.scafi:scafi-core_2.13:1.1.7")
}

application {
    // Define the main class for the application
    mainClassName = "examples.HelloScafi"
}

