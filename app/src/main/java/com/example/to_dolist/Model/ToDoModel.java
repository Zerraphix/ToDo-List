package com.example.to_dolist.Model;

public class ToDoModel {
    private  int id, isCompleted;
    private String task;

    // Getter and Setters
    // Could be auto made by right clicking and selecting Generate...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompleted() {
        return isCompleted;
    }

    public void setCompleted(int isCompleted) {
        this.isCompleted = isCompleted;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
