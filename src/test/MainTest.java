package test;

import model.*;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("    EMPLOYEE MANAGEMENT SYSTEM - DEMO    ");
        System.out.println("    Student: Nada Mamdouh Kamel (ID: 2300340)");
        System.out.println("==========================================");

        Department csDepartment = new Department(101, "Software Engineering");

        MonthlyEmployee emp1 = new MonthlyEmployee(1, "Ahmed Ali", "29901011234567", Gender.MALE, 8000.0, 1000.0, 500.0);
        HourlyEmployee emp2 = new HourlyEmployee(2, "Mona Hassan", "29805051234568", Gender.FEMALE, 150.0, 40.0);
        CommissionEmployee emp3 = new CommissionEmployee(3, "Omar Mahmoud", "29710101234569", Gender.MALE, 50000.0, 0.10);

        csDepartment.addEmployee(emp1);
        csDepartment.addEmployee(emp2);
        csDepartment.addEmployee(emp3);

        csDepartment.printAllEmployees();
        System.out.println("------------------------------------------");
        System.out.println("Total Department Payroll: $" + csDepartment.calculateTotalPayroll());
        System.out.println("==========================================");
    }
}
