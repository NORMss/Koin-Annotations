package ru.normno.mykoinannotations.todo.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.option.viewModelScopeFactory
import ru.normno.mykoinannotations.todo.domain.ToDoRepository

class MainViewModel(
    private val repository: ToDoRepository,
) : ViewModel() {
    private val _state = MutableStateFlow(emptyList<String>())
    val state: StateFlow<List<String>> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getTodos().let { todos ->
                _state.update {
                    todos
                }
            }
        }
    }
}
