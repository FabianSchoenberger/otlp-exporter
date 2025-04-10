package com.infendro.otlp

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

actual fun execute(block: suspend () -> Unit) {
    // launching a coroutine is fine here since Node.js will not exit automatically
    CoroutineScope(Dispatchers.Default).launch {
        block()
    }
}
