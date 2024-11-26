package HomeWork8.vendingMachine.handler;

import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.snack.Snack;

public class SnickersDispenseHandler extends SnackDispenseHandler {

    @Override
    public boolean handle(String snackName, VendingMachine machine) {
        if ("Snickers".equalsIgnoreCase(snackName)) {
            Snack snack = machine.getSnackByName("Snickers");
            if (snack != null && snack.getQuantity() > 0) {
                snack.dispense();
                return true;
            } else {
                System.out.println("No Snickers left");
                return false;
            }
        } else if (nextHandler != null) {
            return nextHandler.handle(snackName, machine);
        } else {
            System.out.println("Snacks wasn't found");
            return false;
        }
    }
}

