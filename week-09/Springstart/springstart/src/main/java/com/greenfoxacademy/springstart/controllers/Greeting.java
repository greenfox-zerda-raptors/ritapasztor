package com.greenfoxacademy.springstart.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by Rita on 2016.12.19..
 */
@Getter
@AllArgsConstructor
@ToString
public class Greeting {
    long id;
    String content;
}
