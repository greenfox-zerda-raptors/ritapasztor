package com.greenfox.exams.java;

/**
 * Created by Rita on 2016.12.07..
 */
public class Card {
    //public static final String COLOR_KARO = "karo"; //nem kotelezo, ha szeretnenk megadni akkor lehet

    String color;
    int value;

    public Card(String color, int value) {
        this.color = color;
        /*if(value<10) {
            this.value = 10;
        }else {*/ // nem volt feladat, de be lehet allitani
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
