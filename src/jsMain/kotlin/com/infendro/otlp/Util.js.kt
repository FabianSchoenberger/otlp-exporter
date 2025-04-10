package com.infendro.otlp

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import node.process.process

internal actual fun env(name: String): String? {
    return process.env[name]
}

internal actual fun execute(block: suspend () -> Unit) {
    // launching a coroutine is fine here since Node.js will not exit automatically
    CoroutineScope(Dispatchers.Default).launch {
        block()
    }
}
