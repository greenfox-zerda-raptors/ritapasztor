package com.greenfox.Controller;

import com.greenfox.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rita on 2017.01.10..
 */

@Controller
@RequestMapping("/meals")
public class MealController {

    private MealService service;

    @Autowired
    public MealController(MealService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("meals", service.findAllMeals());
        return "index";
    }
}
