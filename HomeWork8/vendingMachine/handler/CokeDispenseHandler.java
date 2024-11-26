package HomeWork8.vendingMachine.handler;

import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.snack.Snack;

public class CokeDispenseHandler extends SnackDispenseHandler {

    @Override
    public boolean handle(String snackName, VendingMachine machine) {
        if ("Coke".equalsIgnoreCase(snackName)) {
            Snack snack = machine.getSnackByName("Coke");
            if (snack != null && snack.getQuantity() > 0) {
                snack.dispense();
                return true;
            } else {
                System.out.println("No Coke left");
                return false;
            }
        } else if (nextHandler != null) {
            return nextHandler.handle(snackName, machine);
        } else {
            System.out.println("Snack wasn't found.");
            return false;
        }
    }
}

