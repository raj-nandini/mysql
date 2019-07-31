package com.start.java;

public class Factorial3 {

	public static void main(String[] args) {
		int i;
		int fact = 1;
		int number = 9;
		//System.out.println(number);
		for (i = 1; i <= number; i++) {
			fact = fact * i;

		}
		System.out.println(fact);
	}
}
