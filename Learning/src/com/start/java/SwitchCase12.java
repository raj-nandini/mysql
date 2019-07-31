package com.start.java;

public class SwitchCase12 {
	public static void main(String[] args) {
		String branch="cse";
		int yr=1;
		switch(yr) {
		case 1:System.out.println("engish");
		break;
		case 2:
			switch(branch) {
			case "cse" :System.out.println("data stucuter");
			break;
			case "ec" :System.out.println("network");
			break;
			case "it" :System.out.println("alogrithm");
			break;
			}
		 case 3:
				switch(branch) {
				case "cse" :System.out.println("java");
				break;
				case "ec" :System.out.println("network");
				}
			}
		}
	}


