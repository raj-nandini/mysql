package com.start.java;

public class ReverseNumber {
	public static void main(String[] args) {
		int number=23456;
		int i=1;
		int rem=0;
		int result=0;
		
		while(number!=0) {
			
			 rem=number%10;
			 result= result*10+rem;
			 number=number/10;
		}
		System.out.println(result);
		
	}

}
