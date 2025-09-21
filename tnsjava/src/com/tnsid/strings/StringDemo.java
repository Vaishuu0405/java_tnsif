package com.tnsid.strings;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Hello";
        str = str + " World"; 
        System.out.println("String: " + str); 
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("------------------");

        // StringBuffer (mutable, synchronized)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");   // modifies original object
        sb.insert(6, "Java "); // inserts at index 6
        System.out.println("StringBuffer: " + sb);
        sb.reverse();           // reverse the string
        System.out.println("Reversed StringBuffer: " + sb);

        System.out.println("------------------");

        // StringBuilder (mutable, faster, not synchronized)
        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" World");   
        sbd.replace(6, 11, "Java"); 
        System.out.println("StringBuilder: " + sbd);
        sbd.reverse();
        System.out.println("Reversed StringBuilder: " + sbd);
	}

}
