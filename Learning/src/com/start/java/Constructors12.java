package com.start.java;	

public class Constructors12 {
	private String eye;
	private String mouse;
	private String nose;
	public Constructors12() {
		System.out.println("fghj");
	}
	
	public Constructors12(String e, String m, String n) {
		
		eye=e;
		mouse=m;
		nose=n;
	}
	
    public void add(int a,int b) {
    	System.out.println(a+b);
    }
    public static void main(String[] args) {
    	Constructors12 constructor=new Constructors12();
    	//Constructors12 constructors1= new Constructors12("girls eye")
    	               constructor.add(10, 20);
    		
		
	}
}
