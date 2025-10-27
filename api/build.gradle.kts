
plugins {
    application
    kotlin("jvm") version "1.9.24"
}
repositories { mavenCentral() }
dependencies {
    implementation("io.ktor:ktor-server-netty:2.3.11")
    implementation("io.ktor:ktor-server-core:2.3.11")
    implementation("io.ktor:ktor-server-content-negotiation:2.3.11")
    implementation("io.ktor:ktor-serialization-jackson:2.3.11")
}
application { mainClass.set("MainKt") }
