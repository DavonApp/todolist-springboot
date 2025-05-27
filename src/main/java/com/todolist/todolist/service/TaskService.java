package com.todolist.todolist.service;

import com.todolist.todolist.model.Task;
import com.todolist.todolist.model.Priority;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public void markAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markAsCompleted();
                return;
            }
        }
    }
    public void unmarkAsCompleted(int id) {
        for (Task task : tasks){
            if (task.getId() == id){
                task.setCompletion(false);
                return;
            }
        }
    }
    public void editTaskTitle(int id, String newTitle){
        for (Task task : tasks){
            if (task.getId() == id){
                task.setTitle(newTitle);
                return;
            }
        }
    }
    public void setDueDate(int id, LocalDate date){
        for (Task task : tasks){
            if(task.getId() == id){
                task.setDueDate(date);
                return;
            }
        }
    }
    public void setCategory(int id, String category){
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCategory(category);
                return;
            }
        }
    }
    public void setPriority(int id, Priority priority) {
        for (Task task : tasks){
            if(task.getId() == id){
                task.setPriority(priority);
                return;
            }
        }
    }
}