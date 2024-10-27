package HomeWork4.macronutrientMeals.models;

import HomeWork4.macronutrientMeals.foods.Food;
import HomeWork4.macronutrientMeals.factories.AbstractMacronutrientFactory;
import HomeWork4.macronutrientMeals.enums.DietPlan;

public class Meal {
    private final Food carb;
    private final Food protein;
    private final Food fat;

    public Meal(Customer customer) {
        DietPlan dietPlan = customer.getDietPlan();
        this.carb = AbstractMacronutrientFactory.getCarbsFactory().createFood(dietPlan);
        this.protein = AbstractMacronutrientFactory.getProteinFactory().createFood(dietPlan);
        this.fat = AbstractMacronutrientFactory.getFatsFactory().createFood(dietPlan);
    }

    public void displayMeal() {
        System.out.println("Carb: " + carb.getName());
        System.out.println("Protein: " + protein.getName());
        System.out.println("Fat: " + fat.getName());
    }

    public Food getCarb() {
        return this.carb;
    }

    public Food getProtein() {
        return this.protein;
    }

    public Food getFat() {
        return this.fat;
    }
}
