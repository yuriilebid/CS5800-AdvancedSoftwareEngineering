package HomeWork8.vendingMachine.test;

import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.state.IdleState;
import HomeWork8.vendingMachine.state.WaitingMoneyState;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IdleStateTest {

    @Test
    public void testSelectSnack() {
        VendingMachine machine = new VendingMachine();
        machine.setState(new IdleState());
        machine.selectSnack("Coke");
        assertEquals("Coke", machine.getSelectedSnack());
        assertInstanceOf(WaitingMoneyState.class, machine.getCurrentState());
    }

    @Test
    public void testInsertMoney() {
        VendingMachine machine = new VendingMachine();
        machine.setState(new IdleState());
        machine.insertMoney(1.00);
        assertEquals(0, machine.getCurrentMoney());
    }

    @Test
    public void testDispenseSnack() {
        VendingMachine machine = new VendingMachine();
        machine.setState(new IdleState());
        machine.dispenseSnack();
        assertInstanceOf(IdleState.class, machine.getCurrentState());
    }
}
