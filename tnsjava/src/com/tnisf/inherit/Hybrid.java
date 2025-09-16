package com.tnisf.inherit;

public class Hybrid {
	void imp()
	{
		System.out.println("This is parent");
	}
}
class Box extends Hybrid
{
	void display()
	{
		System.out.println("Extended from class Hybrid");
	}
}
class Cog extends Hybrid
{
	int a=10,b=5;
	int  show()
	{
		 return a-b;
	}
}
class D extends Cog
{
	void sub()
	{
		System.out.println("Sub of a&b: "+show());
	}
}
