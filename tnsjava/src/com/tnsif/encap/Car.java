package com.tnsif.encap;

public class Car {
	int seats;
	String name;
	String colour;
	int year;
	int speed;
	
	void start() {
		System.out.println("Car started");
	}
	void stop()
	{
		System.out.println("Car stopped");
	}
	void acceleration(int increase_speed)
	{
		speed+=increase_speed;
		System.out.println("Your car speed is: "+speed);
	}

}
