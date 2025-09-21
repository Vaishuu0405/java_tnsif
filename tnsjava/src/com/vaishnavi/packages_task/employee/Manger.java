package com.vaishnavi.packages_task.employee;

public class Manger extends Employee {
	private String department;

    public Manger(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public String getDepartment() { 
    	return department;
    	}
    public void setDepartment(String department) { 
    	this.department = department;
    	}

}
