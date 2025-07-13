package ru.normno.mykoinannotations

import android.app.Application
import org.koin.android.ext.koin.androidContext
import ru.normno.mykoinannotations.core.di.initKoin

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyApp)
        }
    }
}