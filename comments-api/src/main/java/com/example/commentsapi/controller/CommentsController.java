package com.example.commentsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentsController {
    @GetMapping
    public String root(){
        return "root route";
    }

    @GetMapping("/all")
    public String testing(){
        return "Ideally this would return an array of comments";
    }
}
