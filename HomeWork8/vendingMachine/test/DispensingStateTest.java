package HomeWork8.vendingMachine.test;

import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.state.DispensingState;
import HomeWork8.vendingMachine.snack.Snack;
import HomeWork8.vendingMachine.handler.*;

import HomeWork8.vendingMachine.state.IdleState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DispensingStateTest {
    private VendingMachine machine;

    @BeforeEach
    public void setup() {
        machine = new VendingMachine();
        machine.addSnack(new Snack("Coke", 1.25, 5));
        SnackDispenseHandler cokeHandler = new CokeDispenseHandler();

        machine.setSnackHandlers(cokeHandler);
        machine.setSelectedSnack("Coke");
        machine.addMoney(1.25);
        machine.setState(new DispensingState());
    }

    @Test
    public void testDispenseSnackSuccess() {
        machine.dispenseSnack();
        assertInstanceOf(IdleState.class, machine.getCurrentState());
        Snack coke = machine.getSnackByName("Coke");
        assertEquals(4, coke.getQuantity());
        assertEquals(0, machine.getCurrentMoney());
    }

    @Test
    public void testSelectSnackDuringDispensing() {
        machine.selectSnack("Pepsi");
        assertEquals("Coke", machine.getSelectedSnack());
    }

    @Test
    public void testInsertMoneyDuringDispensing() {
        machine.insertMoney(1.00);
        assertEquals(1.25, machine.getCurrentMoney());
    }
}

