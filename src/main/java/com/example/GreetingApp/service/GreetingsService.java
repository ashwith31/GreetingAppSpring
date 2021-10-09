package com.example.GreetingApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingsService {

    public String greet(){
        return "Hello World";
    }
}
