package com.greenfox.todothymeleaf.greenfoxacademy;

/**
 * Created by Rita on 2016.12.20..
 */

public class Todo {
    int id;
    String title;
    Boolean isUrgent;
    Boolean isDone;

    public Todo(int id, String title, Boolean isUrgent, Boolean isDone) {
        this.id = id;
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
    }

    public Todo(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(Boolean urgent) {
        isUrgent = urgent;
    }

    public Boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(Boolean done) {
        isDone = done;
    }
}
