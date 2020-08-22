package com.hacker;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {

		 String s=null;
		  Scanner scan = new Scanner(System.in);
		  System.out.println("enter integer: ");
	        int i= scan.nextInt();
	        System.out.println("enter double: ");
	        double d=scan.nextDouble();
	        System.out.println("enter String: ");
	        
	        while(scan.hasNext())
	        {
	         s=scan.next();
	        }
	        

	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        scan.close();
	}

}
