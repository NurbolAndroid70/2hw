package com.example.a2hw.presentation.actyvity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a2hw.databinding.ItemTaskBinding
import com.example.a2hw.presentation.model.TaskUI

class TaskAdapter(private var taskList: List<TaskUI>):
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    inner class TaskViewHolder(private val binding: ItemTaskBinding):
        RecyclerView.ViewHolder(binding.root) {

        fun bind(task: TaskUI) {
            binding.tvTask.text = task.taskName
            binding.tvDate.text = task.taskDate
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(taskList[position])
    }

    fun updateTasks(newTasks: List<TaskUI>) {
        taskList = newTasks
        notifyDataSetChanged()
    }
}