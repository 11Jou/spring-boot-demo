package com.myapp.demo.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    private final Coach myCoach;


    @Autowired
    public FirstController(@Qualifier("basketBallCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/")
    public String getText() {
        return myCoach.getDailyWork();
    }
}
