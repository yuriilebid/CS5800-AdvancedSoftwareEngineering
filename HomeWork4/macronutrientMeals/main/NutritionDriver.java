package HomeWork4.macronutrientMeals.main;

import HomeWork4.macronutrientMeals.models.Customer;
import HomeWork4.macronutrientMeals.models.Meal;
import HomeWork4.macronutrientMeals.enums.DietPlan;

public class NutritionDriver {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("Yurii", DietPlan.NO_RESTRICTION),
                new Customer("Vladyslav", DietPlan.PALEO),
                new Customer("Volodymyr", DietPlan.VEGAN),
                new Customer("Nataliia", DietPlan.NUT_ALLERGY),
                new Customer("Yuliia", DietPlan.NO_RESTRICTION),
                new Customer("Michael", DietPlan.VEGAN)
        };

        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName() + ", Diet Plan: " + customer.getDietPlan());
            Meal meal = new Meal(customer);
            meal.displayMeal();
            System.out.println();
        }
    }
}
