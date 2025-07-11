package ru.normno.mykoinannotations.todo.domain

interface ToDoRepository {
    suspend fun getTodos(): List<String>
}