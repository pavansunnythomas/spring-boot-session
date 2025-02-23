package com.pavan.todoapp.model;

public class Task {

    private int taskId;
    private String taskHeading;
    private String taskDescription;

    public Task(int taskId, String taskHeading, String taskDescription) {
        this.taskId = taskId;
        this.taskHeading = taskHeading;
        this.taskDescription = taskDescription;
    }
    
    public int getTaskId() {
        return taskId;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
    public String getTaskHeading() {
        return taskHeading;
    }
    public void setTaskHeading(String taskHeading) {
        this.taskHeading = taskHeading;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    
}
