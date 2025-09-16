package com.tnsif.third;

public class primeornot {
	public static void main(String args[])
	{
		int n=10,count=0;
		if(n<=1)
		{
			System.out.println("Not prime");
		}
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
		
	}

}
