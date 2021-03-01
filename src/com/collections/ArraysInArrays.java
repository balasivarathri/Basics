package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraysInArrays {

	public static void main(String[] args) {


		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(ar.size());
		ar.remove(3);
		
		Iterator<Integer> numbers =ar.iterator();
		while(numbers.hasNext()){
			System.out.println(numbers.next());
		}
		
		System.out.println("--------------------------");
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("rama","raja","kirka","lacha","kali"));
		System.out.println(names.size());
		
		Iterator<String> studentNames =names.iterator();
		while(studentNames.hasNext()){
			System.out.println(studentNames.next());
		}
	}

}
