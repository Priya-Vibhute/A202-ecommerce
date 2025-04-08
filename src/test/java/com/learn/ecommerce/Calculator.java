package com.learn.ecommerce;

public class Calculator {
	
	int add(int a,int b)
	{
		return a+b;
	}
	
	int sub(int a,int b)
	{
		return a-b;
	}
	
	boolean isEven(int n)
	{
		
		return n%2==0;
	}
	
	int countOfPrime()
	{
		int primeCount=0;
		for(int n=1;n<=100;n++)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					count++;		
			}
			if(count==2)
				primeCount++;
		}
		
		return primeCount;
	}
	
	

}
