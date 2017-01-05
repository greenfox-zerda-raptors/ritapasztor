package com.greenfox.aze.reddit;

import com.greenfox.aze.reddit.domain.Post;
import com.greenfox.aze.reddit.domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheRedditApplication implements CommandLineRunner {

    @Autowired
    private PostRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(TheRedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 5; i++) {
            repository.save(new Post("This is the Title", "This is the Content of the post, the actual message"));
        }
    }
}
