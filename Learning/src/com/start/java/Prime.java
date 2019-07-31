package com.start.java;

public class Prime {
	public static void main(String[] args) {
		int i;
		int number=30;
		 int temp=0;
		 for(i=2;i<number;i++) {
			 if(number%i==0) {
				 temp=temp+1;
				 
			 }
			 
		 }
		 if(temp==0) {
			 System.out.println("prime number");
		 }
		 else {
			 System.out.println("prime not number");
			 
		 }
	
	
	}

}
