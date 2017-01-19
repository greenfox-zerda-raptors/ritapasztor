package com.greenfox.com.greenfox.rita.reddit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rita on 2017.01.05..
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String helloWorld() {
        return "redirect:/posts";
    }
}
