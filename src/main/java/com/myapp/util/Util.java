package com.myapp.util;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Util {

    @GetMapping("util")
    public String sayHelloUtil(){
        return "Hello From Util Controller";
    }
}
