package com.example.effectiveMoblile.repository;

import com.example.effectiveMoblile.dto.TaskDTO;
import com.example.effectiveMoblile.model.Task;
import com.example.effectiveMoblile.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
