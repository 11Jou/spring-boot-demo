package com.myapp.demo.rest;


import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {

    @Override
    public String getDailyWork() {
        return "BasketBall Coach";
    }
}
