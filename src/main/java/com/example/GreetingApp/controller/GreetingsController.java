package com.example.GreetingApp.controller;

import com.example.GreetingApp.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @Autowired
    GreetingsService greetingsService;

    //http://localhost:8080/message
    @GetMapping("/message")
    public String getGreeting(){
        return greetingsService.greet();
    }


}
