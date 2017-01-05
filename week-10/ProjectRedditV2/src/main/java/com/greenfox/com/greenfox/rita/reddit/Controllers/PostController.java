package com.greenfox.com.greenfox.rita.reddit.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Rita on 2017.01.05..
 */

@Controller
public class PostController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index() {
        return "posts/list";
    }
}
