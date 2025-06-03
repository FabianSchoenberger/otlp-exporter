# OTLP Exporter

This is an exporter for dcxp's OpenTelemetry port. \
It exports spans to the OpenTelemetry Collector using HTTP and JSON.

## Usage

Add the following to your `build.gradle.kts` common dependencies.
```kotlin
implementation("com.infendro.otel:otlp-exporter:1.0.0")
implementation("io.opentelemetry.kotlin.api:all:1.0.570")
implementation("io.opentelemetry.kotlin.sdk:sdk-trace:1.0.570")
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
```

See [my prototype](https://github.com/FabianSchoenberger/otlp-exporter) for an example.
