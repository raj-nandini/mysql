package com.start.java;

public class Panlidam {
	public static void main(String[] args) {
		
		int number=121;
		int result=0;
		int temp=number;
		int rem=0;
		while(number!=0) {
			rem=number%10;
			result=result*10+rem;
			number=number/10;
			
		}
		if(temp==result) {
			System.out.println("it is panlidam");
		}
		else {
			System.out.println("it is not panlidam");
		}
	}

}
