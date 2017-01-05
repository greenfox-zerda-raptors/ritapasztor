package com.greenfox.com.greenfox.rita.reddit.Controllers;

import com.greenfox.com.greenfox.rita.reddit.Service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Rita on 2017.01.05..
 */

@Controller
public class PostController {

    @Autowired
    private PostRepository repository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("posts", repository.findAll());
        return "posts/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPost() {
        return "posts/add";
    }
}
