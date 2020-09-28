package com.hacker.thirtydayscode;

import java.util.Scanner;

public class Sorting {

	public static void numberOfSwaps(int []a)
    {
        int length= a.length;
        int totalSwaps=0;
        int temp;
        int lastElement=length-1;
      
        for (int i=0;i<length;i++)
        {
            for (int j=i+1;j<length;j++)
            {
                if (a[i]>a[j])
                {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp; 
                   totalSwaps++;    
                }
            }
        }
            System.out.println("Array is sorted in "+ totalSwaps+ " swaps.");
           System.out.println("First Element: "+a[0]);
           
           System.out.println("Last Element: "+a[lastElement]);
    }
	public static void main(String[] args) 
	{

		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }

	        numberOfSwaps( a);
	       
	    }
	}


