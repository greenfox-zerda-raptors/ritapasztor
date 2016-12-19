package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rita on 2016.12.19..
 */
@RestController
public class HelloRESTController {
    Greeting greeting;

    @RequestMapping
    public Greeting greeting(@RequestParam("name") String name) {
        return new Greeting(19, "Hello, " + name);
    }
}
