package com.start.java;

public class MethodOverLoading {
	int a;
	int  b;
	public MethodOverLoading(int c,int d) {
		a=c;
		b=d;
		
	}
	
	public void add() {
		System.out.println(a+b);
	}
	public void add(int e) {
		System.out.println(a+b+e);
	}
	    public static void main(String[] args) {
			MethodOverLoading loading=new MethodOverLoading(5,6);
			 loading.add();
		}
	

}
