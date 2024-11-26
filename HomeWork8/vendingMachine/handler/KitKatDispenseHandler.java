package HomeWork8.vendingMachine.handler;

import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.snack.Snack;

public class KitKatDispenseHandler extends SnackDispenseHandler {
    @Override
    public boolean handle(String snackName, VendingMachine machine) {
        if ("KitKat".equalsIgnoreCase(snackName)) {
            Snack snack = machine.getSnackByName("KitKat");
            if (snack != null && snack.getQuantity() > 0) {
                snack.dispense();
                return true;
            } else {
                System.out.println("No KitKat left");
                return false;
            }
        } else if (nextHandler != null) {
            return nextHandler.handle(snackName, machine);
        } else {
            System.out.println("Snack wasn't found");
            return false;
        }
    }
}
