package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterations {

	public static void main(String[] args) {


		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("raghu");
		studentList.add("nari");
		studentList.add("suri");
		studentList.add("balu");
		System.out.println(studentList.size());
		
		//1.print all elements by normal for loop
		for (int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("-------------------------");
		//2.print all elements by normal for loop
		
		for(String b : studentList  ) {
			System.out.println(b);
		}
		
		System.out.println("------------------------");
		//3.Afte JDK 8 streams with Lamda funciton we can print the elements
		studentList.stream().forEach(nms -> System.out.println(nms));
		
		System.out.println("------------------------");
		
		//4.By using iterator
		
		Iterator <String> it = studentList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	
	
	
}
