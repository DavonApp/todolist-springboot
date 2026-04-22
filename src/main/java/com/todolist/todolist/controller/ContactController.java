package com.todolist.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.todolist.todolist.service.EmailService;
import com.todolist.todolist.model.Contact;


@RestController
@RequestMapping("/api/contact")
public class ContactController {
    
    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity <String> sendMessage(@RequestBody Contact form) {
        try {
            emailService.sendEmail(form);
            return ResponseEntity.ok("Message sent successfully");
        } catch (Exception e) {
            e.printStackTrace(); // check your server logs
            return ResponseEntity.status(500).body("Failed to send: " + e.getMessage());
        }   
    }
}
