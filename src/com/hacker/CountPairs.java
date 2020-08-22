package com.hacker;

import java.util.HashSet;
import java.util.Scanner;

public class CountPairs {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		String [] pairLeft=new String[t];
		String[] pairRight=new String[t];
		for (int i=0;i<t;i++)
		{
			pairLeft[i]=scan.next();
			pairRight[i]=scan.next();
		}
		
		HashSet<String> pairs=new HashSet<>();
		
		for (int i=0;i<t;i++)
		{
			pairs.add(pairLeft[i]+","+pairRight[i]);
//			System.out.println(pairs);
			System.out.println(pairs.size());

		}
	}

}
