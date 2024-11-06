package HomeWork5.test.order;

import org.junit.jupiter.api.Test;
import HomeWork5.food.Burger;
import HomeWork5.topping.Cheese;
import HomeWork5.order.Order;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void testCalculateTotalCost() {
        Order order = new Order();
        order.addItem(new Burger());
        order.addItem(new Cheese(new Burger()));
        assertEquals(11.0, order.calculateTotalCost());
    }
}
