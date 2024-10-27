package HomeWork4.macronutrientMeals.factories;

import HomeWork4.macronutrientMeals.foods.Food;
import HomeWork4.macronutrientMeals.foods.fats.*;
import HomeWork4.macronutrientMeals.enums.DietPlan;

public class FatsFactory implements MacronutrientFactory {
    @Override
    public Food createFood(DietPlan dietPlan) {
        switch (dietPlan) {
            case PALEO:
                return new Avocado(); // Allowed: Avocado, Peanuts, Tuna. Banned: SourCream
            case NUT_ALLERGY:
                return new Tuna(); // Allowed: Avocado, SourCream, Tuna. Banned: Peanuts
            case VEGAN: // Allowed: Avocado, Peanuts. Banned: SourCream, Tuna
                return new Peanuts();
            default:
                return new SourCream(); // Default carb
        }
    }
}
