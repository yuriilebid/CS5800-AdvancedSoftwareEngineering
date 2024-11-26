package HomeWork8.vendingMachine.state;

import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.handler.SnackDispenseHandler;
import HomeWork8.vendingMachine.snack.Snack;

public class DispensingState implements VendingMachineState {

    @Override
    public void selectSnack(VendingMachine machine, String snackName) {
        System.out.println("Giving money change. Please, wait");
    }

    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Diving your snack. Cannot accept money now");
    }

    @Override
    public void dispenseSnack(VendingMachine machine) {
        SnackDispenseHandler handler = machine.getSnackHandlers();
        boolean dispensed = handler.handle(machine.getSelectedSnack(), machine);

        if (dispensed) {
            Snack snack = machine.getSnackByName(machine.getSelectedSnack());
            double change = machine.getCurrentMoney() - snack.getPrice();

            if (change > 0) {
                System.out.printf("Given: %s. Your change: $%.2f\n", snack.getName(), change);
            } else {
                System.out.println("Dispensed: " + snack.getName() + ".");
            }
            machine.reset();
            machine.setState(new IdleState());
        } else {
            System.out.println("Cannot dispense snack");
            machine.returnMoney();
            machine.setState(new IdleState());
        }
    }
}
