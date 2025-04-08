package com.myapp.demo.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    private final Coach myCoach;


    @Autowired
    public FirstController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/")
    public String getText() {
        return myCoach.getDailyWork();
    }
}
