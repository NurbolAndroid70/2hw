package com.example.a2hw.domain.repository

import com.example.a2hw.domain.model.TaskModel

interface TaskManagerRepository {

    suspend fun insertTask(taskModel: TaskModel)
    suspend fun getAllTasks(): List<TaskModel>
    suspend fun getTaskByName(taskName: String): TaskModel?


}