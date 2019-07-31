package sanjiv.java;

public class Summation {
	
	int total=0;
	public void sum()
	{
	int i=0;
	{
	while(i<10)
	{
	  total=total+i;
		i++;
	}
	}
		System.out.println(total);
	}
	public static void main(String[] args) {
		Summation isika=new Summation();
		isika.sum();
	}

}
