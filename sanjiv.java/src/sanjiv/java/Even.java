package sanjiv.java;

public class Even {
	int i=1;
	
	public void num()
	{
	while(i<=100)
	{
		if(i%2==0)
		{
		 System.out.println(i);
		}
		}
		i++;
	}
	public static void main(String[] args) {
		Even e=new Even();
		e.num();
	}

}
