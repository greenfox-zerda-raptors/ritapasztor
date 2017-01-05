package com.greenfox.aze.reddit.Controllers;

import com.greenfox.aze.reddit.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

//    @GetMapping(value = "/new")
//    public String createNewPost(Model model) {
//        model.addAttribute("post", new Post());
//        return "newPost";
//    }
//
//    @PostMapping(value = "/new")
//    public String addNewPost(@ModelAttribute Post post) {
//        postService.addNewPost(post);
//        return "redirect:/";
//    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String addPost(Model model) {
        return "newPost";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String createNewPost(@RequestParam("title") String title, @RequestParam("message") String message) {
        postService.addNewPost(title, message);
        return "redirect:/posts/";
    }
}
