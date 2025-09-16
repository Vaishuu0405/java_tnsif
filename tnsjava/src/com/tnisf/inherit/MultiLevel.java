package com.tnisf.inherit;

public class MultiLevel {
	void show1() {
		System.out.println("This is parent class");
	}
}
class B extends MultiLevel{
	int a=10;
	void display1()
	{
		System.out.println(a);
	}
}
class C extends B{
	void play()
	{
		System.out.println("This is Child class of B ");
	}	
}
