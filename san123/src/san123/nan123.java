package san123;

import java.util.*;

public class nan123 
{
	public static void main(String[] args) 
	{
		ArrayList lst=new ArrayList();
		lst.add(10);
		lst.add("Text");
		lst.add(14.25);
		lst.add('A');
		
		System.out.println("Search Result="+lst.indexOf(100));
		
		System.out.println(lst);
		
		Iterator itr=lst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
		
			
		
