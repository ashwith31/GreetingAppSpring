package com.example.GreetingApp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class GreetingsEntity {

    @Id
    int id;
    String message;
}
