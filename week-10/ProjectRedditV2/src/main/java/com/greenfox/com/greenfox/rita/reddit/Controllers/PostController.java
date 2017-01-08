package com.greenfox.com.greenfox.rita.reddit.Controllers;

import com.greenfox.com.greenfox.rita.reddit.Model.Post;
import com.greenfox.com.greenfox.rita.reddit.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Rita on 2017.01.05..
 */

@Controller
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    private PostService service;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "0") Integer page,
                        @RequestParam(name = "count", defaultValue = "10") Integer limit) {
        model.addAttribute("posts", service.listAllPosts(page, limit));
        return "posts/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPost() {
        return "posts/add";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@RequestParam("message") String comment) {
        service.createNewPost(new Post(comment));
        return "redirect:/posts";
    }

    @RequestMapping(value = "/{id}/upvote", method = RequestMethod.GET)
    private String upvote(@PathVariable long id) {
        service.upvote(id);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/{id}/downvote", method = RequestMethod.GET)
    private String downvote(@PathVariable long id) {
        service.downvote(id);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    private String delete(@PathVariable long id) {
        service.deletePost(id);
        return "redirect:/posts";
    }
}
