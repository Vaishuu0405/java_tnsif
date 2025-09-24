package com.tnsif.exception_handling;

public class mutlipleCatches {
	public static void main(String args[])
	{
	
		        try {
		            String str = "Hello";
		            System.out.println(str.charAt(0));  
		            System.out.println(str.charAt(4));  
		            System.out.println(str.charAt(5));  
		        }
		        catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Array exception");
		        }
		        catch (StringIndexOutOfBoundsException se) {
		            System.out.println("String index not found");
		        }
		        catch (Exception ex) {
		            System.out.println("General exception: " + ex);
		        }
		  

    }

}
