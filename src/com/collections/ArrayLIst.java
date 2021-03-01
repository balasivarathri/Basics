package com.collections;

import java.util.ArrayList;

public class ArrayLIst {

	public static void main(String[] args) {


		ArrayList<Object> list = new ArrayList<Object>();
		list.add("Bala Krishna");
		list.add(100);
		list.add('M');
		list.add(12.56);
		System.out.println(list);
		//System.out.println(list.get(6));
		System.out.println(list.size());
		System.out.println("Lowest Index is:" + 0);
		System.out.println("Highest Index is:" + (list.size()-1));
		
		//Arraylist are dynamic in nature
		list.add("Madhu");
		list.add(28);
		list.add('F');
		list.add(15.56);
		System.out.println(list);
		System.out.println(list.size());
	}

}
