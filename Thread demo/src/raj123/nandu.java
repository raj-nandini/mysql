package raj123;

import java.util.Scanner;

public class nandu extends Thread

{
	
	@Override
      public void run()
      {
		int i;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a numbe");
		int number=Sc.nextInt();
		i=1;
		while(i<=number)
		{
			if(number%i==0)
			{
				System.out.println("Enter the value"+i);
			}
	          i++;
		}
      }
}
