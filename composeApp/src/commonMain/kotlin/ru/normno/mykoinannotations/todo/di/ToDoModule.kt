package ru.normno.mykoinannotations.todo.di

import io.ktor.client.HttpClient
import org.koin.android.annotation.KoinViewModel
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import ru.normno.mykoinannotations.todo.data.KtorToDoRepository
import ru.normno.mykoinannotations.todo.domain.ToDoRepository
import ru.normno.mykoinannotations.todo.presentation.MainViewModel

@Module
class ToDoModule {

    @Factory
    fun todoRepository(httpClient: HttpClient) = KtorToDoRepository(httpClient)

    @KoinViewModel
    fun todoViewModel(toDoRepository: ToDoRepository) = MainViewModel(todoRepository())
}