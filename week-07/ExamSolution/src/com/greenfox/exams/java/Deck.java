package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by Rita on 2016.12.07..
 */
public class Deck {
    private static final String[] COLORS = new String[] {"karo", "tref", "kor", "pikk"};
    ArrayList<Card> cards; //jelenleg meg uresek
    ArrayList<Card> used;

    public Deck() {
        cards = new ArrayList<>(); // constructorban adok neki erteket
        for(String color : COLORS) {
            for (int i = 1; i < 14; i++) {
                Card card = new Card(color, i); // es mar kesz is a kartya, van egy szine es egy erteke
            }
        }

        used = new ArrayList<>();
    }
}
