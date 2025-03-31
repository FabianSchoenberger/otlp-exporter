package com.infendro.otlp

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.opentelemetry.kotlin.sdk.common.CompletableResultCode
import io.opentelemetry.kotlin.sdk.trace.data.SpanData
import io.opentelemetry.kotlin.sdk.trace.export.SpanExporter
import kotlinx.coroutines.runBlocking

class OtlpExporter : SpanExporter {
    override fun export(
        spans: Collection<SpanData>
    ): CompletableResultCode {
        val payload = spans.toJson()
        runBlocking {
            val httpClient = HttpClient()
            httpClient.post("http://localhost:4318/v1/traces") {
                contentType(ContentType.Application.Json)
                setBody(payload)
            }
        }

        return CompletableResultCode.ofSuccess()
    }

    override fun flush(): CompletableResultCode {
        return CompletableResultCode.ofSuccess()
    }

    override fun shutdown() = flush()
}
