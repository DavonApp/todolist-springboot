package com.todolist.todolist.controller;


import com.todolist.todolist.model.User;
import com.todolist.todolist.service.UserService;


import org.springframework.web.bind.annotation.*;


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
