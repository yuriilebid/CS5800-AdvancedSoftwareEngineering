package Ship_Polymorphism;

public class Ship {
    private final String name;
    private final String buildYear;

    public Ship(String name, String year) {
        this.name = name;
        this.buildYear = year;
    }

    public String getName() {
        return this.name;
    }

    public String getBuildYear() {
        return this.buildYear;
    }

    public void printShip() {
        System.out.printf("Ship [Name: %s, Year: %s]%n",
                this.name, this.buildYear);
    }
}
