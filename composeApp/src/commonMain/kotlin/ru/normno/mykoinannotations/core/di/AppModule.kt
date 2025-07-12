package ru.normno.mykoinannotations.core.di

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
class  AppModule {

    @Single
    fun httpClient(engine: HttpClientEngine): HttpClient = HttpClient(engine) {

    }
}