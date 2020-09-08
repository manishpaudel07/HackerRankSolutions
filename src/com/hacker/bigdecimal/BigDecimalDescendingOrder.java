package com.hacker.bigdecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalDescendingOrder {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n =scan.nextInt();
		String []s= new String [n+2];
		for (int i=0;i<n;i++)
		{
			s[i]=scan.next();
		}
	
		for (int i=0;i<n;i++)
		{
			BigDecimal firstElement=new BigDecimal(s[i]);
			int temp=i;
			for (int j=i+1;j<n;j++)
			{
				BigDecimal secondElement=new BigDecimal(s[j]);
				if (firstElement.compareTo(secondElement)==-1)
				{
					firstElement=secondElement;
					temp=j;
				}
			}
			String index=s[i];
			s[i]=s[temp];
			s[temp]=index;
		}
		   for(int i = 0;i<n;i++){
	            System.out.println(s[i]);
	        }

	}

}
