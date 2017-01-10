package com.greenfox.Service;

import com.greenfox.Model.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rita on 2017.01.10..
 */

@Service
public class MealService {

    private MealRepository repository;
    String[] types = new String[]{"Breakfast", "Elevenses", "Lunch", "Snack", "Dinner", "Midnight Snack"};

    @Autowired
    public MealService(MealRepository repository) {
        this.repository = repository;
    }

    public List<Meal> findAllMeals() {
        return repository.findAll();
    }

    public void createNewMeal(Meal meal) {
        repository.save(meal);
    }

    public String[] getTypes() {
        return types;
    }
}
