package com.start.java;

public class Collage {
	private int rollNo;
public static void main(String[] args) {
	Collage techno=new Collage();
	        techno.rollNo=30;
      if (techno.rollNo>0 && techno.rollNo<=10) {
    	  System.out.println('A');
    	  
      }
      else if(techno.rollNo>20 && techno.rollNo<=30) {
    	  System.out.println('B');
      }
      else {
    	  System.out.println('c');
      }
}
}
