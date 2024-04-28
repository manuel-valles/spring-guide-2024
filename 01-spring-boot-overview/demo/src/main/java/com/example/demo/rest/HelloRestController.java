package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    // Inject custom properties
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    String sayHello() {
        return "Hello World! This is a place for " + coachName + " and his team " + teamName;
    }
}
