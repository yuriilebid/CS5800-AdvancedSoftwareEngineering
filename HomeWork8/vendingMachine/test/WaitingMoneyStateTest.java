package HomeWork8.vendingMachine.test;

import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.snack.Snack;
import HomeWork8.vendingMachine.state.WaitingMoneyState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WaitingMoneyStateTest {
    private VendingMachine machine;

    @BeforeEach
    public void setup() {
        machine = new VendingMachine();
        machine.addSnack(new Snack("Coke", 1.25, 5));
        machine.setState(new WaitingMoneyState());
        machine.setSelectedSnack("Coke");
    }

    @Test
    public void testInsertMoneyInsufficient() {
        machine.insertMoney(1.00);
        assertInstanceOf(WaitingMoneyState.class, machine.getCurrentState());
        assertEquals(1.00, machine.getCurrentMoney());
    }

    @Test
    public void testSelectSnack() {
        machine.selectSnack("Pepsi");
        assertEquals("Coke", machine.getSelectedSnack());
    }

    @Test
    public void testDispenseSnack() {
        machine.dispenseSnack();
        assertInstanceOf(WaitingMoneyState.class, machine.getCurrentState());
    }
}

