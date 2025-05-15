package com.myapp.demo.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    private final Coach firstCoach;


    @Autowired
    public FirstController(@Qualifier("basketBallCoach") Coach firstCoach) {
        this.firstCoach = firstCoach;
    }

    @GetMapping("/")
    public String getText() {
        return firstCoach.getDailyWork();
    }
}
