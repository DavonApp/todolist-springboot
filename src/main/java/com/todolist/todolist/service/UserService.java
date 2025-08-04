package com.todolist.todolist.service;

import com.todolist.todolist.model.Task;
import com.todolist.todolist.model.User;
import com.todolist.todolist.repository.TaskRepository;
import com.todolist.todolist.repository.UserRepository;
import com.todolist.todolist.model.Priority;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.time.LocalDate;

@Service
public class UserService {
    private final UserRepository userRepository;

    // Constructor Injection
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User registerUser (String email, String password){
        User existingUser = userRepository.findByEmail(email);
        if(existingUser != null){
            throw new RuntimeException("User already exists");
        } else {
            User user = new User(email, password);
            userRepository.save(user);
            return user;
        }
    }
}
