package com.example.effectiveMoblile.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Objects;

@Entity(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tasks;


    private String comments;

    private String status;

    private String executor;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Task(Long id, String tasks, String executor, String comments, String status) {
        this.id = id;
        this.tasks = tasks;
        this.comments = comments;
        this.status = status;
        this.executor = executor;
    }

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTasks() {
        return tasks;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id)
                && Objects.equals(tasks, task.tasks)
                && Objects.equals(comments, task.comments)
                && Objects.equals(status, task.status)
                && Objects.equals(executor, task.executor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tasks, comments, status, executor);
    }
}
