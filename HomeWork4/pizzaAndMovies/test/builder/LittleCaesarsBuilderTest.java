package HomeWork4.pizzaAndMovies.test.builder;

import HomeWork4.pizzaAndMovies.builder.LittleCaesarsBuilder;
import HomeWork4.pizzaAndMovies.models.Pizza;
import HomeWork4.pizzaAndMovies.models.Topping;
import HomeWork4.pizzaAndMovies.enums.PizzaSize;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LittleCaesarsBuilderTest {

    @Test
    void testSetSize() {
        LittleCaesarsBuilder builder = new LittleCaesarsBuilder();
        builder.setSize(PizzaSize.MEDIUM);
        Pizza pizza = builder.build();
        assertEquals(PizzaSize.MEDIUM, pizza.getSize(), "The size should be MEDIUM.");
    }

    @Test
    void testAddToppings() {
        LittleCaesarsBuilder builder = new LittleCaesarsBuilder();
        builder.setSize(PizzaSize.LARGE)
                .addToppings(Arrays.asList(Topping.CHICKEN, Topping.PEPPERS, Topping.TOMATO_BASIL));
        Pizza pizza = builder.build();
        assertEquals(Arrays.asList(Topping.CHICKEN, Topping.PEPPERS, Topping.TOMATO_BASIL),
                pizza.getToppings(), "The toppings should be [CHICKEN, PEPPERS, TOMATO_BASIL].");
    }

    @Test
    void testBuild() {
        LittleCaesarsBuilder builder = new LittleCaesarsBuilder();
        builder.setSize(PizzaSize.SMALL)
                .addToppings(Arrays.asList(Topping.BACON, Topping.OLIVES));
        Pizza pizza = builder.build();
        assertNotNull(pizza, "The pizza should not be null.");
        assertEquals("Little Caesars", pizza.getChain(), "The chain should be Little Caesars.");
    }
}
