package com.myapp.demo.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("common")
    public String SayHellp() {
        return "Hello From CommonController";
    }
}
