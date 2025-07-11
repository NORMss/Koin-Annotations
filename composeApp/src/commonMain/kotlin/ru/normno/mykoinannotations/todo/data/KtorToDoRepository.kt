package ru.normno.mykoinannotations.todo.data

import io.ktor.client.HttpClient
import ru.normno.mykoinannotations.todo.domain.ToDoRepository

class KtorToDoRepository(
    private val httpClient: HttpClient,
) : ToDoRepository {
    override suspend fun getTodos(): List<String> {
        return (1..10).map {
            it.toString()
        }
    }
}