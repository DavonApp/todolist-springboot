package com.todolist.todolist.controller;

import com.todolist.todolist.model.Task;
import com.todolist.todolist.model.User;
import com.todolist.todolist.model.Priority;
import com.todolist.todolist.service.TaskService;
import com.todolist.todolist.service.UserService;
import com.todolist.todolist.repository.UserRepository;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // Construtor Injection
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping ("/register")
    public User registerUser (@RequestBody User userRequest){
        return userService.registerUser(userRequest.getEmail(), userRequest.getPassword());
    }
}
