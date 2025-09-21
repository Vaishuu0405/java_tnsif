package com.vaishnavi.packages_task;
import com.vaishnavi.packages_task.utilities.EmployeeUtilities;
import com.vaishnavi.packages_task.employee.Manger;
import com.vaishnavi.packages_task.employee.Developer;


public class PackagesMain {
	
	public static void main(String[] args) {
        Manger manager = new Manger("Vaishu", 101, 75000, "HR");
        Developer developer = new Developer("Madhu", 102, 60000, "Java");
        System.out.println("Manager Details:");
        EmployeeUtilities.displayEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.displayEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        EmployeeUtilities.increaseSalary(manager, 5000);
        EmployeeUtilities.increaseSalary(developer, 3000);

        System.out.println("\nAfter Salary Increment:");
        EmployeeUtilities.displayEmployeeDetails(manager);
        EmployeeUtilities.displayEmployeeDetails(developer);

}
}
