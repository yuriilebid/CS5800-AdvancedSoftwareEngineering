package Employee_Inheritance;

public class BaseEmployee extends Employee {
    private float baseSalary;

    public BaseEmployee(String firstName, String lastName, String ssn, float baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    float getBaseSalary() {
        return baseSalary;
    }

    void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return String.format("Employee_Inheritance.Employee [Name: %s %s, SSN: %s, Base Salary: $%.2f]",
                getFirstName(), getLastName(), getSSN(), this.baseSalary);
    }
}
