package HomeWork4.pizzaAndMovies.test.builder;

import HomeWork4.pizzaAndMovies.builder.PizzaHutBuilder;
import HomeWork4.pizzaAndMovies.models.Pizza;
import HomeWork4.pizzaAndMovies.models.Topping;
import HomeWork4.pizzaAndMovies.enums.PizzaSize;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PizzaHutBuilderTest {

    @Test
    void testSetSize() {
        PizzaHutBuilder builder = new PizzaHutBuilder();
        builder.setSize(PizzaSize.LARGE);
        Pizza pizza = builder.build();
        assertEquals(PizzaSize.LARGE, pizza.getSize(), "The size should be LARGE.");
    }

    @Test
    void testAddToppings() {
        PizzaHutBuilder builder = new PizzaHutBuilder();
        builder.setSize(PizzaSize.MEDIUM)
                .addToppings(Arrays.asList(Topping.PEPPERONI, Topping.ONIONS));
        Pizza pizza = builder.build();
        assertEquals(Arrays.asList(Topping.PEPPERONI, Topping.ONIONS), pizza.getToppings(),
                "The toppings should be [PEPPERONI, ONIONS].");
    }

    @Test
    void testBuild() {
        PizzaHutBuilder builder = new PizzaHutBuilder();
        builder.setSize(PizzaSize.SMALL)
                .addToppings(Arrays.asList(Topping.SAUSAGE, Topping.EXTRA_CHEESE));
        Pizza pizza = builder.build();
        assertNotNull(pizza, "The pizza should not be null.");
        assertEquals("Pizza Hut", pizza.getChain(), "The chain should be Pizza Hut.");
    }
}
