package sanjiv.java;

public class Tree {
	int value;
	public void root()
	{
		System.out.println("root");

	}
	public void node()
	{
		System.out.println("node");
	}
	public void Tie()
	{
		System.out.println("Tie");
	}
	
	
	public static void main(String[] args) {
		Tree Binary = new Tree();
		Binary.root();
		Binary.node();
		Binary.Tie();
		
	}

}
