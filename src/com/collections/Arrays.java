package com.collections;

public class Arrays {

	public static void main(String[] args) {

		//8)	Declare an array of type int with size 5 and loop through it printing the values to the console
		/*
		 * int [] number = new int [5]; number[0]=1; number[1]=2; number[2]=3;
		 * number[3]=4; number[4]=5;
		 */
		
		int  nums[][] = {{1,2,3,4,5},{6,3}};
		
		/*
		 * for(int i=0;i<number.length;i++) { System.out.println(number[i]); }
		 */
		/*
		 * for(int[] n:nums) { for(int k:n) { System.out.println(k); } }
		 */
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.println(nums[i][j]);
			}
		}

	}
}