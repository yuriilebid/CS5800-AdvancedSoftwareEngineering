package HomeWork8.vendingMachine.state;

import HomeWork8.vendingMachine.machine.VendingMachine;

public class IdleState implements VendingMachineState {

    @Override
    public void selectSnack(VendingMachine machine, String snackName) {
        machine.setSelectedSnack(snackName);
        System.out.println("Selected snack: " + snackName);
        machine.setState(new WaitingMoneyState());
    }

    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Firstly enter snack name");
    }

    @Override
    public void dispenseSnack(VendingMachine machine) {
        System.out.println("Select snack and enter money");
    }
}
