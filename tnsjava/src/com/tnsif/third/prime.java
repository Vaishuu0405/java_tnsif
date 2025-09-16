package com.tnsif.third;

public class prime {
	public static void main(String agrs[])
	{
		int n = 100;

        System.out.println("Prime numbers from 1 to " + n + " are:");

        for (int i = 2; i <= n; i++) {   
            int count = 0;               
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
	}
}
