package com.greenfox.RitaTodoList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Rita on 2016.11.17..
 */
public class TodoList {
    ArrayList <String> tasks = new ArrayList<>();

    public void load(){
        try (BufferedReader storedTodoList = new BufferedReader(new FileReader("C:\\Users\\Rita\\Documents\\greenfox\\ritapasztor\\week-05\\Project\\src\\com\\greenfox\\RitaTodoList\\todoList.txt"))) {
            String Currentline;
            if ((Currentline = storedTodoList.readLine()) != null) {
                tasks.add(Currentline);
            } else {
                System.out.println("No todos for today! :)");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

    public void displayTodoList() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + " - " + tasks.get(i));
            }
        }

}
