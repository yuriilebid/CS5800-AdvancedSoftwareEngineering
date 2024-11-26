package HomeWork8.vendingMachine.test;

import HomeWork8.vendingMachine.handler.CokeDispenseHandler;
import HomeWork8.vendingMachine.handler.PepsiDispenseHandler;
import HomeWork8.vendingMachine.handler.SnickersDispenseHandler;
import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.snack.Snack;
import HomeWork8.vendingMachine.handler.SnackDispenseHandler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SnackDispenseChainTest {

    private VendingMachine machine;
    private SnackDispenseHandler chain;

    @BeforeEach
    public void setup() {
        machine = new VendingMachine();
        machine.addSnack(new Snack("Coke", 1.25, 1));
        machine.addSnack(new Snack("Pepsi", 1.00, 1));
        machine.addSnack(new Snack("Snickers", 0.75, 1));

        SnackDispenseHandler cokeHandler = new CokeDispenseHandler();
        SnackDispenseHandler pepsiHandler = new PepsiDispenseHandler();
        SnackDispenseHandler snickersHandler = new SnickersDispenseHandler();
        cokeHandler.setNextHandler(pepsiHandler);
        pepsiHandler.setNextHandler(snickersHandler);
        chain = cokeHandler;
        machine.setSnackHandlers(chain);
    }

    @Test
    public void testHandleExistingSnack() {
        boolean result = chain.handle("Pepsi", machine);
        assertTrue(result);
        Snack pepsi = machine.getSnackByName("Pepsi");
        assertEquals(0, pepsi.getQuantity());
    }

    @Test
    public void testHandleNonExistingSnack() {
        boolean result = chain.handle("KitKat", machine);
        assertFalse(result);
    }
}
