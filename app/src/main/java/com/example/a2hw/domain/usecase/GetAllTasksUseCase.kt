package com.example.a2hw.domain.usecase

import com.example.a2hw.domain.model.TaskModel
import com.example.a2hw.domain.repository.TaskManagerRepository

class GetAllTasksUseCase(private val taskManagerRepository: TaskManagerRepository) {
    suspend operator fun invoke(): List<TaskModel> {
        return taskManagerRepository.getAllTasks()
    }
}