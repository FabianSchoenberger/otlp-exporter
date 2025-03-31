plugins {
    kotlin("jvm") version "2.1.10"
    kotlin("plugin.serialization") version "2.1.10"
    `maven-publish`
}

publishing {
    publications.create<MavenPublication>("maven") {
        groupId = "com.infendro"
        artifactId = "otlp-exporter"
        version = "1.0.0"

        from(components["java"])
    }
}

repositories {
    maven {
        url = uri("https://maven.pkg.github.com/dcxp/opentelemetry-kotlin")
        credentials {
            username = project.property("GITHUB_USERNAME") as String
            password = project.property("GITHUB_PASSWORD") as String
        }
    }
    mavenCentral()
}

dependencies {
    implementation("io.opentelemetry.kotlin.api:all:1.0.570")
    implementation("io.opentelemetry.kotlin.sdk:sdk-trace:1.0.570")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")
    implementation("io.ktor:ktor-client-core:3.1.0")
    implementation("io.ktor:ktor-client-cio:3.1.0")
}
