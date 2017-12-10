package com.riadh.kata.menugenerator;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MenuGeneratorTest {

    @Test
    public void give_me_random_meal() {
        MealGenerator generator = new MealGenerator();
        Assertions.assertThat(generator.giveMeMeal()).isNotEmpty();
    }

    @Test
    public void find_meal_proposal_containing_given_string() {
        MealGenerator generator = new MealGenerator();
        Assertions.assertThat(generator.searchMeal("Omele")).isTrue();
    }
}
