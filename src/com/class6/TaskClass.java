package com.class6;
import java.util.Scanner;
public class TaskClass {
	private static Scanner scan;

	public static void main(String[]args) {
		/*ask user to enter the month they were born
		 * based on the month define the season
		 * if user is born in jan,feb,dec.......winter
		 * if mar,apr,may......spring
		 * if jun,july,augst....summer
		 * if sep,oct,nov......fall
		 * otherwise.....unknown
		 * at the end of the program "you are born in....."
		 */
		String month="June";
		
		scan = new Scanner(System.in);
		
		
		System.out.println("Month of born");
		month =scan.nextLine();
		String season;
		if(month.contentEquals("January") || month.equals("February") ||  month.equals("December")) {
			season="Winter";
		}else if(month.contentEquals("March") || month.contentEquals("April")  ||  month.contentEquals("May")) {
			season="Spring";
		}else if(month.equals("June") || month.contentEquals("July")  ||  month.contentEquals("Augst")) {
			season="Summer";
		}else if (month.contentEquals("September") || month.contentEquals("October") || month.contentEquals("November")) {
			season="Fall";
		}else {
			season="Unknown";
		}
		System.out.println("You were born in"+season);
		System.out.println(month);
		
	}

}
