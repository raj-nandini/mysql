package com.start.java;

public class Donation {
	private int age;
	private int weight;
	
	
	public static void main(String[] args) {
		
		Donation donation = new Donation();
		donation.age=21;
		donation.weight=55;
		
		
		if(donation.age>20) {
			
			if(donation.weight>50) {
				System.out.println("you are eligible for donation");
			}
			
			else {
				System.out.println("you are not eligible for blood donation");
			}
			
		}
		else {
			System.out.println("you are not eligible for donation");
		}
	}
}


