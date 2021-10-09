package com.example.GreetingApp.service;

import com.example.GreetingApp.entity.GreetingsEntity;
import com.example.GreetingApp.repository.GreetingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingsService {

    @Autowired
    GreetingsRepository greetingsRepository;

    public String greet(){
        return "Hello World";
    }

    public String getGreeting(String firstName, String lastName) {
        return firstName+" " +lastName;
    }

    public String saveGreeting(GreetingsEntity message) {
       return greetingsRepository.save(message).toString();
    }

    public GreetingsEntity getGreetingById(int id) {
        Optional<GreetingsEntity> greetById = greetingsRepository.findById(id);
        if(greetById.isPresent()){
            return greetById.get();
        }
        return null;
    }

    public List<GreetingsEntity> getall() {
        return greetingsRepository.findAll();
    }
}
