package com.tnsif.overloading;

public class Student {
	
	    String name;
	    int age;
	    Student() {
	        name = "Unknown";
	        age = 0;
	    }
	    Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}

