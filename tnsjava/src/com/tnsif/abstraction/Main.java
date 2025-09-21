package com.tnsif.abstraction;
abstract class Vehicle {
    abstract void startEngine();
    void stopEngine() {
        System.out.println("Engine stopped");
    }
}
class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started");
    }
}


public class Main {
	public static void main(String[] args) {
        Vehicle myCar = new Car();

        myCar.startEngine(); 
        myCar.stopEngine();

}
}
