package com.pluralsight.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // this method will respond to http://localhost:8080/
    @GetMapping(path = "/")
    public String hello(@RequestParam(defaultValue = "World")
                        String name) {
        return "Hello, " + name + "!";
    }

}
