package com.start.java;

public class Pelindrome {
	public static void main(String[] args) {
		int number=121;
		int rem=0;
		int result=0;
		int tem=number;
		while(number!=0) {
			
			rem=number%10;
			//System.out.println(rem);
			result=result*10+rem;
			//System.out.println(result);
			number=number/10;
		}
			System.out.println(result);
			
	         if(tem==result) {
	        	 System.out.println("pelindrome is number");
	        	 
	         }
	         else {
	        	 System.out.println("pelindrome is not number");
	         }
	        	 
	         }
			
		}
		
	


