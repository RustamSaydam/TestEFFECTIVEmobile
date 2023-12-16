package com.example.effectiveMoblile.controller;

import com.example.effectiveMoblile.dto.TaskDTO;
import com.example.effectiveMoblile.model.Task;
import com.example.effectiveMoblile.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class TaskController {

    final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/tasks")
    public void addNewTask(@RequestBody TaskDTO taskDTO) {
        taskService.addNewTask(taskDTO);
    }
}
