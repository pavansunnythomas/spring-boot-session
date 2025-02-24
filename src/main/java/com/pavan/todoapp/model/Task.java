package com.pavan.todoapp.model;

public class Task {

    private int taskId;
    private String taskHeading;
    private String taskDescription;
    private int userId;
    private boolean isDone;

    
    
    public Task(int taskId, String taskHeading, String taskDescription, int userId, boolean isDone) {
        this.taskId = taskId;
        this.taskHeading = taskHeading;
        this.taskDescription = taskDescription;
        this.userId = userId;
        this.isDone = isDone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }


}
