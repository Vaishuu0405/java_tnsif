package com.tnsif.overloading;

public class MethodOverload {
	    int add(int a, int b) {
	        return a + b;
	    }

	    double add(double a, double b) {
	        return a + b;
	    }

	    void display(String name, int age) {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    void display(int age, String name) {
	        System.out.println("Age: " + age + ", Name: " + name);
	    }
	}

