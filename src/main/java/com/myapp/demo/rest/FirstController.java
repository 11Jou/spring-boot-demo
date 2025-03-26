package com.myapp.demo.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @Value("${team.name}")
    private String username;

    @GetMapping("/")
    public String sayName(){
        return username;
    }
}
