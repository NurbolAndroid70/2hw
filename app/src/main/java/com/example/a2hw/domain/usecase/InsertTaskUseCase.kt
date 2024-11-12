package com.example.a2hw.domain.usecase

import com.example.a2hw.domain.model.TaskModel
import com.example.a2hw.domain.repository.TaskManagerRepository
import java.time.LocalDateTime

class InsertTaskUseCase(private val taskManagerRepository: TaskManagerRepository) {

    suspend fun insertTask(taskModel: TaskModel): String {
        val existingTask = taskManagerRepository.getTaskByName(taskModel.taskName)
        if (existingTask != null) {
            return "Task with the same name already exists."
        }

        val taskDate = taskModel.taskDate.toIntOrNull()
        val currentHour = LocalDateTime.now().hour

        if (taskDate == null || taskDate < currentHour) {
            return "Invalid task date. Task date must be in the future."
        }
        taskManagerRepository.insertTask(taskModel)
        return "Task added successfully"
    }
}