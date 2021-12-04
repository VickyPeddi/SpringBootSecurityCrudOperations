package com.example.nanda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @GetMapping("/test")
    public String returntest(){
        return "this is test input";
    }
}
