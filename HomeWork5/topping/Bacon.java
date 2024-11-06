package HomeWork5.topping;

import HomeWork5.food.FoodItem;

public class Bacon extends ToppingDecorator {
    public Bacon(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
