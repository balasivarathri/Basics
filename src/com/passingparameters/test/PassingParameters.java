package com.passingparameters.test;


public class PassingParameters {

	
	public static void main(String[] args) 
	{
		PassingParameters obj=new PassingParameters();
		obj.add(45, 34);
		obj.sub(78.45, 34.77);
		
	}
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of two nimbers are:" +c);
		
	}
	public void sub(double x, double y)
	{
		double c=x-y;
		System.out.println("Substraction of two numbers are :"+c);
	}	
	

}
