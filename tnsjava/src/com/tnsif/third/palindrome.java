package com.tnsif.third;

public class palindrome {
	public static void main(String args[])
	{
		int n = 121, r , m, rev = 0;
		m = n;
		while(n > 0)
		{
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		if(rev == m)
		{
			System.out.println(m +" is a palindrome number");
		}
		else
		{
			System.out.println(m +" is not a palindrome number");
		}
	}

}
