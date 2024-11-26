package HomeWork8.vendingMachine.handler;

import HomeWork8.vendingMachine.machine.VendingMachine;

public abstract class SnackDispenseHandler {
    protected SnackDispenseHandler nextHandler;

    public void setNextHandler(SnackDispenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean handle(String snackName, VendingMachine machine);
}

