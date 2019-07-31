package com.start.java;

public class If {
	public static void main(String[] args) {
		int age=5;
	
		if(age<18) {
			System.out.println("child");
			
		}
		else if(age>18 && age<30) {
			System.out.println("adult");
			
		}
		
		else {
			System.out.println("old");
		}
		
	}

}
