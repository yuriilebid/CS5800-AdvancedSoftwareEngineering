package HomeWork4.macronutrientMeals.models;

import HomeWork4.macronutrientMeals.enums.DietPlan;

public class Customer {
    private final String name;
    private final DietPlan dietPlan;

    public Customer(String name, DietPlan dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    public String getName() {
        return name;
    }
}
