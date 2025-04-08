package com.myapp.demo.rest;


import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

    @Override
    public String getDailyWork() {
        return "Hello Coach Youssef Mohamed";
    }
}
