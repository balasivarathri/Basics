package com.collections;

import java.util.Arrays;

public class LargestElementArray {
	
	
	  public static int findNthLargest(Integer[] nums, int n) 
	  { 
		  Arrays.sort(nums);
		  return nums[nums.length - n]; 
	  }
	  
	  public static void main(String[] args) 
	  {
		  Integer nums[] = new Integer[] {37,24,61,53,-48};
	        int n = 2;
	        System.out.print("N'th Largest element is : " + findNthLargest(nums, n)); 
	  }

}

        
	        
	    	
	



