package com.greenfox.com.greenfox.rita.reddit.Service;

import com.greenfox.com.greenfox.rita.reddit.Model.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rita on 2017.01.05..
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
