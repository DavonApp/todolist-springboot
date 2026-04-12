package com.todolist.todolist.repository;

import com.todolist.todolist.model.Task;
import com.todolist.todolist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    
    // Retruns only taks belonging to this user
    List<Task> findByUser(User user);

    // Prevents user A from editing/deleting user B's task by ID
    Optional<Task> findByIdAndUser(int id, User user);
}
