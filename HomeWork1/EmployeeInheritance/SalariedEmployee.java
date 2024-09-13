package HomeWork1.EmployeeInheritance;

public class SalariedEmployee extends Employee {
    private float weeklySalary;

    public SalariedEmployee(String firstName, String lastName,
                            String socialSecurityNum, float weeklySalary) {
        super(firstName, lastName, socialSecurityNum);
        this.weeklySalary = validateWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(float weeklySalary) {
        this.weeklySalary = validateWeeklySalary(weeklySalary);
    }

    public float getWeeklySalary() {
        return this.weeklySalary;
    }

    private float validateWeeklySalary(float salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Weekly salary cannot be < 0");
        }
        return salary;
    }

    @Override
    public String toString() {
        return String.format("HomeWork1.EmployeeInheritance " +
                        "[Name: %s %s, SSN: %s, Weekly Salary: $%.2f]",
                getFirstName(), getLastName(), getSocialSecurityNumber(),
                this.weeklySalary);
    }
}
