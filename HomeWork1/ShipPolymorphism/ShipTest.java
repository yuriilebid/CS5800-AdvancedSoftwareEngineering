package HomeWork1.ShipPolymorphism;

public class ShipTest {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Generic Ship", "1990");
        ships[1] = new CruiseShip("Luxury Cruise", "2020", 300);
        ships[2] = new CargoShip("Freight Carrier", "2015", 50000);

        for (Ship ship : ships) {
            ship.printShipInfo();
        }
    }
}
