package com.hacker.array;

import java.util.Scanner;

public class FindMax {

	static int findMaxArray(int arr[]) {
		int maxElement = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxElement) {
				maxElement = arr[i];
			}

		}
		return maxElement;
	}

	static int findMinArray(int arr[]) {
		int minElement = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minElement) {
				minElement = arr[i];
			}

		}
		return minElement;
	}

	static int searchArray(int arr[], int findElement) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findElement) {
				// 1 !=3
			result=1;
			}
			else
				result=-1;

		}
		return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a size");
		int size = scanner.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("enter the element to be searched:");
		int findElement = scanner.nextInt();
		System.out.println("the maximum element of the array is:" + findMaxArray(arr));
		System.out.println("the minimum element of the array is:" + findMinArray(arr));
		int result = searchArray(arr, findElement);
		if (result ==-1) {
			System.out.println("the searched element " + findElement + " of the array is not found:");
		} else
			System.out.println("the  searched element " + findElement + " of the array is  found:");

	}
}
