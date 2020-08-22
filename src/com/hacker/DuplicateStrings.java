package com.hacker;

public class DuplicateStrings {
	
	public static void main(String[] args) {
		
		int count=0;
		
		String string1="how many words are repeating";
		
		char string[]=string1.toCharArray();
		System.out.println("repeated words:");
		for (int i=0;i<string.length;i++)
		{
			count=1;
			for (int j=i+1;j<string.length;j++)
			{
				if (string[i]==string[j] && string[i]!=' ')
			////     'a'==
				{
					count++;// reserved the repeated words
					
				string[j]=' ';
				}
				
			}
			
			// compare count and print the string
		
			if (count>1 && string[i]!=' ')
				System.out.print(string[i]+",");
			
			
		}
		
	}
	

}
