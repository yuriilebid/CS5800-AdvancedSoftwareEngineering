package HomeWork4.macronutrientMeals.test.factories;

import HomeWork4.macronutrientMeals.factories.CarbsFactory;
import HomeWork4.macronutrientMeals.enums.DietPlan;
import HomeWork4.macronutrientMeals.foods.Food;
import HomeWork4.macronutrientMeals.foods.carbs.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarbsFactoryTest {

    private final CarbsFactory carbsFactory = new CarbsFactory();

    @Test
    void testCreateFoodNoRestriction() {
        Food food = carbsFactory.createFood(DietPlan.NO_RESTRICTION);
        assertTrue(food instanceof Lentils, "Expected Lentils for No Restriction diet");
    }

    @Test
    void testCreateFoodPaleo() {
        Food food = carbsFactory.createFood(DietPlan.PALEO);
        assertTrue(food instanceof Pistachio, "Expected Pistachio for Paleo diet");
    }

    @Test
    void testCreateFoodVegan() {
        Food food = carbsFactory.createFood(DietPlan.VEGAN);
        assertTrue(food instanceof Bread, "Expected Bread for Vegan diet");
    }

    @Test
    void testCreateFoodNutAllergy() {
        Food food = carbsFactory.createFood(DietPlan.NUT_ALLERGY);
        assertTrue(food instanceof Cheese, "Expected Cheese for Nut Allergy diet");
    }
}
