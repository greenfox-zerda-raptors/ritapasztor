package com.greenfox.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rita on 2017.01.10..
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String helloWorld() {
        return "index";
    }
}
