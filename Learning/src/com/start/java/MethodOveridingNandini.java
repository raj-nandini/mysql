package com.start.java;

public class MethodOveridingNandini extends MethodOveridingSiyaram {

	@Override
	public void angry() {
		// TODO Auto-generated method stub
		System.out.println("raj nadini angry 50%");
	}
	
	public static void main(String[] args) {		
		
		MethodOveridingNandini nandini = new MethodOveridingNandini();
		
		nandini.angry();
		
	}
}
