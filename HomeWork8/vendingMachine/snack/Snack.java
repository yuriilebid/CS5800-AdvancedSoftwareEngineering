package HomeWork8.vendingMachine.snack;

public class Snack {
    final private String name;
    final private double price;
    private int quantity;

    public Snack(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void dispense() {
        if (quantity > 0) {
            quantity--;
        } else {
            throw new IllegalStateException("Snack " + name + " don't exist");
        }
    }
}
