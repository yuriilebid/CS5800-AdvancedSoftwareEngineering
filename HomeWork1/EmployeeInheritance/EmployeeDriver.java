package HomeWork1.EmployeeInheritance;

public class EmployeeDriver {
    public static void main(String[] args) {
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones",
                "111-11-1111", 2500.00f);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie",
                "Smith", "222-22-2222", 25.00f);
        stephanie.addHoursWorked(32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn",
                "333-33-3333", 19.00f);
        mary.addHoursWorked(47);
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior",
                "444-44-4444", 0.15f, 50000.00f);
        BaseEmployee renwa = new BaseEmployee("Renwa", "Chanel",
                "555-55-5555", 1700.00f);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport",
                "666-66-6666", 95000.00f);
        BaseEmployee mahnaz = new BaseEmployee("Mahnaz", "Vaziri",
                "777-77-7777", 40000.00f);

        System.out.println(joe);
        System.out.println(stephanie);
        System.out.println(mary);
        System.out.println(nicole);
        System.out.println(renwa);
        System.out.println(mike);
        System.out.println(mahnaz);
    }
}
