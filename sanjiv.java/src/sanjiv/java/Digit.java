package sanjiv.java;

public class Digit {
	int count=0;
	int num=2345;
	public void number()
	{
		while(num>0)
		{
		 num=num/10;
		 count++;
		}
	System.out.println("Enter the number"+count);

	}
			
	public static void main(String[] args) {
		Digit n=new Digit();
		n.number();
	}

}
