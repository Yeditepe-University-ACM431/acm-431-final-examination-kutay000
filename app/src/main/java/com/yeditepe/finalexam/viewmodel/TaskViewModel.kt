package com.yeditepe.finalexam.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    val taskList = mutableStateListOf(
        Task(1, "Kutay Yeditepe Exam", false),
        Task(2, "Engin Hocama Saygılarımla Finish Final Exam", true)
    )

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val index = taskList.indexOfFirst { it.id == taskId }
        if (index != -1) {
            val task = taskList[index]
            taskList[index] = task.copy(isCompleted = !task.isCompleted)
        }
    }
}
