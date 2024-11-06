package HomeWork5.order;

import HomeWork5.food.FoodItem;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double calculateTotalCost() {
        return items.stream().mapToDouble(FoodItem::getCost).sum();
    }
}

