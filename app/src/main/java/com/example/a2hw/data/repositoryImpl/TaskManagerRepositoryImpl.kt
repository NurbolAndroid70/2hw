package com.example.a2hw.data.repositoryImpl

import com.example.a2hw.data.database.dao.TaskManagerDao
import com.example.a2hw.data.dto.toData
import com.example.a2hw.data.dto.toDomain
import com.example.a2hw.domain.model.TaskModel
import com.example.a2hw.domain.repository.TaskManagerRepository

class TaskManagerRepositoryImpl(
    private val taskManagerDao: TaskManagerDao
) : TaskManagerRepository {

    override suspend fun insertTask(taskModel: TaskModel) {
        taskManagerDao.insertTask(taskModel.toData())
    }

    override suspend fun getAllTasks(): List<TaskModel> {
        return taskManagerDao.getAllTasks().map { it.toDomain()}
    }

    override suspend fun getTaskByName(taskName: String): TaskModel? {
        return taskManagerDao.getTaskByName(taskName)?.toDomain()
    }
}