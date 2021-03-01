package com.methodoverloading.tests;

public class NumberOfArguments {

	public static void main(String[] args) {

		NumberOfArguments obj = new NumberOfArguments();
		obj.add(45, 56, 23);

	}
	public void add(int x,int y)
	{
		int z=x+y;
		System.out.println("Addition of two number are :"+ z);
	}
	public void add(int x,int y,int a)
	{
		int z=x+y+a;
		System.out.println("Addition of two number are :"+ z);
	}

}
