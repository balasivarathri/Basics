package com.methodoverloading.tests;

public class TypeOfArguments {

	public static void main(String[] args) {

		TypeOfArguments obj = new TypeOfArguments();
		obj.add(45, 56.34);

	}
	public void add(int x,int y)
	{
		int z=x+y;
		System.out.println("Addition of two number are :"+ z);
	}
	public void add(int x,double y)
	{
		double z=x+y;
		System.out.println("Addition of two number are :"+ z);
	}

}
