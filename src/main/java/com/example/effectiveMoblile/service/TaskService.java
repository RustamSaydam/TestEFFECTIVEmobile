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

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task addNewTask(TaskDTO taskDTO) {
        Task task = new Task();
        task.setTasks(taskDTO.getTasks());
        task.setComments(taskDTO.getComments());
        task.setStatus(taskDTO.getStatus());
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
}
