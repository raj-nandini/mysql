package sanjiv.java;

public class Reverse {
	int n, num=3456;
	int reversed=0;
	public void num()
	{
	 while(num!=0)
	 { 
	 
	   n=num%10;
	   reversed=reversed*10+n;
	   num=num/10;
	 }
	System.out.println("reverse"+reversed);
	}
public static void main(String[] args) {
	Reverse number=new Reverse();
	number.num();
}
}
