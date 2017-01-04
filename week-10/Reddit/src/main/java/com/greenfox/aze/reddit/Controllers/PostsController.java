package com.greenfox.aze.reddit.Controllers;

import com.greenfox.aze.reddit.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    PostService postService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "index";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newPost(Model model) {
        return "newPost";
    }
}
