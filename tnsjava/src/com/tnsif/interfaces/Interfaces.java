package com.tnsif.interfaces;

	interface Vehicle {
	    void start();
	}
	interface ElectricVehicle extends Vehicle {
	    void charge();
	}
	class Tesla implements ElectricVehicle {

	    public void start() {
	        System.out.println("Tesla started");
	    }

	    public void charge() {
	        System.out.println("Tesla is charging");
	    }
	}
