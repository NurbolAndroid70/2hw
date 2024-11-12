package com.example.a2hw.presentation.model

import com.example.a2hw.domain.model.TaskModel

data class TaskUI(
    val id: Int,
    val taskName: String,
    val taskDate: String,
)

fun TaskUI.toDomain() = TaskModel(id, taskName, taskDate)
fun TaskModel.toUI() = TaskUI(id, taskName, taskDate)