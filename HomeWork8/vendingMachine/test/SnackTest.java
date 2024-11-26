package HomeWork8.vendingMachine.test;

import HomeWork8.vendingMachine.snack.Snack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SnackTest {

    @Test
    public void testConstructorAndGetters() {
        Snack snack = new Snack("Coke", 1.25, 5);
        assertEquals("Coke", snack.getName());
        assertEquals(1.25, snack.getPrice());
        assertEquals(5, snack.getQuantity());
    }

    @Test
    public void testDispense() {
        Snack snack = new Snack("Pepsi", 1.00, 3);
        snack.dispense();
        assertEquals(2, snack.getQuantity());
    }

    @Test
    public void testDispenseWhenQuantityZero() {
        Snack snack = new Snack("KitKat", 0.75, 0);
        Exception exception = assertThrows(IllegalStateException.class, snack::dispense);
        assertEquals("Snack KitKat don't exist", exception.getMessage());
    }

    @Test
    public void testSetQuantity() {
        Snack snack = new Snack("Snickers", 0.75, 5);
        snack.setQuantity(10);
        assertEquals(10, snack.getQuantity());
    }
}
