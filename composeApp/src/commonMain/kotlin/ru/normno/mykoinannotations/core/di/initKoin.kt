package ru.normno.mykoinannotations.core.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.ksp.generated.module
import ru.normno.mykoinannotations.todo.di.ToDoModule

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(
            AppModule().module,
            ToDoModule().module
        )
    }
}