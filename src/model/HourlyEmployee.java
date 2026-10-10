package model;

public class HourlyEmployee extends Employee {
    private double hourRate;
    private double numberOfHours;

    public HourlyEmployee() {}

    public HourlyEmployee(int id, String name, String ssn, Gender gender, double hourRate, double numberOfHours) {
        super(id, name, ssn, gender);
        this.hourRate = hourRate;
        this.numberOfHours = numberOfHours;
    }

    public double getHourRate() { return hourRate; }
    public void setHourRate(double hourRate) { this.hourRate = hourRate; }

    public double getNumberOfHours() { return numberOfHours; }
    public void setNumberOfHours(double numberOfHours) { this.numberOfHours = numberOfHours; }

    @Override
    public double calculateEarnings() {
        return hourRate * numberOfHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Hourly Employee, Earnings: $" + calculateEarnings();
    }
}
