package com.hacker;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		
		
//		System.out.println("enter a size:");
//		int size=scan.nextInt();
		
		int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int num=a;
            	  for(int j = 0; j < n; j++) {
                      num += (((int) Math.pow(2, j)) * b);
                      System.out.print(num + " ");
                  }
            	  
            	  System.out.println("");
        }

        in.close();
	}
	

}

