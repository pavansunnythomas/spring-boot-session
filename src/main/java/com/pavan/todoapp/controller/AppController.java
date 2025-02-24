package com.pavan.todoapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.todoapp.form.TaskForm;
import com.pavan.todoapp.model.Task;
import com.pavan.todoapp.service.TodoAppService;

import jakarta.validation.Valid;

@RestController
public class AppController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TodoAppService todoService;

    @GetMapping("get-tasks")
    public List<Task> getTasks() {

        logger.info("retriving the list");

        return TodoAppService.getTaskLists();
    }

    @PostMapping("add-task")
    public boolean addTask(@RequestBody  @Valid TaskForm form) {

        logger.info("Creating and adding task");

        return todoService.createTask(form);
    }

    @PutMapping("change-task")
    public boolean changeTask(@RequestBody @Valid TaskForm form) {

        logger.info("Changing task");

        return todoService.modifyTask(form);
    }

    @DeleteMapping("delete-task/{id}")
    public boolean deleteTask(@PathVariable int id) {

        logger.info("Removing  task");

        return todoService.deleteTask(id);
    }

}
