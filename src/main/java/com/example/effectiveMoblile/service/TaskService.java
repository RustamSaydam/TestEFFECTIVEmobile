package com.example.effectiveMoblile.service;

import com.example.effectiveMoblile.dto.TaskDTO;
import com.example.effectiveMoblile.model.Task;
import com.example.effectiveMoblile.model.User;
import com.example.effectiveMoblile.repository.TaskRepository;
import com.example.effectiveMoblile.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
    }


    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task addNewTask(TaskDTO taskDTO) {
        Task task = new Task();
        task.setTasks(taskDTO.getTasks());
        task.setComments(taskDTO.getComments());
        task.setStatus(taskDTO.getStatus());
        task.setExecutor(taskDTO.getExecutor());
        task.setUser(convertUser(taskDTO.getUserId()));
        return taskRepository.save(task);

        }

        public User convertUser(Integer userId) {
        return userRepository.findById(userId).orElseThrow();
        }

    public void deleteTask(Integer taskId) {
        boolean exists = taskRepository.existsById(taskId);
        if (!exists) {
            throw new IllegalStateException("Task with id "
                    + taskId + " does not exists");
        }

        taskRepository.deleteById(taskId);
    }

    public void editTask(Integer taskId, TaskDTO taskDTO) {
        Optional<Task> taskOpt = taskRepository.findById(taskId);

        if (taskOpt.isPresent()) {
            Task editTask = taskOpt.get();
            if(taskDTO.getStatus() != null) {
                editTask.setStatus(taskDTO.getStatus());
            }
            if(taskDTO.getTasks() != null) {
                editTask.setTasks(taskDTO.getTasks());
            }
            if(taskDTO.getExecutor() != null) {
                editTask.setExecutor(taskDTO.getExecutor());
            }
            if(taskDTO.getComments() != null) {
                editTask.setComments(taskDTO.getComments());
            }

            taskRepository.save(editTask);
        } else {
            throw new IllegalStateException("Task with id "
                    + taskId + " does not exists");
        }
    }
}


/*

 */