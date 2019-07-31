package com.start.java;

public class Sanjiv1 {
	public static void main(String[] args) {
		int i;
		int a=0;
		int b=1;
		int c;
		int number=10;
		System.out.println(a+", "+b);
		for(i=2;i<number;i++) {
		c=a+b;
		System.out.println(","+c);
		a=b;
		b=c;
			
		}
	}

}
