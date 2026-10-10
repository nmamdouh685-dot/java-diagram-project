package model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private int departmentNo;
    private String departmentName;
    private List<Employee> employeeList;

    public Department() {
        this.employeeList = new ArrayList<>();
    }

    public Department(int departmentNo, String departmentName) {
        this.departmentNo = departmentNo;
        this.departmentName = departmentName;
        this.employeeList = new ArrayList<>();
    }

    public int getDepartmentNo() { return departmentNo; }
    public void setDepartmentNo(int departmentNo) { this.departmentNo = departmentNo; }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    public List<Employee> getEmployeeList() { return employeeList; }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }

    public void printAllEmployees() {
        System.out.println("=== Department: " + departmentName + " (Code: " + departmentNo + ") ===");
        if (employeeList.isEmpty()) {
            System.out.println("No employees in this department.");
            return;
        }
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    public double calculateTotalPayroll() {
        double total = 0;
        for (Employee emp : employeeList) {
            total += emp.calculateEarnings();
        }
        return total;
    }
}
