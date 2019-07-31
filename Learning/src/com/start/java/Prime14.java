package com.start.java;

public class Prime14 {
	public static void main(String[] args) {
		int i;
		int number=16;
		int temp=0;
		for(i=2;i<number;i++) {
			if(number%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
		System.out.println("This is prime number");
		}
	else {
		System.out.println("This is not prime number");
	}
}
}