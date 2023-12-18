package com.example.effectiveMoblile.service;

import com.example.effectiveMoblile.repository.TaskRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;
    private AutoCloseable autoCloseable;
    private TaskService underTest;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new TaskService(taskRepository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canAllTasks() {
        // when
        underTest.getAllTasks();
        //then
        verify(taskRepository.findAll());

    }

    @Test
    @Disabled
    void addNewTask() {
    }
}