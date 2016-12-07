package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Collections;

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
                cards.add(card);                // hozzaadom az arraylisthey, lehet roviditeni is, nem kell kulon valtozoba
            }
        }
        used = new ArrayList<>();
        Collections.shuffle(cards);
    }

    //huzunk a paklibol
    public Card draw() {//cards-bol kiveszunk egyet, azt visszateresi ertekkent megadom es beleteszem a used-ba
        if (cards.size() == 0) { // ha elfogy a pakli
            return null;
        }
        Card removed = cards.remove(0); //beletesszuk egy valtozoba, amit removultunk
        used.add(removed);
        return removed; //return  huzott kartyat
    }
}
