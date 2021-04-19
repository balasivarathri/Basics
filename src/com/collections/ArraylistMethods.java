package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistMethods {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Telugu");
		ar.add("Hindi");
		ar.add("English");
		ar.add("Maths");

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("90");
		ar1.add("65");
		ar1.add("90");
		/*
		 * // ar.addAll(ar1);
		 * 
		 * ar1.addAll(1, ar); System.out.println(ar1);
		 * 
		 * Iterator it = ar1.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next());
		 * 
		 * 
		 * ar1.clear(); System.out.println(ar1);
		 * 
		 * 
		 * }
		 */

		
		System.out.println(ar.contains("Telugu"));
		
		//To find last Index of element
		int i = ar.indexOf("Hindi");
		System.out.println(i);
		
		ArrayList<Integer> ar3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ar3.removeIf(num -> num%2==0);
		System.out.println(ar3);
		
		//RetainAll method with Singleton
		
		ArrayList<Integer> numberlist = new ArrayList<Integer>(Arrays.asList(1,2,3,4,2,3,5,6,2,7,8,3,9,10));
		System.out.println(numberlist);
		numberlist.retainAll(Collections.singleton(2));
		System.out.println(numberlist);
		
		//To get the sublist
		ArrayList<Integer> numberlist1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,2,5,6,2,7,8,9,10));
		ArrayList<Integer> sublist = new ArrayList<Integer>(numberlist1.subList(1, 9));
		System.out.println(sublist);
		
		//Convert ArrayList into array object
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("bala","nana","neshu","amma"));
		Object arr[] =names.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object s:arr) {
			System.out.println(s);
		}
		//ArrayList<String, Integer> j1 = new ArralyList<String, Integer> (Arrays.asList("Bala", 56));
	}
}