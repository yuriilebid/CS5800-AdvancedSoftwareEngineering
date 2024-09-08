package Ship_Polymorphism;

public class CruiseShip extends Ship {
    int passengersCapacity;

   public  CruiseShip(String name, String year) {
       super(name, year);
       this.passengersCapacity = 0; // Default value
   }

    public CruiseShip(String name, String year, int passengersCapacity) {
        super(name, year);
        this.passengersCapacity = passengersCapacity;
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
