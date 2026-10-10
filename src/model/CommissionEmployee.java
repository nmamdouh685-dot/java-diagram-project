package model;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee() {}

    public CommissionEmployee(int id, String name, String ssn, Gender gender, double grossSales, double commissionRate) {
        super(id, name, ssn, gender);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() { return grossSales; }
    public void setGrossSales(double grossSales) { this.grossSales = grossSales; }

    public double getCommissionRate() { return commissionRate; }
    public void setCommissionRate(double commissionRate) { this.commissionRate = commissionRate; }

    @Override
    public double calculateEarnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Commission Employee, Earnings: $" + calculateEarnings();
    }
}
