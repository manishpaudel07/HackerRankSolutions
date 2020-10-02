package com.hacker.thirtydayscode;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int result = 0;
		int index = 0;
		int temp = 0;
		while (num > 0) {
			result = num % 2;
			num = num / 2;
			if (result == 1) {
				index++;
				if(index>temp)
				{
					temp=index;
				}

			} else {

				index = 0;
			}

		}
		System.out.println(temp);

	}

}
