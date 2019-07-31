package com.start.java;

public class Armstrong13 {
	public static void main(String[] args) {
		int number=153;
		int temp=0;
		int rem=0;
		int armost=number;
		while(number!=0) {
			rem=number%10;
			temp=temp+rem*rem*rem;
			number=number/10;
		}
		if(temp==armost) {
			System.out.println("it is Armost number");
		}
		else {
			System.out.println("it is not Armost number");
		}

}
}