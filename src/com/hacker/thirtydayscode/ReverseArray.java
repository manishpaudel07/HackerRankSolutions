package com.hacker.thirtydayscode;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = scanner.nextInt();
		}

		int[] reversedArray = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			reversedArray[j - 1] = arr[i];
			j = j - 1;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(reversedArray[i] + " ");
		}
		scanner.close();
	}
}
