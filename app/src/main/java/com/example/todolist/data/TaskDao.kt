package com.example.todolist.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDao {

    @Query("SELECT * FROM Task")
    fun getAll(): LiveData<List<Task>>

    @Query("SELECT * FROM TASK WHERE id = :id")
    fun getById(id: Long): LiveData<Task>

    @Query("SELECT * FROM TASK WHERE name = :name")
    fun getByName(name: String): LiveData<List<Task>>

    @Insert
    suspend fun insert(task: Task)

    @Update
    suspend fun update(task: Task)

    @Delete
    suspend fun delete(task: Task)
}