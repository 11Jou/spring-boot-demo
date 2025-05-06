package com.myapp.demo.rest;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootBallCoach implements Coach {
    public FootBallCoach() {
        System.out.println("in Constructor " + getClass().getSimpleName() );
    }

    @Override
    public String getDailyWork() {
        return "FootBall Coach";
    }
}
