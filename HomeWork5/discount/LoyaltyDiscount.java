package HomeWork5.discount;

public class LoyaltyDiscount {
    public double applyDiscount(double totalCost, String loyaltyStatus) {
        double discountRate = loyaltyStatus.equals("Gold") ? 0.1 : 0.05;
        return totalCost * (1 - discountRate);
    }
}
