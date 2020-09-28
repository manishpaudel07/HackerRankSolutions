package com.hacker.thirtydayscode;

import java.util.Scanner;

interface InterafaceAdvancedArthmetic {
	int divisorSum(int n);

}

class Calculator implements InterafaceAdvancedArthmetic {
	public int divisorSum(int n) {
		
		if (n==1)
		{
			return n;
		}
		int sum = 0;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == (n / i))
					sum += i;
				else
					sum += (i + n / i);
			}
		}
		return (sum +n+ 1);
	}

}

