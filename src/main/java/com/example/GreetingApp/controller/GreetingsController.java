package com.example.GreetingApp.controller;

import com.example.GreetingApp.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @Autowired
    GreetingsService greetingsService;

    @GetMapping("/message")
    public String getMessage(){
        return greetingsService.greet();
    }

    @GetMapping(value = {"/greetmessage"})
    public String helloMessage(@RequestParam(value ="firstName", defaultValue =" ") String firstName, @RequestParam (value ="lastName", defaultValue =" ") String lastName) {
        return "Hello "+greetingsService.getGreeting(firstName,lastName);
    }
}
