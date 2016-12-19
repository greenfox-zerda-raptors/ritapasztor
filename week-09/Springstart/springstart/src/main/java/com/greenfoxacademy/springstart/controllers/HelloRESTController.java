package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rita on 2016.12.19..
 */
@RestController
public class HelloRESTController {
    Greeting greeting;

    @RequestMapping
    public Greeting greeting() {
        return new Greeting(19, "Rita greets the world!");
    }
}
