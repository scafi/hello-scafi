plugins {
    application
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.12.14")
    implementation("it.unibo.scafi:scafi-core_2.12:0.3.3")
}

application {
    // Define the main class for the application
    mainClassName = "examples.HelloScafi"
}

