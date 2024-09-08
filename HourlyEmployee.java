public class HourlyEmployee extends Employee {
    public static final float MINIMUM_WAGE = 15.00f;
    private float wage;
    private float hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssn) {
        super(firstName, lastName, ssn);
        this.wage = MINIMUM_WAGE;
        this.hoursWorked = 0.0F;
    }

    public HourlyEmployee(String firstName, String lastName, String ssn, float wage) {
        super(firstName, lastName, ssn);
        if (wage < MINIMUM_WAGE) {
            throw new IllegalArgumentException("Wage cannot be below minimum wage.");
        }
        this.wage = wage;
        this.hoursWorked = 0.0F;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        if(wage < MINIMUM_WAGE) {
            throw new IllegalArgumentException("Wage cannot be below minimum wage.");
        }
        this.wage = wage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void addHoursWorked(float additionalHours) {
        this.hoursWorked += additionalHours;
    }

    public void resetWorkHours() {
        this.hoursWorked = 0;
    }

    @Override
    public String toString() {
        return String.format("Employee [Name: %s %s, SSN: %s, Wage: $%.2f, Hours Worked: $%.2f]",
                getFirstName(), getLastName(), getSSN(), this.wage, this.hoursWorked);
    }
}
