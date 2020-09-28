package com.hacker.thirtydayscode;

import java.util.Scanner;

public class InterfaceMainMethod {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			scan.close();

			InterafaceAdvancedArthmetic myCalculator = new Calculator();
			int sum = myCalculator.divisorSum(n);
			System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
			System.out.println(sum);
		}

	}


