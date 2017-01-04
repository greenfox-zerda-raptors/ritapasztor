package com.greenfox.aze.reddit.Services;

import com.greenfox.aze.reddit.domain.Post;
import com.greenfox.aze.reddit.domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rita on 2017.01.04..
 */

@Service
public class PostService {

    @Autowired
    PostRepository repository;

    public List<Post> getAllPosts() {
        return (List<Post>) repository.findAll();
    }


}
