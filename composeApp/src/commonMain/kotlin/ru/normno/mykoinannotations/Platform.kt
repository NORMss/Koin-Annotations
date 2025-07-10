package ru.normno.mykoinannotations

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform