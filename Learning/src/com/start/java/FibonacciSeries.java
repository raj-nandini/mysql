package com.start.java;

public class FibonacciSeries {
	
public static void main(String[] args) {
	
	
	int a=0;
	int b=1;
	
	
	System.out.print(a + "," +b);
	
	for(int i=1;i<=8;i++) {
		int c;
		c=a+b;
		System.out.print(","+c);
	}
}


}
