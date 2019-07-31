package com.start.java;

public class ReverseNumber2 {
	public static void main(String[] args) {
		int number=121;
		int palin=number;
		int rem=0;
		int result=0;
		
	
		while(number!=0) {
			rem=number%10;
			result=result*10+rem;
			number=number/10;
			
			
		}
		System.out.println(result);
		if(palin==result) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not plaindrome");
		}
	}

}
 