package com.tnisf.inherit;

public class Hierarchy {
	void imp()
	{
		System.out.println("This is parent class");
	}
	void integer()
	{
		int a=25;
		System.out.println(a);
	}
}
class subclass1 extends Hierarchy
{
	void display()
	{
		System.out.println("this is child");
	}
}
class subclass2 extends Hierarchy
{
	void show()
	{
		System.out.println("my class");
	}
}
