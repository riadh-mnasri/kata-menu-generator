package com.riadh.kata.menugenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MealGenerator {

    private List<String> meals = Arrays.asList("Omelette", "Pâtes", "Poisson grillée", "Coucous", "Salades Gourmande");
    public static final int MEALS_TOTAL_NUMBER = 5;

    public String giveMeMeal() {
        Random rand = new Random();
        rand.nextInt(MEALS_TOTAL_NUMBER);
        return meals.get(rand.nextInt(5));
    }

    public boolean searchMeal(String text) {
        return meals.stream().anyMatch(m -> m.contains(text));
    }
}
