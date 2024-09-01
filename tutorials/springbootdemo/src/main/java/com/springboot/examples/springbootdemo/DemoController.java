package com.springboot.examples.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!!!!";
    }

    @GetMapping("/")
    public String index() {
        return "/";
    }
}
