package com.todolist.todolist.model;

import java.time.LocalDate;

public class Task {
    private String title;
    private boolean isCompleted;
    private int id;
    private LocalDate dueDate;
    private String category;
    private Priority priority;

    private static int idCount = 1;

    // Constructor
    public Task(String title){
        this.title = title;
        this.isCompleted = false;
        this.priority = Priority.MEDIUM;
        this.id = idCount++;
    }

    // Getters and Setters
    public int getId() { return id;}

    public String getTitle() { return title;}
    public void setTitle(String title) { this.title = title;}

    public boolean getIsCompleted() { return isCompleted; }
    public void setCompletion(boolean completed) { this.isCompleted = completed; }
    public void markAsCompleted() {this.isCompleted = true; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate (LocalDate dueDate) { this.dueDate = dueDate; }

    public String getCategory() {return category; }
    public void setCategory(String category) { this.category = category;}

    public Priority getPriority() {return priority;}
    public void setPriority(Priority priority) { this.priority = priority;}

}