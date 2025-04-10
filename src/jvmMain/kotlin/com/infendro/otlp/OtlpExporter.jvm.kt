package com.infendro.otlp

import kotlinx.coroutines.runBlocking

actual fun execute(block: suspend () -> Unit) = runBlocking {
    block()
}
