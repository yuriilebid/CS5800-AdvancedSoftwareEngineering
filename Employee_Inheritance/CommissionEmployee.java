package Employee_Inheritance;

public class CommissionEmployee extends Employee {
    private float commissionRate;
    private float grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn, float commissionRate) {
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = 0.0F;
    }

    public CommissionEmployee(String firstName, String lastName, String ssn, float commissionRate, float grossSales) {
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public float getCommissionRate() {
        return this.commissionRate;
    }

    public void setGrossSales(float grossSales) {
        this.grossSales = grossSales;
    }

    public void addGrossSales(float grossSale) {
        this.grossSales += grossSale;
    }

    public void resetGrossSales() {
        this.grossSales = 0;
    }

    public float getGrossSales() {
        return this.grossSales;
    }

    @Override
    public String toString() {
        return String.format("Employee_Inheritance.Employee [Name: %s %s, SSN: %s, Commission Rate: $%.2f, Gross Sales: $%.2f]",
                getFirstName(), getLastName(), getSSN(), commissionRate, grossSales);
    }
}
