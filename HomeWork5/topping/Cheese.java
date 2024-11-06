package HomeWork5.topping;

import HomeWork5.food.FoodItem;

public class Cheese extends ToppingDecorator {
    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
}