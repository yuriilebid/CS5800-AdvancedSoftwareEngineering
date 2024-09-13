package HomeWork1.EmployeeInheritance;

public class CommissionEmployee extends Employee {
    private float commissionRate;
    private float grossSales;

    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNum, float commissionRate) {
        super(firstName, lastName, socialSecurityNum);
        this.commissionRate = validateCommissionRate(commissionRate);
        this.grossSales = 0.0F;
    }

    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNum, float commissionRate,
                              float grossSales) {
        super(firstName, lastName, socialSecurityNum);
        this.commissionRate = validateCommissionRate(commissionRate);
        this.grossSales = validateGrossSales(grossSales);
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = validateCommissionRate(commissionRate);
    }

    public float getCommissionRate() {
        return this.commissionRate;
    }

    public void setGrossSales(float grossSales) {
        this.grossSales = grossSales;
    }

    public void addGrossSales(float grossSaleRecord) {
        this.grossSales += validateGrossSales(grossSaleRecord);
    }

    public void resetGrossSales() {
        this.grossSales = 0.0F;
    }

    public float getGrossSales() {
        return this.grossSales;
    }

    private float validateCommissionRate(float rate) {
        if (rate < 0.0F || rate > 100.0F) {
            throw new IllegalArgumentException("Commission rate must be " +
                    "between 0% and 100%.");
        }
        return rate;
    }

    private float validateGrossSales(float sales) {
        if (sales < 0) {
            throw new IllegalArgumentException("Gross sales cannot be < 0");
        }
        return sales;
    }

    @Override
    public String toString() {
        return String.format("HomeWork1.EmployeeInheritance " +
                        "[Name: %s %s, SSN: %s, Commission Rate: $%.2f, " +
                        "Gross Sales: $%.2f]",
                getFirstName(), getLastName(), getSocialSecurityNumber(),
                commissionRate, grossSales);
    }
}
