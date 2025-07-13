package ru.normno.mykoinannotations.core.data

import  io.ktore.client.engine.darwin.Darwin

actual class HttpClientEngineFactory {
    actual fun getHttpEngine(): io.ktor.client.engine.HttpClientEngine {
        return Darwin.create()
    }
}