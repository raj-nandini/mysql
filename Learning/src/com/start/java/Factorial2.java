package com.start.java;

public class Factorial2 {
	private int fact=1;
	private int number=10;
	public static void main(String[] args) {
		System.out.println("number");
			int i;
		
		Factorial2 obj=new Factorial2();
		    
		 for(i=obj.number;i>=1;i--) {
			 obj.fact=obj.fact*i;
			 
			 
		 }
		 System.out.println(obj.fact);
		
	}

}
