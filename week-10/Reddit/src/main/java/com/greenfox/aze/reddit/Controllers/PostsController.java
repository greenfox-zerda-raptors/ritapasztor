package com.greenfox.aze.reddit.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Rita on 2017.01.04..
 */
@Controller
@RequestMapping("/posts")
public class PostsController {

    //TODO: Somethign to show the list of posts
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "posts";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newPost(Model model) {
        return "newPost";
    }
}
