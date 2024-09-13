package HomeWork1.ShipPolymorphism;

public class CruiseShip extends Ship {
    private int passengersCapacity;

    public CruiseShip(String name, String year, int passengersCapacity) {
        super(name, year);
        this.passengersCapacity = validateShipCapacity(passengersCapacity);
    }

    public void setPassengersCapacity(int capacity) {
        this.passengersCapacity = validateShipCapacity(capacity);
    }

    public int getPassengersCapacity() {
        return this.passengersCapacity;
    }

    @Override
    public void printShipInfo() {
        System.out.printf("Ship [Name: %s, Year: %s, Passenger Capacity: %d]%n",
                super.getName(), super.getBuildYear(), this.passengersCapacity);
    }
}
