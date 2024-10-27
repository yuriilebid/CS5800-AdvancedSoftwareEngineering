package HomeWork4.macronutrientMeals.factories;

import HomeWork4.macronutrientMeals.foods.Food;
import HomeWork4.macronutrientMeals.foods.carbs.*;
import HomeWork4.macronutrientMeals.enums.DietPlan;

public class CarbsFactory implements MacronutrientFactory {
    @Override
    public Food createFood(DietPlan dietPlan) {
        switch (dietPlan) {
            case PALEO:
                return new Pistachio(); // Allowed: Pistachio. Banned: Bread, Cheese, Lentils
            case NUT_ALLERGY:
                return new Cheese(); // Allowed: Bread, Cheese, Lentils. Banned: Pistachio
            case VEGAN: // Allowed: Bread, Pistachio, Lentils. Banned: Cheese
                return new Bread();
            default:
                return new Lentils(); // Default carb
        }
    }
}

