package HomeWork1.EmployeeInheritance;

public class BaseEmployee extends Employee {
    protected float baseSalary;

    public BaseEmployee(String firstName, String lastName,
                        String socialSecurityNum, float baseSalaryAnnually) {
        super(firstName, lastName, socialSecurityNum);
        this.baseSalary = validateBaseSalary(baseSalaryAnnually);
    }

    float getBaseSalary() {
        return baseSalary;
    }

    void setBaseSalary(float baseSalary) {
        this.baseSalary = validateBaseSalary(baseSalary);
    }

    private float validateBaseSalary(float baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary must be > zero");
        }
        return baseSalary;
    }

    @Override
    public String toString() {
        return String.format("HomeWork1.EmployeeInheritance " +
                        "[Name: %s %s, SSN: %s, Base Salary: $%.2f]",
                getFirstName(), getLastName(), getSocialSecurityNumber(),
                this.baseSalary);
    }
}
