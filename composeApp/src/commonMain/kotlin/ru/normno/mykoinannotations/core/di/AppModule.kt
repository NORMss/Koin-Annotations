package ru.normno.mykoinannotations.core.di

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import ru.normno.mykoinannotations.core.data.HttpClientEngineFactory

@Module
class  AppModule {

    @Single
    fun httpClient(engine: HttpClientEngine): HttpClient = HttpClient(engine) {

    }

    @Single
    fun httpClientEngine(): HttpClientEngine = HttpClientEngineFactory().getHttpEngine()
}