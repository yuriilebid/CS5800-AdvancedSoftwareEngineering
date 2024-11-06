package HomeWork5.test.topping;

import org.junit.jupiter.api.Test;
import HomeWork5.food.*;
import HomeWork5.topping.*;
import static org.junit.jupiter.api.Assertions.*;

class ToppingDecoratorTest {
    @Test
    void testCheeseToppingCost() {
        ToppingDecorator cheeseBurger = new Cheese(new Burger());
        assertEquals(6.0, cheeseBurger.getCost());
    }

    @Test
    void testBaconToppingCost() {
        ToppingDecorator baconBurger = new Bacon(new Burger());
        assertEquals(6.5, baconBurger.getCost());
    }
}
