package com.example.a2hw.data.dto

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.a2hw.domain.model.TaskModel

@Entity
data class TaskDto(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val taskName: String? = null,
    val taskDate: String? = null
)

fun TaskModel.toData() = TaskDto(id, taskName, taskDate)
fun TaskDto.toDomain() = TaskModel(id, taskName.orEmpty(), taskDate.orEmpty())