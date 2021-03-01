package com.passingparameters.test;

public class PassingParameters2 {

	public static void main(String[] args) {
		DynamicPrams obj = new DynamicPrams();

		int sum = obj.add(67, 90);
		System.out.println("Sum Of Two Numbers Are: " + sum);

		double sub = obj.sub(56.3, 78.54);
		System.out.println("Sub Of Two Numbers Are: " + sub);

		String fullname = DynamicPrams.myFullName("Bala", "Siavarathri");
		System.out.println("My name is : " + fullname);
	}

}