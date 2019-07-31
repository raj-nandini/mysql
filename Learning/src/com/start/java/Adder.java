package com.start.java;

public class Adder {

	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		
		Adder adition= new Adder();
		adition.add(10, 20);
		adition.add(20, 30,40);
	}
}
