package com.hacker.bigdecimal;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerIsPrime {

	  private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        
	        BigInteger bigInteger= scanner.nextBigInteger();
	   
	        System.out.println(bigInteger.isProbablePrime(100)?"prime":"not prime");
	        
	      
	        scanner.close();
	    }
	}


