package com.class5;

public class ClassTask {
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
		
		
		int month=7;
				
		String born;
		if(month==1 || month==2 || month==12) {
			born="winter";
		}else if(month==3 || month==4 || month==5 ){
			born="spring";
		}else if(month==6 || month==7 || month==8) {
			born="summer";
		}else if(month==9 ||  month==10 || month==11) {
			born="fall";
		}else {
			born="Invalid";
		}

			System.out.println("You were born in "+born);
		}
		
		
		
		
		
	}


