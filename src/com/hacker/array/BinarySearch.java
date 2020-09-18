package com.hacker.array;

public class BinarySearch {

	static int binarySearch(int arr[], int x) 
	{ 
		 int leftIndex = 0, rightIndex= arr.length - 1; 
	        while (leftIndex <= rightIndex) { 
	            int m = leftIndex + (rightIndex - leftIndex) / 2; 
	  
	            // Check if x (searched element) present at mid 
	            if (arr[m] == x) 
	                return m; 
	  
	            // If x greater, ignore left half 
	            if (arr[m] < x) 
	                leftIndex = m + 1; 
	  
	            // If x is smaller, ignore right half 
	            else
	            	rightIndex = m - 1; 
	        } 
	  
	        // if we reach here, then element was 
	        // not present 
	        return -1; 
	}
	public static void main(String[] args) {

			int [] arr= {2,3,4,5,6};
			int searchedElement=3;
			int result=binarySearch(arr,searchedElement);
			if (result == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at "
	                               + "index " + result); 
	}

}
