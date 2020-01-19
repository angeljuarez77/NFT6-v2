package com.example.usersapi.controller;

import com.example.usersapi.models.User;
import com.example.usersapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {
    @Autowired
    private UserService userService;

    // @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/info/list")
    public Iterable<User> allUsers() {
        return userService.listUsers();
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }

    @GetMapping("/login/{username}/{password}")
    public User login(@PathVariable String username, @PathVariable String password) {
        return userService.login(username, password);
    }

    @DeleteMapping("/delete/{userId}")
    public HttpStatus deleteUserByUserId(@PathVariable Long userId) {
        return userService.deleteById(userId);
    }
}
