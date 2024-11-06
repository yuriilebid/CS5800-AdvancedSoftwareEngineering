package HomeWork5.test.food;

import HomeWork5.food.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FoodItemTest {
    @Test
    void testBurgerCost() {
        FoodItem burger = new Burger();
        assertEquals(5.0, burger.getCost());
    }

    @Test
    void testFriesCost() {
        FoodItem fries = new Fries();
        assertEquals(2.5, fries.getCost());
    }

    @Test
    void testHotDogCost() {
        FoodItem hotDog = new HotDog();
        assertEquals(3.0, hotDog.getCost());
    }
}

