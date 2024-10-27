package HomeWork4.pizzaAndMovies.builder;

import HomeWork4.pizzaAndMovies.models.Pizza;
import HomeWork4.pizzaAndMovies.enums.PizzaSize;
import HomeWork4.pizzaAndMovies.models.Topping;

import java.util.List;

public interface PizzaBuilder {
    PizzaBuilder setSize(PizzaSize size);
    PizzaBuilder addToppings(List<Topping> toppings);
    Pizza build();
}
