plugins {
    id("java")
    id("ca.coglinc.javacc") version "2.4.0"
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

group = "com.github.maciejmalecki"
version = "0.1.0"

repositories {
    mavenCentral()
}
