package com.class7;

public class Task {

	public static void main(String[] args) {
		//create a boolean variable workDay and assign true
		//create int variable day and assign it to 1
		//as long as it is workDay print"I need a day of" and increase day
		//once day is 6 print "I do not need a day of anby more
		
		boolean workDay=true;
		int day=1;
		while(workDay) {
			System.out.println("I need a day off");
             if(day==6) {
			System.out.println("I do not need a day off");	
			workDay=false;
		}
        day++;
		}
//WRÝTE 2 WAY
	}

	}
