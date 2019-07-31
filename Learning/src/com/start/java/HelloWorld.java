package com.start.java;

public class HelloWorld {
 private int a;// instance varibale
  private int b;//instance variable
  private int f; //instance variable
  
  private static int g; // static variable
  
  public void   add() {
	  
	  int c;//local varibale
	  
	  System.out.println(a+b);
  }
	
	
 public static void main(String[]args) {
	  
	 
	 int e;//local variable
	 HelloWorld raj=new HelloWorld();
	 raj.a=10;
	 raj.b=20;
	 HelloWorld.g=33;
	 
	 raj.add();
 }
}
