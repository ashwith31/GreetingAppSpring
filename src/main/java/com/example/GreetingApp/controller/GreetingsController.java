package com.example.GreetingApp.controller;

import com.example.GreetingApp.entity.GreetingsEntity;
import com.example.GreetingApp.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping(value = "save")
    public String saveGreeting(@RequestBody GreetingsEntity message){
        return  greetingsService.saveGreeting(message);
    }

    @PutMapping(value = "save")
    public String editGreeting(@RequestBody GreetingsEntity message){
        return  greetingsService.editGreeting(message);
    }

    @GetMapping("/findgreet")
    public GreetingsEntity getGreetingById(@RequestParam int id) {
        return greetingsService.getGreetingById(id);
    }

    @GetMapping("getall")
    public List<GreetingsEntity> getallmessages(){
        return greetingsService.getall();
    }

    @DeleteMapping("delete")
    public void deleteGreeting(@RequestParam int id){
        greetingsService.deleteGreeting(id);
    }
}
