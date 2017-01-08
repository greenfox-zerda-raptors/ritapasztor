package com.greenfox;

import com.greenfox.com.greenfox.rita.reddit.Service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectRedditV2Application {

    @Autowired
    private PostRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ProjectRedditV2Application.class, args);
    }

}
