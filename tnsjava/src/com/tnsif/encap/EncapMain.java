package com.tnsif.encap;

public class EncapMain {

	public static void main(String[] args) {
		Car car =new Car();
		car.seats=6;
		car.name="KIA";
		car.colour="Black";
		car.year=2024;
		car.speed=20;
		
		System.out.println(car.name);
		car.start();
		car.stop();
		car.acceleration(40);
	}

}
