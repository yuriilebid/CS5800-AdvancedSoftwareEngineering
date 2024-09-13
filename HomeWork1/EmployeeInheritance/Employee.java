package HomeWork1.EmployeeInheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    private String validateString(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " null or empty");
        }
        return value;
    }

    public Employee(String firstName, String lastName, String socialSecurityNum) {
        this.firstName = validateString(firstName, "First name");
        this.lastName = validateString(lastName, "Last name");
        this.socialSecurityNumber = validateString(socialSecurityNum,
                "Social Security Number");

        if (!isValidSocialSecurityNum(this.socialSecurityNumber)) {
            throw new IllegalArgumentException("Invalid Social Security Number");
        }
    }

    public boolean isValidSocialSecurityNum(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return ssn.matches(regex);
    }

    private Employee() {}

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = validateString(firstName, "First name");
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = validateString(lastName, "Last name");
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = validateString(socialSecurityNumber,
                "Social Security Number");

        if (!isValidSocialSecurityNum(this.socialSecurityNumber)) {
            throw new IllegalArgumentException("Invalid Social Security Number");
        }
    }

    @Override
    public String toString() {
        return String.format("HomeWork1.EmployeeInheritance " +
                        "[Name: %s %s, SSN: %s]",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
