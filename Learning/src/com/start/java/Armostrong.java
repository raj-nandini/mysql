package com.start.java;

public class Armostrong {
	public static void main(String[] args) {
		int number=153;
		int armost=number;
		int rem=0;
		int temp=0;
		while(number!=0) {
			rem=number%10;
			temp=temp+rem*rem*rem;
			number=number/10;
			
			
		}
		
			if(temp==armost) {
				System.out.println("it is armostnumber");
			}
				else {
					System.out.println("it is not armostnumber");
				}
			}
		

}

