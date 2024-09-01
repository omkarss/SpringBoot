package com.example.devtools.devtools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevtoolsController {
    
    @GetMapping("/hello")
    public String helloMethod() {
        return "<h1>Hello Bitchesss<h1>";
    }

    @GetMapping("/")
    public String defaultMehod() {
        return "Hello";
    }
}
