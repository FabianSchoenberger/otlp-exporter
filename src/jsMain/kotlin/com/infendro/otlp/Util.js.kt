package com.infendro.otlp

import node.process.process

internal actual fun env(name: String): String? {
    return process.env[name]
}
