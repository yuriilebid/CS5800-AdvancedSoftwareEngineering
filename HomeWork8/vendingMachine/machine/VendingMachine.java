package HomeWork8.vendingMachine.machine;

import HomeWork8.vendingMachine.state.VendingMachineState;
import HomeWork8.vendingMachine.state.IdleState;
import HomeWork8.vendingMachine.snack.Snack;
import HomeWork8.vendingMachine.handler.SnackDispenseHandler;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private VendingMachineState currentState;
    public List<Snack> snacks;
    private SnackDispenseHandler snackHandlers;
    private String selectedSnack;
    private double currentMoney;

    public VendingMachine() {
        this.currentState = new IdleState();
        this.snacks = new ArrayList<>();
        this.currentMoney = 0;
    }

    public void addSnack(Snack snack) {
        snacks.add(snack);
    }

    public Snack getSnackByName(String name) {
        for (Snack snack : snacks) {
            if (snack.getName().equalsIgnoreCase(name)) {
                return snack;
            }
        }
        return null;
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void selectSnack(String snackName) {
        currentState.selectSnack(this, snackName);
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(this, amount);
    }

    public void dispenseSnack() {
        currentState.dispenseSnack(this);
    }

    public VendingMachineState getCurrentState() {
        return this.currentState;
    }

    public void setSelectedSnack(String snackName) {
        this.selectedSnack = snackName;
    }

    public String getSelectedSnack() {
        return selectedSnack;
    }

    public void addMoney(double amount) {
        this.currentMoney += amount;
    }

    public double getCurrentMoney() {
        return currentMoney;
    }

    public void reset() {
        selectedSnack = null;
        currentMoney = 0;
    }

    public void returnMoney() {
        System.out.printf("Money return: $%.2f\n", currentMoney);
        currentMoney = 0;
    }

    public SnackDispenseHandler getSnackHandlers() {
        return snackHandlers;
    }

    public void setSnackHandlers(SnackDispenseHandler snackHandlers) {
        this.snackHandlers = snackHandlers;
    }
}
