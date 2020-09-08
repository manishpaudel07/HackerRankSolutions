package com.hacker.bigdecimal;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntAddAndMultiply {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
        BigInteger big01=scanner.nextBigInteger();
        BigInteger big02=scanner.nextBigInteger();

    System.out.println(big01.add(big02));
    
        System.out.println(big01.multiply(big02));
        scanner.close();
	}

}
