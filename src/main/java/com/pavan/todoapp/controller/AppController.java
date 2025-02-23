package com.pavan.todoapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.todoapp.model.Task;

@RestController
public class AppController {

    @GetMapping("get-tasks")
    public List<Task> getTasks() {
        return Arrays.asList(
            new Task(1, "buy Milk", "Buy 2 amul milk 1 litre pack"),
            new Task(2, "buy Eggs", "Buy 10 whole eggs and do not break them")
            // new Task(3, "buy Cream", "Buy whip cream for making icing")
            );
    }
}
