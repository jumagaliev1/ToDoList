package com.example.todolist.data

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TaskDatabase: RoomDatabase() {

    companion object {
        @Volatile
        var INSTANCE: TaskDatabase? = null

        fun getInstance(application: Application): TaskDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    INSTANCE = Room.databaseBuilder(
                        application.applicationContext,
                        TaskDatabase::class.java,
                        "TaskDatabase"
                    ).build()
                    instance = INSTANCE
                }
                return instance!!
            }
        }
    }

}