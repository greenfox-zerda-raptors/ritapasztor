package com.greenfox.com.greenfox.rita.reddit.Service;

import com.greenfox.com.greenfox.rita.reddit.Model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Rita on 2017.01.06..
 */
@Service
@Transactional
public class PostService {

    @Autowired
    PostRepository repository;

//    public List<Post> listAllPosts() {
//        //return (List<Post>) repository.findAll();
//        return repository.findAllByOrderByScoreDesc();
//    }

    public Page<Post> listAllPosts(int page, int limit) {
        return repository.findByOrderByScoreDesc(new PageRequest(page, limit));
    }

    public void createNewPost(Post newPost) {
        repository.save(newPost);
    }

    public void upvote(long id) {
        vote(id, 1);
    }

    public void downvote(long id) {
        vote(id, -1);
//        int score = repository.findOne(id).getScore();
//        score += -1;
    }

    public void vote(long id, int scoreChange) {
        Post post = repository.findOne(id);
        int changedScore = post.getScore() + scoreChange;
        post.setScore(changedScore);
        repository.save(post);

    }
//        if (currentScore == 0 && scoreChange > 0) {
//            return currentScore += scoreChange;
//        } else if (currentScore == 0 && scoreChange < 0) {
//            return currentScore;
//        } else {
//            return currentScore + scoreChange;
//        }

    public void deletePost(long id) {
        repository.delete(id);
    }

}
