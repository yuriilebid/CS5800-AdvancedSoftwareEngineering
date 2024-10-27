package HomeWork4.macronutrientMeals.test.factories;

import HomeWork4.macronutrientMeals.factories.ProteinFactory;
import HomeWork4.macronutrientMeals.enums.DietPlan;
import HomeWork4.macronutrientMeals.foods.Food;
import HomeWork4.macronutrientMeals.foods.proteins.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProteinFactoryTest {

    private final ProteinFactory proteinFactory = new ProteinFactory();

    @Test
    void testCreateFoodNoRestriction() {
        Food food = proteinFactory.createFood(DietPlan.NO_RESTRICTION);
        assertTrue(food instanceof Beef, "Expected Beef for No Restriction diet");
    }

    @Test
    void testCreateFoodPaleo() {
        Food food = proteinFactory.createFood(DietPlan.PALEO);
        assertTrue(food instanceof Chicken, "Expected Chicken for Paleo diet");
    }

    @Test
    void testCreateFoodVegan() {
        Food food = proteinFactory.createFood(DietPlan.VEGAN);
        assertTrue(food instanceof Tofu, "Expected Tofu for Vegan diet");
    }

    @Test
    void testCreateFoodNutAllergy() {
        Food food = proteinFactory.createFood(DietPlan.NUT_ALLERGY);
        assertTrue(food instanceof Fish, "Expected Fish for Nut Allergy diet");
    }
}
