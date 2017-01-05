package com.greenfox;

import com.greenfox.com.greenfox.rita.reddit.Model.Post;
import com.greenfox.com.greenfox.rita.reddit.Service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectRedditV2Application implements CommandLineRunner {

    @Autowired
    private PostRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ProjectRedditV2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 6; i++) {
            repository.save(new Post("My new post" + (i)));
        }
    }
}
