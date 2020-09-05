package com.hacker.oops;

import java.util.*;
import java.util.ArrayList;

public class JavaIterator {
	
	@SuppressWarnings("rawtypes")
	static Iterator func(ArrayList mylist)
	{
		Iterator it= mylist.iterator();
		while(it.hasNext()){
	         Object element =  it.next();
	         if( element.equals("###"))//Hints: use instanceof operator

				break;
			}
	      return it;
		
	}

	public static void main(String[] args) {
		
		ArrayList arraylist=new ArrayList();
		arraylist.add("hello");
		arraylist.add("Java");
		arraylist.add("###");
		arraylist.add("print me");

		
		Iterator it=func(arraylist);
		while(it.hasNext())
		{
			Object element =it.next();
			System.out.println(element);
		}
		
	}

}
