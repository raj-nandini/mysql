package sanjiv.java;

public class Amstrong {
	int m=0,a,temp;
	public void num()
	{
		int n=153;
		temp=n;
		while(n>0)
		{
		 a=n%10;
		 n=n/10;
		 m=m+(a*a*a);
		}
		if(temp==m)
		{
		 System.out.println("Amstrong number");
	}
		else
		{
			System.out.println("not Amstrong number");
		  }
		}
	
	public static void main(String[] args) {
		Amstrong r=new Amstrong();
		r.num();
	}
	}


