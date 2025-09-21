package com.tnsif.overloading;

public class MainOverload {
	    public static void main(String[] args) {
	        MethodOverload mo = new MethodOverload();

	        System.out.println(mo.add(5, 10));       
	        System.out.println(mo.add(5.5, 3.2));    

	        mo.display("Vaishu", 20);
	        mo.display(20, "Vaishu"); 
	    }
	}

