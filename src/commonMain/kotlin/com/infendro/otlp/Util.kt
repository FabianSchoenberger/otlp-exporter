package com.infendro.otlp

internal expect fun env(name: String): String?

internal expect fun execute(block: suspend () -> Unit)
