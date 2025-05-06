package com.myapp.demo.rest;


import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {
    public BasketBallCoach() {
        System.out.println("in Constructor " + getClass().getSimpleName() );

    }

    @Override
    public String getDailyWork() {
        return "BasketBall Coach";
    }
}
