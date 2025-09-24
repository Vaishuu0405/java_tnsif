package com.tnsif.exception_handling;

public class NestedTry {
	public static void main(String args[])
	{
		try {

	        try {
	            String str = "Hello";
	            System.out.println(str.charAt(0));  
	            System.out.println(str.charAt(4));  
	            System.out.println(str.charAt(5));  
	        }
	        catch(StringIndexOutOfBoundsException se) {
		            System.out.println("String index not found");
	        }
		}
		catch(Exception e) {

	            System.out.println("General exception");
			}
		}
	}


