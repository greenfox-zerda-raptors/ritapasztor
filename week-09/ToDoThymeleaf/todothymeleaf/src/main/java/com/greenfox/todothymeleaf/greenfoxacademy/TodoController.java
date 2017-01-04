package com.greenfox.todothymeleaf.greenfoxacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rita on 2016.12.20..
 */

@Controller
@RequestMapping("/todo")
public class TodoController {
    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/list")
    public String list() {
        List<Todo> list = new ArrayList<>(todoService.getTodos());
        return list.toString();
    }


}
