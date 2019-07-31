package com.start.java;

public class Person {
	private int age;
	private static String name;
  public static void main(String[] args) {
	  
	  Person dog=new Person();
	  //dog.age=20;
	  dog.age=22;
	  if(dog.age<18)
	  {	
		  
		  System.out.println("you r kid");
		  
	  }
	  
	  else if(dog.age>18 && dog.age<30) {
		  System.out.println("you are adult");
	  }
	  
	  else if(dog.age>30 && dog.age<40) {
		  
		  System.out.println("you are able to married ");
		  
	  }
	  
	  else {
		  System.out.println("you are old");
	  }
	 
			 
		  
		  
	
}
}

