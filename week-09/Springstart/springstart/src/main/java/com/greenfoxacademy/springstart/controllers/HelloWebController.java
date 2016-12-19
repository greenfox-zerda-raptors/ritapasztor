package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;


/**
 * Created by Rita on 2016.12.19..
 */
@Controller
public class HelloWebController {
    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam("name") String name) {

        long val = atomicLong.incrementAndGet();
        model.addAttribute("name", name);
        model.addAttribute("val", val);
        return "greeting";
    }
}
