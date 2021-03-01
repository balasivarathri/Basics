package com.methodoverloading.tests;

public class OrderOfArguments {

	public static void main(String[] args) {

		OrderOfArguments obj = new OrderOfArguments();
		obj.add(56.34, 59);

	}
	public void add(int x,int y)
	{
		int z=x+y;
		System.out.println("Addition of two number are :"+ z);
	}
	public void add(double y, int x)
	{
		double z=x+y;
		System.out.println("Addition of two number are :"+ z);
	}

}
