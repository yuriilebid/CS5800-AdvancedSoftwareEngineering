package HomeWork8.vendingMachine;

import HomeWork8.vendingMachine.machine.VendingMachine;
import HomeWork8.vendingMachine.snack.Snack;
import HomeWork8.vendingMachine.handler.*;
import java.util.Scanner;

public class VendingMachineDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();
        SnackDispenseHandler cokeHandler = new CokeDispenseHandler();
        SnackDispenseHandler pepsiHandler = new PepsiDispenseHandler();
        SnackDispenseHandler cheetosHandler = new CheetosDispenseHandler();
        SnackDispenseHandler doritosHandler = new DoritosDispenseHandler();
        SnackDispenseHandler kitKatHandler = new KitKatDispenseHandler();
        SnackDispenseHandler snickersHandler = new SnickersDispenseHandler();

        vendingMachine.addSnack(new Snack("Coke", 1.25, 5));
        vendingMachine.addSnack(new Snack("Pepsi", 1.25, 5));
        vendingMachine.addSnack(new Snack("Cheetos", 1.00, 5));
        vendingMachine.addSnack(new Snack("Doritos", 1.00, 5));
        vendingMachine.addSnack(new Snack("KitKat", 0.75, 5));
        vendingMachine.addSnack(new Snack("Snickers", 0.75, 1));
        cokeHandler.setNextHandler(pepsiHandler);
        pepsiHandler.setNextHandler(cheetosHandler);
        cheetosHandler.setNextHandler(doritosHandler);
        doritosHandler.setNextHandler(kitKatHandler);
        kitKatHandler.setNextHandler(snickersHandler);
        vendingMachine.setSnackHandlers(cokeHandler);
        while (true) {
            System.out.println("\nAvailable snacks: ");
            for (Snack snack : vendingMachine.snacks) {
                System.out.printf("- %s ($%.2f) Quantity: %d\n", snack.getName(), snack.getPrice(), snack.getQuantity());
            }
            System.out.print("\nEnter snack name (or type 'exit' for ... exit): ");
            String snackName = scanner.nextLine();
            if (snackName.equalsIgnoreCase("exit")) {
                break;
            }
            vendingMachine.selectSnack(snackName);
            System.out.print("Accept cash: ");
            double amount = Double.parseDouble(scanner.nextLine());
            vendingMachine.insertMoney(amount);
        }
        scanner.close();
    }
}

