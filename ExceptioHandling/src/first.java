import javax.swing.text.rtf.RTFEditorKit;

public class first {
	
	public static void main(String[] args) {
		
		try {
		for(int i=1;i<10;i++) {
			
			int x= 100/i;
			System.out.println(x);
		}
		}catch( ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("sgfghgghgh");
		}
	}

}
