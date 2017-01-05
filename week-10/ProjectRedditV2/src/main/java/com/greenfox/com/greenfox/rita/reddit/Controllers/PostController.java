package com.greenfox.com.greenfox.rita.reddit.Controllers;

import com.greenfox.com.greenfox.rita.reddit.Model.Post;
import com.greenfox.com.greenfox.rita.reddit.Service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Rita on 2017.01.05..
 */

@Controller
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    private PostRepository repository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("posts", repository.findAll());
        return "posts/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPost() {
        return "posts/add";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView create(@RequestParam("message") String comment) {
        repository.save(new Post(comment));
        return new ModelAndView("redirect:/posts");
    }
}
