package com.example.todolist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ToDoListViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ToDoListViewModel::class.java)) {
            return ToDoListViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel")
    }
}