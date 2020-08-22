package com.hacker;

import java.util.Scanner;

public class CompareDataTypes {

	public static void main(String[] args) 
	{
		
		 Scanner sc = new Scanner(System.in);
//		 double y=(-9.223372037*Math.pow(10, 18));
//		 System.out.println(y);
//		 double a=(9.223372037*Math.pow(10, 18));
//		 System.out.println(a);
		 System.out.println("enter a number: ");
	        int t=sc.nextInt();
	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if ( (x>=-128 && x<=127) && (x>=-32768 && x<=32767) && (x>=-2147483648&& x<=2147483647) && ( x>=(-9.223372037*Math.pow(10, 18)) && x<=(9.223372037*Math.pow(10, 18)) ) )
	                {
	                	System.out.println(" *byte");
	                	System.out.println(" *short");
	                	System.out.println(" *int");
	                	System.out.println(" *long");
	                }
	                
	                else  if ( (x>=-32768 && x<=32767) && (x>=-2147483648&& x<=2147483647) && ( x>=(-9.223372037*Math.pow(10, 18)) && x<=(9.223372037*Math.pow(10, 18) )))
	                {
	                	System.out.println(" *short");
	                	System.out.println(" *int");
	                	System.out.println(" *long");
	                }
	                else if ((x>=-2147483648&& x<=2147483647) && ( x>=(-9.223372037*Math.pow(10, 18)) && x<=(9.223372037*Math.pow(10, 18) )))
	                {
	                	System.out.println(" *int");
	                	System.out.println(" *long");
	                }
	                else 
	                	System.out.println(" *long");
	                
	                }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }

	        }
	    }	
		

	}


