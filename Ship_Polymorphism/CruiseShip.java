package Ship_Polymorphism;

public class CruiseShip extends Ship {
    private int passengersCapacity;

    public CruiseShip(String name, String year, int passengersCapacity) {
        super(name, year);
        this.passengersCapacity = passengersCapacity;
    }

    public CruiseShip(String name, String year) {
        this(name, year, 0);
    }

    public void setPassengersCapacity(int pCapacity) {
        this.passengersCapacity = pCapacity;
    }

    public int getPassengersCapacity() {
        return this.passengersCapacity;
    }

    @Override
    public void printShip() {
        System.out.printf("Ship [Name: %s, Year: %s, Passenger Capacity: %d]%n",
                super.getName(), super.getBuildYear(), this.passengersCapacity);
    }
}
