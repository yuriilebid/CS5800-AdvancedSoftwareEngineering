package HomeWork4.macronutrientMeals.test.factories;

import HomeWork4.macronutrientMeals.factories.FatsFactory;
import HomeWork4.macronutrientMeals.enums.DietPlan;
import HomeWork4.macronutrientMeals.foods.Food;
import HomeWork4.macronutrientMeals.foods.fats.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatsFactoryTest {

    private final FatsFactory fatsFactory = new FatsFactory();

    @Test
    void testCreateFoodNoRestriction() {
        Food food = fatsFactory.createFood(DietPlan.NO_RESTRICTION);
        assertTrue(food instanceof SourCream, "Expected SourCream for No Restriction diet");
    }

    @Test
    void testCreateFoodPaleo() {
        Food food = fatsFactory.createFood(DietPlan.PALEO);
        assertTrue(food instanceof Avocado, "Expected Avocado for Paleo diet");
    }

    @Test
    void testCreateFoodVegan() {
        Food food = fatsFactory.createFood(DietPlan.VEGAN);
        assertTrue(food instanceof Peanuts, "Expected Avocado for Peanuts diet");
    }

    @Test
    void testCreateFoodNutAllergy() {
        Food food = fatsFactory.createFood(DietPlan.NUT_ALLERGY);
        assertTrue(food instanceof Tuna, "Expected Sour Tuna for Nut Allergy diet");
    }
}
