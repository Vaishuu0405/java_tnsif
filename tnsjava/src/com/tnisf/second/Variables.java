package com.tnisf.second;

public class Variables {
	    int instanceVar = 100;
	    void display() {
	     
	        int localVar = 50;

	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Local Variable: " + localVar);
	    }

	    public static void main(String[] args) {
	        
	        Variables obj = new Variables();
	        obj.display();
	        System.out.println("Accessing Instance Variable outside method: " + obj.instanceVar);
	    }
	}

