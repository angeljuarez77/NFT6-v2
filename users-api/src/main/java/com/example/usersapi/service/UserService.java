package com.example.usersapi.service;

import com.example.usersapi.models.User;
import org.springframework.http.HttpStatus;

public interface UserService {
    public Iterable<User> listUsers();
    public User createUser(User newUser);
    public User login(String username, String password);
    public HttpStatus deleteById(Long userId);
}
