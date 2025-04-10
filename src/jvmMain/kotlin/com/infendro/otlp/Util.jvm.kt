package com.infendro.otlp

internal actual fun env(name: String): String? {
    return System.getenv(name)
}
