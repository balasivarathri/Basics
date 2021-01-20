package com.conditionalstatemnts.tests;

public class ifElese {

	public static void main(String[] args) {
		
		String browser = "firefox";
		
		int x =20;
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("chrome browser will execute");
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("Firefox Browser will execute");
		}
		else
		{
			System.out.println("IE browser will exucute");
		}
	}

}
