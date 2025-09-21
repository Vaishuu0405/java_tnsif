package com.tnsif.static_members;

public class Demo_static {
	    // Static variable
	    static int count = 0;

	    // Static block (runs once when class is loaded)
	    static {
	        System.out.println("Static block executed");
	        count = 10;
	    }

	    // Static method
	    static void displayCount() {
	        System.out.println("Count = " + count);
	    }

	    // Non-static method
	    void increment() {
	        count++;
	    }
}
