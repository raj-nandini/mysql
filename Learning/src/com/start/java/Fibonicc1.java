package com.start.java;

public class Fibonicc1 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int i;
		int number=13;
		System.out.print(a+","+b);
		int c;
		for(i=1;i<=number;i++) {
		 c=a+b;
		 System.out.print(","+c);
		 a=b;
		 b=c;
			
		}
		
	}

}
