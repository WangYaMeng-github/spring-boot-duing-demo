package com.duing.controller;

import com.duing.config.FoodConfig;
import com.duing.domain.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@Autowired
private FoodConfig foodConfig;
    @RequestMapping("/json")
    public Food json(){
        Food food = new Food();
        food.setRice(foodConfig.getRice());
        food.setMeat(foodConfig.getMeat());
        return food;
    }
}
