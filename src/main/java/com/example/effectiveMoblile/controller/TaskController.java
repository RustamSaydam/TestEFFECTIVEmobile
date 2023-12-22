package com.example.effectiveMoblile.controller;

import com.example.effectiveMoblile.dto.TaskDTO;
import com.example.effectiveMoblile.model.Task;
import com.example.effectiveMoblile.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class TaskController  {

    final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @Operation(
            description = "Get all users tasks",
            summary = "Users tasks field",
            responses = {
                    @ApiResponse(
                            description = "Success!",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Unauthorized /Invalid token",
                            responseCode = "403"
                    )
            }
    )
    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }




    @Operation(
            description = "Post user tasks",
            summary = "Post user tasks field",
            responses = {
                    @ApiResponse(
                            description = "Success!",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Unauthorized /Invalid token",
                            responseCode = "403"
                    )
            }
    )
    @PostMapping("/tasks")
    public void addNewTask(@RequestBody TaskDTO taskDTO) {
        taskService.addNewTask(taskDTO);
    }


    @Operation(
            description = "Delete task",
            summary = "Delete task user for id",
            responses = {
                    @ApiResponse(
                            description = "Success!",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Task does not exist",
                            responseCode = "403"
                    )
            }
    )
    @DeleteMapping("tasks/{taskId}")
    public void deleteTask(@PathVariable("taskId") Integer taskId) {
        taskService.deleteTask(taskId);
    }



    @Operation(
            description = "Create task",
            summary = "Create task user for id",
            responses = {
                    @ApiResponse(
                            description = "Success!",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Task does not exist",
                            responseCode = "403"
                    )
            }
    )
    @PatchMapping("/tasks/{taskId}")
    public void editTask(@PathVariable("taskId") Integer taskId, @RequestBody TaskDTO taskDTO) {
        taskService.editTask(taskId, taskDTO);
    }
}
