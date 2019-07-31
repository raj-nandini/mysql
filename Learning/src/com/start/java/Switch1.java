package com.start.java;

public class Switch1 {
	public static void main(String[] args) {
		String branch="cse";
		int yr=1;
		switch(yr){
		case 1:	System.out.println("english");	
		break;
		case 2:
			switch(branch) {
			case "cse":System.out.println("data stucuter");
			break;
			case "mch":System.out.println("machince");
			break;
			case "it":System.out.println("algorithm");
			break;
			
			}
			
		case 3:
		switch(branch) {
		case "cse":System.out.println("java");
		break;
		case "ec":System.out.println("network");
		break;
		case "it":System.out.println("c++");
		break;
		
		}
		
		default:
			System.out.println("no match");
			break;
		
		}
		
	}

}
