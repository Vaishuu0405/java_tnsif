package com.vaishnavi.packages_task.utilities;
import com.vaishnavi.packages_task.employee.Employee;
public class EmployeeUtilities {
	public static void displayEmployeeDetails(Employee emp) {
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
    public static void increaseSalary(Employee emp, double increment) {
        double newSalary = emp.getSalary() + increment;
        emp.setSalary(newSalary);
    }
}
