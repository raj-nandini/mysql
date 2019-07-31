package com.start.java;

public class Sanjiv5 {
	public static void main(String[] args) {
	
		int number=121;
		int rem=0;
		int temp=0;
		int result=number;
		while(number!=0){
			rem=number%10;
			temp=temp+rem*rem*rem;

			number=number/10;
			
			//System.out.println(result);
			
			if(temp==result) {
				System.out.println("it is armost number");
			}
			else {
				System.out.println("it is not armost number");
			}
		}
	}
}

