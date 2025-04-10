package com.infendro.otlp

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString
import kotlinx.coroutines.runBlocking
import platform.posix.getenv

@OptIn(ExperimentalForeignApi::class)
internal actual fun env(name: String): String? {
    return getenv(name)?.toKString()
}

internal actual fun execute(block: suspend () -> Unit) = runBlocking {
    block()
}
