package com.pavan.todoapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pavan.todoapp.form.TaskForm;
import com.pavan.todoapp.model.Task;

@Service
public class TodoAppService {

    private static List<Task> taskLists = new ArrayList<Task>();
    private static int taskIdCount = 0;

    static {
        taskLists.add(new Task(1, "buy Milk", "Buy 2 amul milk 1 litre pack", 1, false));
        taskLists.add(new Task(2, "buy Eggs", "Buy 10 whole eggs and do not break them", 1, false));
        taskLists.add(new Task(3, "buy Cream", "Buy whip cream for making icing", 1, false));
        taskIdCount = 3;
    }

    public static List<Task> getTaskLists() {
        return taskLists;
    }
    
    public boolean createTask(TaskForm form) {
        taskLists.add(new Task(++taskIdCount, form.getTaskHeading(), form.getTaskDescription(), 1, form.isDone()));
        return true;
    }

    public boolean modifyTask(TaskForm form) {

        int pos = findByTaskid(form.getTaskId());
        if(pos == -1)
            return false;
        taskLists.set(pos, new Task(form.getTaskId(), form.getTaskHeading(), form.getTaskDescription(), 1, form.isDone()));
        return true;
    }

    public boolean deleteTask(int id) {
        int pos = findByTaskid(id);
        if(pos == -1)
            return false;
        taskLists.remove(pos);
        return true;
    }

    private int findByTaskid(int id) {
        for(int i=0; i<taskLists.size(); ++i) {
            if(id == taskLists.get(i).getTaskId())
                return i;
        }
        return -1;
    }
}
