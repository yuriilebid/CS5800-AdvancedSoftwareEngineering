package HomeWork4.macronutrientMeals.test.models;

import HomeWork4.macronutrientMeals.enums.DietPlan;
import HomeWork4.macronutrientMeals.foods.Food;
import HomeWork4.macronutrientMeals.models.*;
import HomeWork4.macronutrientMeals.factories.AbstractMacronutrientFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void testMealForPaleoDiet() {
        Customer customer = new Customer("Alice", DietPlan.PALEO);
        Meal meal = new Meal(customer);

        Food carb = AbstractMacronutrientFactory.getCarbsFactory().createFood(DietPlan.PALEO);
        Food protein = AbstractMacronutrientFactory.getProteinFactory().createFood(DietPlan.PALEO);
        Food fat = AbstractMacronutrientFactory.getFatsFactory().createFood(DietPlan.PALEO);

        assertEquals(carb.getName(), meal.getCarb().getName(), "Carb should respect Paleo diet");
        assertEquals(protein.getName(), meal.getProtein().getName(), "Protein should respect Paleo diet");
        assertEquals(fat.getName(), meal.getFat().getName(), "Fat should respect Paleo diet");
    }

    @Test
    void testMealForVeganDiet() {
        Customer customer = new Customer("Margo", DietPlan.VEGAN);
        Meal meal = new Meal(customer);

        assertTrue(meal.getProtein().getName().equals("Tofu") || meal.getProtein().getName().equals("Other Vegan Protein"),
                "Protein should be vegan-friendly");
        assertEquals("Peanuts", meal.getFat().getName(), "Fat should be vegan-friendly (Peanut)");
    }
}

