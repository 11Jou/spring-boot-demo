package com.myapp.demo.rest;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BasketBallCoach implements Coach {
    public BasketBallCoach() {
        System.out.println("in Constructor " + getClass().getSimpleName() );

    }

    @Override
    public String getDailyWork() {
        return "BasketBall Coach";
    }

    @PostConstruct
    public void doStartup(){
        System.out.println("In doStartup " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanup(){
        System.out.println("In doCleanup " + getClass().getSimpleName());
    }
}

