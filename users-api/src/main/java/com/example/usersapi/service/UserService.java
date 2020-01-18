package com.example.usersapi.service;

import com.example.usersapi.models.User;

public interface UserService {
    public Iterable<User> listUsers();
}
