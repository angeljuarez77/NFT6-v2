package com.example.firstattempt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorld {
    @GetMapping
    public String helloWorld() {
        return "you made a root route";
    }

    @GetMapping("/testing")
    public String testing() {
        return "Hello World!, Testing!!!";
    }
}
