plugins {
    kotlin("jvm") version "1.8.21"
}

group = "com.changeworld"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation( platform("io.insert-koin:koin-bom:3.5.3"))
    implementation("io.insert-koin:koin-core")
}