package HomeWork5.topping;

import HomeWork5.food.FoodItem;

public class Lettuce extends ToppingDecorator {
    public Lettuce(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}