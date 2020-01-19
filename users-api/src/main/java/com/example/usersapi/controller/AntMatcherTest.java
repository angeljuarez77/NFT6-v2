package com.example.usersapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AntMatcherTest {
    @GetMapping("/ant/auth/test")
    public String authTest() {
        return "I shouldn't be able to see this";
    }
    @GetMapping("/ant/noauth/test")
    public String noauthTest() {
        return "I should be able to see this";
    }
}
