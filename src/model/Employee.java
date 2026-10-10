package model;

public abstract class Employee {
    private int id;
    private String name;
    private String ssn;
    private Gender gender;

    public Employee() {}

    public Employee(int id, String name, String ssn, Gender gender) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
        this.gender = gender;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSsn() { return ssn; }
    public void setSsn(String ssn) { this.ssn = ssn; }

    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public abstract double calculateEarnings();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", SSN: " + ssn + ", Gender: " + gender;
    }
}
