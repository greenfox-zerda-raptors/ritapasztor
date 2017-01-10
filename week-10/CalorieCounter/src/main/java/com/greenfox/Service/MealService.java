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

    MealRepository repository;

    @Autowired
    public MealService(MealRepository repository) {
        this.repository = repository;
    }

    public List<Meal> findAllMeals() {
        return (List<Meal>) repository.findAll();
    }
}
