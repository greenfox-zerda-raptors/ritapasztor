package com.greenfox.Service;

import com.greenfox.Model.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rita on 2017.01.10..
 */
@Repository
public interface MealRepository extends CrudRepository<Meal, Long> {
    List<Meal> findALl();
}
