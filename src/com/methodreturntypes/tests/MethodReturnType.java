package com.methodreturntypes.tests;

public class MethodReturnType {
	
	//2)	Create a method “getstring” in gmail2 which returns a string value of “ok”
	
		public static String getstring(String s){
			//System.out.println("Enter name is :"+s);
			return s;
		}
		public static void main(String[] args) {
			
			String s1 = MethodReturnType.getstring("Ok");
			System.out.println(s1);
		}
}
