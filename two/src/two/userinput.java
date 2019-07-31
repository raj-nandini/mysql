package two;

import java.util.Scanner;

public class userinput
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter 2 no ");
		int num=Sc.nextInt();
		int num2=Sc.nextInt();
		int r=num+num2;
		System.out.println("Number"+r);
	}
	
}
