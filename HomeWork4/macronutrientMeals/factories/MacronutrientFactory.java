package HomeWork4.macronutrientMeals.factories;

import HomeWork4.macronutrientMeals.foods.Food;
import HomeWork4.macronutrientMeals.enums.DietPlan;

public interface MacronutrientFactory {
    Food createFood(DietPlan dietPlan);
}
