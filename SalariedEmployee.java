public class SalariedEmployee extends Employee {
    private float weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, float weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(String firstName, String lastName, String ssn) {
        super(firstName, lastName, ssn);
        this.weeklySalary = 1000.00f;  // Default value
    }

    public void setWeeklySalary(float weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public float getWeeklySalary() {
        return this.weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("Employee [Name: %s %s, SSN: %s, Weekly Salary: $%.2f]",
                getFirstName(), getLastName(), getSSN(), this.weeklySalary);
    }
}
