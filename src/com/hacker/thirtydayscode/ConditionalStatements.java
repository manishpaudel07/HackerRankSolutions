package com.hacker.thirtydayscode;

import java.util.Scanner;

public class ConditionalStatements {

	public static void getNumber(int n)
	{
	          if(n%2==0 &&(n>=6 && n<=20))
	        {
	          System.out.println("Weird");   
	        }
	          else if((n%2==0 )&&(n>=2 || n<=5))
	          {
	        	  System.out.println("Not Weird");
	          }
	        else if (n%2!=0)
	        {
	           System.out.println("Weird");
	        }
	        else if (n%2==0 && n>20)
	        {
	         System.out.println("Not Weird");
	        }
	        	  
	       
	        
	        
	}
	  private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        getNumber(N);
        scanner.close();
		
	}

}
