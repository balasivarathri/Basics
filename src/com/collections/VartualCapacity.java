package com.collections;

import java.util.ArrayList;

public class VartualCapacity {

	public static void main(String[] args) {


		ArrayList<Object> ar = new ArrayList<Object>(20);
		System.out.println(ar.size()); // Physical Capacity default size is 0
		
		ar.add(100);
		
		System.out.println(ar.size());
		
		ar.add(200);
		ar.add(300);
		ar.add(400);

		System.out.println(ar.size());
		
		//Default vartual capacity for array in java is 10
		
	}

}
