package com.methodreturntypes.tests;

public class Gmail2 {

	public static String getstring(String s) {
		return s;
	}
	public static void main(String[] args) {
		
		Gmail2 obj =  new Gmail2();
		String name = Gmail2.getstring("Bala");
		System.out.println(name);
	}

}
