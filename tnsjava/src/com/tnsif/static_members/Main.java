package com.tnsif.static_members;

public class Main {
	    public static void main(String[] args) {
	        
	        Demo_static.displayCount();

	        // Create objects
	        Demo_static d1 = new Demo_static();
	        Demo_static d2 = new Demo_static();

	        // Call non-static method
	        d1.increment();
	        d2.increment();

	        // Access static method again
	        Demo_static.displayCount(); // Output: Count = 12 (shared by all objects)
	    }
	}

