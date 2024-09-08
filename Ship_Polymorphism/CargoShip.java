package Ship_Polymorphism;

public class CargoShip extends Ship {
    int cargoCapacity;

    public CargoShip(String name, String year) {
        super(name, year);
        this.cargoCapacity = 0; // Default value
    }

    public CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }

    public void setCargoCapacity(int cCapacity) {
        this.cargoCapacity = cCapacity;
    }

    public int getCargoCapacity() {
        return this.cargoCapacity;
    }

    @Override
    public void printShip() {
        System.out.printf("Ship [Name: %s, Year: %s, Cargo Capacity: %d]%n",
                super.getName(), super.getBuildYear(), this.cargoCapacity);
    }
}
