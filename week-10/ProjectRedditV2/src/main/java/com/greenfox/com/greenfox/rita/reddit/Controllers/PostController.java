package com.greenfox.com.greenfox.rita.reddit.Controllers;

import com.greenfox.com.greenfox.rita.reddit.Model.Post;
import com.greenfox.com.greenfox.rita.reddit.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Rita on 2017.01.05..
 */

@Controller
@RequestMapping(value = "/posts")
public class PostController {

    private PostService service;

    @Autowired
    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping(value = "")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "0") Integer page,
                        @RequestParam(name = "count", defaultValue = "10") Integer limit) {
        model.addAttribute("posts", service.listAllPosts(page, limit));
        return "posts/list";
    }

    @GetMapping(value = "/add")
    public String addPost() {
        return "posts/add";
    }

    @PostMapping(value = "/create")
    public String create(@RequestParam("message") String comment) {
        service.createNewPost(new Post(comment));
        return "redirect:/posts";
    }

    @GetMapping(value = "/{id}/upvote")
    private String upvote(@PathVariable long id) {
        service.upvote(id);
        return "redirect:/posts";
    }

    @GetMapping(value = "/{id}/downvote")
    private String downvote(@PathVariable long id) {
        service.downvote(id);
        return "redirect:/posts";
    }

    @GetMapping(value = "/{id}/delete")
    private String delete(@PathVariable long id) {
        service.deletePost(id);
        return "redirect:/posts";
    }
}
