package com.collections;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {


		
		ArrayList<String> names = new ArrayList <String>();
		names.add("bala");
		names.add("raju");
		names.add("raki");
		names.add("boza");
		System.out.println(names);
		
		ArrayList<Integer> numbers = new ArrayList <Integer>();
		numbers.add(79);
		numbers.add(49);
		numbers.add(68);
		numbers.add(60);
		System.out.println(numbers);
		
		ArrayList<Double> doublenumbers = new ArrayList <Double>();
		doublenumbers.add(79.67);
		doublenumbers.add(75.07);
		doublenumbers.add(45.76);
		doublenumbers.add(87.56);
		
		System.out.println(doublenumbers);
	}

}
