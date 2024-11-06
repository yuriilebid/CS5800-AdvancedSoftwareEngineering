package HomeWork5.topping;

import HomeWork5.food.FoodItem;

public abstract class ToppingDecorator implements FoodItem {
    protected FoodItem foodItem;

    public ToppingDecorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public double getCost() {
        return foodItem.getCost();
    }
}