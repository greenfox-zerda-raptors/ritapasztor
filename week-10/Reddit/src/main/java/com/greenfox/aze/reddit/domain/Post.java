package com.greenfox.aze.reddit.domain;

import javax.persistence.*;

/**
 * Created by Rita on 2017.01.04..
 */
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long postId;
    private String message;
    private String postTitle;
    private int score;

    public Post() {
    }

    public Post(String message) {
        this.message = message;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public long getPostId() {
        return postId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }
}
