package com.pavan.todoapp.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TaskForm {

    private int taskId;

    @NotNull(message = "Task heading is mandatory")
    @Size(max = 50, message = "maximum charcter limit is 50")
    private String taskHeading;

    @Size(max = 4096, message = "maximum character limit is 4096")
    private String taskDescription;

    @NotNull(message = "isDone cannot be null")
    private boolean isDone;

    public TaskForm() {
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

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

}
