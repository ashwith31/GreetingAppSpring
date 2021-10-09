package com.example.GreetingApp.repository;

import com.example.GreetingApp.entity.GreetingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingsRepository extends JpaRepository<GreetingsEntity,Integer>{
}
