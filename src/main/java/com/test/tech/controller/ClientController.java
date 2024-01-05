package com.test.tech.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ClientController {

    @GetMapping("/test")
    public String getConection() {
        return "Hello World!";
    }
    
    
}
