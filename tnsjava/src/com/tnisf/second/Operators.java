package com.tnisf.second;

public class Operators {
	    public static void main(String[] args) {
	        int a = 10, b = 5;
	        boolean x = true, y = false;
	        System.out.println("Arithmetic Operators:");
	        System.out.println("a + b = " + (a + b));
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b));
	        System.out.println("a / b = " + (a / b));
	        System.out.println("a % b = " + (a % b));
	        System.out.println();
	        System.out.println("Relational Operators:");
	        System.out.println("a == b : " + (a == b));
	        System.out.println("a != b : " + (a != b));
	        System.out.println("a > b  : " + (a > b));
	        System.out.println("a < b  : " + (a < b));
	        System.out.println("a >= b : " + (a >= b));
	        System.out.println("a <= b : " + (a <= b));
	        System.out.println();
	        System.out.println("Logical Operators:");
	        System.out.println("x && y : " + (x && y));
	        System.out.println("x || y : " + (x || y));
	        System.out.println("!x     : " + (!x));
	        System.out.println();
	        System.out.println("Assignment Operators:");
	        int c = 10;
	        c += 5;  
	        System.out.println("c += 5 : " + c);
	        c -= 3; 
	        System.out.println("c -= 3 : " + c);
	        c *= 2;  
	        System.out.println("c *= 2 : " + c);
	        c /= 4;  
	        System.out.println("c /= 4 : " + c);
	        c %= 3;  
	        System.out.println("c %= 3 : " + c);
	        System.out.println();
	        System.out.println("Unary Operators:");
	        int d = 5;
	        System.out.println("d++ : " + (d++)); // post-increment
	        System.out.println("++d : " + (++d)); // pre-increment
	        System.out.println("d-- : " + (d--)); // post-decrement
	        System.out.println("--d : " + (--d)); // pre-decrement
	        System.out.println();
	        System.out.println("Bitwise Operators:");
	        int m = 6, n = 3; 
	        System.out.println("m & n : " + (m & n)); 
	        System.out.println("m | n : " + (m | n)); 
	        System.out.println("m ^ n : " + (m ^ n)); 
	        System.out.println("~m    : " + (~m));
	        System.out.println("m << 1: " + (m << 1));
	        System.out.println("m >> 1: " + (m >> 1)); 
	        System.out.println();
	        System.out.println("Ternary Operator:");
	        int max = (a > b) ? a : b;
	        System.out.println("Max of a and b: " + max);
	    }
	}
