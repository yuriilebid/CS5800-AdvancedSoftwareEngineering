package HomeWork4.pizzaAndMovies.models;

import HomeWork4.pizzaAndMovies.enums.PizzaSize;
import java.util.List;

public class Pizza {
    private final String chain;
    private final PizzaSize size;
    private final List<Topping> toppings;

    public Pizza(String chain, PizzaSize size, List<Topping> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public String getChain() {
        return chain;
    }

    public PizzaSize getSize() {
        return size;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void eat() {
        System.out.println(chain + " " + size + " pizza with toppings: " + toppings);
    }

    @Override
    public String toString() {
        return chain + " " + size + " pizza with toppings: " + toppings;
    }
}
