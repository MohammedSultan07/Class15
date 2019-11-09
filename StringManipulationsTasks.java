package com.Class15;
import java.util.Scanner;
public class StringManipulationsTasks {
public static void main(String[] args) {
	
	Scanner kb=new Scanner(System.in);
	System.out.println("Please enter brower name");
	String browser=kb.nextLine();
	
	switch(browser.toLowerCase()) {
	case "firefox":
		System.out.println("Execution be performed on "+browser);
		break;
	case "chrome":
		System.out.println("Execution be performed on "+browser);
		break;
	case "safari":
		System.out.println("Execution be performed on "+browser);
		break;
	default:
		System.out.println("Please enter valid broswer");
	}	
	
}
}