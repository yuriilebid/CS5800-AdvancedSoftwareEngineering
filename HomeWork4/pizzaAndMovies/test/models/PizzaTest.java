package HomeWork4.pizzaAndMovies.test.models;

import HomeWork4.pizzaAndMovies.models.Pizza;
import HomeWork4.pizzaAndMovies.models.Topping;
import HomeWork4.pizzaAndMovies.enums.PizzaSize;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    @Test
    void testEat() {
        Pizza pizza = new Pizza("Pizza Hut", PizzaSize.SMALL, Arrays.asList(Topping.PEPPERONI, Topping.OLIVES));
        String expectedOutput = "Pizza Hut SMALL pizza with toppings: [PEPPERONI, OLIVES]";
        assertEquals(expectedOutput, pizza.toString(), "The eat() output should match expected output.");
    }
}
