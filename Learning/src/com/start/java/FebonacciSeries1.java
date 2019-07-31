package com.start.java;

public class FebonacciSeries1 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int i;
		int number=23;
		System.out.println(a+","+b);
	      int c;
		for(i=1;i<=number;i++) {
		
			c=a+b;
		System.out.println(","+c);
		a=b;
		b=c;
		
	}
	}
	}