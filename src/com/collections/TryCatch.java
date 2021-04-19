package com.collections;

import java.util.Arrays;

public class TryCatch {

	public static void main(String[] args) {
		try {
			String s = "madhu";
			System.out.println(s);
			int i = 1/0;
			System.out.println(i);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Something went wrong:" + e.getMessage());
		}
		String s1 = "neshu";
		System.out.println(s1);	
		
	}

}
