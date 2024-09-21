package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //С тази анотация посочваме, че тоза клас ще бъде RestController
public class FunRestController {

    // expose endpoint "/" that returns "Hello World"

    @GetMapping("/") //HTTP GET Request
    public String sayHello() {
        return "Hello World";
    }
}