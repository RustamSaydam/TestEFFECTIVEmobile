package com.example.effectiveMoblile.repository;
import com.example.effectiveMoblile.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
