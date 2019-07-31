package sanjiv.java;

public class Voat {
	int age=20;
	boolean indianc=true;
	

	public void candidateforvoat()
	{
		if(age>18&&indianc)
		{
			
			System.out.println("you are aviable in voat");
		}
		else
		{
			System.out.println("you are not  aviable in voat ");
		}
	}
		

  public static void main(String[] args) {
	Voat nandu = new Voat();
	 nandu.candidateforvoat();
 }
}
