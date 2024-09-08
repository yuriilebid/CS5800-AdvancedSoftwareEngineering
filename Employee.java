public class Employee {
    final private String firstName;
    final private String lastName;
    final private String SSN;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = ssn;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSSN() {
        return this.SSN;
    }

    @Override
    public String toString() {
        return String.format("Employee [Name: %s %s, SSN: %s]",
                getFirstName(), getLastName(), getSSN());
    }
}
