package HomeWork8.vendingMachine.test;

import HomeWork8.vendingMachine.snack.Snack;
import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.state.IdleState;
import HomeWork8.vendingMachine.state.WaitingMoneyState;
import HomeWork8.vendingMachine.handler.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {

    private VendingMachine vendingMachine;

    @BeforeEach
    public void setup() {
        vendingMachine = new VendingMachine();
        vendingMachine.addSnack(new Snack("Coke", 1.25, 5));
        vendingMachine.addSnack(new Snack("Pepsi", 1.00, 5));
        vendingMachine.addSnack(new Snack("Snickers", 0.75, 1));
        SnackDispenseHandler cokeHandler = new CokeDispenseHandler();
        SnackDispenseHandler pepsiHandler = new PepsiDispenseHandler();
        SnackDispenseHandler snickersHandler = new SnickersDispenseHandler();

        cokeHandler.setNextHandler(pepsiHandler);
        pepsiHandler.setNextHandler(snickersHandler);
        vendingMachine.setSnackHandlers(cokeHandler);
    }

    @Test
    public void testAddSnackAndGetSnackByName() {
        Snack snack = new Snack("KitKat", 0.75, 5);
        vendingMachine.addSnack(snack);
        Snack retrievedSnack = vendingMachine.getSnackByName("KitKat");
        assertEquals(snack, retrievedSnack);
    }

    @Test
    public void testSelectSnack() {
        vendingMachine.selectSnack("Coke");
        assertEquals("Coke", vendingMachine.getSelectedSnack());
        assertInstanceOf(WaitingMoneyState.class, vendingMachine.getCurrentState());
    }

    @Test
    public void testInsertMoney() {
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(1.00);
        assertEquals(1.00, vendingMachine.getCurrentMoney());
    }

    @Test
    public void testDispenseSnackSuccessful() {
        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(1.00);
        assertInstanceOf(IdleState.class, vendingMachine.getCurrentState());
        Snack pepsi = vendingMachine.getSnackByName("Pepsi");
        assertEquals(4, pepsi.getQuantity());
    }

    @Test
    public void testDispenseSnackInsufficientFunds() {
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(1.00);
        assertEquals(1.00, vendingMachine.getCurrentMoney());
    }

    @Test
    public void testReset() {
        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(1.00);
        vendingMachine.reset();
        assertNull(vendingMachine.getSelectedSnack());
        assertEquals(0, vendingMachine.getCurrentMoney());
    }

    @Test
    public void testReturnMoney() {
        vendingMachine.addMoney(2.00);
        vendingMachine.returnMoney();
        assertEquals(0, vendingMachine.getCurrentMoney());
    }
}
