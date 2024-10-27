package HomeWork4.pizzaAndMovies.test.builder;

import HomeWork4.pizzaAndMovies.builder.DominosBuilder;
import HomeWork4.pizzaAndMovies.models.Pizza;
import HomeWork4.pizzaAndMovies.models.Topping;
import HomeWork4.pizzaAndMovies.enums.PizzaSize;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DominosBuilderTest {

    @Test
    void testSetSize() {
        DominosBuilder builder = new DominosBuilder();
        builder.setSize(PizzaSize.SMALL);
        Pizza pizza = builder.build();
        assertEquals(PizzaSize.SMALL, pizza.getSize(), "The size should be SMALL.");
    }

    @Test
    void testAddToppings() {
        DominosBuilder builder = new DominosBuilder();
        builder.setSize(PizzaSize.LARGE)
                .addToppings(Arrays.asList(Topping.HAM, Topping.PESTO));
        Pizza pizza = builder.build();
        assertEquals(Arrays.asList(Topping.HAM, Topping.PESTO), pizza.getToppings(),
                "The toppings should be [HAM, PESTO].");
    }

    @Test
    void testBuild() {
        DominosBuilder builder = new DominosBuilder();
        builder.setSize(PizzaSize.MEDIUM)
                .addToppings(Arrays.asList(Topping.SPICY_PORK, Topping.HAM_PINEAPPLE));
        Pizza pizza = builder.build();
        assertNotNull(pizza, "The pizza should not be null.");
        assertEquals("Dominos", pizza.getChain(), "The chain should be Dominos.");
    }
}
