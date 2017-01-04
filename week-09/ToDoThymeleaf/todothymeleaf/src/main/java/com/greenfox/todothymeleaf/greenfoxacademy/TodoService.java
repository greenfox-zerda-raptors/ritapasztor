package com.greenfox.todothymeleaf.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rita on 2016.12.20..
 */
public class TodoService {
    private List<Todo> fakeTodoStore = new ArrayList<Todo>(
            Arrays.asList(
                    new Todo(0, "Create an action", true, true),
                    new Todo(1, "Add @RequestMapping to it"),
                    new Todo(2, "Return the viewName from the action")));

    public List<Todo> getTodos() {
        return fakeTodoStore;
    }

    public void addTodo(Todo todo) {
        if (todo.getId() == 0) {
            todo.setId(fakeTodoStore.size());
        }
        fakeTodoStore.add(todo);
    }
}
