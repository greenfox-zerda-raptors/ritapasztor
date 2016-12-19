package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Rita on 2016.12.19..
 */
@Controller
public class HelloToAllTheWorld {
    private final String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    private final String[] colors = {"red", "grey", "black", "yellow", "green", "blue"};
    private final Integer[] fontSize = {12, 14, 16, 18, 20};
    private Random rand = new Random();

    Welcome welcome;
    ArrayList<Welcome> welcomes = new ArrayList<>();


    @RequestMapping("/web/helloall")
    public String greeting(Model model) {
        for (String hi : hellos) {
            welcomes.add(new Welcome(hi, colors[rand.nextInt(colors.length)], rand.nextInt(fontSize.length)));
        }
        model.addAttribute("welcomes", welcomes);

        return "helloAllWorld";
    }

//    public String readAll(String[] hellos) {
//        for (String hi : hellos) {
//            return hi;
//        }
//        return hi;
//    }
}
