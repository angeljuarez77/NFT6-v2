package com.example.usersapi.controller;

import com.example.usersapi.models.User;
import com.example.usersapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Iterable<User> allUsers() {
        return userService.listUsers();
    }
}
