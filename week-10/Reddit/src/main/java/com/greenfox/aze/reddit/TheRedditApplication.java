package com.greenfox.aze.reddit;

import com.greenfox.aze.reddit.domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheRedditApplication {

    @Autowired
    private PostRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(TheRedditApplication.class, args);
    }

}
