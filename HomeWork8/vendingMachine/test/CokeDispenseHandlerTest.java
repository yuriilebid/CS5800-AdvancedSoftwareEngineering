package HomeWork8.vendingMachine.test;

import HomeWork8.vendingMachine.handler.CokeDispenseHandler;
import HomeWork8.vendingMachine.handler.PepsiDispenseHandler;
import HomeWork8.vendingMachine.handler.SnackDispenseHandler;
import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.snack.Snack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CokeDispenseHandlerTest {

    private VendingMachine machine;
    private SnackDispenseHandler handler;

    @BeforeEach
    public void setup() {
        machine = new VendingMachine();
        machine.addSnack(new Snack("Coke", 1.25, 1));
        handler = new CokeDispenseHandler();
    }

    @Test
    public void testHandleCokeSuccess() {
        boolean result = handler.handle("Coke", machine);
        assertTrue(result);
        Snack coke = machine.getSnackByName("Coke");
        assertEquals(0, coke.getQuantity());
    }

    @Test
    public void testHandleCokeOutOfStock() {
        machine.getSnackByName("Coke").setQuantity(0);
        boolean result = handler.handle("Coke", machine);
        assertFalse(result);
    }

    @Test
    public void testHandleOtherSnack() {
        SnackDispenseHandler nextHandler = new PepsiDispenseHandler();
        handler.setNextHandler(nextHandler);
        boolean result = handler.handle("Pepsi", machine);
        assertFalse(result);
    }
}

