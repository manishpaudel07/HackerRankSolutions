package com.hacker;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*1. How to find the missing number in integer array of 1 to 100? (solution)
This is one of the most simple array problems you will see, mostly asked in a telephonic round of Interview.
 You have given an integer array which contains numbers from 1 to 100 but one number is missing, you need to write a Java program 
 to find that missing number in an array. You cannot use any open source library or Java API method which solves this problem.
  One trick to solve this problem is to calculate sum of all numbers in the array and compare with expected sum, 
  the difference would be the missing number.

 * 
 */
public class MissingNumber 
{

	public static void main(String[] args)
	{
	
		Random ran=new Random();
		 int size=10;
		 int [] array=new int[size];
		 int num=0;
		 int rand = 0;
		 
			
		for(int i=0;i<array.length;i++)
		{
			array[i]=array[i]+i;
			for(int j=0;j<size;j++)
			{
				rand=ran.nextInt(10);	
				if (array[i]!=rand)
				{
					System.out.println(rand);
					
				}
			}
			
			
		
			}
		
		
	}
			
		

	
	

	}


