package HomeWork1.ShipPolymorphism;

public class Ship {
    private String name;
    private final String buildYear; // Year cannot be modified

    public Ship(String name, String year) {
        this.name = validateName(name);
        this.buildYear = validateBuildYear(year);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String shipName) {
        this.name = validateName(shipName);
    }

    public String getBuildYear() {
        return this.buildYear;
    }

    public void printShipInfo() {
        System.out.printf("Ship [Name: %s, Year: %s]%n",
                this.name, this.buildYear);
    }

    protected int validateShipCapacity(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Ship capacity must be > 0");
        }
        return capacity;
    }

    private String validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Ship name cannot be null");
        }
        return name;
    }

    private String validateBuildYear(String year) {
        if (year == null || !year.matches("\\d{4}")) {
            throw new IllegalArgumentException("Build year must be a 4-digit");
        }
        return year;
    }
}
