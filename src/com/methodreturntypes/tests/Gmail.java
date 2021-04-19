package com.methodreturntypes.tests;

public class Gmail {

	public static void main(String[] args) {
		//Here we are instantiating/creating the object of Gmail2 class to access the metods or variables of that class
		Gmail2 obj =  new Gmail2();
		String actualValue = obj.getstring("OK");
		System.out.println(actualValue);
		String expectedValue = "OK";
		//we are calling the method directly by class name cause we make the method as static
		int actualnum = Gmail3.getInt(9);
		System.out.println(actualnum);
		int expectednum = 9;
		if(actualValue.equalsIgnoreCase(expectedValue)) {
			System.out.println("Test Pass");
		}else
		{
			System.out.println("Test Fail");
		}
		if(actualnum!=expectednum) {
			System.out.println("Test Passs");
		}else
		{
			System.out.println("Test Fail");
		}
		
	}

}
