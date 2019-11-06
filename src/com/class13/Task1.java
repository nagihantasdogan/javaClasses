package com.class13;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your class day:: ");
		String day=scanner.nextLine();
		String day1=day.toLowerCase();
		
		if(day.trim().toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your java class");
		}else if(day.equalsIgnoreCase("Sunday")) {
			System.out.println("sunday is your Git Class");
		}else if(day.toUpperCase().equals("TUESDAY")) {
			System.out.println("Tuesday is your SDLC class");
		}else if(day.equals("Thursday")) {
			System.out.println("Thursday is your Manual class");
		}else {
			System.err.println("Invalid Day!!Please enter a valid day!!!");
		}
		scanner.close();
		
		
		//kntrl et!!!
		
		
		
		
		
		
		

	}

}
