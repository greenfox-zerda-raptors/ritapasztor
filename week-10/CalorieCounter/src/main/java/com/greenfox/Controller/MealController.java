package com.greenfox.Controller;

import com.greenfox.Model.Meal;
import com.greenfox.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rita on 2017.01.10..
 */

@Controller
@RequestMapping(value = "/meals")
public class MealController {


    private MealService service;

    @Autowired
    public MealController(MealService service) {
        this.service = service;
    }


    @GetMapping(value = {"", "/", "/index"})
    public String index(Model model) {
        model.addAttribute("meals", service.findAllMeals());
        return "index";
    }

    @GetMapping(value = "/add")
    public String addMeal(Model model) {
        model.addAttribute("allTypes", service.getTypes());
        model.addAttribute("meal", new Meal());
        return "add";
    }

    @PostMapping(value = "/create")
    public String createMeal(@ModelAttribute Meal meal) {
        service.createNewMeal(meal);
        return "redirect:/meals/index";
    }


}
