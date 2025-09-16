package com.tnisf.inherit;

public class MainHierarchy {
	public static void main(String args[])
	{
		subclass1 s1 = new subclass1();
		subclass2 s2 = new subclass2();
		s1.integer();
		s2.integer();
		s1.imp();
		s2.imp();
		s1.display();
		s2.show();
	}

}
