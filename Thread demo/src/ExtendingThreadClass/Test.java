package ExtendingThreadClass;

public class Test {

	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		YouThread t2=new YouThread();
		
		t1.start();
		t2.start();

	}

}
