package HomeWork4.pizzaAndMovies.builder;

import HomeWork4.pizzaAndMovies.models.Pizza;
import HomeWork4.pizzaAndMovies.enums.PizzaSize;
import HomeWork4.pizzaAndMovies.models.Topping;

import java.util.ArrayList;
import java.util.List;

public class PizzaHutBuilder implements PizzaBuilder {
    private PizzaSize size;
    private List<Topping> toppings = new ArrayList<>();

    @Override
    public PizzaBuilder setSize(PizzaSize size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder addToppings(List<Topping> toppings) {
        this.toppings.addAll(toppings);
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza("Pizza Hut", size, toppings);
    }
}
