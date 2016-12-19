package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Rita on 2016.12.19..
 */
@RestController
public class HelloRESTController {
    Greeting greeting;
    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping
    public Greeting greeting(@RequestParam("name") String name) {
        long val = atomicLong.incrementAndGet();
        return new Greeting(val, " , Hello, " + name);
    }


}
