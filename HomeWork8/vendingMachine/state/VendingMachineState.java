package HomeWork8.vendingMachine.state;

import HomeWork8.vendingMachine.machine.VendingMachine;

public interface VendingMachineState {
    void selectSnack(VendingMachine machine, String snackName);
    void insertMoney(VendingMachine machine, double amount);
    void dispenseSnack(VendingMachine machine);
}
