package HomeWork8.vendingMachine.state;

import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.snack.Snack;

public class WaitingMoneyState implements VendingMachineState {

    @Override
    public void selectSnack(VendingMachine machine, String snackName) {
        System.out.println("Snack is already selected. Wait for your money please");
    }

    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        machine.addMoney(amount);
        Snack snack = machine.getSnackByName(machine.getSelectedSnack());

        if (snack == null) {
            System.out.println("Selected snacks wasn't found");
            machine.returnMoney();
            machine.setState(new IdleState());
            return;
        }

        double totalInserted = machine.getCurrentMoney();
        double price = snack.getPrice();

        if (totalInserted >= price) {
            machine.setState(new DispensingState());
            machine.dispenseSnack();
        } else {
            System.out.printf("Money accepted $%.2f. Please, Enter $%.2f.\n", totalInserted, price - totalInserted);
        }
    }

    @Override
    public void dispenseSnack(VendingMachine machine) {
        System.out.println("Enter money first");
    }
}
