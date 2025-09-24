package com.tnsif.exception_handling;

public class try_catch {
	public static void main(String args[])
	{
		try
		{
			int [] a= new int[3];
		    a[0]=1;
		    a[1]=2;
		    a[2]=3;
		    System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println(e);		}
	}

}
