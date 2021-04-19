package com.conditionalstatemnts.tests;

import java.util.Scanner;

public class ifElese {

	public static void main(String[] args) {

		String browser = "firefox";

		int x = 20;
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome browser will execute");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Firefox Browser will execute");
		} else {
			System.out.println("IE browser will exucute");
		}

		// 7) Write code which checks if a declared int is even

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int enteredValue = sc.nextInt();

		if (enteredValue % 2 == 0) {
			System.out.println(enteredValue + " is Even number");
		} else {
			System.out.println(enteredValue + " is odd number");
		}
	}

}
