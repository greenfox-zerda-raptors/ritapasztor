package com.greenfox.com.greenfox.rita.reddit.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Rita on 2017.01.05..
 */

@Entity
@Getter
@Setter
@AllArgsConstructor

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(length = 1000)
    private String content;
    private String title;
    private int score;

    private LocalDateTime dateTime;

    public Post() {
        this.dateTime = LocalDateTime.now();
    }

    public Post(String content, String title) {
        this();
        this.content = content;
        this.title = title;
    }

    public String formatDateTime() {
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
}
