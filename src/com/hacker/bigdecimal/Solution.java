package com.hacker.bigdecimal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		/*Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
      	System.out.println("the printed results after sorting");

      	 for(int i=0;i<n;i++)
         {
             System.out.println(s[i]);
         }
      	 
      	Arrays.sort(s);
      	System.out.println("the printed results after sorting"+Arrays.toString(s));

      	System.out.println("the printed results after sorting");

      	 for(int i=0;i<n;i++)
         {
             System.out.println(s[i]);
         }
      	 Arrays.sort(s,Collections.reverseOrder());
       	System.out.println("the printed results after sorting"+Arrays.toString(s));
	*/
		
		int [] arr= new int[] {2,3,4,6,3};
		int temp=0;
		System.out.println("elements of the array");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);

		}
		
		
		for (int i=0;i<arr.length;i++)
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

			System.out.println();

			System.out.println("elements after sorting in descending order ");
				
			for (int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);

			}
	}

}
