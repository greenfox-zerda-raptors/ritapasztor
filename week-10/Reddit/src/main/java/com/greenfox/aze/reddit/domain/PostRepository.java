package com.greenfox.aze.reddit.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rita on 2017.01.04..
 */
@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}
