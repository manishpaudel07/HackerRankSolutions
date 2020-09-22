package com.hacker.thirtydayscode;

import java.util.Scanner;

public class PersonInherit {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	PersonInherit(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	
}

class Student extends PersonInherit{

	int [] scores;
	Student(String firstName, String lastName, int identification, int []scores) {
		super(firstName, lastName, identification);
		this.scores=scores;
	}
	
	public char calculate()
	{
		int sum=0;
		for (int i=0;i<scores.length;i++)
		{
			sum=sum+scores[i];
		}
		int avg= sum/scores.length;
		
		if(90<=avg&&avg<=100){
	        return 'O';
	    }else if(80<=avg&&avg<90){
	        return 'E';
	    }else if(70<=avg&&avg<80){
	        return 'A';
	    }else if(55<=avg&&avg<70){
	        return 'P';
	    }else if(40<=avg&&avg<55){
	        return 'D';
	    }else if(0<=avg&&avg<40){
	        return 'T';
	    }
	    else return Character.MIN_VALUE;
	}
	
}


	

