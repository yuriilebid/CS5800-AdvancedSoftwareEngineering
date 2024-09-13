package HomeWork1.ShipPolymorphism;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = validateShipCapacity(cargoCapacity);
    }

    public void setCargoCapacity(int capacity) {
        this.cargoCapacity = validateShipCapacity(capacity);
    }

    public int getCargoCapacity() {
        return this.cargoCapacity;
    }

    @Override
    public void printShipInfo() {
        System.out.printf("Ship [Name: %s, Year: %s, Cargo Capacity: %d]%n",
                super.getName(), super.getBuildYear(), this.cargoCapacity);
    }
}
