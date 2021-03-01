package com.passingparameters.test;


public class DynamicPrams {
	
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
		
	}
	public double sub(double x, double y)
	{
		double c=x-y;
		return c;
	}
		
	public static String myFullName(String firstname, String lastname)
	{
		String fullname=firstname+" "+lastname;
		return fullname;
	}

}
