package com.start.java;

public class Adder1 {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a ,int b,int c) {
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		Adder1 adder=new Adder1();
		       adder.add(32,56);
		       adder.add(89,79,90);
		
	}

}
