package com.example.effectiveMoblile.service;

import com.example.effectiveMoblile.controller.TaskController;
import com.example.effectiveMoblile.model.Task;
import com.example.effectiveMoblile.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskService taskService;

    @InjectMocks
    TaskController taskController;

    @Test
    void canAllTasks() {
        //given
        var tasks = List.of(new Task(1L, "tasks1", "executor1", "comments1", "status1"),
                new Task(2L, "tasks2", "executor2", "comments2", "status2"));

        Mockito.doReturn(tasks).when(this.taskService).getAllTasks();

        // when
        var response = this.taskController.getAllTasks();

        //then
        assertNotNull(response);
        assertInstanceOf(List.class,response);
        assertEquals(response.size(),2);
        assertEquals(response.get(1).getTasks(), "tasks2");


        verify(taskService, times(1)).getAllTasks();

    }

}