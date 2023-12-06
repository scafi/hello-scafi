plugins {
    application
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.12")
    implementation("it.unibo.scafi:scafi-core_2.13:1.2.0")
}

application {
    // Define the main class for the application
    mainClassName = "examples.HelloScafi"
}

