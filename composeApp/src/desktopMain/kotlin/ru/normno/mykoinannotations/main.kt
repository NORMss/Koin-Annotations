package ru.normno.mykoinannotations

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ru.normno.mykoinannotations.core.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "myKoinAnnotations",
        ) {
            App()
        }
    }
}