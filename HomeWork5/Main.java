package HomeWork5;

import HomeWork5.food.*;
import HomeWork5.topping.*;
import HomeWork5.order.Order;
import HomeWork5.discount.LoyaltyDiscount;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Cheese(new Burger()));
        order.addItem(new Bacon(new Fries()));
        double totalCost = order.calculateTotalCost();

        LoyaltyDiscount loyalty = new LoyaltyDiscount();
        double discountedTotal = loyalty.applyDiscount(totalCost, "Gold");
        System.out.println("Total cost after discount: " + discountedTotal);
    }
}
