package com.class15;
import java.util.Scanner;

public class StringManipulatoinsTask {

	public static void main(String[] args) {
		//lets ask user to enter browser
		//based on the input we say "your selected is........
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter browser name");
		String browser=scan.nextLine();
		
		switch(browser.toLowerCase()) {
		case "firefox":
			System.out.println("execution be performed on"+browser);
		
		break;
		case "chrome":
			System.out.println("execution be performed on"+browser);
			break;
		case"ie":
			System.out.println("execution be performed on"+browser);
			break;
		case"safari":
			System.out.println("execution be performed on"+browser);
			break;
		default:
			System.out.println("please enter valid browser");
			
			
			
			
			
			
			
			
		
			
			
			
			
		}
		
		
		
		
		
		
		

	}

}
