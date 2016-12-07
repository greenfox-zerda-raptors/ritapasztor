package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by Rita on 2016.12.07..
 */
public class Player {
    String name;
    ArrayList<Card> played;

    public Player(String name) {
        this.name = name;
        played = new ArrayList<>(); // itt hozom letre az ures ArrayListet
    }

    public int sum() { //nincs parametere, majd csak a kijatszott kartyaimtol fugg
        int sum = 0;
        for (Card card : played) {
            sum += card.getValue();
        }
        return sum;
    }

    public void add(Card drawn) {
        played.add(drawn);
    }
}
