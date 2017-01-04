package com.greenfox.aze.reddit.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rita on 2017.01.04..
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String helloWorld() {
        return "redirect:/posts/";
    }
}
