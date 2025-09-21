package com.tnsif.super_keyword;

public class Parent {
	    public void greet() {
	        System.out.println("Hello from Parent");
	    }
	}

	class Child extends Parent {
	    public void greet() {
	        System.out.println("Hello from Child");
	    }

	    public void parentGreet() {
	        super.greet();
	    }
	}

