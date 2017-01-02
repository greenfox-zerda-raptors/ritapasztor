package com.greenfox;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Rita on 2017.01.02..
 */

@Entity
@Getter
@Setter
@Table(name = "meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;


    private Date date;
    private String type;
    private String description;
    private Integer chCount;

    public Meal(String type, String description, Integer chCount) {
        this.type = type;
        this.description = description;
        this.chCount = chCount;

        date = new Date();
    }

    public Meal() {
    }
}
