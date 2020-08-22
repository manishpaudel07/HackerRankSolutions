package com.hacker.stringcompare;

import java.util.Scanner;

public class StringFrequency {

	static boolean isAnagram(String a ,String b)
	{
		char[] aChar = null;
		char[] bChar=null;
		if (a.length()!=b.length())
	    {
	        return false;
	     
	       }
	       if (a== " " || b== " ")
	       {
	           return false;
	       }
  
	    a=a.toLowerCase();
	    b=b.toLowerCase();

	    for (int i=0;i<a.length();i++)
	    {
	       aChar=a.toCharArray();
	    }

	  

	    for (int i=0;i<b.length();i++)
	    {
	                bChar= b.toCharArray();
	    } 

	    java.util.Arrays.sort(aChar);
	    java.util.Arrays.sort(bChar);
	    
	    boolean result= java.util.Arrays.equals(aChar,bChar);
	    return result;
	}
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	       
	       
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
