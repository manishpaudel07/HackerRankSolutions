package com.hacker.thirtydayscode;

import java.util.Scanner;

public class LetsReview {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String a;
		for (int i = 0; i < num; i++) {

			a = scan.next();
			char[] character = new char[a.length()];
			for (int j = 0; j < a.length(); j++) {
				character[j] = a.charAt(j);
				
			}

			for (int k = 0; k < a.length(); k++) {
				if (k % 2 == 0) {
					System.out.print(character[k]);
				}

			}
			System.out.print(" ");
			for (int l = 0; l < a.length(); l++) {
				if (l % 2 != 0) {
					System.out.print(character[l]);

				}
			}
			System.out.println();

		}
	}
}
