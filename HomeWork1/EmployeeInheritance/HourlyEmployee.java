package HomeWork1.EmployeeInheritance;

public class HourlyEmployee extends Employee {
    public static final float MINIMUM_WAGE = 15.00f;
    private float hourWage;
    private float hoursWorked = 0.0F;

    public HourlyEmployee(String firstName, String lastName,
                          String socialSecurityNum) {
        super(firstName, lastName, socialSecurityNum);
        this.hourWage = MINIMUM_WAGE;
    }

    public HourlyEmployee(String firstName, String lastName,
                          String socialSecurityNum, float hourWage) {
        super(firstName, lastName, socialSecurityNum);
        this.hourWage = validateWage(hourWage);
    }

    public float getHourWage() {
        return this.hourWage;
    }

    public void setHourWage(float hourWage) {
        this.hourWage = validateWage(hourWage);
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = validateHoursWorked(hoursWorked);
    }

    public void addHoursWorked(float additionalHours) {
        this.hoursWorked += validateHoursWorked(additionalHours);
    }

    public void resetWorkHours() {
        this.hoursWorked = 0.0F;
    }

    private float validateWage(float wage) {
        if (wage < MINIMUM_WAGE) {
            throw new IllegalArgumentException("Wage must be > " + MINIMUM_WAGE);
        }
        return wage;
    }

    private float validateHoursWorked(float hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be < 0");
        }
        return hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("HomeWork1.EmployeeInheritance " +
                        "[Name: %s %s, SSN: %s, Wage: $%.2f, Hours Worked: $%.2f]",
                getFirstName(), getLastName(), getSocialSecurityNumber(),
                this.hourWage, this.hoursWorked);
    }
}
