package HomeWork4.macronutrientMeals.factories;

import HomeWork4.macronutrientMeals.foods.Food;
import HomeWork4.macronutrientMeals.foods.proteins.*;
import HomeWork4.macronutrientMeals.enums.DietPlan;

public class ProteinFactory implements MacronutrientFactory {
    @Override
    public Food createFood(DietPlan dietPlan) {
        switch (dietPlan) {
            case PALEO:
                return new Chicken(); // Allowed: Beef, Chicken, Fish. Banned: Tofu
            case NUT_ALLERGY:
                return new Fish(); // Allowed: Beef, Chicken, Fish, Tofu
            case VEGAN: // Allowed: Tofu. Banned: Fish, Chicken, Beef
                return new Tofu();
            default:
                return new Beef(); // Default carb
        }
    }
}
