package com.example.to_dolist.Model;

public class ToDoModel {
    private  int id, isCompleted;
    private String task;

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
