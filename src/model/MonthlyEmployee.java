package model;

public class MonthlyEmployee extends Employee {
    private double salary;
    private double bonus;
    private double deductions;

    public MonthlyEmployee() {}

    public MonthlyEmployee(int id, String name, String ssn, Gender gender, double salary, double bonus, double deductions) {
        super(id, name, ssn, gender);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    public double getDeductions() { return deductions; }
    public void setDeductions(double deductions) { this.deductions = deductions; }

    @Override
    public double calculateEarnings() {
        return salary + bonus - deductions;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Monthly Employee, Earnings: $" + calculateEarnings();
    }
}
