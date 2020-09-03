package com.hacker.oops;

import java.util.ArrayList;
import java.util.Scanner;

class Student{}
class Rockstar{}
class Hacker{}
public class InstanceOf {

	static String count(ArrayList arrayList)
	{
		int a = 0,b = 0,c = 0;
	      for(int i = 0; i < arrayList.size(); i++){
	         Object element=arrayList.get(i);
	         if(element instanceof Student)
	            a++;
	         if(element instanceof Rockstar)
	            b++;
	         if(element instanceof Hacker)
	            c++;
	      }
	      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
	      return ret;
		
	}
	public static void main(String[] args) {

		ArrayList arrayList=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a size");
		int size=scan.nextInt();
		for(int i=0;i<size;i++)
		{
			String input=scan.next();
			if (input.equals("Students"))arrayList.add(new Student());
			if (input.equals("Rockstar")) arrayList.add(new Rockstar());
			if (input.equals("Hacker"))arrayList.add(new Hacker());
		}
		System.out.println(count(arrayList));
	}

}
