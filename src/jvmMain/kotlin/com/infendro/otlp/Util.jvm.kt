package com.infendro.otlp

import kotlinx.coroutines.runBlocking

internal actual fun env(name: String): String? {
    return System.getenv(name)
}

internal actual fun execute(block: suspend () -> Unit) = runBlocking {
    block()
}
