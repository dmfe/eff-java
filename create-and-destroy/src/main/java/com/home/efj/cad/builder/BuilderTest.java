package com.home.efj.cad.builder;

import lombok.extern.log4j.Log4j;

@Log4j
public class BuilderTest {

    public static void run() {
        NutritionFacts nutritionFacts = NutritionFacts.builder(5, 50)
                .calories(100)
                .sodium(20)
                .fat(20)
                .carbohydrate(3)
                .build();

        log.info("Nutrition facts: " + nutritionFacts);
    }
}
