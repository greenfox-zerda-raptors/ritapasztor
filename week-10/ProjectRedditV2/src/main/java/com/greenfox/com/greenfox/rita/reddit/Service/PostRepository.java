package com.greenfox.com.greenfox.rita.reddit.Service;

import com.greenfox.com.greenfox.rita.reddit.Model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Rita on 2017.01.05..
 */
public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
    Page<Post> findByOrderByScoreDesc(Pageable pageable);
    //List<Post> findAllByOrderByScoreDesc();


}
