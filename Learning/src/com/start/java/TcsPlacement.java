package com.start.java;

public class TcsPlacement {
	private String Branch;
	private int pointer;
   public static void main(String[] args) {
	 TcsPlacement placement=new TcsPlacement();
	 placement.Branch="CSE";
	 placement.pointer=8;
	 if(placement.Branch.contentEquals("CSE")) {
	
		 if(placement.pointer>=8) {
			System.out.println("Tcs is eligiable");
			 
		 }
		 else {
			 System.out.println("TCS not eligible");
		 }
     }
	 
	 else {
		 System.out.println("placement not eligible");{
			 
		 }
		 
	 }
}
}
      